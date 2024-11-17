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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "hr_employee_family")
public class EmployeeFamily {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private boolean gender;

    @Column(name = "relationship")
    private String relationship;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "id_number")
    private String idNumber;

    @Column(name = "id_issue_date")
    private String idIssueDate;

    @Column(name = "id_issue_place")
    private String idIssuePlace;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "tax_code")
    private String taxCode;

    @Column(name = "health_insurance_number")
    private String healthInsuranceNumber;

    @Column(name = "social_insurance_number")
    private String socialInsuranceNumber;

    @Column(name = "is_primary_caregiver")
    private boolean isPrimaryCaregiver;

    @Column(name = "is_dead")
    private boolean isDead;

    @Column(name = "year_of_death")
    private boolean yearOfDeath;

    @Column(name = "cause_of_death")
    private boolean causeOfDeath;

    @Column(name = "status")
    private boolean status;

    public EmployeeFamily() {
    }

    public EmployeeFamily(Employee employee, String name, boolean gender, String relationship, Date dateOfBirth, String idNumber, String idIssueDate, String idIssuePlace, String nationality, String taxCode, String healthInsuranceNumber, String socialInsuranceNumber, boolean isPrimaryCaregiver, boolean isDead, boolean yearOfDeath, boolean causeOfDeath, boolean status) {
        this.employee = employee;
        this.name = name;
        this.gender = gender;
        this.relationship = relationship;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
        this.idIssueDate = idIssueDate;
        this.idIssuePlace = idIssuePlace;
        this.nationality = nationality;
        this.taxCode = taxCode;
        this.healthInsuranceNumber = healthInsuranceNumber;
        this.socialInsuranceNumber = socialInsuranceNumber;
        this.isPrimaryCaregiver = isPrimaryCaregiver;
        this.isDead = isDead;
        this.yearOfDeath = yearOfDeath;
        this.causeOfDeath = causeOfDeath;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdIssueDate() {
        return idIssueDate;
    }

    public void setIdIssueDate(String idIssueDate) {
        this.idIssueDate = idIssueDate;
    }

    public String getIdIssuePlace() {
        return idIssuePlace;
    }

    public void setIdIssuePlace(String idIssuePlace) {
        this.idIssuePlace = idIssuePlace;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getHealthInsuranceNumber() {
        return healthInsuranceNumber;
    }

    public void setHealthInsuranceNumber(String healthInsuranceNumber) {
        this.healthInsuranceNumber = healthInsuranceNumber;
    }

    public String getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    public void setSocialInsuranceNumber(String socialInsuranceNumber) {
        this.socialInsuranceNumber = socialInsuranceNumber;
    }

    public boolean isIsPrimaryCaregiver() {
        return isPrimaryCaregiver;
    }

    public void setIsPrimaryCaregiver(boolean isPrimaryCaregiver) {
        this.isPrimaryCaregiver = isPrimaryCaregiver;
    }

    public boolean isIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    public boolean isYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(boolean yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

    public boolean isCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(boolean causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
