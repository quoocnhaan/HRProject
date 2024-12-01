/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.Manage_Component;

import controller.Session.SharedData;
import java.awt.BorderLayout;
import model.DateRange;
import view.component.Filter.Filter_Component;
import view.component.LeaveApplication.GridLeaveRequest.Content.Content_Component;
import view.component.LeaveApplication.GridLeaveRequest.LeaveApplicationGrid;

/**
 *
 * @author LENOVO
 */
public class ManageLeaveApplication_Component extends javax.swing.JPanel {

    private Filter_Component filter;
    private LeaveApplicationGrid leaveApp;
    private static ManageLeaveApplication_Component instance;

    public ManageLeaveApplication_Component() {
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

        setBackground(new java.awt.Color(240, 242, 245));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void setLayout() {
        this.setLayout(new BorderLayout(10, 0));
    }

    private void addComponents() {
        filter = new Filter_Component();
        leaveApp = new LeaveApplicationGrid();

        this.add(filter, BorderLayout.WEST);
        this.add(leaveApp, BorderLayout.CENTER);
    }

    public static ManageLeaveApplication_Component getInstance() {
        if (instance == null) {
            instance = new ManageLeaveApplication_Component();
        }
        return instance;
    }

    public void updateData(DateRange dateRange) {
        Content_Component.getInstance().updateDate(dateRange);
        Content_Component.getInstance().updateEmployee();
        Content_Component.getInstance().updateLeaveForm(SharedData.getInstance().getEmployee_Selected(), dateRange);
        updateCurDate(dateRange);
        updateButtonState();
    }

    public void changePage(DateRange dateRange) {
        Content_Component.getInstance().updateDate(dateRange);
        Content_Component.getInstance().updateLeaveForm(SharedData.getInstance().getEmployee_Selected(), dateRange);
        updateCurDate(dateRange);
        updateButtonState();
    }

    public void updateCurDate(DateRange dateRange) {
        leaveApp.getChangePageAndSearch().updateData(dateRange.toString());
    }

    public void updateButtonState() {
        leaveApp.getChangePageAndSearch().updateButtonState();
    }

    public Filter_Component getFilter() {
        return filter;
    }

    public void setFilter(Filter_Component filter) {
        this.filter = filter;
    }

    public LeaveApplicationGrid getLeaveApp() {
        return leaveApp;
    }

    public void setLeaveApp(LeaveApplicationGrid leaveApp) {
        this.leaveApp = leaveApp;
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
