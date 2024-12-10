/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
@Table(name = "hr_pay_period")
public class PayPeriod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "pay_period_code")
    private String payPeriodCode;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "status")
    private boolean status;

    public PayPeriod(String monthYear) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");

        LocalDate startDate = LocalDate.parse("15/" + monthYear, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDate endDate = startDate.plusMonths(1).withDayOfMonth(14);

        this.startDate = startDate;
        this.endDate = endDate;

        // Use monthYear as the pay period code
        this.payPeriodCode = monthYear;

        // Set the status to true
        this.status = true;
    }

    public PayPeriod() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPayPeriodCode() {
        return payPeriodCode;
    }

    public void setPayPeriodCode(String payPeriodCode) {
        this.payPeriodCode = payPeriodCode;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
