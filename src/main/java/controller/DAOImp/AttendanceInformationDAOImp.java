/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.AttendanceInformationDAO;
import java.util.List;
import model.AttendanceInformation;
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
public class AttendanceInformationDAOImp implements AttendanceInformationDAO {

    private Session session;

    public AttendanceInformationDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(AttendanceInformation t) {
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
    public AttendanceInformation get(long id) {
        return session.get(AttendanceInformation.class, id);
    }

    @Override
    public boolean update(AttendanceInformation t) {
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
            AttendanceInformation attendanceInformation = session.find(AttendanceInformation.class, id);
            session.delete(attendanceInformation); // Xóa role
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
    public List<AttendanceInformation> getAll() {
        Query<AttendanceInformation> query = session.createQuery("FROM AttendanceInformation", AttendanceInformation.class);
        return query.list();
    }
}
