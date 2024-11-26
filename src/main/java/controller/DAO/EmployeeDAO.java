/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller.DAO;

import model.Employee;

/**
 *
 * @author PC
 */
public interface EmployeeDAO extends InterfaceDAO<Employee>{
    Employee getByEmployeeId(String employeeId);
}
