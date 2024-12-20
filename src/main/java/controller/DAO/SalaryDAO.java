/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller.DAO;

import model.Employee;
import model.PayPeriod;
import model.Salary;

/**
 *
 * @author PC
 */
public interface SalaryDAO extends InterfaceDAO<Salary> {

    Salary getByEmployeeAndPayPeriod(Employee employee, PayPeriod payPeriod);
}
