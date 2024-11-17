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
@Table(name = "hr_kow")
public class KOW {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "work_date")
    private Date workDate;

    @Column(name = "total_late")
    private double totalLate;

    @Column(name = "total_working_hours")
    private double totalWorkinghours;
    
    @Column(name = "status")
    private boolean status;

    public KOW() {
    }

    public KOW(Employee employee, Date workDate, double totalLate, double totalWorkinghours, boolean status) {
        this.employee = employee;
        this.workDate = workDate;
        this.totalLate = totalLate;
        this.totalWorkinghours = totalWorkinghours;
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

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public double getTotalLate() {
        return totalLate;
    }

    public void setTotalLate(double totalLate) {
        this.totalLate = totalLate;
    }

    public double getTotalWorkinghours() {
        return totalWorkinghours;
    }

    public void setTotalWorkinghours(double totalWorkinghours) {
        this.totalWorkinghours = totalWorkinghours;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
