/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.RoleDAO;
import java.util.List;
import model.Employee;
import model.Role;
import model.Salary;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author LENOVO
 */
public class RoleDAOImp implements RoleDAO {

    private Session session;

    public RoleDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(Role t) {
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
    public Role get(long id) {
        return session.get(Role.class, id);
    }

    @Override
    public boolean update(Role t) {
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
            Role role = session.find(Role.class, id);
            session.delete(role); // Xóa role
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
    public List<Role> getAll() {
        Query<Role> query = session.createQuery("FROM Role", Role.class);
        return query.list();
    }

    @Override
    public Role getByName(String name) {
        Query<Role> query = session.createQuery("FROM Role r WHERE r.name = :name", Role.class);
        query.setParameter("name", name);

        return query.uniqueResult();
    }
}
