/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.FunctionAuthorizationDAO;
import java.util.List;
import model.FunctionAuthorization;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author LENOVO
 */
public class FunctionAuthorizationDAOImp implements FunctionAuthorizationDAO {

    private Session session;

    public FunctionAuthorizationDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(FunctionAuthorization t) {
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
    public FunctionAuthorization get(long id) {
        return session.get(FunctionAuthorization.class, id);
    }

    @Override
    public boolean update(FunctionAuthorization t) {
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
            FunctionAuthorization functionAuthorization = session.find(FunctionAuthorization.class, id);
            session.delete(functionAuthorization); // Xóa role
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
    public List<FunctionAuthorization> getAll() {
        Query<FunctionAuthorization> query = session.createQuery("FROM FunctionAuthorization", FunctionAuthorization.class);
        return query.list();
    }
}
