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
@Table(name = "hr_paid_leave")
public class PaidLeave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "remaining_day")
    private double remainingDay;

    @Column(name = "leave_salary_rate")
    private double leaveSalaryRate;

    @Column(name = "leave_accrual_period")
    private double leaveAccrualPeriod;

    @Column(name = "maximum_leave_day")
    private double maximumLeaveDay;

    @Column(name = "status")
    private double status;

    public PaidLeave() {
    }

    public PaidLeave(long id, double remainingDay, double leaveSalaryRate, double leaveAccrualPeriod, double maximumLeaveDay, double status) {
        this.id = id;
        this.remainingDay = remainingDay;
        this.leaveSalaryRate = leaveSalaryRate;
        this.leaveAccrualPeriod = leaveAccrualPeriod;
        this.maximumLeaveDay = maximumLeaveDay;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getRemainingDay() {
        return remainingDay;
    }

    public void setRemainingDay(double remainingDay) {
        this.remainingDay = remainingDay;
    }

    public double getLeaveSalaryRate() {
        return leaveSalaryRate;
    }

    public void setLeaveSalaryRate(double leaveSalaryRate) {
        this.leaveSalaryRate = leaveSalaryRate;
    }

    public double getLeaveAccrualPeriod() {
        return leaveAccrualPeriod;
    }

    public void setLeaveAccrualPeriod(double leaveAccrualPeriod) {
        this.leaveAccrualPeriod = leaveAccrualPeriod;
    }

    public double getMaximumLeaveDay() {
        return maximumLeaveDay;
    }

    public void setMaximumLeaveDay(double maximumLeaveDay) {
        this.maximumLeaveDay = maximumLeaveDay;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }
    
}
