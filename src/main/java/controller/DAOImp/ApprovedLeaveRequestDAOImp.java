/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.ApprovedLeaveRequestDAO;
import java.util.List;
import model.ApprovedLeaveRequest;
import model.Salary;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 *
 * @author LENOVO
 */
public class ApprovedLeaveRequestDAOImp implements ApprovedLeaveRequestDAO {

    private Session session;

    public ApprovedLeaveRequestDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(ApprovedLeaveRequest t) {
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
    public ApprovedLeaveRequest get(long id) {
        return session.get(ApprovedLeaveRequest.class, id);
    }

    @Override
    public boolean update(ApprovedLeaveRequest t) {
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
            ApprovedLeaveRequest approvedLeaveRequest = session.find(ApprovedLeaveRequest.class, id);
            session.delete(approvedLeaveRequest); // Xóa role
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
    public List<ApprovedLeaveRequest> getAll() {
        Query<ApprovedLeaveRequest> query = session.createQuery("FROM ApprovedLeaveRequest", ApprovedLeaveRequest.class);
        return query.list();
    }
}
