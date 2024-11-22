/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.DepartmentInfo;

import controller.DAO.DepartmentDAO;
import controller.DAOImp.DepartmentDAOImp;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author LENOVO
 */
public class DepartmentData_Component extends javax.swing.JPanel {

    /**
     * Creates new form Department_Component
     */
    public DepartmentData_Component() {
        initComponents();

        SwingUtilities.invokeLater(() -> {
            jScrollPane1.setBorder(BorderFactory.createEmptyBorder()); // Xóa viền của JScrollPane
        });

        designTree();
        initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        department = new javax.swing.JTree();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(department);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree department;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void initData() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        DepartmentDAO departmentDAO = new DepartmentDAOImp(session);
        department.setModel(departmentDAO.getDefaultTreeModel(12));
        session.close();
    }

    private void designTree() {
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();

        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/home.png"));

        Image scaleIcon = icon.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);

        renderer.setClosedIcon(new ImageIcon(scaleIcon));
        renderer.setOpenIcon(new ImageIcon(scaleIcon));
        renderer.setLeafIcon(new ImageIcon(scaleIcon));

        department.setCellRenderer(renderer);
    }

}
