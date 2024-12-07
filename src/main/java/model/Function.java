/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "sys_function")
public class Function {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "function_id")
    private String functionId;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "sys_authorization",
            joinColumns = {
                @JoinColumn(name = "function_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "role_id")})
    private List<Role> roles;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "function", cascade = CascadeType.ALL)
    private FunctionAuthorization functionAuthorization;

//    @Column(name = "focus_icon")
//    private byte[] focusIcon;
//
//    @Column(name = "exit_icon")
//    private byte[] exitIcon;
    @Column(name = "icon")
    private byte[] icon;

    @Column(name = "color")
    private String color;

    @Column(name = "status")
    private boolean status;

    public Function() {
        roles = new ArrayList<>();
    }

//    public Function(String functionId, List<Role> roles, String name, FunctionAuthorization functionAuthorization, byte[] focusIcon, byte[] exitIcon, String color, boolean status) {
//        this.functionId = functionId;
//        this.roles = roles;
//        this.name = name;
//        this.functionAuthorization = functionAuthorization;
//        this.focusIcon = focusIcon;
//        this.exitIcon = exitIcon;
//        this.color = color;
//        this.status = status;
//    }
    public Function(String functionId, List<Role> roles, String name, FunctionAuthorization functionAuthorization, byte[] icon, String color, boolean status) {
        this.functionId = functionId;
        this.roles = roles;
        this.name = name;
        this.functionAuthorization = functionAuthorization;
        this.icon = icon;
        this.color = color;
        this.status = status;
    }

    public Function(String functionId, String name, byte[] icon, String color, boolean status) {
        this.functionId = functionId;
        this.name = name;
        this.icon = icon;
        this.color = color;
        this.status = status;
    }

//    public byte[] getFocusIcon() {
//        return focusIcon;
//    }
//
//    public void setFocusIcon(byte[] focusIcon) {
//        this.focusIcon = focusIcon;
//    }
//
//    public byte[] getExitIcon() {
//        return exitIcon;
//    }
//
//    public void setExitIcon(byte[] exitIcon) {
//        this.exitIcon = exitIcon;
//    }
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public FunctionAuthorization getFunctionAuthorization() {
        return functionAuthorization;
    }

    public void setFunctionAuthorization(FunctionAuthorization functionAuthorization) {
        this.functionAuthorization = functionAuthorization;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getIcon() {
        return icon;
    }

    public void setIcon(byte[] icon) {
        this.icon = icon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
