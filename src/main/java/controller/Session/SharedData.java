/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Session;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class SharedData {
    
    private List<String> employeeId_Selected;
    private static SharedData instance;

    public SharedData() {
        employeeId_Selected = new ArrayList<>();
    }
    
    public static SharedData getInstance() {
        if(instance == null) 
            instance = new SharedData();
        return instance;
    }

    public List<String> getEmployeeId_Selected() {
        return employeeId_Selected;
    }

    public void setEmployeeId_Selected(List<String> employeeId_Selected) {
        this.employeeId_Selected = employeeId_Selected;
    }
    
    
    
}
