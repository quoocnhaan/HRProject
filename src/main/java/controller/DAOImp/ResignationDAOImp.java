/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.ResignationDAO;
import java.util.List;
import model.Job;
import model.Resignation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 *
 * @author PC
 */
public class ResignationDAOImp implements ResignationDAO {

    private SessionFactory sessionFactory;
    private Transaction transaction;

    public ResignationDAOImp() {
        sessionFactory = HibernateUtil.getSessionFactory();
        transaction = null;
    }

    @Override
    public boolean add(Resignation t) {
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
    public Resignation get(long id) {
        Resignation resignation = null;
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            resignation = session.find(Resignation.class, id);

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
        return resignation;
    }

    @Override
    public boolean update(Resignation t) {
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

            Query<Resignation> query = session.createQuery("FROM Resignation WHERE id = :id", Resignation.class);
            query.setParameter("id", id);

            Resignation resignation = query.uniqueResult();
            session.delete(resignation);

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
    public List<Resignation> getAll() {
        List<Resignation> resignations = null;
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            String hql = "FROM Resignation";
            Query<Resignation> query = session.createQuery(hql, Resignation.class);
            resignations = query.list();

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
        return resignations;
    }
}
