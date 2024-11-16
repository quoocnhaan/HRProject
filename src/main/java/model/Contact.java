/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "hr_contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "personal_email")
    private String personalEmail;

    @Column(name = "personal_phone")
    private String personalPhone;

    @Column(name = "permanent_address")
    private String permanentAddress;

    @Column(name = "temp_address")
    private String tempAddress;

    @Column(name = "co_email")
    private String coEmail;

    @Column(name = "co_phone")
    private String coPhone;

    @Column(name = "co_address")
    private String coAddress;

    @Column(name = "status")
    private String status;

    public Contact() {
    }

    public Contact(long id, String personalEmail, String personalPhone, String permanentAddress, String tempAddress, String coEmail, String coPhone, String coAddress, String status) {
        this.id = id;
        this.personalEmail = personalEmail;
        this.personalPhone = personalPhone;
        this.permanentAddress = permanentAddress;
        this.tempAddress = tempAddress;
        this.coEmail = coEmail;
        this.coPhone = coPhone;
        this.coAddress = coAddress;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(String tempAddress) {
        this.tempAddress = tempAddress;
    }

    public String getCoEmail() {
        return coEmail;
    }

    public void setCoEmail(String coEmail) {
        this.coEmail = coEmail;
    }

    public String getCoPhone() {
        return coPhone;
    }

    public void setCoPhone(String coPhone) {
        this.coPhone = coPhone;
    }

    public String getCoAddress() {
        return coAddress;
    }

    public void setCoAddress(String coAddress) {
        this.coAddress = coAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

}
