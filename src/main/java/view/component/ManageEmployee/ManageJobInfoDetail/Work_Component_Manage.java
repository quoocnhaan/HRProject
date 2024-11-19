package view.component.ManageEmployee.ManageJobInfoDetail;

import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Work_Component_Manage extends javax.swing.JPanel {

    public Work_Component_Manage() {
        initComponents();
    }

    public Work_Component_Manage(String job, boolean specializationAssignment, String jobTitle, String promotionDate, String nameJob, Date dateOfAppointment) {
        initComponents();
        setData(job, specializationAssignment, jobTitle, promotionDate, nameJob, dateOfAppointment);
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
        maNhanVien1 = new javax.swing.JLabel();
        nameEmployee = new javax.swing.JLabel();
        genderEmployee = new javax.swing.JLabel();
        birthdayEmployee = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        specializationAssignment = new javax.swing.JCheckBox();
        dateOfAppointment = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        job = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jobTitle = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        nameJob = new javax.swing.JTextPane();
        promotionDate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 370));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Công việc");

        date.setText("Ngành nghề");

        maNhanVien1.setText("Chức danh công việc");

        nameEmployee.setText("Phân công đúng chuyên ngành");

        genderEmployee.setText("Chức vụ");

        birthdayEmployee.setText("Ngày bổ nhiệm");

        jLabel1.setText("Ngày nhận chức danh");

        specializationAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specializationAssignmentActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(job);

        jScrollPane3.setViewportView(jobTitle);

        jScrollPane5.setViewportView(nameJob);

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
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameEmployee)
                            .addComponent(date)
                            .addComponent(genderEmployee)
                            .addComponent(birthdayEmployee)
                            .addComponent(maNhanVien1)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateOfAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane2)
                            .addComponent(specializationAssignment)
                            .addComponent(jScrollPane3)
                            .addComponent(promotionDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(658, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameEmployee)
                    .addComponent(specializationAssignment))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderEmployee))
                        .addGap(18, 18, 18)
                        .addComponent(promotionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(birthdayEmployee))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maNhanVien1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateOfAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void specializationAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specializationAssignmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specializationAssignmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthdayEmployee;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JDateChooser dateOfAppointment;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane job;
    private javax.swing.JTextPane jobTitle;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JTextPane nameJob;
    private com.toedter.calendar.JDateChooser promotionDate;
    private javax.swing.JCheckBox specializationAssignment;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void setData(String job, boolean specializationAssignment, String jobTitle, String promotionDate, String nameJob, Date dateOfAppointment) {
        this.job.setText(job);
        this.specializationAssignment.setSelected(specializationAssignment);
        this.jobTitle.setText(jobTitle);
        this.promotionDate.setDate(dateOfAppointment);
        this.nameJob.setText(nameJob);
        this.dateOfAppointment.setDate(dateOfAppointment);
    }

}
