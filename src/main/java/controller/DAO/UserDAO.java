/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller.DAO;

import model.User;

/**
 *
 * @author LENOVO
 */
public interface UserDAO extends InterfaceDAO<User> {

    User getByUsernameAndPassword(String username, String password);
}
