package view.component.EmployeeDetailInfo.EmployeeDetail;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PersonalProfile_Component extends javax.swing.JPanel {

    public PersonalProfile_Component() {
        initComponents();
    }

    public PersonalProfile_Component(String idEmployee, String nameEmployee, String genderEmployee, String birthdayEmployee, String majorEmployee, String levelOfEducationEmployee, String culturalLevelEmployee,
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
        label16 = new javax.swing.JLabel();
        label17 = new javax.swing.JLabel();
        idEmployee = new javax.swing.JLabel();
        nameEmployee = new javax.swing.JLabel();
        genderEmployee = new javax.swing.JLabel();
        birthdayEmployee = new javax.swing.JLabel();
        major = new javax.swing.JLabel();
        levelOfEducationEmployee = new javax.swing.JLabel();
        culturalLevelEmployee = new javax.swing.JLabel();
        ethnicityEmployee = new javax.swing.JLabel();
        taxIdentificationNumber = new javax.swing.JLabel();
        dateOfIssuanceOfTaxIdentificationNumber = new javax.swing.JLabel();
        issuingAuthorityOfCitizenIdentificationCard = new javax.swing.JLabel();
        nationalityEmployee = new javax.swing.JLabel();
        citizenIdentificationNumberEmployee = new javax.swing.JLabel();
        dateOfIssuanceOfCitizenIdentificationCard = new javax.swing.JLabel();
        placeOfIssuanceOfCitizenIdentificationCard = new javax.swing.JLabel();
        religion = new javax.swing.JLabel();
        maritalStatus = new javax.swing.JLabel();
        academicRank = new javax.swing.JLabel();
        seniority = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 420));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText(" Thông tin cá nhân");

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

        label16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label16.setText("Học hàm");

        label17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label17.setText("Thâm niên");

        idEmployee.setText("jLabel1");

        nameEmployee.setText("jLabel1");

        genderEmployee.setText("jLabel1");

        birthdayEmployee.setText("jLabel1");

        major.setText("jLabel1");

        levelOfEducationEmployee.setText("jLabel1");

        culturalLevelEmployee.setText("jLabel1");

        ethnicityEmployee.setText("jLabel1");

        taxIdentificationNumber.setText("jLabel1");

        dateOfIssuanceOfTaxIdentificationNumber.setText("jLabel1");

        issuingAuthorityOfCitizenIdentificationCard.setText("jLabel1");

        nationalityEmployee.setText("jLabel1");

        citizenIdentificationNumberEmployee.setText("jLabel1");

        dateOfIssuanceOfCitizenIdentificationCard.setText("jLabel1");

        placeOfIssuanceOfCitizenIdentificationCard.setText("jLabel1");

        religion.setText("jLabel1");

        maritalStatus.setText("jLabel1");

        academicRank.setText("jLabel1");

        seniority.setText("jLabel1");

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
                        .addGap(856, 856, 856)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ethnicityEmployee)
                            .addComponent(label4)
                            .addComponent(label5)))
                    .addComponent(maritalStatus)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label)
                            .addComponent(idEmployee)
                            .addComponent(label7)
                            .addComponent(major)
                            .addComponent(label13)
                            .addComponent(label11)
                            .addComponent(taxIdentificationNumber)
                            .addComponent(citizenIdentificationNumberEmployee)
                            .addComponent(label10))
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfIssuanceOfCitizenIdentificationCard)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1)
                                    .addComponent(nameEmployee)
                                    .addComponent(label8)
                                    .addComponent(levelOfEducationEmployee)
                                    .addComponent(label15)
                                    .addComponent(dateOfIssuanceOfTaxIdentificationNumber)
                                    .addComponent(label12))
                                .addGap(202, 202, 202)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label14)
                                    .addComponent(culturalLevelEmployee)
                                    .addComponent(label9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label2)
                                            .addComponent(genderEmployee))
                                        .addGap(222, 222, 222)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label3)
                                            .addComponent(birthdayEmployee)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(issuingAuthorityOfCitizenIdentificationCard)
                                            .addComponent(maNhanVien12))
                                        .addGap(192, 192, 192)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label6)
                                            .addComponent(nationalityEmployee)
                                            .addComponent(religion)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(academicRank)
                                    .addComponent(label16))
                                .addGap(267, 267, 267)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label17)
                                    .addComponent(placeOfIssuanceOfCitizenIdentificationCard)
                                    .addComponent(seniority))))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(title)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(label3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idEmployee)
                            .addComponent(nameEmployee)
                            .addComponent(genderEmployee)
                            .addComponent(birthdayEmployee))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(label8)
                            .addComponent(label9)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(major)
                            .addComponent(culturalLevelEmployee)
                            .addComponent(ethnicityEmployee))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(label13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(taxIdentificationNumber)
                                .addGap(18, 18, 18)
                                .addComponent(label11)
                                .addGap(18, 18, 18)
                                .addComponent(citizenIdentificationNumberEmployee)
                                .addGap(18, 18, 18)
                                .addComponent(label10)
                                .addGap(18, 18, 18)
                                .addComponent(maritalStatus))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label15)
                                    .addComponent(label14)
                                    .addComponent(label5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateOfIssuanceOfTaxIdentificationNumber)
                                        .addGap(18, 18, 18)
                                        .addComponent(label12)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateOfIssuanceOfCitizenIdentificationCard)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(label16)
                                            .addComponent(label17)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nationalityEmployee)
                                            .addComponent(issuingAuthorityOfCitizenIdentificationCard))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(maNhanVien12)
                                            .addComponent(label6))
                                        .addGap(10, 10, 10)
                                        .addComponent(placeOfIssuanceOfCitizenIdentificationCard))
                                    .addComponent(religion))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seniority)
                                    .addComponent(academicRank)))))
                    .addComponent(levelOfEducationEmployee))
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel academicRank;
    private javax.swing.JLabel birthdayEmployee;
    private javax.swing.JLabel citizenIdentificationNumberEmployee;
    private javax.swing.JLabel culturalLevelEmployee;
    private javax.swing.JLabel dateOfIssuanceOfCitizenIdentificationCard;
    private javax.swing.JLabel dateOfIssuanceOfTaxIdentificationNumber;
    private javax.swing.JLabel ethnicityEmployee;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel idEmployee;
    private javax.swing.JLabel issuingAuthorityOfCitizenIdentificationCard;
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
    private javax.swing.JLabel levelOfEducationEmployee;
    private javax.swing.JLabel maNhanVien12;
    private javax.swing.JLabel major;
    private javax.swing.JLabel maritalStatus;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JLabel nationalityEmployee;
    private javax.swing.JLabel placeOfIssuanceOfCitizenIdentificationCard;
    private javax.swing.JLabel religion;
    private javax.swing.JLabel seniority;
    private javax.swing.JLabel taxIdentificationNumber;
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
