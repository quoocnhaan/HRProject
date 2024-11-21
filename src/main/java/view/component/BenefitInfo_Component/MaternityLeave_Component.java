package view.component.BenefitInfo_Component;

import view.component.ManageEmployee.ManageBenefitInfoDetail.*;

public class MaternityLeave_Component extends javax.swing.JPanel {

    public MaternityLeave_Component() {
        initComponents();
    }

    public MaternityLeave_Component(String gender, String maternityLeave, String subsidy, String companySupport, String numberOfMaternityLeaves) {
        initComponents();
        setData(gender, maternityLeave, subsidy, companySupport, numberOfMaternityLeaves);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        maNhanVien1 = new javax.swing.JLabel();
        nameEmployee = new javax.swing.JLabel();
        abc = new javax.swing.JLabel();
        birthdayEmployee1 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        maternityLeave = new javax.swing.JLabel();
        subsidy = new javax.swing.JLabel();
        companySupport = new javax.swing.JLabel();
        numberOfMaternityLeaves = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 310));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Nghỉ thai sản");

        date.setText("Giới tính");

        maNhanVien1.setText("Số lần nghỉ thai sản");

        nameEmployee.setText("Thời gian nghĩ thai sản");

        abc.setText("Mức trợ cấp");

        birthdayEmployee1.setText("Hỗ trợ từ công ty");

        gender.setText("jLabel1");

        maternityLeave.setText("jLabel1");

        subsidy.setText("jLabel1");

        companySupport.setText("jLabel1");

        numberOfMaternityLeaves.setText("jLabel1");

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
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maNhanVien1)
                            .addComponent(birthdayEmployee1)
                            .addComponent(abc)
                            .addComponent(nameEmployee)
                            .addComponent(date))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gender)
                            .addComponent(maternityLeave)
                            .addComponent(subsidy)
                            .addComponent(companySupport)
                            .addComponent(numberOfMaternityLeaves))))
                .addGap(831, 831, 831))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(gender))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameEmployee)
                    .addComponent(maternityLeave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abc)
                    .addComponent(subsidy))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayEmployee1)
                    .addComponent(companySupport))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maNhanVien1)
                    .addComponent(numberOfMaternityLeaves))
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abc;
    private javax.swing.JLabel birthdayEmployee1;
    private javax.swing.JLabel companySupport;
    private javax.swing.JLabel date;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel maternityLeave;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JLabel numberOfMaternityLeaves;
    private javax.swing.JLabel subsidy;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void setData(String gender, String maternityLeave, String subsidy, String companySupport, String numberOfMaternityLeaves) {
        this.gender.setText(gender);
        this.maternityLeave.setText(maternityLeave);
        this.subsidy.setText(subsidy);
        this.companySupport.setText(companySupport);
        this.numberOfMaternityLeaves.setText(numberOfMaternityLeaves);
    }
}
