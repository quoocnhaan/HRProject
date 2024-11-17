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
@Table(name = "hr_insurance")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @OneToOne(mappedBy = "insurance", cascade = CascadeType.ALL)
    private Employee employee;

    @Column(name = "insurance_id")
    private String insuranceId;

    @Column(name = "from_month")
    private String fromMonth;

    @Column(name = "to_month")
    private String toMonth;

    @Column(name = "contribution_amount")
    private String contributionAmount;

    @Column(name = "emp_social_rate")
    private String empSocialRate;

    @Column(name = "emp_health_rate")
    private String empHealthRate;

    @Column(name = "emp_unemployment_rate")
    private String empUnemploymentRate;

    @Column(name = "co_social_rate")
    private String coSocialRate;
    
    @Column(name = "co_health_rate")
    private String coHealthRate;
    
    @Column(name = "co_unemployment_rate")
    private String coUnemploymentRate;
    
    @Column(name = "status")
    private String status;

    public Insurance() {
    }

    public Insurance(Employee employee, String insuranceId, String fromMonth, String toMonth, String contributionAmount, String empSocialRate, String empHealthRate, String empUnemploymentRate, String coSocialRate, String coHealthRate, String coUnemploymentRate, String status) {
        this.employee = employee;
        this.insuranceId = insuranceId;
        this.fromMonth = fromMonth;
        this.toMonth = toMonth;
        this.contributionAmount = contributionAmount;
        this.empSocialRate = empSocialRate;
        this.empHealthRate = empHealthRate;
        this.empUnemploymentRate = empUnemploymentRate;
        this.coSocialRate = coSocialRate;
        this.coHealthRate = coHealthRate;
        this.coUnemploymentRate = coUnemploymentRate;
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

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getFromMonth() {
        return fromMonth;
    }

    public void setFromMonth(String fromMonth) {
        this.fromMonth = fromMonth;
    }

    public String getToMonth() {
        return toMonth;
    }

    public void setToMonth(String toMonth) {
        this.toMonth = toMonth;
    }

    public String getContributionAmount() {
        return contributionAmount;
    }

    public void setContributionAmount(String contributionAmount) {
        this.contributionAmount = contributionAmount;
    }

    public String getEmpSocialRate() {
        return empSocialRate;
    }

    public void setEmpSocialRate(String empSocialRate) {
        this.empSocialRate = empSocialRate;
    }

    public String getEmpHealthRate() {
        return empHealthRate;
    }

    public void setEmpHealthRate(String empHealthRate) {
        this.empHealthRate = empHealthRate;
    }

    public String getEmpUnemploymentRate() {
        return empUnemploymentRate;
    }

    public void setEmpUnemploymentRate(String empUnemploymentRate) {
        this.empUnemploymentRate = empUnemploymentRate;
    }

    public String getCoSocialRate() {
        return coSocialRate;
    }

    public void setCoSocialRate(String coSocialRate) {
        this.coSocialRate = coSocialRate;
    }

    public String getCoHealthRate() {
        return coHealthRate;
    }

    public void setCoHealthRate(String coHealthRate) {
        this.coHealthRate = coHealthRate;
    }

    public String getCoUnemploymentRate() {
        return coUnemploymentRate;
    }

    public void setCoUnemploymentRate(String coUnemploymentRate) {
        this.coUnemploymentRate = coUnemploymentRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
