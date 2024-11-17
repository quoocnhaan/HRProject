/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "hr_notification")
public class Notification {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reciver_id")
    private Employee reciver;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "noti_type_id")
    private NotiType notiType;
    
    @JoinColumn(name = "recive_time")
    private LocalDateTime reciveTime;
    
    @JoinColumn(name = "is_read")
    private boolean isRead;
    
    @JoinColumn(name = "status")
    private boolean status;

    public Notification() {
    }

    public Notification(Employee reciver, NotiType notiType, LocalDateTime reciveTime, boolean isRead, boolean status) {
        this.reciver = reciver;
        this.notiType = notiType;
        this.reciveTime = reciveTime;
        this.isRead = isRead;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Employee getReciver() {
        return reciver;
    }

    public void setReciver(Employee reciver) {
        this.reciver = reciver;
    }

    public NotiType getNotiType() {
        return notiType;
    }

    public void setNotiType(NotiType notiType) {
        this.notiType = notiType;
    }

    public LocalDateTime getReciveTime() {
        return reciveTime;
    }

    public void setReciveTime(LocalDateTime reciveTime) {
        this.reciveTime = reciveTime;
    }

    public boolean isIsRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
