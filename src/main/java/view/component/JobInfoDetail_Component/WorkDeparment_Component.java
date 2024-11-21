package view.component.JobInfoDetail_Component;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class WorkDeparment_Component extends javax.swing.JPanel {

    public WorkDeparment_Component() {
        initComponents();
    }

    public WorkDeparment_Component(String department, String internalDepartment, String directManager, String workspace, String placeOfWork, String workingConditions) {
        initComponents();
        setData(department, internalDepartment, directManager, workspace, placeOfWork, workingConditions);
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
        department = new javax.swing.JLabel();
        internalDepartment = new javax.swing.JLabel();
        directManager = new javax.swing.JLabel();
        workspace = new javax.swing.JLabel();
        placeOfWork = new javax.swing.JLabel();
        workingConditions = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 360));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Bộ phần làm việc");

        date.setText("Bộ phận làm việc");

        maNhanVien1.setText("Địa điểm làm việc ");

        nameEmployee.setText("Bộ phận nội bộ");

        genderEmployee.setText("Người quản lí trực tiếp");

        birthdayEmployee.setText("Vùng làm việc");

        jLabel1.setText("Điều kiện làm việc");

        department.setText("jLabel2");

        internalDepartment.setText("jLabel2");

        directManager.setText("jLabel2");

        workspace.setText("jLabel2");

        placeOfWork.setText("jLabel2");

        workingConditions.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date)
                            .addComponent(nameEmployee)
                            .addComponent(genderEmployee)
                            .addComponent(birthdayEmployee)
                            .addComponent(maNhanVien1)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(department, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(internalDepartment, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directManager, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(workspace, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placeOfWork, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(workingConditions, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(title)))
                .addContainerGap(833, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(department))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameEmployee)
                    .addComponent(internalDepartment))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderEmployee)
                    .addComponent(directManager))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayEmployee)
                    .addComponent(workspace))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maNhanVien1)
                    .addComponent(placeOfWork))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(workingConditions))
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthdayEmployee;
    private javax.swing.JLabel date;
    private javax.swing.JLabel department;
    private javax.swing.JLabel directManager;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel internalDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JLabel placeOfWork;
    private javax.swing.JLabel title;
    private javax.swing.JLabel workingConditions;
    private javax.swing.JLabel workspace;
    // End of variables declaration//GEN-END:variables

    private void setData(String department, String internalDepartment, String directManager, String workspace, String placeOfWork, String workingConditions) {
        this.department.setText(department);
        this.internalDepartment.setText(internalDepartment);
        this.directManager.setText(directManager);
        this.workspace.setText(workspace);
        this.placeOfWork.setText(placeOfWork);
        this.workingConditions.setText(workingConditions);
    }

}
