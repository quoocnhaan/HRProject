/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.ListLeaveRequest.BasicLeaveRequest;

import java.awt.FlowLayout;
import java.awt.GridLayout;

/**
 *
 * @author LENOVO
 */
public class BasicLeaveRequest_Container extends javax.swing.JPanel {

    /**
     * Creates new form BasicLeaveRequest_Container
     */
    public BasicLeaveRequest_Container() {
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
            .addGap(0, 280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addComponents() {
        String type = "Nghỉ phép";
        String name = "Lâm Quốc Nhân";
        String date = "05/11/2024 - 07/11/2024";
        String total = "2 ngày";
        String status = "pending";
        for (int i = 1; i <= 10; i++) {
            this.add(new BasicLeaveRequest_Component(type, name, date, total, status));
        }
    }

    private void setLayout() {
        this.setLayout(new GridLayout(0, 1, 0, 0));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
