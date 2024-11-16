/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "sys_authorization", 
            joinColumns = {@JoinColumn(name = "function_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}) 
    private List<Role> roles;

    private String name;

    private byte[] icon;

    private String color;

    private boolean status;

    public Function() {
    }

    public Function(long id, String functionId, String name, byte[] icon, String color, boolean status) {
        this.id = id;
        this.functionId = functionId;
        this.name = name;
        this.icon = icon;
        this.color = color;
        this.status = status;
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
