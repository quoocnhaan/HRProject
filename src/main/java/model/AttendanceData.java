/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class AttendanceData {

    private String attendanceId;
    private List<Data> datas;

    public AttendanceData(String attendanceId) {
        this.attendanceId = attendanceId;
        this.datas = new ArrayList<>();
    }

    public void addData(String date, String time) {
        for (Data data : datas) {
            if (data.getDateWork().equals(date)) {
                if (data.getTimeIn() == null || time.compareTo(data.getTimeIn()) < 0) {
                    data.setTimeIn(time);
                }
                if (data.getTimeOut() == null || time.compareTo(data.getTimeOut()) > 0) {
                    data.setTimeOut(time);
                }
                return;
            }
        }
        datas.add(new Data(date, time, null));
    }

    @Override
    public String toString() {
        return "Attendance ID: " + attendanceId + ", Data: " + datas;
    }

    public String getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(String attendanceId) {
        this.attendanceId = attendanceId;
    }

    public List<Data> getDatas() {
        return datas;
    }

    public void setDatas(List<Data> datas) {
        this.datas = datas;
    }
    
    
}
