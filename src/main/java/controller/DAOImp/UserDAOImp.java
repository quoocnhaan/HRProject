/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.UserDAO;
import java.util.List;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author LENOVO
 */
public class UserDAOImp implements UserDAO {

    private Session session;

    public UserDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(User t) {
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
    public User get(long id) {
        return session.get(User.class, id);
    }

    @Override
    public boolean update(User t) {
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
            User user = session.find(User.class, id);
            session.delete(user); // Xóa role
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
    public List<User> getAll() {
        Query<User> query = session.createQuery("FROM User", User.class);
        return query.list();
    }

    @Override
    public User getByUsernameAndPassword(String username, String password) {
        Query<User> query = session.createQuery("FROM User u WHERE u.userName = :username AND u.password = :password", User.class);
        query.setParameter("username", username);
        query.setParameter("password", password);

        return query.uniqueResult();
    }
}
