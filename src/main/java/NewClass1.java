
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
        Function f1 = functionDAO.get(1);
        Role r1 = roleDAO.get(1);
        FunctionAuthorization functionAuthorization = new FunctionAuthorization(f1, r1, true, true, true, true, true);
        
        // Cập nhật quan hệ
        r1.getFunctions().add(f1);
        f1.getRoles().add(r1);
        
        // Cập nhật Role và Function
        roleDAO.update(r1); // Cập nhật Role
        functionDAO.update(f1); // Cập nhật Function
        functionAuthorizationDAO.add(functionAuthorization);
        
        // Commit giao dịch và đóng session
        session.close();
    }
}
