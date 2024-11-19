package view.component.FamilyEmployeeInfo_Component;

import controller.Function.Functional;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class BasicInfo_Component_FamilyEmployee extends javax.swing.JPanel {

    public BasicInfo_Component_FamilyEmployee(String name, String age, String job, String sen, ImageIcon img) {
        initComponents();
        picture_user.setSize(47, 47);
        this.setPreferredSize(new Dimension(280, 105));
        initData(name, age, job, sen, img);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        picture_user = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        seniority = new javax.swing.JLabel();
        job = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(250, 100));

        name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name.setText("name");

        age.setText("age");

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

        job.setText("relationship");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addGap(18, 18, 18)
                        .addComponent(age))
                    .addComponent(job))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(picture_user, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(age))
                        .addGap(15, 15, 15)
                        .addComponent(job)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel job;
    private javax.swing.JLabel name;
    private javax.swing.JLabel picture_user;
    private javax.swing.JLabel seniority;
    // End of variables declaration//GEN-END:variables

    private void initData(String name, String age, String job, String sen, ImageIcon img) {
        this.name.setText(name);
        this.job.setText(job);
        this.age.setText(age);
        this.seniority.setText(sen);
        this.picture_user.setIcon(Functional.scaleImg(picture_user, img));
    }
}
