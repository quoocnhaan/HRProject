/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.MaternityLeaveDAO;
import java.util.List;
import model.MaternityLeave;
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
public class MaternityLeaveDAOImp implements MaternityLeaveDAO {

    private SessionFactory sessionFactory;
    private Transaction transaction;

    public MaternityLeaveDAOImp() {
        sessionFactory = HibernateUtil.getSessionFactory();
        transaction = null;
    }

    @Override
    public boolean add(MaternityLeave t) {
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
    public MaternityLeave get(long id) {
        MaternityLeave maternityLeave = null;
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            maternityLeave = session.find(MaternityLeave.class, id);

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
        return maternityLeave;
    }

    @Override
    public boolean update(MaternityLeave t) {
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

            Query<MaternityLeave> query = session.createQuery("FROM MaternityLeave WHERE id = :id", MaternityLeave.class);
            query.setParameter("id", id);

            MaternityLeave maternityLeave = query.uniqueResult();
            session.delete(maternityLeave);

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
    public List<MaternityLeave> getAll() {
        List<MaternityLeave> maternityLeaves = null;
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            String hql = "FROM MaternityLeave";
            Query<MaternityLeave> query = session.createQuery(hql, MaternityLeave.class);
            maternityLeaves = query.list();

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
        return maternityLeaves;
    }
}
