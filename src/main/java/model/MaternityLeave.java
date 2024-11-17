/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
 * @author LENOVO
 */
@Entity
@Table(name = "hr_maternity_leave")
public class MaternityLeave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @OneToOne(mappedBy = "maternityLeave", cascade = CascadeType.ALL)
    private Employee employee;

    @Column(name = "duration")
    private int duration;

    @Column(name = "allowance")
    private double allowance;

    @Column(name = "company_support")
    private String companySupport;

    @Column(name = "remaining_day")
    private int remainingDay;

    @Column(name = "status")
    private boolean status;

    public MaternityLeave() {
    }

    public MaternityLeave(Employee employee, int duration, double allowance, String companySupport, int remainingDay, boolean status) {
        this.employee = employee;
        this.duration = duration;
        this.allowance = allowance;
        this.companySupport = companySupport;
        this.remainingDay = remainingDay;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public String getCompanySupport() {
        return companySupport;
    }

    public void setCompanySupport(String companySupport) {
        this.companySupport = companySupport;
    }

    public int getRemainingDay() {
        return remainingDay;
    }

    public void setRemainingDay(int remainingDay) {
        this.remainingDay = remainingDay;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
