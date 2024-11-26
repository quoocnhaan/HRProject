/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Session;

import java.util.ArrayList;
import java.util.List;
import model.Employee;

/**
 *
 * @author LENOVO
 */
public class SharedData {

    private List<Employee> employee_Selected;
    private static SharedData instance;

    public SharedData() {
        employee_Selected = new ArrayList<>();
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

}
