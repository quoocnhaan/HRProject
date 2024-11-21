package view.component.JobInfoDetail_Component;

import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TimeKeepingInfo_Component extends javax.swing.JPanel {

    public TimeKeepingInfo_Component() {
        initComponents();
    }

    public TimeKeepingInfo_Component(String attendanceTracking, String placeOfWor, String workingConditions, String shift, Date startDate) {
        initComponents();
        setData(attendanceTracking, placeOfWor, workingConditions, shift, startDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        maNhanVien1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        maNhanVien2 = new javax.swing.JLabel();
        startDate = new com.toedter.calendar.JDateChooser();
        attendanceTracking0 = new javax.swing.JLabel();
        placeOfWork = new javax.swing.JLabel();
        workingConditions = new javax.swing.JLabel();
        shift = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 210));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Thông tin chấm công");

        date.setText("Mã chấm công");

        maNhanVien1.setText("Địa điểm làm việc ");

        jLabel1.setText("Điều kiện làm việc");

        jLabel2.setText("Ca làm việc");

        maNhanVien2.setText("Ngày làm việc");

        attendanceTracking0.setText("jLabel3");

        placeOfWork.setText("jLabel3");

        workingConditions.setText("jLabel3");

        shift.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addContainerGap(900, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maNhanVien1)
                            .addComponent(date)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(attendanceTracking0)
                                    .addComponent(placeOfWork))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maNhanVien2)
                                        .addGap(18, 18, 18)
                                        .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(shift)
                                        .addGap(172, 172, 172)))
                                .addGap(73, 73, 73))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(workingConditions)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(date)
                                    .addComponent(attendanceTracking0))
                                .addGap(40, 40, 40))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(maNhanVien1)
                                .addComponent(placeOfWork)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(workingConditions)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(shift))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maNhanVien2)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attendanceTracking0;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel maNhanVien2;
    private javax.swing.JLabel placeOfWork;
    private javax.swing.JLabel shift;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JLabel title;
    private javax.swing.JLabel workingConditions;
    // End of variables declaration//GEN-END:variables

    private void setData(String attendanceTracking, String placeOfWor, String workingConditions, String shift, Date startDate) {
        this.attendanceTracking0.setText(attendanceTracking);
        this.placeOfWork.setText(placeOfWor);
        this.workingConditions.setText(workingConditions);
        this.shift.setText(shift);
        this.startDate.setDate(startDate);
    }

}
