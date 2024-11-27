
import controller.DAO.ContactDAO;
import controller.DAO.ContractDAO;
import controller.DAO.DepartmentDAO;
import controller.DAO.EmployeeDAO;
import controller.DAO.FunctionAuthorizationDAO;
import controller.DAO.FunctionDAO;
import controller.DAO.JobDAO;
import controller.DAO.RoleDAO;
import controller.DAOImp.ContactDAOImp;
import controller.DAOImp.ContractDAOImp;
import controller.DAOImp.DepartmentDAOImp;
import controller.DAOImp.EmployeeDAOImp;
import controller.DAOImp.FunctionAuthorizationDAOImp;
import controller.DAOImp.FunctionDAOImp;
import controller.DAOImp.JobDAOImp;
import controller.DAOImp.RoleDAOImp;
import controller.Functional.Functional;
import java.util.Date;
import javax.swing.ImageIcon;
import model.Contact;
import model.Contract;
import model.Department;
import model.Employee;
import model.Function;
import model.FunctionAuthorization;
import model.Job;
import model.Role;
import org.hibernate.Session;
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
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {

            RoleDAO roleDAO = new RoleDAOImp(session);
            FunctionDAO functionDAO = new FunctionDAOImp(session);
            FunctionAuthorizationDAO functionAuthorizationDAO = new FunctionAuthorizationDAOImp(session);
            EmployeeDAO employeeDAO = new EmployeeDAOImp(session);
            ContractDAO contractDAO = new ContractDAOImp(session);
            ContactDAO contactDAO = new ContactDAOImp(session);
            JobDAO jobDAO = new JobDAOImp(session);
            DepartmentDAO departmentDAO = new DepartmentDAOImp(session);

            String name = "Lâm Quốc Nhân";
            String employeeId = "LQN2005";
            String profession = "Web Developer";
            String direct = "Trung tam CDC";
            byte[] img = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("img/avatar.jpg")));
            String dateOfBirth = "20/09/2005";
            String place = "Thành phố Hồ Chí Minh";
            String gender = "Nam";
            String startDate = "15/10/2024";
            String seniority = "1 năm";
            String type = "Chinh thuc";
            String email = "quocnhan56@gmail.com";
            String phone = "0968270553";
            String twitter = "quocnhan56@gmail.com";

            Department department = departmentDAO.get(1L);
            Contact contact = new Contact(email, phone, place);
            Job job = new Job(new Date(2024, 10, 15), profession, type);
            Employee e = new Employee(name, department, employeeId, img, new Date(2005, 9, 20), true, 1, null, contact);
            Contract contract = new Contract(direct, e, job);
            
            contactDAO.add(contact);
            jobDAO.add(job);
            employeeDAO.add(e);
            contractDAO.add(contract);

            // Lấy dữ liệu
//            Role r1 = roleDAO.get(1);
//            Function f1 = functionDAO.get(1);
//            FunctionAuthorization functionAuthorization1 = new FunctionAuthorization(f1, r1, true, true, true, true, true);
//            r1.getFunctions().add(f1);
//            f1.getRoles().add(r1);
//
//            roleDAO.update(r1);
//            functionDAO.update(f1);
//            functionAuthorizationDAO.add(functionAuthorization1);
//
//            Function f2 = functionDAO.get(2);
//            FunctionAuthorization functionAuthorization2 = new FunctionAuthorization(f2, r1, true, true, true, true, true);
//            r1.getFunctions().add(f2);
//            f2.getRoles().add(r1);
//
//            roleDAO.update(r1);
//            functionDAO.update(f2);
//            functionAuthorizationDAO.add(functionAuthorization2);
//
//            Function f3 = functionDAO.get(3);
//            FunctionAuthorization functionAuthorization3 = new FunctionAuthorization(f3, r1, true, true, true, true, true);
//            r1.getFunctions().add(f3);
//            f3.getRoles().add(r1);
//
//            roleDAO.update(r1);
//            functionDAO.update(f3);
//            functionAuthorizationDAO.add(functionAuthorization3);
//
//            Function f4 = functionDAO.get(4);
//            FunctionAuthorization functionAuthorization4 = new FunctionAuthorization(f4, r1, true, true, true, true, true);
//            r1.getFunctions().add(f4);
//            f4.getRoles().add(r1);
//
//            roleDAO.update(r1);
//            functionDAO.update(f4);
//            functionAuthorizationDAO.add(functionAuthorization4);
        } catch (Exception e) {
        }
    }
}
