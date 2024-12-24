/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.EmployeeDAO;
import java.util.List;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author PC
 */
public class EmployeeDAOImp implements EmployeeDAO {

    private Session session;

    public EmployeeDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(Employee t) {
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
    public Employee get(long id) {
        return session.get(Employee.class, id);
    }

    @Override
    public boolean update(Employee t) {
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
            Employee employee = session.find(Employee.class, id);
            session.delete(employee); // Xóa role
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
    public List<Employee> getAll() {
        Query<Employee> query = session.createQuery("FROM Employee e", Employee.class);
        return query.list();
    }

    @Override
    public Employee getByEmployeeId(String employeeId) {
        Query<Employee> query = session.createQuery("FROM Employee WHERE employeeId = :employeeId", Employee.class);
        query.setParameter("employeeId", employeeId);
        return query.uniqueResult();
    }

    @Override
    public Employee getByUserId(long userId) {
        Query<Employee> query = session.createQuery("FROM Employee e WHERE e.user.id = :userId", Employee.class);
        query.setParameter("userId", userId);

        return query.uniqueResult();
    }

    @Override
    public Employee getByAttendanceId(String attendanceId) {
        Query<Employee> query = session.createQuery("FROM Employee e WHERE e.attendanceInformation.attendanceId = :attendanceId", Employee.class);
        query.setParameter("attendanceId", attendanceId);

        return query.uniqueResult();
    }

    @Override
    public boolean firedEmployee(Employee employee) {
        Transaction transaction = session.beginTransaction();
        try {
            employee.setStatus(false);
            session.update(employee);
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
    public int getTotal() {
        Query<Employee> query = session.createQuery("FROM Employee e WHERE e.status = true", Employee.class);
        return query.list().size();
    }
}
