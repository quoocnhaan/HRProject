/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.FunctionAuthorizationDAO;
import java.util.List;
import model.FunctionAuthorization;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 *
 * @author LENOVO
 */
public class FunctionAuthorizationDAOImp implements FunctionAuthorizationDAO {

    private SessionFactory sessionFactory;

    public FunctionAuthorizationDAOImp() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public boolean add(FunctionAuthorization t) {
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
    public FunctionAuthorization get(long id) {
        FunctionAuthorization functionAuthorization = null;
        try (Session session = sessionFactory.openSession()) {
            functionAuthorization = session.find(FunctionAuthorization.class, id);
            System.out.println("Success !");
            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
        } catch (Exception e) {
            e.printStackTrace();
        }
        return functionAuthorization;
    }

    @Override
    public boolean update(FunctionAuthorization t) {
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

            Query<FunctionAuthorization> query = session.createQuery("FROM FunctionAuthorization WHERE id = :id", FunctionAuthorization.class);
            query.setParameter("id", id);

            FunctionAuthorization functionAuthorization = query.uniqueResult();
            session.delete(functionAuthorization);

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
    public List<FunctionAuthorization> getAll() {
        List<FunctionAuthorization> functionAuthorizations = null;
        try (Session session = sessionFactory.openSession()) {
            String hql = "FROM FunctionAuthorization";
            Query<FunctionAuthorization> query = session.createQuery(hql, FunctionAuthorization.class);
            functionAuthorizations = query.list();

            // In ra thông báo
            System.out.println("Success !");
            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
        } catch (Exception e) {
            e.printStackTrace();
        }
        return functionAuthorizations;
    }
}
