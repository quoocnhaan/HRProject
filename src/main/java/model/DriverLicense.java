/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "hr_driver_license")
public class DriverLicense {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "license_id")
    private String licenseId;
    
    @Column(name = "name")
    private  String name;
    
    @OneToOne(mappedBy = "driverLicense")
    private Employee employee;
    
    @Column(name = "issued_date")
    private Date issuedDate;
    
    @Column(name = "expired_date")
    private Date expiredDate;
    
    @Column(name = "level")
    private String level;
    
    @Column(name = "issued_place")
    private String issuedPlace;
    
    @Column(name = "status")
    private boolean status;

    public DriverLicense() {
    }

    public DriverLicense(long id, String licenseId, String name, Employee employee, Date issuedDate, Date expiredDate, String level, String issuedPlace, boolean status) {
        this.id = id;
        this.licenseId = licenseId;
        this.name = name;
        this.employee = employee;
        this.issuedDate = issuedDate;
        this.expiredDate = expiredDate;
        this.level = level;
        this.issuedPlace = issuedPlace;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getIssuedPlace() {
        return issuedPlace;
    }

    public void setIssuedPlace(String issuedPlace) {
        this.issuedPlace = issuedPlace;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
    
}
