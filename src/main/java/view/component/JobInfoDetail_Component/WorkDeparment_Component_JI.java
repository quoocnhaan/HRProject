package view.component.JobInfoDetail_Component;


import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author user
 */
public class WorkDeparment_Component_JI extends javax.swing.JPanel {

    /**
     * Creates new form PersonalProfile
     */
    public WorkDeparment_Component_JI() {
        initComponents();
        this.setPreferredSize(new Dimension(1120, 270));
        setImg();
    }

    private ImageIcon scaleImg(JLabel jLabel, String url) {
        title.setSize(20,20);
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
        date = new javax.swing.JLabel();
        maNhanVien1 = new javax.swing.JLabel();
        nameEmployee = new javax.swing.JLabel();
        placeOfWork = new javax.swing.JLabel();
        genderEmployee = new javax.swing.JLabel();
        birthdayEmployee = new javax.swing.JLabel();
        workingConditions = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        shift = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        option_NoNeedToSwipeACard = new javax.swing.JCheckBox();
        attendanceTracking = new javax.swing.JLabel();
        subjectsForTimekeeping = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        workspace = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        option_OvertimeRegistration = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(1120, 270));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Bộ phần làm việc");

        date.setText("Bộ phận làm việc");

        maNhanVien1.setText("Địa điểm làm việc ");

        nameEmployee.setText("Bộ phận nội bộ");

        placeOfWork.setText("????");

        genderEmployee.setText("Người quản lí trực tiếp");

        birthdayEmployee.setText("Vùng làm việc");

        workingConditions.setText("???");

        jLabel1.setText("Điều kiện làm việc");

        jLabel2.setText("Người quản lí gián tiếp");

        shift.setText("Nguyễn Trần XYZ");

        jLabel4.setText("Tài khoản Protal");

        jLabel5.setText("Mật khẩu xem phiếu lương");

        jLabel6.setText("Tự động phát sinh mật khẩu");

        option_NoNeedToSwipeACard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_NoNeedToSwipeACardActionPerformed(evt);
            }
        });

        attendanceTracking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        attendanceTracking.setText("Tester");

        subjectsForTimekeeping.setText("????");

        jlabel.setText("Nguyễn Văn ABC");

        workspace.setText("????");

        jLabel10.setText("Là cán bộ chủ chốt");

        option_OvertimeRegistration.setToolTipText("");
        option_OvertimeRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option_OvertimeRegistrationActionPerformed(evt);
            }
        });

        jLabel3.setText("????");

        jLabel7.setText("????");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(workingConditions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(maNhanVien1)
                                            .addGap(18, 18, 18)
                                            .addComponent(placeOfWork))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(birthdayEmployee)
                                            .addGap(18, 18, 18)
                                            .addComponent(workspace))))
                                .addGap(150, 150, 150))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genderEmployee)
                                .addGap(18, 18, 18)
                                .addComponent(jlabel)
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(date)
                                    .addComponent(nameEmployee))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subjectsForTimekeeping)
                                    .addComponent(attendanceTracking))
                                .addGap(134, 134, 134)))
                        .addGap(267, 267, 267)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shift)
                            .addComponent(option_NoNeedToSwipeACard)
                            .addComponent(option_OvertimeRegistration)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(date)
                                    .addComponent(attendanceTracking))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(shift)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameEmployee)
                                        .addComponent(subjectsForTimekeeping)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(genderEmployee))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addGap(3, 3, 3))))
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jlabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(option_NoNeedToSwipeACard))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(option_OvertimeRegistration)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthdayEmployee)
                            .addComponent(workspace))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maNhanVien1)
                            .addComponent(placeOfWork))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(workingConditions)
                            .addComponent(jLabel1))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void option_NoNeedToSwipeACardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_NoNeedToSwipeACardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option_NoNeedToSwipeACardActionPerformed

    private void option_OvertimeRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option_OvertimeRegistrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option_OvertimeRegistrationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attendanceTracking;
    private javax.swing.JLabel birthdayEmployee;
    private javax.swing.JLabel date;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel nameEmployee;
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
