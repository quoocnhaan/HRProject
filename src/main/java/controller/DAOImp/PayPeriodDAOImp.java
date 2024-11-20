/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.PayPeriodDAO;
import java.util.List;
import model.PayPeriod;
import model.Role;
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

    private SessionFactory sessionFactory;
    private Transaction transaction;

    public PayPeriodDAOImp() {
        sessionFactory = HibernateUtil.getSessionFactory();
        transaction = null;
    }

    @Override
    public boolean add(PayPeriod t) {
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            session.save(t);

            // Hoàn thành transaction
            transaction.commit();

            // In ra thông báo
            System.out.println("Success !");
            return true;
            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public PayPeriod get(long id) {
        PayPeriod payPeriod = null;
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            payPeriod = session.find(PayPeriod.class, id);

            // Hoàn thành transaction
            transaction.commit();

            // In ra thông báo
            System.out.println("Success !");
            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return payPeriod;
    }

    @Override
    public boolean update(PayPeriod t) {
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            session.update(t);

            // Hoàn thành transaction
            transaction.commit();

            // In ra thông báo
            System.out.println("Success !");
            return true;
            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(long id) {
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            Query<PayPeriod> query = session.createQuery("FROM PayPeriod WHERE id = :id", PayPeriod.class);
            query.setParameter("id", id);

            PayPeriod payPeriod = query.uniqueResult();
            session.delete(payPeriod);

            // Hoàn thành transaction
            transaction.commit();

            // In ra thông báo
            System.out.println("Success !");
            return true;
            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<PayPeriod> getAll() {
        List<PayPeriod> payPeriods = null;
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            String hql = "FROM PayPeriod";
            Query<PayPeriod> query = session.createQuery(hql, PayPeriod.class);
            payPeriods = query.list();

            // Hoàn thành transaction
            transaction.commit();

            // In ra thông báo
            System.out.println("Success !");
            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return payPeriods;
    }
}
