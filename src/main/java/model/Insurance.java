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
@Table(name = "hr_insurance")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
}
