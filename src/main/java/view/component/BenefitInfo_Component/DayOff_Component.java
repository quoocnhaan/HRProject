package view.component.BenefitInfo_Component;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DayOff_Component extends javax.swing.JPanel {

    public DayOff_Component() {
        initComponents();
    }

    public DayOff_Component(String leaveEntitlement, String accruedTime, String maximumAccruedDays, String currentLeaveDays) {
        initComponents();
        setData(leaveEntitlement, accruedTime, maximumAccruedDays, currentLeaveDays);
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
        date = new javax.swing.JLabel();
        nameEmployee = new javax.swing.JLabel();
        genderEmployee = new javax.swing.JLabel();
        birthdayEmployee = new javax.swing.JLabel();
        leaveEntitlement = new javax.swing.JLabel();
        accruedTime = new javax.swing.JLabel();
        maximumAccruedDays = new javax.swing.JLabel();
        currentLeaveDays = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 250));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Nghỉ phép");

        date.setText("Tỉ lệ nghỉ phép");

        nameEmployee.setText("Thời gian tích lũy nghỉ phép");

        genderEmployee.setText("Số ngày tích phép tối đa");

        birthdayEmployee.setText("Số ngày nghỉ đang có");

        leaveEntitlement.setText("jLabel1");

        accruedTime.setText("jLabel1");

        maximumAccruedDays.setText("jLabel1");

        currentLeaveDays.setText("jLabel1");

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
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(date)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(genderEmployee)
                                    .addComponent(nameEmployee)
                                    .addComponent(birthdayEmployee))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leaveEntitlement)
                            .addComponent(accruedTime)
                            .addComponent(maximumAccruedDays)
                            .addComponent(currentLeaveDays))))
                .addContainerGap(827, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(leaveEntitlement))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameEmployee)
                    .addComponent(accruedTime))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderEmployee)
                    .addComponent(maximumAccruedDays))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayEmployee)
                    .addComponent(currentLeaveDays))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accruedTime;
    private javax.swing.JLabel birthdayEmployee;
    private javax.swing.JLabel currentLeaveDays;
    private javax.swing.JLabel date;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel leaveEntitlement;
    private javax.swing.JLabel maximumAccruedDays;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void setData(String leaveEntitlement, String accruedTime, String maximumAccruedDays, String currentLeaveDays) {
        this.leaveEntitlement.setText(leaveEntitlement);
        this.accruedTime.setText(accruedTime);
        this.maximumAccruedDays.setText(maximumAccruedDays);
        this.currentLeaveDays.setText(currentLeaveDays);

    }
}
