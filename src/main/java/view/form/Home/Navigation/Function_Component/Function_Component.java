/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.form.Home.Navigation.Function_Component;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

/**
 *
 * @author PC
 */
public class Function_Component extends javax.swing.JPanel {

    private ImageIcon focusIcon;
    private ImageIcon exitIcon;

    public Function_Component(String name, ImageIcon focusIcon, ImageIcon exitIcon) {
        initComponents();
        this.focusIcon = focusIcon;
        this.exitIcon = exitIcon;
        initData(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user1.png"))); // NOI18N

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("Danh sách nhân viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.setBackground(new Color(81, 124, 244));
        this.name.setForeground(Color.white);
        this.name.setFont(new Font("Segoe UI", Font.BOLD, 14));
        this.icon.setIcon(focusIcon);
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(Color.white);
        this.name.setForeground(new Color(102, 102, 102));
        this.name.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        this.icon.setIcon(exitIcon);
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables

    private void initData(String name) {
        icon.setIcon(exitIcon);
        this.name.setText(name);
    }

}
