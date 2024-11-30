/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.GridLeaveRequest.LeaveRequestForm;

import controller.DAO.LeaveRequestDAO;
import controller.DAOImp.LeaveRequestDAOImp;
import java.awt.GridLayout;
import java.time.LocalDate;
import model.DateRange;
import model.Employee;
import model.LeaveRequest;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author LENOVO
 */
public class LeaveForm_Container extends javax.swing.JPanel {

    public LeaveForm_Container() {
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
            .addGap(0, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new GridLayout(0, 7, 0, 0));
    }

    private void addComponents() {
//        for (int i = 1; i <= 56; i++) {
//            this.add(new LeaveForm_Component(true));
//        }
    }

    public void updateData(Employee employee, DateRange dateRange) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            LeaveRequestDAO leaveRequestDAO = new LeaveRequestDAOImp(session);

            LocalDate fromDate = dateRange.getFromDate();
            LocalDate toDate = dateRange.getToDate();

            LocalDate currentDate = fromDate;
            int count = 1;
            while (!currentDate.isAfter(toDate)) {
                java.sql.Date sqlDate = java.sql.Date.valueOf(currentDate);

                LeaveRequest leaveRequest = leaveRequestDAO.findByEmployeeIdAndRegistrationDate(employee.getId(), sqlDate);

                this.add(new LeaveForm_Component(leaveRequest, employee, sqlDate));

                currentDate = currentDate.plusDays(1);

                count++;
            }
            for (int i = count; i <= 7; i++) {
                this.add(new LeaveForm_Component());
            }
        } catch (Exception e) {
        }
        validate();
        repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
