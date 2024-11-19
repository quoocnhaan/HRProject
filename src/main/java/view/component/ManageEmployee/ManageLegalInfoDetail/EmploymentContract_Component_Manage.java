package view.component.ManageEmployee.ManageLegalInfoDetail;

import java.awt.Dimension;
import java.util.Date;

public class EmploymentContract_Component_Manage extends javax.swing.JPanel {

    public EmploymentContract_Component_Manage() {
        initComponents();
        this.setPreferredSize(new Dimension(1120, 360));
    }

    public EmploymentContract_Component_Manage(String contractNumber, Date contractSigningDate, String typeOfContract, Date startDateOfEffect, String salaryPaymentMethod, String signer, boolean benefit,
            boolean obligation, boolean condition, boolean disputeResolution, boolean registerForOvertime, boolean calculateOvertimePay, boolean calculateOvertimeCompensation) {
        initComponents();

        setData(contractNumber, contractSigningDate, typeOfContract, startDateOfEffect, salaryPaymentMethod, signer, benefit, obligation, condition, disputeResolution,
                registerForOvertime, calculateOvertimePay, calculateOvertimeCompensation);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        registerForOvertime = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        calculateOvertimePay = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        calculateOvertimeCompensation = new javax.swing.JCheckBox();
        genderEmployee = new javax.swing.JLabel();
        birthdayEmployee = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        obligation = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        condition = new javax.swing.JCheckBox();
        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        maNhanVien1 = new javax.swing.JLabel();
        nameEmployee = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        disputeResolution = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        contractNumber = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        typeOfContract = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        signer = new javax.swing.JTextPane();
        benefit = new javax.swing.JCheckBox();
        contractSigningDate = new com.toedter.calendar.JDateChooser();
        startDateOfEffect = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        salaryPaymentMethod = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 360));

        jLabel10.setText("Tính công theo đăng ký làm ngoài");

        registerForOvertime.setToolTipText("");
        registerForOvertime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerForOvertimeActionPerformed(evt);
            }
        });

        jLabel11.setText("Không tính công ngoài giờ");

        jLabel12.setText("Không tính nghỉ bù khi làm ngoài giờ");

        calculateOvertimeCompensation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateOvertimeCompensationActionPerformed(evt);
            }
        });

        genderEmployee.setText("Loại hợp đồng");

        birthdayEmployee.setText("Ngày hiệu lực");

        jLabel1.setText("Người ký HĐLĐ");

        jLabel2.setText("Quyền lợi");

        jLabel4.setText("Nghĩa vụ");

        obligation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obligationActionPerformed(evt);
            }
        });

        jLabel5.setText("Điều khoản chấm dứt hợp đồng");

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Hợp đồng lao động");

        date.setText("Số hợp đồng");

        maNhanVien1.setText("Hình thức trả lương");

        nameEmployee.setText("Ngày ký");

        jLabel6.setText("Giải quyết tranh chấp");

        disputeResolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disputeResolutionActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(contractNumber);

        jScrollPane2.setViewportView(typeOfContract);

        jScrollPane3.setViewportView(signer);

        benefit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benefitActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(salaryPaymentMethod);

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
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameEmployee)
                            .addComponent(date)
                            .addComponent(genderEmployee)
                            .addComponent(birthdayEmployee)
                            .addComponent(maNhanVien1)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1)
                            .addComponent(contractSigningDate, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(startDateOfEffect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addGap(126, 126, 126)
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
                            .addComponent(obligation)
                            .addComponent(condition)
                            .addComponent(disputeResolution)
                            .addComponent(registerForOvertime)
                            .addComponent(calculateOvertimePay)
                            .addComponent(calculateOvertimeCompensation)
                            .addComponent(benefit))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(calculateOvertimeCompensation)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(benefit))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(obligation, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5))
                                        .addComponent(condition, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(disputeResolution, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(registerForOvertime))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11))
                                .addComponent(calculateOvertimePay))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameEmployee)
                            .addComponent(contractSigningDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(genderEmployee)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(birthdayEmployee)
                            .addComponent(startDateOfEffect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maNhanVien1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerForOvertimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerForOvertimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerForOvertimeActionPerformed

    private void calculateOvertimeCompensationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateOvertimeCompensationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculateOvertimeCompensationActionPerformed

    private void obligationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obligationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_obligationActionPerformed

    private void disputeResolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disputeResolutionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disputeResolutionActionPerformed

    private void benefitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benefitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_benefitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox benefit;
    private javax.swing.JLabel birthdayEmployee;
    private javax.swing.JCheckBox calculateOvertimeCompensation;
    private javax.swing.JCheckBox calculateOvertimePay;
    private javax.swing.JCheckBox condition;
    private javax.swing.JTextPane contractNumber;
    private com.toedter.calendar.JDateChooser contractSigningDate;
    private javax.swing.JLabel date;
    private javax.swing.JCheckBox disputeResolution;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JCheckBox obligation;
    private javax.swing.JCheckBox registerForOvertime;
    private javax.swing.JTextPane salaryPaymentMethod;
    private javax.swing.JTextPane signer;
    private com.toedter.calendar.JDateChooser startDateOfEffect;
    private javax.swing.JLabel title;
    private javax.swing.JTextPane typeOfContract;
    // End of variables declaration//GEN-END:variables

    private void setData(String contractNumber, Date contractSigningDate, String typeOfContract, Date startDateOfEffect, String salaryPaymentMethod, String signer, boolean benefit, boolean obligation, boolean condition, boolean disputeResolution, boolean registerForOvertime, boolean calculateOvertimePay, boolean calculateOvertimeCompensation) {
        this.contractNumber.setText(contractNumber);
        this.contractSigningDate.setDate(contractSigningDate);
        this.typeOfContract.setText(typeOfContract);
        this.startDateOfEffect.setDate(startDateOfEffect);
        this.salaryPaymentMethod.setText(salaryPaymentMethod);
        this.signer.setText(signer);
        this.benefit.setSelected(benefit);
        this.obligation.setSelected(obligation);
        this.condition.setSelected(condition);
        this.disputeResolution.setSelected(disputeResolution);
        this.registerForOvertime.setSelected(registerForOvertime);
        this.calculateOvertimePay.setSelected(calculateOvertimePay);
        this.calculateOvertimeCompensation.setSelected(calculateOvertimeCompensation);
    }

}
