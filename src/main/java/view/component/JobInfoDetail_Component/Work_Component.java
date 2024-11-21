package view.component.JobInfoDetail_Component;

import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Work_Component extends javax.swing.JPanel {

    public Work_Component() {
        initComponents();
    }

    public Work_Component(String job, boolean specializationAssignment, String jobTitle, String promotionDate, String nameJob, Date dateOfAppointment) {
        initComponents();
        setData(job, specializationAssignment, jobTitle, promotionDate, nameJob, dateOfAppointment);
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
        promotionDate = new com.toedter.calendar.JDateChooser();
        job = new javax.swing.JLabel();
        jobTitle = new javax.swing.JLabel();
        nameJob = new javax.swing.JLabel();

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

        job.setText("jLabel2");

        jobTitle.setText("jLabel2");

        nameJob.setText("jLabel2");

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
                            .addComponent(specializationAssignment)
                            .addComponent(promotionDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(job)
                            .addComponent(jobTitle)
                            .addComponent(nameJob))))
                .addContainerGap(658, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(job))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameEmployee)
                    .addComponent(specializationAssignment))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderEmployee)
                            .addComponent(jobTitle))
                        .addGap(18, 18, 18)
                        .addComponent(promotionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(birthdayEmployee))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maNhanVien1)
                    .addComponent(nameJob))
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
    private javax.swing.JLabel job;
    private javax.swing.JLabel jobTitle;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JLabel nameJob;
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
