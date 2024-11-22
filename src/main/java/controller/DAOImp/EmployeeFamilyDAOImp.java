/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.EmployeeFamilyDAO;
import java.util.List;
import model.EmployeeFamily;
import model.Salary;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author PC
 */
public class EmployeeFamilyDAOImp implements EmployeeFamilyDAO {

    private Session session;

    public EmployeeFamilyDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(EmployeeFamily t) {
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(t); // Hibernate tự động quyết định là save hay update
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback nếu có lỗi xảy ra
            }
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public EmployeeFamily get(long id) {
        return session.get(EmployeeFamily.class, id);
    }

    @Override
    public boolean update(EmployeeFamily t) {
        Transaction transaction = session.beginTransaction();
        try {
            session.update(t);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback nếu có lỗi
            }
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(long id) {
        Transaction transaction = session.beginTransaction();
        try {
            EmployeeFamily employeeFamily = session.find(EmployeeFamily.class, id);
            session.delete(employeeFamily); // Xóa role
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback nếu có lỗi
            }
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public List<EmployeeFamily> getAll() {
        Query<EmployeeFamily> query = session.createQuery("FROM EmployeeFamily", EmployeeFamily.class);
        return query.list();
    }
}
