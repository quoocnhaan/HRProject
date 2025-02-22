/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.Navigation;

import controller.DAO.NavigationItemDAO;
import controller.DAOImp.NavigationItemDAOImp;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import model.NavigationItem;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author PC
 */
public class Navigation extends javax.swing.JPanel {

    private List<Navigation_Component> navItems = new ArrayList<>();
    private Navigation_Component selectedItem; // Track the currently selected item

    public Navigation() {
        initComponents();
        setLayout();
        addComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
    }

    private void addComponents() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            NavigationItemDAO navigationItemDAO = new NavigationItemDAOImp(session);
            List<NavigationItem> navigationItem = navigationItemDAO.getAll();

            for (int i = 0; i < navigationItem.size(); i++) {
                Navigation_Component navigation_Component = new Navigation_Component(navigationItem.get(i));

                navItems.add(navigation_Component);
                if (i == 0) {
                    setSelectedItem(navigation_Component);
                }
            }

            // Add mouse listeners to each item for selection
            for (Navigation_Component item : navItems) {
                item.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        setSelectedItem(item); // Set clicked item as selected
                    }
                });
                add(item); // Add item to the panel
            }

        } catch (Exception e) {
        }

    }

    public void setSelectedItem(Navigation_Component item) {
        // Deselect the previously selected item
        if (selectedItem != null) {
            selectedItem.setSelected(false);
        }

        // Select the new item
        selectedItem = item;
        selectedItem.setSelected(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
