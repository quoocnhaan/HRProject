/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.GridLeaveRequest.Date;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author LENOVO
 */
public class Date_Component extends javax.swing.JPanel {

    /**
     * Creates new form Date_Component
     */
    public Date_Component(String weekDay, String monthDay) {
        initComponents();
        customComponents();
        initData(weekDay, monthDay);
    }

    public Date_Component() {
        initComponents();
        monthDay.setText("");
        weekDay.setText("");
        this.setBackground(new Color(227, 227, 227));
        customComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        weekDay = new javax.swing.JLabel();
        monthDay = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        weekDay.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        weekDay.setForeground(new java.awt.Color(0, 0, 0));
        weekDay.setText("Thứ hai");

        monthDay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        monthDay.setForeground(new java.awt.Color(0, 0, 0));
        monthDay.setText("17");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weekDay)
                    .addComponent(monthDay))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(weekDay, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel monthDay;
    private javax.swing.JLabel weekDay;
    // End of variables declaration//GEN-END:variables

    private void initData(String weekDay, String monthDay) {
        this.weekDay.setText(weekDay);
        this.monthDay.setText(monthDay);
    }

    private void customComponents() {
        this.setPreferredSize(new Dimension(140, 60));
        Border lineBorder = BorderFactory.createLineBorder(Color.GRAY, 1);  // Đường viền màu đen dày 2 pixel
        this.setBorder(lineBorder);
    }

}
