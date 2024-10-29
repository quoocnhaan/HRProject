/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.BenefitsInfo_Component;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class TransportAllowance_Component_BI extends javax.swing.JPanel {

    /**
     * Creates new form TransportAllowance_Component_BI
     */
    public TransportAllowance_Component_BI() {
        initComponents();
        this.setPreferredSize(new Dimension(1120, 230));
//        setImg();
    }

    private ImageIcon scaleImg(JLabel jLabel, String url) {
        title.setSize(20, 20);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(url));
        Image image = imageIcon.getImage();
        Image scaleImage = image.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaleImage);
        return scaledIcon;
    }

    private void setImg() {
        String urlTitle = "/img/infor.png";

        ImageIcon iconTitle = scaleImg(title, urlTitle);

        title.setIcon(iconTitle);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        purposeOfReceivingBenefits = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        beneficiary = new javax.swing.JLabel();
        levelOfBenefits = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        maNhanVien1 = new javax.swing.JLabel();
        nameEmployee = new javax.swing.JLabel();
        benefitsRegulations = new javax.swing.JLabel();
        genderEmployee = new javax.swing.JLabel();
        birthdayEmployee = new javax.swing.JLabel();
        businessTravelPolicy = new javax.swing.JLabel();
        nameEmployee1 = new javax.swing.JLabel();
        informationOfTheDocumentApprover = new javax.swing.JLabel();
        subsidyProcedure = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 230));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Trợ cấp đi lại");

        purposeOfReceivingBenefits.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        purposeOfReceivingBenefits.setText("Đi tới công ty / đi công tác");

        jLabel3.setText("Chính sách đi công tác");

        beneficiary.setText("????");

        levelOfBenefits.setText("????");

        date.setText("Mục đích trợ cấp");

        maNhanVien1.setText("Quy định về chi phí đi lại");

        nameEmployee.setText("Đối tượng hưởng trợ cấp");

        benefitsRegulations.setText("????");

        genderEmployee.setText("Mức trợ cấp");

        birthdayEmployee.setText("Duyệt thủ tục nhận trợ cấp");

        businessTravelPolicy.setText("???????");

        nameEmployee1.setText("Thông tin người duyệt trợ cấp");

        informationOfTheDocumentApprover.setText("????");

        subsidyProcedure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subsidyProcedureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameEmployee)
                            .addComponent(date)
                            .addComponent(genderEmployee)
                            .addComponent(maNhanVien1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(purposeOfReceivingBenefits)
                            .addComponent(beneficiary)
                            .addComponent(levelOfBenefits)
                            .addComponent(benefitsRegulations, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(businessTravelPolicy))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 333, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameEmployee1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(birthdayEmployee, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(informationOfTheDocumentApprover)
                    .addComponent(subsidyProcedure))
                .addGap(231, 231, 231))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date)
                            .addComponent(purposeOfReceivingBenefits)
                            .addComponent(nameEmployee1)
                            .addComponent(informationOfTheDocumentApprover))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameEmployee)
                            .addComponent(beneficiary)
                            .addComponent(birthdayEmployee)))
                    .addComponent(subsidyProcedure))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderEmployee)
                    .addComponent(levelOfBenefits))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maNhanVien1)
                    .addComponent(benefitsRegulations))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(businessTravelPolicy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void subsidyProcedureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subsidyProcedureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subsidyProcedureActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beneficiary;
    private javax.swing.JLabel benefitsRegulations;
    private javax.swing.JLabel birthdayEmployee;
    private javax.swing.JLabel businessTravelPolicy;
    private javax.swing.JLabel date;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel informationOfTheDocumentApprover;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel levelOfBenefits;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JLabel nameEmployee1;
    private javax.swing.JLabel purposeOfReceivingBenefits;
    private javax.swing.JCheckBox subsidyProcedure;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
