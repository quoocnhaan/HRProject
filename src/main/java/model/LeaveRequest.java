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
@Table(name = "hr_leave_request")
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "approve_status")
    private int approveStatus;

    @ManyToOne
    @JoinColumn(name = "approver_id")
    private Employee approver;

    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "approve_date")
    private Date approveDate;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;

    @Column(name = "type")
    private String type;

    @Column(name = "start_leave")
    private double startLeave;

    @Column(name = "total_day")
    private int totalDay;

    @Column(name = "reason")
    private String reason;

    @Column(name = "status")
    private boolean status;

    public LeaveRequest() {
    }

    public LeaveRequest(Employee employee, int approveStatus, Employee approver, Date registrationDate, Date approveDate, Date fromDate, Date toDate, String type, double startLeave, int totalDay, String reason, boolean status) {
        this.employee = employee;
        this.approveStatus = approveStatus;
        this.approver = approver;
        this.registrationDate = registrationDate;
        this.approveDate = approveDate;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.type = type;
        this.startLeave = startLeave;
        this.totalDay = totalDay;
        this.reason = reason;
        this.status = status;
    }

    public LeaveRequest(Employee employee, int approveStatus, Date registrationDate) {
        this.employee = employee;
        this.approveStatus = approveStatus;
        this.registrationDate = registrationDate;
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

    public int getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(int approveStatus) {
        this.approveStatus = approveStatus;
    }

    public Employee getApprover() {
        return approver;
    }

    public void setApprover(Employee approver) {
        this.approver = approver;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getStartLeave() {
        return startLeave;
    }

    public void setStartLeave(double startLeave) {
        this.startLeave = startLeave;
    }

    public int getTotalDay() {
        return totalDay;
    }

    public void setTotalDay(int totalDay) {
        this.totalDay = totalDay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    

}
