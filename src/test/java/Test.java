
import controller.DAO.NavigationItemDAO;
import controller.DAOImp.NavigationItemDAOImp;
import controller.Functional.Functional;
import javax.swing.ImageIcon;
import model.NavigationItem;
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
public class Test {

    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            NavigationItemDAO navigationItemDAO = new NavigationItemDAOImp(session);

//            byte[] focusingIcon = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/29.png")));
//            byte[] exitedIcon = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/28.png")));
//
//            NavigationItem navigationItem = new NavigationItem("Product", focusingIcon, exitedIcon, true);
//            navigationItemDAO.add(navigationItem);
            byte[] home_f = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/home_f.png")));
            byte[] home_e = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/home_e.png")));
            NavigationItem home = new NavigationItem("Home", home_f, home_e, true);
            navigationItemDAO.add(home);

            byte[] inventory_f = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/inventory_f.png")));
            byte[] inventory_e = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/inventory_e.png")));
            NavigationItem inventory = new NavigationItem("Inventory", inventory_f, inventory_e, true);
            navigationItemDAO.add(inventory);

            byte[] importing_f = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/importing_f.png")));
            byte[] importing_e = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/importing_e.png")));
            NavigationItem importing = new NavigationItem("Importing", importing_f, importing_e, true);
            navigationItemDAO.add(importing);

            byte[] invoice_f = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/invoice_f.png")));
            byte[] invoice_e = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/invoice_e.png")));
            NavigationItem invoice = new NavigationItem("Invoice", invoice_f, invoice_e, true);
            navigationItemDAO.add(invoice);

            byte[] customer_f = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/customer_f.png")));
            byte[] customer_e = Functional.convertIconToByteArray(new ImageIcon(ClassLoader.getSystemResource("icon/customer_e.png")));
            NavigationItem customer = new NavigationItem("Customer", customer_f, customer_e, true);
            navigationItemDAO.add(customer);

        } catch (Exception e) {
        }
    }
}
