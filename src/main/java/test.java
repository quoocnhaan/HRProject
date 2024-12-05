
import controller.Functional.Functional;
import javax.swing.ImageIcon;
import model.Department;
import model.Function;
import model.Role;
import model.User;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PC
 */
public class test {

    public static void main(String[] args) {
        // Tạo cấu hình Hibernate từ hibernate.cfg.xml
        // Tạo phiên làm việc (session) với cơ sở dữ liệu
        Transaction transaction = null;

//        FunctionDAO f = new FunctionDAOImp();
//        RoleDAO r = new RoleDAOImp();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            // Bắt đầu data mẫu
            Department department1 = new Department("D00001", "Công ty Cổ phần Tin học Quốc Nhân", null, null, null, 0, 1, true);
            Department department2 = new Department("D00011", "Chi nhánh HCM", null, null, department1, 0, 2, true);
            Department department3 = new Department("D00111", "Khối phần mềm DX", null, null, department2, 0, 3, true);
            Department department4 = new Department("D01111", "DSC-Nhóm kinh doanh 1", null, null, department3, 0, 4, true);
            Department department5 = new Department("D01112", "Trung tâm DXS", null, null, department3, 0, 4, true);
            Department department6 = new Department("D00112", "Trung tâm CDC", null, null, department2, 0, 3, true);
            Department department7 = new Department("D01113", "Phòng CSKH", null, null, department6, 0, 4, true);
            Department department8 = new Department("D01114", "Phòng triển khai CĐS", null, null, department6, 0, 4, true);
            Department department9 = new Department("D00012", "Chi nhánh HN", null, null, department1, 0, 2, true);
            Department department10 = new Department("D00113", "Nhóm kinh doanh giải pháp", null, null, department9, 0, 3, true);
            Department department11 = new Department("D00114", "Phòng kế toán HN", null, null, department9, 0, 3, true);

            session.save(department1);
            session.save(department2);
            session.save(department3);
            session.save(department4);
            session.save(department5);
            session.save(department6);
            session.save(department7);
            session.save(department8);
            session.save(department9);
            session.save(department10);
            session.save(department11);

            Role role1 = new Role("Quản lý", null, true);
            Role role2 = new Role("HR", null, true);
            Role role3 = new Role("Nhân viên", null, true);

            session.save(role1);
            session.save(role2);
            session.save(role3);

            User user1 = new User("quocnhan56", "123", null);
            User user2 = new User("hoanghuu123", "123", null);

            session.save(user1);
            session.save(user2);

            ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/func_emp_manage.png"));
            ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/func_department_manage.png"));
            ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/func_salary_manage.png"));
            ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/func_leave_manage.png"));

//            Function function1 = new Function("F0001", "Quản lý hồ sơ nhân viên", Functional.convertIconToByteArray(icon1), "108,151,218", true);
//            Function function2 = new Function("F0002", "Quản lý thông tin phòng ban", Functional.convertIconToByteArray(icon2), "241,111,82", true);
//            Function function3 = new Function("F0003", "Quản lý lương", Functional.convertIconToByteArray(icon3), "242,183,5", true);
//            Function function4 = new Function("F0004", "Quản lý nghỉ phép", Functional.convertIconToByteArray(icon4), "4,89,74", true);
//
//            session.save(function1);
//            session.save(function2);
//            session.save(function3);
//            session.save(function4);
//            // Kết thúc data mẫu
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
    }
}
