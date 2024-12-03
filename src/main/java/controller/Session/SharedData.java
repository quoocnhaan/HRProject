/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Session;

import java.util.ArrayList;
import java.util.List;
import model.DateRange;
import model.Employee;

/**
 *
 * @author LENOVO
 */
public class SharedData {

    private List<Employee> employee_Selected;
    private List<Employee> employee_Leave;
    private List<Employee> employee_Salary;
    private List<DateRange> dateRanges;
    private DateRange curDateRange;
    private static SharedData instance;

    public SharedData() {
        employee_Selected = new ArrayList<>();
        employee_Leave = new ArrayList<>();
        employee_Salary = new ArrayList<>();
        dateRanges = new ArrayList<>();
    }

    public static SharedData getInstance() {
        if (instance == null) {
            instance = new SharedData();
        }
        return instance;
    }

    public List<Employee> getEmployee_Selected() {
        return employee_Selected;
    }

    public void setEmployee_Selected(List<Employee> employee_Selected) {
        this.employee_Selected = employee_Selected;
    }

    public List<Employee> getEmployee_Leave() {
        return employee_Leave;
    }

    public void setEmployee_Leave(List<Employee> employee_Leave) {
        this.employee_Leave = employee_Leave;
    }

    public List<Employee> getEmployee_Salary() {
        return employee_Salary;
    }

    public void setEmployee_Salary(List<Employee> employee_Salary) {
        this.employee_Salary = employee_Salary;
    }

    public List<DateRange> getDateRanges() {
        return dateRanges;
    }

    public void setDateRanges(List<DateRange> dateRanges) {
        this.dateRanges = dateRanges;
    }

    public DateRange getCurDateRange() {
        return curDateRange;
    }

    public void setCurDateRange(DateRange curDateRange) {
        this.curDateRange = curDateRange;
    }

}
