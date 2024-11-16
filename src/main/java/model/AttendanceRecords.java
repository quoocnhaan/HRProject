/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

    private String workDate;
    
    private LocalTime startTime;
    
    private LocalTime endTime;
    
    private boolean status;

    public AttendanceRecords(long id, AttendanceInformation attendanceInformation, String workDate, LocalTime startTime, LocalTime endTime, boolean status) {
        this.id = id;
        this.attendanceInformation = attendanceInformation;
        this.workDate = workDate;
        this.startTime = startTime;
        this.endTime = endTime;
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
    
    

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}