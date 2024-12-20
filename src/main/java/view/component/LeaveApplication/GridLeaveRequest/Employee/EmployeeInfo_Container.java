/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.GridLeaveRequest.Employee;

import controller.DAO.EmployeeDAO;
import controller.DAOImp.EmployeeDAOImp;
import controller.Functional.Functional;
import controller.Session.SharedData;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.ImageIcon;
import model.Employee;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author LENOVO
 */
public class EmployeeInfo_Container extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeInfo_Container
     */
    public EmployeeInfo_Container() {
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
            .addGap(0, 280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new GridLayout(0, 1, 0, 0));
    }

    private void addComponents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            EmployeeDAO employeeDAO = new EmployeeDAOImp(session);
            List<Employee> list = employeeDAO.getAll();
            for (Employee employee : list) {
                ImageIcon img = Functional.convertByteArrayToIcon(employee.getImage());
                String name = employee.getName();
                String job = employee.getContracts().get(0).getJob().getProfession();
                String id = employee.getEmployeeId();
                this.add(new EmployeeInfo_Component(name, job, id, img));
            }

        } catch (Exception e) {
        }
    }

    public void updateData() {
        this.removeAll();
        for (Employee e : SharedData.getInstance().getEmployee_Leave()) {
            if (e != null) {
                ImageIcon img = Functional.convertByteArrayToIcon(e.getImage());
                String name = e.getName();
                String job = e.getContracts().get(0).getJob().getProfession();
                String id = e.getEmployeeId();
                this.add(new EmployeeInfo_Component(name, job, id, img));
            } else {
                this.add(new EmployeeInfo_Component());
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
