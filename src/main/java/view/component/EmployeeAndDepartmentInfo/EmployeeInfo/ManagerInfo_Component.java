/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.EmployeeAndDepartmentInfo.EmployeeInfo;

import controller.Function.Function;
import java.awt.Dimension;
import java.awt.FontMetrics;
import javax.swing.ImageIcon;

/**
 *
 * @author LENOVO
 */
public class ManagerInfo_Component extends javax.swing.JPanel {

    /**
     * Creates new form ManagerInfo
     */
    public ManagerInfo_Component(String name, String position, String companyName, String phone, String email, ImageIcon img) {
        initComponents();
        this.name.setText(name);
        this.position.setText(position);
        this.companyName.setText(companyName);
        this.phoneNumber.setText(phone);
        this.email.setText(email);
        this.logo.setIcon(Function.scaleImg(this.logo, img));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        companyName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        companyName.setForeground(new java.awt.Color(124, 124, 124));
        companyName.setText("Company's name");

        phoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumber.setText("(+84) 968270553");
        phoneNumber.setMaximumSize(new java.awt.Dimension(300, 16));
        phoneNumber.setSize(300, 16);

        email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(127, 175, 252));
        email.setText("Email");

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setMaximumSize(new java.awt.Dimension(100, 100));
        logo.setSize(35, 35);

        name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("LAM QUOC NHAN");

        position.setForeground(new java.awt.Color(124, 124, 124));
        position.setText("Position");

        total.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        total.setForeground(new java.awt.Color(51, 102, 255));
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("255");

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tổng nhân viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(position)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 618, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email)
                            .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(total)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel companyName;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel position;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

        
}
