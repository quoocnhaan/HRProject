/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.EmployeeBasicInfo.EmployeeInfo;

import java.awt.GridLayout;
import view.component.Title_CheckBox.Title_Component;

/**
 *
 * @author LENOVO
 */
public class TitleEmployeeBasicInfo_Component extends javax.swing.JPanel {

    /**
     * Creates new form TitleEmployeeBasicInfo_Component
     */
    public TitleEmployeeBasicInfo_Component() {
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

        setBackground(new java.awt.Color(241, 241, 250));
        setMinimumSize(new java.awt.Dimension(1120, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void addComponents() {
        String[] names = {"Nhân viên", "Thông tin cá nhân", "Tình trạng", "Liên hệ"};
        for(int i = 0; i < 4; i++) {
            this.add(new Title_Component(names[i]));
        }
    }

    private void setLayout() {
        this.setLayout(new GridLayout(1, 4, 25, 0));
    }
}
