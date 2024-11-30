/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller.DAO;

import java.util.Date;
import model.LeaveRequest;

/**
 *
 * @author PC
 */
public interface LeaveRequestDAO extends InterfaceDAO<LeaveRequest>{
    LeaveRequest findByEmployeeIdAndRegistrationDate(long employeeId, Date registrationDate);
}
