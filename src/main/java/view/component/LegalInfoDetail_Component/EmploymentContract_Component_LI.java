package view.component.LegalInfoDetail_Component;

import java.awt.Dimension;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author user
 */
public class EmploymentContract_Component_LI extends javax.swing.JPanel {

    /**
     * Creates new form EmploymentContract_Component_LI
     */
    public EmploymentContract_Component_LI() {
        initComponents();
        this.setPreferredSize(new Dimension(1120, 300));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        attendanceTracking = new javax.swing.JLabel();
        subjectsForTimekeeping = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        workspace = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        option_OvertimeRegistration = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        option_CalculateOvertimePay = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        option_CompensatoryTimeForOvertime = new javax.swing.JCheckBox();
        genderEmployee = new javax.swing.JLabel();
        birthdayEmployee = new javax.swing.JLabel();
        workingConditions = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        shift = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        option_ChangingShifts = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        option_ArrivingLateAndLeavingEarly = new javax.swing.JCheckBox();
        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        maNhanVien1 = new javax.swing.JLabel();
        nameEmployee = new javax.swing.JLabel();
        placeOfWork = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        option_NoNeedToSwipeACard = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        attendanceTracking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        attendanceTracking.setText("123");

        subjectsForTimekeeping.setText("????");

        jlabel.setText("????");

        workspace.setText("????");

        jLabel10.setText("Tính công theo đăng ký làm ngoài");

        option_OvertimeRegistration.setToolTipText("");
        option_OvertimeRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_OvertimeRegistrationActionPerformed(evt);
            }
        });

        jLabel11.setText("Không tính công ngoài giờ");

        jLabel12.setText("Không tính nghĩ bù khi làm ngoài giờ");

        option_CompensatoryTimeForOvertime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_CompensatoryTimeForOvertimeActionPerformed(evt);
            }
        });

        genderEmployee.setText("Loại hợp đồng");

        birthdayEmployee.setText("Ngày hiệu lực");

        workingConditions.setText("???");

        jLabel1.setText("Người ký HĐLĐ");

        jLabel2.setText("Quyền lợi");

        shift.setText("??????");

        jLabel4.setText("Nghĩa vụ");

        option_ChangingShifts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_ChangingShiftsActionPerformed(evt);
            }
        });

        jLabel5.setText("Điều khoản chấm dứt hợp đồng");

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Hợp đồng lao động");

        date.setText("Số hợp đồng");

        maNhanVien1.setText("Hình thức trả lương");

        nameEmployee.setText("Ngày ký");

        placeOfWork.setText("????");

        jLabel6.setText("Giải quyết tranh chấp");

        option_NoNeedToSwipeACard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_NoNeedToSwipeACardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameEmployee)
                    .addComponent(date)
                    .addComponent(genderEmployee)
                    .addComponent(birthdayEmployee)
                    .addComponent(maNhanVien1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(workingConditions)
                    .addComponent(placeOfWork, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workspace, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attendanceTracking)
                    .addComponent(subjectsForTimekeeping))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(jLabel11))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jLabel10))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel5))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(147, 147, 147)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shift)
                    .addComponent(option_ChangingShifts)
                    .addComponent(option_ArrivingLateAndLeavingEarly)
                    .addComponent(option_NoNeedToSwipeACard)
                    .addComponent(option_OvertimeRegistration)
                    .addComponent(option_CalculateOvertimePay)
                    .addComponent(option_CompensatoryTimeForOvertime))
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(option_CompensatoryTimeForOvertime)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(shift))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel4))
                                                .addComponent(option_ChangingShifts))
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5))
                                        .addComponent(option_ArrivingLateAndLeavingEarly))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(option_NoNeedToSwipeACard))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(option_OvertimeRegistration))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11))
                                .addComponent(option_CalculateOvertimePay))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date)
                            .addComponent(attendanceTracking))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameEmployee)
                            .addComponent(subjectsForTimekeeping))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderEmployee)
                            .addComponent(jlabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthdayEmployee)
                            .addComponent(workspace))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maNhanVien1)
                            .addComponent(placeOfWork))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(workingConditions))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void option_OvertimeRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_OvertimeRegistrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option_OvertimeRegistrationActionPerformed

    private void option_CompensatoryTimeForOvertimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_CompensatoryTimeForOvertimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option_CompensatoryTimeForOvertimeActionPerformed

    private void option_ChangingShiftsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_ChangingShiftsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option_ChangingShiftsActionPerformed

    private void option_NoNeedToSwipeACardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_NoNeedToSwipeACardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option_NoNeedToSwipeACardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attendanceTracking;
    private javax.swing.JLabel birthdayEmployee;
    private javax.swing.JLabel date;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JCheckBox option_ArrivingLateAndLeavingEarly;
    private javax.swing.JCheckBox option_CalculateOvertimePay;
    private javax.swing.JCheckBox option_ChangingShifts;
    private javax.swing.JCheckBox option_CompensatoryTimeForOvertime;
    private javax.swing.JCheckBox option_NoNeedToSwipeACard;
    private javax.swing.JCheckBox option_OvertimeRegistration;
    private javax.swing.JLabel placeOfWork;
    private javax.swing.JLabel shift;
    private javax.swing.JLabel subjectsForTimekeeping;
    private javax.swing.JLabel title;
    private javax.swing.JLabel workingConditions;
    private javax.swing.JLabel workspace;
    // End of variables declaration//GEN-END:variables
}
