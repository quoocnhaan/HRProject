/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DAOImp;

import controller.DAO.DepartmentDAO;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import model.Department;
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
public class DepartmentDAOImp implements DepartmentDAO {

    private Session session;

    public DepartmentDAOImp(Session session) {
        this.session = session;
    }

    @Override
    public boolean add(Department t) {
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
    public Department get(long id) {
        return session.get(Department.class, id);
    }

    @Override
    public boolean update(Department t) {
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
            Department department = session.find(Department.class, id);
            session.delete(department); // Xóa role
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
    public List<Department> getAll() {
        Query<Department> query = session.createQuery("FROM Department", Department.class);
        return query.list();
    }

    @Override
    public List<Department> findChildren(long id) {
        List<Department> departments = null;
        Transaction transaction = session.beginTransaction();
        try {
            String hql = "FROM Department d where d.parent.id = :id";
            Query<Department> query = session.createQuery(hql, Department.class);
            query.setParameter("id", id);
            departments = query.list();

            // Hoàn thành transaction
            transaction.commit();

            // In ra thông báo
            System.out.println("Success !");
            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return departments;
    }

    private DefaultMutableTreeNode getDefaultMutableTreeNode(Department parent) {
        List<Department> children = findChildren(parent.getId());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(parent.getName());

        if (!children.isEmpty()) {
            for (Department department : children) {
                root.add(getDefaultMutableTreeNode(department));
            }
        }
        return root;
    }

    @Override
    public DefaultTreeModel getDefaultTreeModel(long id) {
        return new DefaultTreeModel(getDefaultMutableTreeNode(get(id)));
    }
}
