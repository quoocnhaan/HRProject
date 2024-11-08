/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.LeaveRequestGridAndFilter.LeaveRequestForm;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author LENOVO
 */
public class Content extends javax.swing.JPanel {

    /**
     * Creates new form Content
     */
    public Content(boolean hasPermission) {
        initComponents();
        customComponents(hasPermission);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vice = new javax.swing.JPanel();

        setBackground(new java.awt.Color(245, 247, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        vice.setBackground(new java.awt.Color(78, 116, 247));

        javax.swing.GroupLayout viceLayout = new javax.swing.GroupLayout(vice);
        vice.setLayout(viceLayout);
        viceLayout.setHorizontalGroup(
            viceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        viceLayout.setVerticalGroup(
            viceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(vice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel vice;
    // End of variables declaration//GEN-END:variables

    private void customComponents(boolean hasPermission) {
        vice.setPreferredSize(new Dimension(4, 40));

        if (hasPermission) {
            this.setBackground(new Color(238, 250, 237));
            vice.setBackground(new Color(77, 151, 42));
        } else {
            this.setBackground(new Color(245, 247, 255));
            vice.setBackground(new Color(78, 116, 247));
        }
    }
}