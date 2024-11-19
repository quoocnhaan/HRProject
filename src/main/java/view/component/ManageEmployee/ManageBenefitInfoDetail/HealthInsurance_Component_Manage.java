package view.component.ManageEmployee.ManageBenefitInfoDetail;

import java.awt.Dimension;
import java.util.Date;

public class HealthInsurance_Component_Manage extends javax.swing.JPanel {

    public HealthInsurance_Component_Manage() {
        initComponents();
    }

    public HealthInsurance_Component_Manage(Date fromMonth, Date toMonth, String salary, String position, String seniority, String insuranceContribution, String socialInsuranceRate_Employee,
            String healthInsurancePremiumRate_Employee, String insurancePremiumRateForDependents_Employee, String socialInsuranceRate_Company, String healthInsurancePremiumRate_Company,
            String insurancePremiumRateForDependents_Company) {
        initComponents();

        setData(fromMonth, toMonth, salary, position, seniority, insuranceContribution, socialInsuranceRate_Employee,
                healthInsurancePremiumRate_Employee, insurancePremiumRateForDependents_Employee, socialInsuranceRate_Company, healthInsurancePremiumRate_Company,
                insurancePremiumRateForDependents_Company);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fromMonth = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salary = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        position = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        seniority = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        healthInsurancePremiumRate_Company = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        socialInsuranceRate_Company = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        insurancePremiumRateForDependents_Employee = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        insuranceContribution = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        socialInsuranceRate_Employee = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        insurancePremiumRateForDependents_Company = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        healthInsurancePremiumRate_Employee = new javax.swing.JTextPane();
        toMonth = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 410));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Bảo hiểm bắt buộc");

        label3.setText("Từ tháng");

        jLabel2.setText("Đến tháng");

        fromMonth.setToolTipText("");

        jLabel3.setText("Mức lương");

        jLabel6.setText("PC chức vụ");

        jLabel8.setText("PC thâm niên");

        jLabel26.setText("Mức đóng bảo hiểm");

        jLabel27.setText("Tỉ lệ % BHXH NV đóng");

        jLabel28.setText("Tỉ lệ % BHYT NV đóng");

        jLabel29.setText("Tỉ lệ % BHTN NV đóng");

        jLabel30.setText("Tỉ lệ % BHXH cty đóng");

        jLabel31.setText("Tỉ lệ % BHTN cty đóng");

        jScrollPane1.setViewportView(salary);

        jScrollPane3.setViewportView(position);

        jScrollPane5.setViewportView(seniority);

        jScrollPane14.setViewportView(healthInsurancePremiumRate_Company);

        jScrollPane15.setViewportView(socialInsuranceRate_Company);

        jScrollPane16.setViewportView(insurancePremiumRateForDependents_Employee);

        jScrollPane17.setViewportView(insuranceContribution);

        jScrollPane18.setViewportView(socialInsuranceRate_Employee);

        jLabel1.setText("Tỉ lệ % BHYT cty đóng");

        jScrollPane20.setViewportView(insurancePremiumRateForDependents_Company);

        jScrollPane2.setViewportView(healthInsurancePremiumRate_Employee);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel31))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                        .addComponent(jLabel30))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel29))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel28))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(toMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fromMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label3)
                                .addComponent(fromMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel26)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(toMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fromMonth;
    private javax.swing.JTextPane healthInsurancePremiumRate_Company;
    private javax.swing.JTextPane healthInsurancePremiumRate_Employee;
    private javax.swing.JTextPane insuranceContribution;
    private javax.swing.JTextPane insurancePremiumRateForDependents_Company;
    private javax.swing.JTextPane insurancePremiumRateForDependents_Employee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel label3;
    private javax.swing.JTextPane position;
    private javax.swing.JTextPane salary;
    private javax.swing.JTextPane seniority;
    private javax.swing.JTextPane socialInsuranceRate_Company;
    private javax.swing.JTextPane socialInsuranceRate_Employee;
    private javax.swing.JLabel title;
    private com.toedter.calendar.JDateChooser toMonth;
    // End of variables declaration//GEN-END:variables

    private void setData(Date fromMonth, Date toMonth, String salary, String position, String seniority, String insuranceContribution, String socialInsuranceRate_Employee, 
            String healthInsurancePremiumRate_Employee, String insurancePremiumRateForDependents_Employee, String socialInsuranceRate_Company, String healthInsurancePremiumRate_Company, 
            String insurancePremiumRateForDependents_Company) {
        
        this.fromMonth.setSelectableDateRange(fromMonth, fromMonth);
        this.toMonth.setSelectableDateRange(toMonth, toMonth);
        this.position.setText(position);
        this.seniority.setText(seniority);
        this.insuranceContribution.setText(insuranceContribution);
        this.socialInsuranceRate_Employee.setText(socialInsuranceRate_Employee);
        this.healthInsurancePremiumRate_Employee.setText(healthInsurancePremiumRate_Employee);
        this.insurancePremiumRateForDependents_Employee.setText(insurancePremiumRateForDependents_Employee);
        this.socialInsuranceRate_Company.setText(socialInsuranceRate_Company);
        this.healthInsurancePremiumRate_Company.setText(healthInsurancePremiumRate_Company);
        this.insurancePremiumRateForDependents_Company.setText(insurancePremiumRateForDependents_Company);
    }
}
