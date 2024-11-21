package view.component.EmployeeDetailInfo.EmployeeDetail;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

//cái này là thêm
public class Hotline_Component extends javax.swing.JPanel {

    public Hotline_Component() {
        initComponents();
        setImg();
    }

    public Hotline_Component(String personalEmail, String personalPhoneNumber, String permanentAddress, String temporaryAddress, String companyEmail, String companyPhoneNumber, String companyAddress) {
        initComponents();
        setImg();
        setData(personalEmail, personalPhoneNumber, permanentAddress, temporaryAddress, companyEmail, companyPhoneNumber, companyAddress);
    }

    private ImageIcon scaleImg(JLabel jLabel, String url) {
        hotline.setSize(20, 20);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(url));
        Image image = imageIcon.getImage();
        Image scaleImage = image.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaleImage);
        return scaledIcon;
    }

    private void setImg() {
        String urlPhone = "/img/Phone-icon.png";
        ImageIcon iconPhone = scaleImg(hotline, urlPhone);
        hotline.setIcon(iconPhone);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hotline = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        personalEmail = new javax.swing.JLabel();
        personalPhoneNumber = new javax.swing.JLabel();
        permanentAddress = new javax.swing.JLabel();
        temporaryAddress = new javax.swing.JLabel();
        companyEmail = new javax.swing.JLabel();
        companyPhoneNumber = new javax.swing.JLabel();
        companyAddress = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 220));

        hotline.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hotline.setForeground(new java.awt.Color(51, 51, 255));
        hotline.setText("Liên Hệ");

        label2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label2.setText("Email cá nhân");

        label3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label3.setText("Số điện thoại cá nhân");

        label4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label4.setText("Địa chỉ thường trú");

        label5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label5.setText("Địa chỉ tạm trú");

        label6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label6.setText("Email công ty");

        label7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label7.setText("Số điện thoại công ty");

        label8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label8.setText("Địa chỉ công ty");

        personalEmail.setText("jLabel1");

        personalPhoneNumber.setText("jLabel1");

        permanentAddress.setText("jLabel1");

        temporaryAddress.setText("jLabel1");

        companyEmail.setText("jLabel1");

        companyPhoneNumber.setText("jLabel1");

        companyAddress.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(hotline))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2)
                            .addComponent(personalEmail)
                            .addComponent(label6)
                            .addComponent(companyEmail))
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personalPhoneNumber)
                            .addComponent(label3)
                            .addComponent(label7)
                            .addComponent(companyPhoneNumber))
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(companyAddress)
                            .addComponent(label8)
                            .addComponent(label4)
                            .addComponent(permanentAddress))
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5)
                            .addComponent(temporaryAddress))))
                .addGap(0, 182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(hotline)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personalEmail)
                            .addComponent(permanentAddress)
                            .addComponent(temporaryAddress))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(personalPhoneNumber)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(companyEmail)
                    .addComponent(companyPhoneNumber)
                    .addComponent(companyAddress))
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel companyAddress;
    private javax.swing.JLabel companyEmail;
    private javax.swing.JLabel companyPhoneNumber;
    private javax.swing.JLabel hotline;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel permanentAddress;
    private javax.swing.JLabel personalEmail;
    private javax.swing.JLabel personalPhoneNumber;
    private javax.swing.JLabel temporaryAddress;
    // End of variables declaration//GEN-END:variables

    private void setData(String personalEmail, String personalPhoneNumber, String permanentAddress, String temporaryAddress, String companyEmail, String companyPhoneNumber, String companyAddress) {
        this.personalEmail.setText(personalEmail);
        this.personalPhoneNumber.setText(personalPhoneNumber);
        this.permanentAddress.setText(permanentAddress);
        this.temporaryAddress.setText(temporaryAddress);
        this.companyEmail.setText(companyEmail);
        this.companyPhoneNumber.setText(companyPhoneNumber);
        this.companyAddress.setText(companyAddress);
    }

}
