/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.LeaveRequestGridAndFilter;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.component.LeaveApplication.LeaveRequestGridAndFilter.Content.Content_Component;
import view.component.LeaveApplication.LeaveRequestGridAndFilter.Filter.Filter_Component;
import view.component.LeaveApplication.ListLeaveRequest.BasicLeaveRequest.Search;

/**
 *
 * @author LENOVO
 */
public class LeaveApplicationGridAndFilter extends javax.swing.JPanel {

    /**
     * Creates new form LeaveApplicationGridAndFilter
     */
    public LeaveApplicationGridAndFilter() {
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
        this.add(new Filter_Component(), BorderLayout.WEST);
        this.add(new LeaveApplicationGrid(), BorderLayout.CENTER);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}