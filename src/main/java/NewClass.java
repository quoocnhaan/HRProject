
import controller.DAO.AttendanceInformationDAO;
import controller.DAOImp.AttendanceInformationDAOImp;
import java.time.LocalTime;
import model.AttendanceInformation;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import util.HibernateUtil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
public class NewClass {

    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            AttendanceInformationDAO attendanceInformationDAO = new AttendanceInformationDAOImp(session);

            AttendanceInformation attendanceInformation1 = new AttendanceInformation("a", null, LocalTime.of(9, 0), LocalTime.of(18, 0), true);
            AttendanceInformation attendanceInformation2 = new AttendanceInformation("a", null, LocalTime.of(9, 0), LocalTime.of(18, 0), true);
            AttendanceInformation attendanceInformation3 = new AttendanceInformation("a", null, LocalTime.of(9, 0), LocalTime.of(18, 0), true);

            attendanceInformationDAO.add(attendanceInformation1);
            attendanceInformationDAO.add(attendanceInformation2);
            attendanceInformationDAO.add(attendanceInformation3);

        } catch (Exception e) {
        }
    }
}
