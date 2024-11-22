/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.PaidLeaveDAO;
import java.util.List;
import model.PaidLeave;
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
public class PaidLeaveDAOImp implements PaidLeaveDAO {

    private Session session;

    public PaidLeaveDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(PaidLeave t) {
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
    public PaidLeave get(long id) {
        return session.get(PaidLeave.class, id);
    }

    @Override
    public boolean update(PaidLeave t) {
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
            PaidLeave paidLeave = session.find(PaidLeave.class, id);
            session.delete(paidLeave); // Xóa role
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
    public List<PaidLeave> getAll() {
        Query<PaidLeave> query = session.createQuery("FROM PaidLeave", PaidLeave.class);
        return query.list();
    }
}
