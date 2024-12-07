/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.Attendance_Component.GridData.Data;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import model.Employee;

/**
 *
 * @author LENOVO
 */
public class Data_Component extends javax.swing.JPanel {

    private Employee employee;

    public Data_Component(Employee employee, String data) {
        this.employee = employee;
        initComponents();
        customComponents();
        initData(data);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        data = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        data.setForeground(new java.awt.Color(0, 0, 0));
        data.setText("HÀNH CHÍNH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(data)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(data)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data;
    // End of variables declaration//GEN-END:variables

    private void initData(String data) {
        this.data.setText(data);
    }

    private void customComponents() {
        this.setPreferredSize(new Dimension(140, 60));
        MatteBorder border = new MatteBorder(1, 0, 0, 0, Color.BLACK);

        this.setBorder(border);
    }
}
