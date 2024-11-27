/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.GridLeaveRequest.ChangePage;

import controller.Functional.Functional;
import controller.Session.SharedData;
import java.awt.Color;
import javax.swing.ImageIcon;
import view.component.LeaveApplication.GridLeaveRequest.Content.Content_Component;

/**
 *
 * @author LENOVO
 */
public class ChangePage_Component extends javax.swing.JPanel {

    private boolean next;
    public static int index;

    public ChangePage_Component(ImageIcon icon, boolean next) {
        initComponents();
        initData(icon, next);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icon.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton icon;
    // End of variables declaration//GEN-END:variables

    private void initData(ImageIcon icon, boolean next) {
        this.icon.setSize(25, 25);
        //this.icon.setIcon(Functional.scaleImg(this.icon, icon));
        this.next = next;
    }
}
