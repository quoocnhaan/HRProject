/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.AttendanceRecordsDAO;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import model.AttendanceInformation;
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

    @Override
    public AttendanceRecords getByAttendanceId(String attendanceId) {
        Query<AttendanceRecords> query = session.createQuery("FROM AttendanceRecords a WHERE a.attendanceInformation.attendanceId = :attendanceId", AttendanceRecords.class);
        query.setParameter("attendanceId", attendanceId);

        return query.uniqueResult();
    }

    @Override
    public AttendanceRecords findByAttendanceInformationAndDate(AttendanceInformation attendanceInformation, Date workDate) {
        String hql = "FROM AttendanceRecords WHERE attendanceInformation = :attendanceInformation AND DATE(workDate) = :workDate";
        Query query = session.createQuery(hql);
        query.setParameter("attendanceInformation", attendanceInformation);
        query.setParameter("workDate", workDate);
        return (AttendanceRecords) query.uniqueResult();  // Trả về null nếu không tìm thấy
    }

    @Override
    public List<AttendanceRecords> getByAttendanceInformationAndPayPeriod(AttendanceInformation attendanceInformation, LocalDate startDate, LocalDate endDate) {
        String hql = "FROM AttendanceRecords ar WHERE ar.attendanceInformation = :attendanceInformation AND ar.workDate BETWEEN :startDate AND :endDate";
        Query query = session.createQuery(hql);
        query.setParameter("attendanceInformation", attendanceInformation);
        query.setParameter("startDate", Date.valueOf(startDate));
        query.setParameter("endDate", Date.valueOf(endDate));
        return query.list();
    }
}
