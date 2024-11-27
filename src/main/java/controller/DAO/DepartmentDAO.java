/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller.DAO;

import java.util.List;
import javax.swing.tree.DefaultTreeModel;
import model.Department;
import model.Employee;

/**
 *
 * @author LENOVO
 */
public interface DepartmentDAO extends InterfaceDAO<Department> {

    List<Department> findChildren(long id);

    DefaultTreeModel getDefaultTreeModel(long id);

    Department getByName(String name);

    List<Employee> getEmployeesByDepartmentAndSubDepartments(long id);


}
