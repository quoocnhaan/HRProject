package view.component.ManageEmployee.ManageEmployeeDetail;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

//cái này là thêm
public class Hotline_Component_Manage extends javax.swing.JPanel {

    public Hotline_Component_Manage() {
        initComponents();
        setImg();
    }

    public Hotline_Component_Manage(String personalEmail, String personalPhoneNumber, String permanentAddress, String temporaryAddress, String companyEmail, String companyPhoneNumber, String companyAddress) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        personalEmail = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        companyPhoneNumber = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        temporaryAddress = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        permanentAddress = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        companyEmail = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        companyAddress = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        personalPhoneNumber = new javax.swing.JTextPane();

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

        jScrollPane1.setViewportView(personalEmail);

        jScrollPane2.setViewportView(companyPhoneNumber);

        jScrollPane3.setViewportView(temporaryAddress);

        jScrollPane4.setViewportView(permanentAddress);

        jScrollPane5.setViewportView(companyEmail);

        jScrollPane7.setViewportView(companyAddress);

        jScrollPane8.setViewportView(personalPhoneNumber);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2)
                            .addComponent(label6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label5)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane companyAddress;
    private javax.swing.JTextPane companyEmail;
    private javax.swing.JTextPane companyPhoneNumber;
    private javax.swing.JLabel hotline;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JTextPane permanentAddress;
    private javax.swing.JTextPane personalEmail;
    private javax.swing.JTextPane personalPhoneNumber;
    private javax.swing.JTextPane temporaryAddress;
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
