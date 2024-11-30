/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.GridLeaveRequest.ChangePage;

import controller.Session.SharedData;
import javax.swing.JButton;
import view.component.LeaveApplication.GridLeaveRequest.Content.Content_Component;
import view.component.Manage_Component.ManageLeaveApplication_Component;

/**
 *
 * @author LENOVO
 */
public class ChangePage_Component extends javax.swing.JPanel {

    private boolean next;
    public static int index;

    public ChangePage_Component(boolean next) {
        initComponents();
        initData(next);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icon.setBackground(new java.awt.Color(69, 89, 190));
        icon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        icon.setForeground(new java.awt.Color(255, 255, 255));
        icon.setText(">");
        icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconActionPerformed(evt);
            }
        });

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

    private void iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconActionPerformed
        if (next && SharedData.getInstance().getDateRanges().size() - 1 > index) {
            index++;
        } else if (!next && index > 0) {
            index--;
        }

        //Content_Component.getInstance().updateDate(SharedData.getInstance().getDateRanges().get(index));

        //ManageLeaveApplication_Component.getInstance().updateButtonState();
        //ManageLeaveApplication_Component.getInstance().updateCurDate(SharedData.getInstance().getDateRanges().get(index));
        ManageLeaveApplication_Component.getInstance().changePage(SharedData.getInstance().getDateRanges().get(index));
        
    }//GEN-LAST:event_iconActionPerformed

    private void updateButtonState() {
        if (index == 0) {
            if (!next) {
                this.icon.setEnabled(false);
            }
        } else {
            if (!next) {
                this.icon.setEnabled(true);
            }
        }

        if (index >= SharedData.getInstance().getDateRanges().size() - 1) {
            if (next) {
                this.icon.setEnabled(false);
            }
        } else {
            if (next) {
                this.icon.setEnabled(true);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton icon;
    // End of variables declaration//GEN-END:variables

    private void initData(boolean next) {
        this.icon.setSize(25, 25);
        this.next = next;
        String s = (next) ? ">" : "<";
        this.icon.setText(s);
        updateButtonState();
    }

    public JButton getIcon() {
        return icon;
    }

    public void setIcon(JButton icon) {
        this.icon = icon;
    }
}
