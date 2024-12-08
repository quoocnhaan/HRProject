/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Data {

    private String dateWork;
    private String timeIn;
    private String timeOut;

    public Data(String dateWork, String timeIn, String timeOut) {
        this.dateWork = dateWork;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    @Override
    public String toString() {
        return "Date: " + dateWork + ", TimeIn: " + timeIn + ", TimeOut: " + timeOut;
    }

    public String getDateWork() {
        return dateWork;
    }

    public void setDateWork(String dateWork) {
        this.dateWork = dateWork;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }
    
    
}
