/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.Title_CheckBox;

import java.awt.Dimension;

/**
 *
 * @author LENOVO
 */
public class Title_Component extends javax.swing.JPanel {

    /**
     * Creates new form Title_Component
     */
    public Title_Component(String name) {
        initComponents();
        this.setPreferredSize(new Dimension(280, 28));
        this.name.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 250));

        name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}