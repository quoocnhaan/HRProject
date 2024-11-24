/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Session;

import model.Employee;

/**
 *
 * @author LENOVO
 */
public class MySession {
    public static Employee currentEmployee;

    public static void login(Employee employee) {
        currentEmployee = employee;
    }

    public static void logout() {
        currentEmployee = null;
    }
}
