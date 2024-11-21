package view.component.LegalInfoDetail_Component;

import java.awt.BorderLayout;
import java.util.Date;

public class Resignation_Component extends javax.swing.JPanel {

    public Resignation_Component() {
        initComponents();
    }

    public Resignation_Component(boolean terminateEmployment, Date resignationDate, Date lastWorkingDay, String formOfResignation, String resignationRecord, String employmentContractTerminationRegister,
            Date employmentContractTerminationDate, String employmentContractTerminationStatus, String reasonForResignation,
            Date signatureDate, String signer, Date salaryTransferDate) {
        initComponents();
//        setLayout();
        setData(terminateEmployment, resignationDate, lastWorkingDay, formOfResignation, resignationRecord, employmentContractTerminationRegister,
                employmentContractTerminationDate, employmentContractTerminationStatus, reasonForResignation,
                signatureDate, signer, salaryTransferDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        nameEmployee = new javax.swing.JLabel();
        genderEmployee = new javax.swing.JLabel();
        birthdayEmployee = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        resignationDate = new com.toedter.calendar.JDateChooser();
        lastWorkingDay = new com.toedter.calendar.JDateChooser();
        employmentContractTerminationDate = new com.toedter.calendar.JDateChooser();
        signatureDate = new com.toedter.calendar.JDateChooser();
        maNhanVien2 = new javax.swing.JLabel();
        nameEmployee1 = new javax.swing.JLabel();
        salaryTransferDate = new com.toedter.calendar.JDateChooser();
        genderEmployee1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        terminateEmployment = new javax.swing.JCheckBox();
        formOfResignation = new javax.swing.JLabel();
        resignationRecord = new javax.swing.JLabel();
        employmentContractTerminationRegister = new javax.swing.JLabel();
        employmentContractTerminationStatus = new javax.swing.JLabel();
        reasonForResignation = new javax.swing.JLabel();
        signer = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 520));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Thông tin thôi việc");

        date.setText("Ngày nộp đơn nghỉ việc");

        nameEmployee.setText("Ngày bắt đầu nghỉ");

        genderEmployee.setText("Hình thức thôi việc");

        birthdayEmployee.setText("Sổ quyết định thôi việc");

        jLabel3.setText("Sổ quyết định thanh lý HĐLĐ");

        jLabel6.setText("Ngày thanh lý");

        jLabel7.setText("Tình trạng thanh lý");

        jLabel8.setText("Lý do thôi việc");

        maNhanVien2.setText("Ngày chuyển lương");
        maNhanVien2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        maNhanVien2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        nameEmployee1.setText("Ngày ký");

        genderEmployee1.setText("Người ký");

        jLabel2.setText("Đã thôi việc");

        terminateEmployment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terminateEmploymentMouseClicked(evt);
            }
        });

        formOfResignation.setText("jLabel1");

        resignationRecord.setText("jLabel1");

        employmentContractTerminationRegister.setText("jLabel1");

        employmentContractTerminationStatus.setText("jLabel1");

        reasonForResignation.setText("jLabel1");

        signer.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date)
                            .addComponent(jLabel2)
                            .addComponent(nameEmployee)
                            .addComponent(genderEmployee)
                            .addComponent(birthdayEmployee)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(terminateEmployment)
                                    .addComponent(resignationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastWorkingDay, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maNhanVien2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameEmployee1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(genderEmployee1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(signatureDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salaryTransferDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(signer)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employmentContractTerminationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formOfResignation)
                                    .addComponent(resignationRecord)
                                    .addComponent(employmentContractTerminationRegister)
                                    .addComponent(employmentContractTerminationStatus)
                                    .addComponent(reasonForResignation))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(terminateEmployment))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resignationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lastWorkingDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameEmployee)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameEmployee1)
                                    .addComponent(signatureDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(genderEmployee1)
                                .addComponent(signer)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maNhanVien2)
                            .addComponent(salaryTransferDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderEmployee)
                    .addComponent(formOfResignation))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayEmployee)
                    .addComponent(resignationRecord))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(employmentContractTerminationRegister))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(employmentContractTerminationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(employmentContractTerminationStatus))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(reasonForResignation))
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void terminateEmploymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminateEmploymentMouseClicked
        if (terminateEmployment.isSelected()) {
            resignationDate.setEnabled(true);
            lastWorkingDay.setEnabled(true);
            formOfResignation.setEnabled(true);
            resignationRecord.setEnabled(true);
            employmentContractTerminationRegister.setEnabled(true);
            employmentContractTerminationDate.setEnabled(true);
            employmentContractTerminationStatus.setEnabled(true);
            reasonForResignation.setEnabled(true);
            signatureDate.setEnabled(true);
            signer.setEnabled(true);
            salaryTransferDate.setEnabled(true);
        } else {
            resignationDate.setEnabled(false);
            lastWorkingDay.setEnabled(false);
            formOfResignation.setEnabled(false);
            resignationRecord.setEnabled(false);
            employmentContractTerminationRegister.setEnabled(false);
            employmentContractTerminationDate.setEnabled(false);
            employmentContractTerminationStatus.setEnabled(false);
            reasonForResignation.setEnabled(false);
            signatureDate.setEnabled(false);
            signer.setEnabled(false);
            salaryTransferDate.setEnabled(false);
        }
    }//GEN-LAST:event_terminateEmploymentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthdayEmployee;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JDateChooser employmentContractTerminationDate;
    private javax.swing.JLabel employmentContractTerminationRegister;
    private javax.swing.JLabel employmentContractTerminationStatus;
    private javax.swing.JLabel formOfResignation;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel genderEmployee1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser lastWorkingDay;
    private javax.swing.JLabel maNhanVien2;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JLabel nameEmployee1;
    private javax.swing.JLabel reasonForResignation;
    private com.toedter.calendar.JDateChooser resignationDate;
    private javax.swing.JLabel resignationRecord;
    private com.toedter.calendar.JDateChooser salaryTransferDate;
    private com.toedter.calendar.JDateChooser signatureDate;
    private javax.swing.JLabel signer;
    private javax.swing.JCheckBox terminateEmployment;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void setLayout() {
        this.setLayout(new BorderLayout());
    }

    private void setData(boolean terminateEmployment, Date resignationDate, Date lastWorkingDay, String formOfResignation, String resignationRecord, String employmentContractTerminationRegister, Date employmentContractTerminationDate, String employmentContractTerminationStatus, String reasonForResignation, Date signatureDate, String signer, Date salaryTransferDate) {
        this.terminateEmployment.setSelected(terminateEmployment);
        this.resignationDate.setDate(resignationDate);
        this.lastWorkingDay.setDate(lastWorkingDay);
        this.formOfResignation.setText(formOfResignation);
        this.resignationRecord.setText(resignationRecord);
        this.employmentContractTerminationRegister.setText(employmentContractTerminationRegister);
        this.employmentContractTerminationDate.setDate(employmentContractTerminationDate);
        this.employmentContractTerminationStatus.setText(employmentContractTerminationStatus);
        this.reasonForResignation.setText(reasonForResignation);
        this.signatureDate.setDate(signatureDate);
        this.signer.setText(signer);
        this.salaryTransferDate.setDate(salaryTransferDate);
    }
}
