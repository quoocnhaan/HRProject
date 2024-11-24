
import controller.DAO.FunctionAuthorizationDAO;
import controller.DAO.FunctionDAO;
import controller.DAO.RoleDAO;
import controller.DAOImp.FunctionAuthorizationDAOImp;
import controller.DAOImp.FunctionDAOImp;
import controller.DAOImp.RoleDAOImp;
import model.Function;
import model.FunctionAuthorization;
import model.Role;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC
 */
public class NewClass1 {

    public static void main(String[] args) {
        // Mở session
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Tạo DAO và truyền session vào
        RoleDAO roleDAO = new RoleDAOImp(session);
        FunctionDAO functionDAO = new FunctionDAOImp(session);
        FunctionAuthorizationDAO functionAuthorizationDAO = new FunctionAuthorizationDAOImp(session);

        // Lấy dữ liệu
        Role r1 = roleDAO.get(1);
        Function f1 = functionDAO.get(1);
        FunctionAuthorization functionAuthorization1 = new FunctionAuthorization(f1, r1, true, true, true, true, true);
        r1.getFunctions().add(f1);
        f1.getRoles().add(r1);

        roleDAO.update(r1);
        functionDAO.update(f1);
        functionAuthorizationDAO.add(functionAuthorization1);

        Function f2 = functionDAO.get(2);
        FunctionAuthorization functionAuthorization2 = new FunctionAuthorization(f2, r1, true, true, true, true, true);
        r1.getFunctions().add(f2);
        f2.getRoles().add(r1);

        roleDAO.update(r1);
        functionDAO.update(f2);
        functionAuthorizationDAO.add(functionAuthorization2);

        Function f3 = functionDAO.get(3);
        FunctionAuthorization functionAuthorization3 = new FunctionAuthorization(f3, r1, true, true, true, true, true);
        r1.getFunctions().add(f3);
        f3.getRoles().add(r1);

        roleDAO.update(r1);
        functionDAO.update(f3);
        functionAuthorizationDAO.add(functionAuthorization3);

        Function f4 = functionDAO.get(4);
        FunctionAuthorization functionAuthorization4 = new FunctionAuthorization(f4, r1, true, true, true, true, true);
        r1.getFunctions().add(f4);
        f4.getRoles().add(r1);

        roleDAO.update(r1);
        functionDAO.update(f4);
        functionAuthorizationDAO.add(functionAuthorization4);

        // Commit giao dịch và đóng session
        session.close();
    }
}
