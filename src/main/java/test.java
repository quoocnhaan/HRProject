
import java.sql.Date;
import model.Role;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class test {
    public static void main(String[] args) {
        // Tạo cấu hình Hibernate từ hibernate.cfg.xml

        // Tạo phiên làm việc (session) với cơ sở dữ liệu
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        
        try {
            // Bắt đầu một transaction
            transaction = session.beginTransaction();

            // Tạo một đối tượng User và lưu vào cơ sở dữ liệu
            Role role = new Role(0, "a", new Date(2020, 1, 1), 0, true);
            session.save(role); // Lưu đối tượng user vào DB

            // Hoàn thành transaction
            transaction.commit();

            // In ra thông báo
            System.out.println("User đã được thêm thành công!");

            // Lấy lại dữ liệu vừa lưu từ cơ sở dữ liệu
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            // Đóng phiên làm việc
            session.close();
        }
    }
}
