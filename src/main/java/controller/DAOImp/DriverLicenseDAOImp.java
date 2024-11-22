/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.DriverLicenseDAO;
import java.util.List;
import model.DriverLicense;
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
public class DriverLicenseDAOImp implements DriverLicenseDAO {

    private Session session;

    public DriverLicenseDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(DriverLicense t) {
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
    public DriverLicense get(long id) {
        return session.get(DriverLicense.class, id);
    }

    @Override
    public boolean update(DriverLicense t) {
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
            DriverLicense driverLicense = session.find(DriverLicense.class, id);
            session.delete(driverLicense); // Xóa role
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
    public List<DriverLicense> getAll() {
        Query<DriverLicense> query = session.createQuery("FROM DriverLicense", DriverLicense.class);
        return query.list();
    }
}
