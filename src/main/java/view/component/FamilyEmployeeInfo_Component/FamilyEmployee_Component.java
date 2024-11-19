package view.component.FamilyEmployeeInfo_Component;

import java.util.Date;

public class FamilyEmployee_Component extends javax.swing.JPanel {

    public FamilyEmployee_Component(boolean companyEmployees, String surName, String name, String relationship, String gender, Date dateOfBirth, boolean cmnd, String id_CMND, Date dateOfIssueOf_CMND, Date dateOfExpirationOf_CMND, String issuingAuthorityOf_CMND, Date dateOfMarriage, String nationality, String taxIdentificationNumber, String healthInsuranceNumber, String socialSecurityNumber, boolean directlySupporting, boolean emergencyContact, boolean guarantor, boolean death, Date yearOfDeath, String causeOfDeath) {
        initComponents();
        initData(companyEmployees, surName, name, relationship, gender, dateOfBirth, cmnd, id_CMND, dateOfIssueOf_CMND, dateOfExpirationOf_CMND, issuingAuthorityOf_CMND, dateOfMarriage, nationality, taxIdentificationNumber, healthInsuranceNumber, socialSecurityNumber, directlySupporting, emergencyContact, guarantor, death, yearOfDeath, causeOfDeath);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        companyEmployees = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        surName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        relationship = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dateOfBirth = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        cmnd = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        id_CMND = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dateOfIssueOf_CMND = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        dateOfExpirationOf_CMND = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        issuingAuthorityOf_CMND = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        dateOfMarriage = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        nationality = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        taxIdentificationNumber = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        healthInsuranceNumber = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        socialSecurityNumber = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        directlySupporting = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        emergencyContact = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        guarantor = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        death = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        yearOfDeath = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        causeOfDeath = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 600));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Thông tin thân nhân");

        jLabel1.setText("Nhân viên công ty ");

        jLabel2.setText("Chọn từ HSNV");

        jLabel3.setText("Chọn từ HSNV");

        jButton1.setText("jButton1");

        jLabel4.setText("Họ");

        surName.setText("Họ");

        jLabel6.setText("Tên");

        name.setText("ABC");

        jLabel8.setText("Quan hệ");

        relationship.setText("????");

        jLabel10.setText("Giới tính");

        gender.setText("Nam/Nữ");

        jLabel12.setText("Ngày sinh");

        jLabel13.setText("Là CMND");

        jLabel14.setText("Số CMND");

        id_CMND.setText("0123456789");

        jLabel16.setText("Ngày cấp CMND");

        jLabel17.setText("Ngày hết hạn");

        jLabel18.setText("Nơi cấp");

        issuingAuthorityOf_CMND.setText("Bộ công an quận 1");

        jLabel20.setText("Ngày kết hôn");

        jLabel21.setText("Quốc tịch");

        nationality.setText("??????");

        jLabel23.setText("Mã số thuế");

        taxIdentificationNumber.setText("??????????");

        jLabel25.setText("Số BHYT");

        healthInsuranceNumber.setText("???????????");

        jLabel27.setText("Số BHXH");

        socialSecurityNumber.setText("???????????");

        jLabel29.setText("Trực tiếp nuôi dưỡng");

        directlySupporting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directlySupportingActionPerformed(evt);
            }
        });

        jLabel30.setText("Người liên hệ khẩn cấp");

        jLabel31.setText("Người bảo lãnh");

        jLabel32.setText("Đã mất");

        jLabel33.setText("Năm mất");

        jLabel34.setText("Lý do mất");

        causeOfDeath.setText("Lý do mất");

        jLabel36.setText("Ghi chú");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(companyEmployees)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addComponent(surName)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name)
                                    .addComponent(relationship)
                                    .addComponent(gender)
                                    .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_CMND)
                                    .addComponent(dateOfExpirationOf_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(issuingAuthorityOf_CMND)
                                    .addComponent(cmnd)
                                    .addComponent(dateOfIssueOf_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateOfMarriage, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nationality)
                                .addComponent(taxIdentificationNumber)
                                .addComponent(healthInsuranceNumber)
                                .addComponent(socialSecurityNumber)
                                .addComponent(directlySupporting)
                                .addComponent(emergencyContact)
                                .addComponent(guarantor)
                                .addComponent(death)
                                .addComponent(yearOfDeath, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(causeOfDeath))
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jButton1)
                                                    .addComponent(jLabel23)
                                                    .addComponent(taxIdentificationNumber))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel4)
                                                    .addComponent(surName)
                                                    .addComponent(jLabel25)
                                                    .addComponent(healthInsuranceNumber))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel6)
                                                    .addComponent(name)
                                                    .addComponent(jLabel27)
                                                    .addComponent(socialSecurityNumber))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel8)
                                                    .addComponent(relationship)
                                                    .addComponent(jLabel29)
                                                    .addComponent(directlySupporting))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel10)
                                                    .addComponent(gender)
                                                    .addComponent(jLabel30)
                                                    .addComponent(emergencyContact)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel21)
                                                .addComponent(nationality))
                                            .addComponent(companyEmployees))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel12))
                                            .addComponent(guarantor)))
                                    .addComponent(jLabel31))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(death)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel13)
                                    .addComponent(cmnd))
                                .addGap(18, 18, 18)
                                .addComponent(yearOfDeath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33)
                                .addComponent(id_CMND)
                                .addComponent(jLabel14)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateOfIssueOf_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(causeOfDeath)
                        .addComponent(jLabel34)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateOfExpirationOf_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel36))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(issuingAuthorityOf_CMND)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateOfMarriage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void directlySupportingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directlySupportingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directlySupportingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel causeOfDeath;
    private javax.swing.JCheckBox cmnd;
    private javax.swing.JCheckBox companyEmployees;
    private com.toedter.calendar.JDateChooser dateOfBirth;
    private com.toedter.calendar.JDateChooser dateOfExpirationOf_CMND;
    private com.toedter.calendar.JDateChooser dateOfIssueOf_CMND;
    private com.toedter.calendar.JDateChooser dateOfMarriage;
    private javax.swing.JCheckBox death;
    private javax.swing.JCheckBox directlySupporting;
    private javax.swing.JCheckBox emergencyContact;
    private javax.swing.JLabel gender;
    private javax.swing.JCheckBox guarantor;
    private javax.swing.JLabel healthInsuranceNumber;
    private javax.swing.JLabel id_CMND;
    private javax.swing.JLabel issuingAuthorityOf_CMND;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nationality;
    private javax.swing.JLabel relationship;
    private javax.swing.JLabel socialSecurityNumber;
    private javax.swing.JLabel surName;
    private javax.swing.JLabel taxIdentificationNumber;
    private javax.swing.JLabel title;
    private com.toedter.calendar.JDateChooser yearOfDeath;
    // End of variables declaration//GEN-END:variables

    private void initData(boolean companyEmployees, String surName, String name, String relationship, String gender, Date dateOfBirth, boolean cmnd, String id_CMND, Date dateOfIssueOf_CMND, Date dateOfExpirationOf_CMND, String issuingAuthorityOf_CMND, Date dateOfMarriage, String nationality, String taxIdentificationNumber, String healthInsuranceNumber, String socialSecurityNumber, boolean directlySupporting, boolean emergencyContact, boolean guarantor, boolean death, Date yearOfDeath, String causeOfDeath) {
        this.companyEmployees.setSelected(companyEmployees);
        this.surName.setText(surName);
        this.name.setText(name);
        this.relationship.setText(relationship);
        this.gender.setText(gender);
        this.dateOfBirth.setDate(dateOfBirth);
        this.cmnd.setSelected(cmnd);
        this.id_CMND.setText(id_CMND);
        this.dateOfIssueOf_CMND.setDate(dateOfIssueOf_CMND);
        this.dateOfExpirationOf_CMND.setDate(dateOfExpirationOf_CMND);
        this.issuingAuthorityOf_CMND.setText(issuingAuthorityOf_CMND);
        this.dateOfMarriage.setDate(dateOfMarriage);
        this.nationality.setText(nationality);
        this.taxIdentificationNumber.setText(taxIdentificationNumber);
        this.healthInsuranceNumber.setText(healthInsuranceNumber);
        this.socialSecurityNumber.setText(socialSecurityNumber);
        this.directlySupporting.setSelected(directlySupporting);
        this.emergencyContact.setSelected(emergencyContact);
        this.guarantor.setSelected(guarantor);
        this.death.setSelected(death);
        this.yearOfDeath.setDate(yearOfDeath);
        this.causeOfDeath.setText(causeOfDeath);
    }
}
