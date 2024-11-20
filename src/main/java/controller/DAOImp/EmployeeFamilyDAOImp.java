/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.EmployeeFamilyDAO;
import java.util.List;
import model.EmployeeFamily;
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
public class EmployeeFamilyDAOImp implements EmployeeFamilyDAO {

    private SessionFactory sessionFactory;
    private Transaction transaction;

    public EmployeeFamilyDAOImp() {
        sessionFactory = HibernateUtil.getSessionFactory();
        transaction = null;
    }

    @Override
    public boolean add(EmployeeFamily t) {
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
    public EmployeeFamily get(long id) {
        EmployeeFamily employeeFamily = null;
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            employeeFamily = session.find(EmployeeFamily.class, id);

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
        return employeeFamily;
    }

    @Override
    public boolean update(EmployeeFamily t) {
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

            Query<EmployeeFamily> query = session.createQuery("FROM EmployeeFamily WHERE id = :id", EmployeeFamily.class);
            query.setParameter("id", id);

            EmployeeFamily employeeFamily = query.uniqueResult();
            session.delete(employeeFamily);

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
    public List<EmployeeFamily> getAll() {
        List<EmployeeFamily> employeeFamilys = null;
        try (Session session = sessionFactory.openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            String hql = "FROM EmployeeFamily";
            Query<EmployeeFamily> query = session.createQuery(hql, EmployeeFamily.class);
            employeeFamilys = query.list();

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
        return employeeFamilys;
    }
}
