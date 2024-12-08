/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalTime;
import java.sql.Date;
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
@Table(name = "hr_attendance_records")
public class AttendanceRecords {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "attendance_information_id")
    private AttendanceInformation attendanceInformation;

    @Column(name = "work_date")
    private Date workDate;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "kow")
    private double kow;

    @Column(name = "status")
    private boolean status;

    public AttendanceRecords(AttendanceInformation attendanceInformation, Date workDate, LocalTime startTime, LocalTime endTime, double kow, boolean status) {
        this.attendanceInformation = attendanceInformation;
        this.workDate = workDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.kow = kow;
        this.status = status;
    }

    public AttendanceRecords() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AttendanceInformation getAttendanceInformation() {
        return attendanceInformation;
    }

    public void setAttendanceInformation(AttendanceInformation attendanceInformation) {
        this.attendanceInformation = attendanceInformation;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public double getKow() {
        return kow;
    }

    public void setKow(double kow) {
        this.kow = kow;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
