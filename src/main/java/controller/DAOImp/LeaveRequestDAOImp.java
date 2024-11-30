/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.LeaveRequestDAO;
import java.util.Date;
import java.util.List;
import model.LeaveRequest;
import model.Salary;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author PC
 */
public class LeaveRequestDAOImp implements LeaveRequestDAO {

    private Session session;

    public LeaveRequestDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(LeaveRequest t) {
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
    public LeaveRequest get(long id) {
        return session.get(LeaveRequest.class, id);
    }

    @Override
    public boolean update(LeaveRequest t) {
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
            LeaveRequest leaveRequest = session.find(LeaveRequest.class, id);
            session.delete(leaveRequest); // Xóa role
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
    public List<LeaveRequest> getAll() {
        Query<LeaveRequest> query = session.createQuery("FROM LeaveRequest", LeaveRequest.class);
        return query.list();
    }

    @Override
    public LeaveRequest findByEmployeeIdAndRegistrationDate(long employeeId, Date registrationDate) {
        Query<LeaveRequest> query = session.createQuery(
                "FROM LeaveRequest l WHERE l.employee.id = :id AND l.registrationDate = :date", LeaveRequest.class
        );
        query.setParameter("id", employeeId);
        query.setParameter("date", registrationDate);
        return query.uniqueResult();
    }

}
