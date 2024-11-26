/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "hr_contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "contract_id")
    private String contractId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "approver_id")
    private Employee approver;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id")
    private Job job;

    @Column(name = "sign_date")
    private Date signDate;

    @Column(name = "duration")
    private String duration;

    @Column(name = "effective_date")
    private Date effectiveDate;

    @Column(name = "expired_date")
    private Date expiredDate;

    @Column(name = "base_salary")
    private double baseSalary;

    @Column(name = "standard_working_hours")
    private double standardWorkingHours;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "probation_start_date")
    private Date probationStartDate;

    @Column(name = "probation_end_date")
    private Date probationEndDate;

    @Column(name = "transportation")
    private String transportation;

    @Column(name = "status")
    private boolean status;

    public Contract() {
    }

    public Contract(String contractId, Employee employee, Employee approver, Job job, Date signDate, String duration, Date effectiveDate, Date expiredDate, double baseSalary, double standardWorkingHours, String paymentMethod, Date probationStartDate, Date probationEndDate, String transportation, boolean status) {
        this.contractId = contractId;
        this.employee = employee;
        this.approver = approver;
        this.job = job;
        this.signDate = signDate;
        this.duration = duration;
        this.effectiveDate = effectiveDate;
        this.expiredDate = expiredDate;
        this.baseSalary = baseSalary;
        this.standardWorkingHours = standardWorkingHours;
        this.paymentMethod = paymentMethod;
        this.probationStartDate = probationStartDate;
        this.probationEndDate = probationEndDate;
        this.transportation = transportation;
        this.status = status;
    }

    public Contract(String contractId, Employee employee, Job job) {
        this.contractId = contractId;
        this.employee = employee;
        this.job = job;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getApprover() {
        return approver;
    }

    public void setApprover(Employee approver) {
        this.approver = approver;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getStandardWorkingHours() {
        return standardWorkingHours;
    }

    public void setStandardWorkingHours(double standardWorkingHours) {
        this.standardWorkingHours = standardWorkingHours;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getProbationStartDate() {
        return probationStartDate;
    }

    public void setProbationStartDate(Date probationStartDate) {
        this.probationStartDate = probationStartDate;
    }

    public Date getProbationEndDate() {
        return probationEndDate;
    }

    public void setProbationEndDate(Date probationEndDate) {
        this.probationEndDate = probationEndDate;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
