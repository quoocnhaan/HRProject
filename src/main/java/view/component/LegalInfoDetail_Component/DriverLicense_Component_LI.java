/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LegalInfoDetail_Component;

import java.awt.Dimension;

/**
 *
 * @author user
 */
public class DriverLicense_Component_LI extends javax.swing.JPanel {

    /**
     * Creates new form DriverLicense_Component_LI
     */
    public DriverLicense_Component_LI() {
        initComponents();
        this.setPreferredSize(new Dimension(1120, 250));
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
        attendanceTracking = new javax.swing.JLabel();
        subjectsForTimekeeping = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        workspace = new javax.swing.JLabel();
        genderEmployee = new javax.swing.JLabel();
        birthdayEmployee = new javax.swing.JLabel();
        workingConditions = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        shift = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        maNhanVien1 = new javax.swing.JLabel();
        nameEmployee = new javax.swing.JLabel();
        placeOfWork = new javax.swing.JLabel();
        shift1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Giấy phép lái xe");

        attendanceTracking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        attendanceTracking.setText("123");

        subjectsForTimekeeping.setText("????");

        jlabel.setText("????");

        workspace.setText("????");

        genderEmployee.setText("Ngày cấp");

        birthdayEmployee.setText("Hết hạn");

        workingConditions.setText("???");

        jLabel1.setText("Mức độ bằng lái");

        jLabel2.setText("Cơ quan cấp bằng lái");

        shift.setText("??????");

        jLabel4.setText("Trạng thái");

        date.setText("Loại giấy tờ");

        maNhanVien1.setText("Tên người sở hữu");

        nameEmployee.setText("Số giấy tờ");

        placeOfWork.setText("????");

        shift1.setText("??????");

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
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameEmployee)
                            .addComponent(date)
                            .addComponent(genderEmployee)
                            .addComponent(birthdayEmployee)
                            .addComponent(maNhanVien1)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(attendanceTracking)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 449, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(subjectsForTimekeeping)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(shift)
                                    .addComponent(shift1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(placeOfWork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(workspace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(workingConditions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(263, 263, 263))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date)
                            .addComponent(attendanceTracking))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameEmployee)
                            .addComponent(subjectsForTimekeeping)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(shift))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(shift1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderEmployee)
                    .addComponent(jlabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayEmployee)
                    .addComponent(workspace))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maNhanVien1)
                    .addComponent(placeOfWork))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(workingConditions))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attendanceTracking;
    private javax.swing.JLabel birthdayEmployee;
    private javax.swing.JLabel date;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JLabel placeOfWork;
    private javax.swing.JLabel shift;
    private javax.swing.JLabel shift1;
    private javax.swing.JLabel subjectsForTimekeeping;
    private javax.swing.JLabel title;
    private javax.swing.JLabel workingConditions;
    private javax.swing.JLabel workspace;
    // End of variables declaration//GEN-END:variables
}
