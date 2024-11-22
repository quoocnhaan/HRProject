/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.FunctionDAO;
import java.util.List;
import model.Function;
import model.Role;
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
public class FunctionDAOImp implements FunctionDAO {

    private Session session;

    public FunctionDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(Function t) {
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(t); // Hibernate tự động quyết định là save hay update
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback nếu có lỗi xảy ra
            }
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Function get(long id) {
        return session.get(Function.class, id);
    }

    @Override
    public boolean update(Function t) {
        Transaction transaction = session.beginTransaction();
        try {
            session.update(t); // Cập nhật role
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
    public boolean delete(long id) {
        Transaction transaction = session.beginTransaction();
        try {
            Function function = session.find(Function.class, id);
            session.delete(function); // Xóa role
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
    public List<Function> getAll() {
        Query<Function> query = session.createQuery("FROM Function", Function.class);
        return query.list();
    }
}
