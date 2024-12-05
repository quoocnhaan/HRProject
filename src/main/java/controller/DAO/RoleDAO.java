/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller.DAO;

import model.Role;

/**
 *
 * @author LENOVO
 */
public interface RoleDAO extends InterfaceDAO<Role>{
    Role getByName(String name);
}
