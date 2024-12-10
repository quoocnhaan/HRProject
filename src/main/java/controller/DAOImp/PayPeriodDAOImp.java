/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.PayPeriodDAO;
import java.util.List;
import model.PayPeriod;
import model.Role;
import model.Salary;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 *
 * @author PC
 */
public class PayPeriodDAOImp implements PayPeriodDAO {

    private Session session;

    public PayPeriodDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(PayPeriod t) {
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
    public PayPeriod get(long id) {
        return session.get(PayPeriod.class, id);
    }

    @Override
    public boolean update(PayPeriod t) {
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
            PayPeriod payPeriod = session.find(PayPeriod.class, id);
            session.delete(payPeriod); // Xóa role
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
    public List<PayPeriod> getAll() {
        Query<PayPeriod> query = session.createQuery("FROM PayPeriod", PayPeriod.class);
        return query.list();
    }

    @Override
    public PayPeriod getByPayPeriodCode(String payPeriodCode) {
        Query<PayPeriod> query = session.createQuery("FROM PayPeriod p WHERE p.payPeriodCode = :payPeriodCode", PayPeriod.class);
        query.setParameter("payPeriodCode", payPeriodCode);
        return query.uniqueResult();
    }
}
