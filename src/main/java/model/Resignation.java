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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "hr_resignation")
public class Resignation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @OneToOne(mappedBy = "resignation", cascade = CascadeType.ALL)
    private Employee employee;

    @Column(name = "submission_date")
    private Date submissionDate;

    @Column(name = "leave_date")
    private Date leaveDate;

    @Column(name = "reason")
    private String reason;

    @Column(name = "type")
    private String type;

    @Column(name = "signature_date")
    private Date signatureDate;

    @Column(name = "signatory_id")
    private String signatoryId;

    @Column(name = "salaryTransfer_date")
    private Date salaryTransferDate;

    @Column(name = "status")
    private boolean status;

    public Resignation() {
    }

    public Resignation(Employee employee, Date submissionDate, Date leaveDate, String reason, String type, Date signatureDate, String signatoryId, Date salaryTransferDate, boolean status) {
        this.employee = employee;
        this.submissionDate = submissionDate;
        this.leaveDate = leaveDate;
        this.reason = reason;
        this.type = type;
        this.signatureDate = signatureDate;
        this.signatoryId = signatoryId;
        this.salaryTransferDate = salaryTransferDate;
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getSignatureDate() {
        return signatureDate;
    }

    public void setSignatureDate(Date signatureDate) {
        this.signatureDate = signatureDate;
    }

    public String getSignatoryId() {
        return signatoryId;
    }

    public void setSignatoryId(String signatoryId) {
        this.signatoryId = signatoryId;
    }

    public Date getSalaryTransferDate() {
        return salaryTransferDate;
    }

    public void setSalaryTransferDate(Date salaryTransferDate) {
        this.salaryTransferDate = salaryTransferDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
