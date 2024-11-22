/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.TransportationAllowanceDAO;
import java.util.List;
import model.Job;
import model.TransportationAllowance;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 *
 * @author PC
 */
public class TransportationAllowanceDAOImp implements TransportationAllowanceDAO {

    private SessionFactory sessionFactory;

    public TransportationAllowanceDAOImp() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public boolean add(TransportationAllowance t) {
        Transaction transaction = null;
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
    public TransportationAllowance get(long id) {
        TransportationAllowance transportationAllowance = null;
        try (Session session = sessionFactory.openSession()) {

            transportationAllowance = session.find(TransportationAllowance.class, id);

            // In ra thông báo
            System.out.println("Success !");
            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transportationAllowance;
    }

    @Override
    public boolean update(TransportationAllowance t) {
        Transaction transaction = null;
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
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            Query<TransportationAllowance> query = session.createQuery("FROM TransportationAllowance WHERE id = :id", TransportationAllowance.class);
            query.setParameter("id", id);

            TransportationAllowance transportationAllowance = query.uniqueResult();
            session.delete(transportationAllowance);

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
    public List<TransportationAllowance> getAll() {
        List<TransportationAllowance> transportationAllowances = null;
        try (Session session = sessionFactory.openSession()) {

            String hql = "FROM TransportationAllowance";
            Query<TransportationAllowance> query = session.createQuery(hql, TransportationAllowance.class);
            transportationAllowances = query.list();

            // In ra thông báo
            System.out.println("Success !");
            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transportationAllowances;
    }
}
