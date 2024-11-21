package view.component.JobInfoDetail_Component;

import java.util.Date;

public class JobInfo_Component extends javax.swing.JPanel {

    public JobInfo_Component() {
        initComponents();
    }

    public JobInfo_Component(Date dateEmployee, Date dateEmployment_Official, String employeeType, String jobStatus, String jobType) {
        initComponents();
        setData(dateEmployee, dateEmployment_Official, employeeType, jobStatus, jobType);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        dateEmployee = new com.toedter.calendar.JDateChooser();
        nameEmployee = new javax.swing.JLabel();
        dateEmployment_Official = new com.toedter.calendar.JDateChooser();
        maNhanVien1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        employeeType = new javax.swing.JLabel();
        jobStatus = new javax.swing.JLabel();
        jobType = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 210));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Thông tin cơ bản");

        date.setText("Ngày vào làm");

        dateEmployee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        nameEmployee.setText("Ngày thành NV chính thức");

        dateEmployment_Official.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        maNhanVien1.setText("Loại nhân viên");

        jLabel1.setText("Loại lao động");

        jLabel2.setText("Tinh trạng công việc");

        employeeType.setText("jLabel3");

        jobStatus.setText("jLabel3");

        jobType.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(title)
                .addContainerGap(928, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date)
                    .addComponent(nameEmployee)
                    .addComponent(maNhanVien1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateEmployment_Official, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jobStatus)
                            .addComponent(jobType))
                        .addGap(247, 247, 247))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(employeeType)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date)
                            .addComponent(dateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateEmployment_Official, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameEmployee, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jobStatus))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jobType))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maNhanVien1)
                    .addComponent(employeeType))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private com.toedter.calendar.JDateChooser dateEmployee;
    private com.toedter.calendar.JDateChooser dateEmployment_Official;
    private javax.swing.JLabel employeeType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jobStatus;
    private javax.swing.JLabel jobType;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void setData(Date dateEmployee, Date dateEmployment_Official, String employeeType, String jobStatus, String jobType) {
        this.dateEmployee.setDate(dateEmployee);
        this.dateEmployment_Official.setDate(dateEmployment_Official);
        this.employeeType.setText(employeeType);
        this.jobStatus.setText(jobStatus);
        this.jobType.setText(jobType);
    }
}
