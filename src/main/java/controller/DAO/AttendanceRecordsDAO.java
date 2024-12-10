/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller.DAO;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import model.AttendanceInformation;
import model.AttendanceRecords;

/**
 *
 * @author LENOVO
 */
public interface AttendanceRecordsDAO extends InterfaceDAO<AttendanceRecords> {

    AttendanceRecords getByAttendanceId(String attendanceId);

    AttendanceRecords findByAttendanceInformationAndDate(AttendanceInformation attendanceInformation, Date workDate);

    List<AttendanceRecords> getByAttendanceInformationAndPayPeriod(AttendanceInformation attendanceInformation, LocalDate startDate, LocalDate endDate);
}
