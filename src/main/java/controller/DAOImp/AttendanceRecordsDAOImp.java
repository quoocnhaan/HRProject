/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.AttendanceRecordsDAO;
import java.util.List;
import model.AttendanceRecords;
import model.Role;
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
public class AttendanceRecordsDAOImp implements AttendanceRecordsDAO {

    private Session session;

    public AttendanceRecordsDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(AttendanceRecords t) {
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
    public AttendanceRecords get(long id) {
        return session.get(AttendanceRecords.class, id);
    }

    @Override
    public boolean update(AttendanceRecords t) {
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
            AttendanceRecords attendanceRecords = session.find(AttendanceRecords.class, id);
            session.delete(attendanceRecords); // Xóa role
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
    public List<AttendanceRecords> getAll() {
        Query<AttendanceRecords> query = session.createQuery("FROM AttendanceRecords", AttendanceRecords.class);
        return query.list();
    }
}
