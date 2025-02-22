
import controller.DAO.ProductDAO;
import controller.DAOImp.ProductDAOImp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Product;
import org.hibernate.Hibernate;
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
public class ProductListPanel extends JPanel {

    public ProductListPanel(List<Product> products) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // Vertical stacking

        for (Product product : products) {
            ProductPanel productPanel = new ProductPanel(product);
            add(productPanel);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Product List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            ProductDAO productDAO = new ProductDAOImp(session);

            ProductListPanel productListPanel = new ProductListPanel(productDAO.getAll());
            JScrollPane scrollPane = new JScrollPane(productListPanel);

            frame.add(scrollPane);
            frame.setSize(800, 400); // Adjusted size for more spacing
            frame.setVisible(true);
        } catch (Exception e) {
        }

    }
}
