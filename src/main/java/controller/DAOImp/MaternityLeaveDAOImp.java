/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.MaternityLeaveDAO;
import java.util.List;
import model.MaternityLeave;
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
public class MaternityLeaveDAOImp implements MaternityLeaveDAO {

    private Session session;

    public MaternityLeaveDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(MaternityLeave t) {
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
    public MaternityLeave get(long id) {
        return session.get(MaternityLeave.class, id);
    }

    @Override
    public boolean update(MaternityLeave t) {
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
            MaternityLeave maternityLeave = session.find(MaternityLeave.class, id);
            session.delete(maternityLeave); // Xóa role
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
    public List<MaternityLeave> getAll() {
        Query<MaternityLeave> query = session.createQuery("FROM MaternityLeave", MaternityLeave.class);
        return query.list();
    }
}
