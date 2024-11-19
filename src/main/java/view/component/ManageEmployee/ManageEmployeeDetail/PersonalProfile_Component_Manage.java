package view.component.ManageEmployee.ManageEmployeeDetail;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PersonalProfile_Component_Manage extends javax.swing.JPanel {

    public PersonalProfile_Component_Manage() {
        initComponents();
    }

    public PersonalProfile_Component_Manage(String idEmployee, String nameEmployee, String genderEmployee, String birthdayEmployee, String majorEmployee, String levelOfEducationEmployee, String culturalLevelEmployee,
            String ethnicityEmployee, String taxIdentificationNumber, String dateOfIssuanceOfTaxIdentificationNumber, String issuingAuthorityOfCitizenIdentificationCard, String nationalityEmployee,
            String citizenIdentificationNumberEmployee, String dateOfIssuanceOfCitizenIdentificationCard, String placeOfIssuanceOfCitizenIdentificationCard, String religionEmployee,
            String maritalStatusEmploye, String academicRank, String seniority, ImageIcon iconPencil) {
        
        initComponents();
        setData(idEmployee, nameEmployee, genderEmployee, birthdayEmployee, majorEmployee, levelOfEducationEmployee, culturalLevelEmployee,
                ethnicityEmployee, taxIdentificationNumber, dateOfIssuanceOfTaxIdentificationNumber, issuingAuthorityOfCitizenIdentificationCard, nationalityEmployee,
                citizenIdentificationNumberEmployee, dateOfIssuanceOfCitizenIdentificationCard, placeOfIssuanceOfCitizenIdentificationCard, religionEmployee,
                maritalStatusEmploye, academicRank, seniority, iconPencil);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        maNhanVien12 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        idEmployee = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        nameEmployee = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        culturalLevelEmployee = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        nationalityEmployee = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        birthdayEmployee = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        ethnicityEmployee = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        genderEmployee = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        major = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        levelOfEducationEmployee = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        dateOfIssuanceOfCitizenIdentificationCard = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        citizenIdentificationNumberEmployee = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        placeOfIssuanceOfCitizenIdentificationCard = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        dateOfIssuanceOfTaxIdentificationNumber = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        taxIdentificationNumber = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        issuingAuthorityOfCitizenIdentificationCard = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        maritalStatus = new javax.swing.JTextPane();
        religionEmployee = new javax.swing.JScrollPane();
        religion = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        academicRank = new javax.swing.JTextPane();
        label16 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        seniority = new javax.swing.JTextPane();
        label17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 420));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Chỉnh sửa thông tin");

        label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label.setText("Mã nhân viên");

        label4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label4.setText("Dân tộc");

        label1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label1.setText("Tên nhân viên");

        label2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label2.setText("Giới tính");

        label5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label5.setText("Quốc tịch");

        label6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label6.setText("Tôn giáo");

        label10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label10.setText("Tình trạng hôn nhân");

        label3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label3.setText("Ngày sinh");

        label7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label7.setText("Chuyên ngành");

        label11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label11.setText("Số CCCD");

        label13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label13.setText("Mã số thuế");

        label12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label12.setText("Ngày cấp CCCD");

        maNhanVien12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maNhanVien12.setText("Nơi cấp CCCD");

        label9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label9.setText("Trình độ văn hóa");

        label8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label8.setText("Trình độ học vấn");

        label15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label15.setText("Ngày cấp mã số thuế");

        label14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label14.setText("Nơi cấp mã số thuế");

        jScrollPane1.setViewportView(idEmployee);

        jScrollPane3.setViewportView(nameEmployee);

        jScrollPane2.setViewportView(culturalLevelEmployee);

        jScrollPane4.setViewportView(nationalityEmployee);

        jScrollPane5.setViewportView(birthdayEmployee);

        jScrollPane6.setViewportView(ethnicityEmployee);

        jScrollPane7.setViewportView(genderEmployee);

        jScrollPane8.setViewportView(major);

        jScrollPane10.setViewportView(levelOfEducationEmployee);

        jScrollPane9.setViewportView(dateOfIssuanceOfCitizenIdentificationCard);

        jScrollPane11.setViewportView(citizenIdentificationNumberEmployee);

        jScrollPane12.setViewportView(placeOfIssuanceOfCitizenIdentificationCard);

        jScrollPane13.setViewportView(dateOfIssuanceOfTaxIdentificationNumber);

        jScrollPane14.setViewportView(taxIdentificationNumber);

        jScrollPane15.setViewportView(issuingAuthorityOfCitizenIdentificationCard);

        jScrollPane16.setViewportView(maritalStatus);

        religionEmployee.setViewportView(religion);

        jScrollPane17.setViewportView(academicRank);

        label16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label16.setText("Học hàm");

        jScrollPane18.setViewportView(seniority);

        label17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label17.setText("Thâm niên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(label7)
                                            .addGap(132, 132, 132))
                                        .addComponent(jScrollPane8)))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3))
                                    .addComponent(label8)))
                            .addComponent(label10)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(label13, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(label11))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label15)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label12)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label16)
                                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(label2)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label9)
                                    .addComponent(jScrollPane15)
                                    .addComponent(label14)
                                    .addComponent(maNhanVien12)
                                    .addComponent(jScrollPane12))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label5)
                                    .addComponent(label4)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label3)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label6)
                                    .addComponent(religionEmployee)))
                            .addComponent(label17))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(label2)
                            .addComponent(label3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label13)
                                    .addGap(28, 28, 28))
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label10)
                            .addComponent(label16)
                            .addComponent(label17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maNhanVien12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(religionEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane academicRank;
    private javax.swing.JTextPane birthdayEmployee;
    private javax.swing.JTextPane citizenIdentificationNumberEmployee;
    private javax.swing.JTextPane culturalLevelEmployee;
    private javax.swing.JTextPane dateOfIssuanceOfCitizenIdentificationCard;
    private javax.swing.JTextPane dateOfIssuanceOfTaxIdentificationNumber;
    private javax.swing.JTextPane ethnicityEmployee;
    private javax.swing.JTextPane genderEmployee;
    private javax.swing.JTextPane idEmployee;
    private javax.swing.JTextPane issuingAuthorityOfCitizenIdentificationCard;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JTextPane levelOfEducationEmployee;
    private javax.swing.JLabel maNhanVien12;
    private javax.swing.JTextPane major;
    private javax.swing.JTextPane maritalStatus;
    private javax.swing.JTextPane nameEmployee;
    private javax.swing.JTextPane nationalityEmployee;
    private javax.swing.JTextPane placeOfIssuanceOfCitizenIdentificationCard;
    private javax.swing.JTextPane religion;
    private javax.swing.JScrollPane religionEmployee;
    private javax.swing.JTextPane seniority;
    private javax.swing.JTextPane taxIdentificationNumber;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void initData() {
    }

    private void setData(String idEmployee, String nameEmployee, String genderEmployee, String birthdayEmployee, String majorEmployee, String levelOfEducationEmployee, String culturalLevelEmployee, 
            String ethnicityEmployee, String taxIdentificationNumber, String dateOfIssuanceOfTaxIdentificationNumber, String isuingAuthorityOfCitizenIdentificationCard, String nationalityEmployee, 
            String citizenIdentificationNumberEmployee, String dateOfIssuanceOfCitizenIdentificationCard, String placeOfIssuanceOfCitizenIdentificationCard, String religionEmployee, String maritalStatusEmploye, 
            String academicRank, String seniority, ImageIcon iconPencil) {
        
        this.idEmployee.setText(idEmployee);
        this.nameEmployee.setText(nameEmployee);
        this.genderEmployee.setText(genderEmployee);
        this.birthdayEmployee.setText(birthdayEmployee);
        this.major.setText(majorEmployee);
        this.levelOfEducationEmployee.setText(levelOfEducationEmployee);
        this.culturalLevelEmployee.setText(culturalLevelEmployee);
        this.ethnicityEmployee.setText(ethnicityEmployee);
        this.taxIdentificationNumber.setText(taxIdentificationNumber);
        this.dateOfIssuanceOfTaxIdentificationNumber.setText(dateOfIssuanceOfTaxIdentificationNumber);
        this.issuingAuthorityOfCitizenIdentificationCard.setText(isuingAuthorityOfCitizenIdentificationCard);
        this.nationalityEmployee.setText(nationalityEmployee);
        this.academicRank.setText(academicRank);
        this.seniority.setText(seniority);
    }

}
