/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.RoleDetailDAO;
import java.util.List;
import model.Job;
import model.Role;
import model.RoleDetail;
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
public class RoleDetailDAOImp implements RoleDetailDAO {

    private Session session;

    public RoleDetailDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(RoleDetail t) {
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
    public RoleDetail get(long id) {
        return session.get(RoleDetail.class, id);
    }

    @Override
    public boolean update(RoleDetail t) {
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
            RoleDetail roleDetail = session.find(RoleDetail.class, id);
            session.delete(roleDetail); // Xóa role
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
    public List<RoleDetail> getAll() {
        Query<RoleDetail> query = session.createQuery("FROM RoleDetail", RoleDetail.class);
        return query.list();
    }

    @Override
    public RoleDetail getByRoleId(long id) {
        Query<RoleDetail> query = session.createQuery("FROM RoleDetail r WHERE r.role.id = :id", RoleDetail.class);
        query.setParameter("id", id);

        return query.uniqueResult();
    }
}
