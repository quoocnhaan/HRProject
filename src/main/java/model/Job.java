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
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "hr_job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "official_date")
    private Date officialDate;

    @Column(name = "type")
    private String type;

    @Column(name = "employment_status")
    private String employmentStatus;

    @Column(name = "labor")
    private String labor;

    @Column(name = "profession")
    private String profession;

    @Column(name = "title")
    private String title;

    @Column(name = "title_start_date")
    private Date titleStartDate;

    @Column(name = "status")
    private boolean status;

    public Job() {
    }

    public Job(Date startDate, Date officialDate, String type, String employmentStatus, String labor, String profession, String title, Date titleStartDate, boolean status) {
        this.startDate = startDate;
        this.officialDate = officialDate;
        this.type = type;
        this.employmentStatus = employmentStatus;
        this.labor = labor;
        this.profession = profession;
        this.title = title;
        this.titleStartDate = titleStartDate;
        this.status = status;
    }

    public Job(Date startDate, String profession, String type) {
        this.startDate = startDate;
        this.profession = profession;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getOfficialDate() {
        return officialDate;
    }

    public void setOfficialDate(Date officialDate) {
        this.officialDate = officialDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTitleStartDate() {
        return titleStartDate;
    }

    public void setTitleStartDate(Date titleStartDate) {
        this.titleStartDate = titleStartDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
