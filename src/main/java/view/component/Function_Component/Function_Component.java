/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.Function_Component;

import controller.Functional.Functional;
import java.awt.Color;
import javax.swing.ImageIcon;
import view.form.Home.MainContent.MainContent;

/**
 *
 * @author LENOVO
 */
public class Function_Component extends javax.swing.JPanel {

    public Function_Component(String funcId, String funcName, Color color, ImageIcon imgIcon) {
        initComponents();
        initData(funcId, funcName, color, imgIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        funcName = new javax.swing.JLabel();
        funcIcon = new javax.swing.JLabel();
        funcId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(4, 89, 74));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(300, 150));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        funcName.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        funcName.setForeground(new java.awt.Color(255, 255, 255));
        funcName.setText("Name");

        funcIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        funcIcon.setText("icon");
        funcIcon.setSize(35, 35);
        funcIcon.setText("");

        funcId.setText("id");
        funcId.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(funcId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(funcIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(funcName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcId)
                    .addComponent(funcIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(funcName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        onClick();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel funcIcon;
    private javax.swing.JLabel funcId;
    private javax.swing.JLabel funcName;
    // End of variables declaration//GEN-END:variables

    private void initData(String funcId, String funcName, Color color, ImageIcon imgIcon) {
        this.funcId.setText(funcId);
        this.funcName.setText(funcName);
        this.funcIcon.setIcon(Functional.scaleImg(this.funcIcon, imgIcon));
        this.setBackground(color);
    }

    private void onClick() {
        MainContent.getInstance().changePage(funcId.getText());
    }
}
