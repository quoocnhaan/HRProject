/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller.DAO;

import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface InterfaceDAO<T> {

    boolean add(T t);          

    T get(long id);            

    boolean update(T t);         

    boolean delete(long id);      

    List<T> getAll();        
}