package view.component.ManageEmployee.ManageLegalInfoDetail;

import java.awt.BorderLayout;
import java.util.Date;

public class Resignation_Component_Manage extends javax.swing.JPanel {

    public Resignation_Component_Manage() {
        initComponents();
    }

    public Resignation_Component_Manage(boolean terminateEmployment, Date resignationDate, Date lastWorkingDay, String formOfResignation, String resignationRecord, String employmentContractTerminationRegister,
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
        jScrollPane3 = new javax.swing.JScrollPane();
        employmentContractTerminationStatus = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        reasonForResignation = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        signer = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        terminateEmployment = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        formOfResignation = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        resignationRecord = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        employmentContractTerminationRegister = new javax.swing.JTextPane();

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

        jScrollPane3.setViewportView(employmentContractTerminationStatus);

        jScrollPane4.setViewportView(reasonForResignation);

        jScrollPane5.setViewportView(signer);

        jLabel2.setText("Đã thôi việc");

        terminateEmployment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terminateEmploymentMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(formOfResignation);

        jScrollPane2.setViewportView(resignationRecord);

        jScrollPane6.setViewportView(employmentContractTerminationRegister);

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
                                    .addComponent(jScrollPane5)
                                    .addComponent(salaryTransferDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(employmentContractTerminationDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
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
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(genderEmployee1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(maNhanVien2)
                                                    .addComponent(salaryTransferDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(24, 24, 24)
                                        .addComponent(genderEmployee))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addComponent(birthdayEmployee))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(employmentContractTerminationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
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
    private javax.swing.JTextPane employmentContractTerminationRegister;
    private javax.swing.JTextPane employmentContractTerminationStatus;
    private javax.swing.JTextPane formOfResignation;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel genderEmployee1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private com.toedter.calendar.JDateChooser lastWorkingDay;
    private javax.swing.JLabel maNhanVien2;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JLabel nameEmployee1;
    private javax.swing.JTextPane reasonForResignation;
    private com.toedter.calendar.JDateChooser resignationDate;
    private javax.swing.JTextPane resignationRecord;
    private com.toedter.calendar.JDateChooser salaryTransferDate;
    private com.toedter.calendar.JDateChooser signatureDate;
    private javax.swing.JTextPane signer;
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
