/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.Title_CheckBox;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.border.MatteBorder;

/**
 *
 * @author LENOVO
 */
public class CheckBox_Component extends javax.swing.JPanel {

    /**
     * Creates new form CheckBox_Component
     */
    public CheckBox_Component() {
        initComponents();
        this.setPreferredSize(new Dimension(31, 100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        check = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        check.setText(" ");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(check)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkActionPerformed

    public JCheckBox getCheck() {
        return check;
    }

    public void setCheck(JCheckBox check) {
        this.check = check;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check;
    // End of variables declaration//GEN-END:variables
}
