/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.EmployeeDetailInfo.ListEmployee_Component;

import controller.Function.Function;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class BasicInfo_Component_PI extends javax.swing.JPanel {

    /**
     * Creates new form BasicInfo_Component
     */
    public BasicInfo_Component_PI(String name, String job, String id, String work, String sen, ImageIcon img) {
        initComponents();
        picture_user.setSize(47, 47);
        this.setPreferredSize(new Dimension(280, 105));
        initData(name, job, id, work, sen, img);
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
        direct = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        picture_user = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        seniority = new javax.swing.JLabel();
        job = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(250, 100));

        name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("name");

        direct.setText("cong ty XYZ");

        id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        id.setForeground(new java.awt.Color(255, 0, 0));
        id.setText("id");

        picture_user.setText(" ");
        picture_user.setPreferredSize(new java.awt.Dimension(47, 47));

        jPanel1.setBackground(new java.awt.Color(218, 248, 246));

        seniority.setBackground(new java.awt.Color(0, 255, 255));
        seniority.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seniority.setForeground(new java.awt.Color(107, 195, 145));
        seniority.setText("1 năm 6 tháng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seniority)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(seniority))
        );

        job.setText("job");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(picture_user, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direct)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id))
                    .addComponent(job))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(picture_user, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(job)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(direct)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel direct;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel job;
    private javax.swing.JLabel name;
    private javax.swing.JLabel picture_user;
    private javax.swing.JLabel seniority;
    // End of variables declaration//GEN-END:variables

    private void initData(String name, String job, String id, String work, String sen, ImageIcon img) {
        this.name.setText(name);
        this.id.setText(id);
        this.job.setText(job);
        this.direct.setText(work);
        this.seniority.setText(sen);
        this.picture_user.setIcon(Function.scaleImg(picture_user, img));
    }
}
