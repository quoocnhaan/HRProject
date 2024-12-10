/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.SalaryDAO;
import java.util.List;
import model.Employee;
import model.PayPeriod;
import model.Salary;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author PC
 */
public class SalaryDAOImp implements SalaryDAO {

    private Session session;

    public SalaryDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(Salary t) {
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
    public Salary get(long id) {
        return session.get(Salary.class, id);
    }

    @Override
    public boolean update(Salary t) {
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
            Salary salary = session.find(Salary.class, id);
            session.delete(salary); // Xóa role
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
    public List<Salary> getAll() {
        Query<Salary> query = session.createQuery("FROM Salary", Salary.class);
        return query.list();
    }

    @Override
    public Salary getByEmployeeAndPayPeriod(Employee employee, PayPeriod payPeriod) {
        String hql = "FROM Salary s WHERE s.employee = :employee AND s.payPeriod = :payPeriod";
        Query query = session.createQuery(hql);
        query.setParameter("employee", employee);
        query.setParameter("payPeriod", payPeriod);
        return (Salary) query.uniqueResult();
    }
}
