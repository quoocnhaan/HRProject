package view.component.BenefitInfo_Component;

import java.util.Date;

public class HealthInsurance_Component extends javax.swing.JPanel {

    public HealthInsurance_Component() {
        initComponents();
    }

    public HealthInsurance_Component(Date fromMonth, Date toMonth, String salary, String position, String seniority, String insuranceContribution, String socialInsuranceRate_Employee,
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
        jLabel1 = new javax.swing.JLabel();
        toMonth = new com.toedter.calendar.JDateChooser();
        salary = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        seniority = new javax.swing.JLabel();
        insuranceContribution = new javax.swing.JLabel();
        socialInsuranceRate_Employee = new javax.swing.JLabel();
        healthInsurancePremiumRate_Employee = new javax.swing.JLabel();
        insurancePremiumRateForDependents_Employee = new javax.swing.JLabel();
        socialInsuranceRate_Company = new javax.swing.JLabel();
        healthInsurancePremiumRate_Company = new javax.swing.JLabel();
        insurancePremiumRateForDependents_Company = new javax.swing.JLabel();

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

        jLabel1.setText("Tỉ lệ % BHYT cty đóng");

        salary.setText("jLabel4");

        position.setText("jLabel4");

        seniority.setText("jLabel4");

        insuranceContribution.setText("jLabel4");

        socialInsuranceRate_Employee.setText("jLabel4");

        healthInsurancePremiumRate_Employee.setText("jLabel4");

        insurancePremiumRateForDependents_Employee.setText("jLabel4");

        socialInsuranceRate_Company.setText("jLabel4");

        healthInsurancePremiumRate_Company.setText("jLabel4");

        insurancePremiumRateForDependents_Company.setText("jLabel4");

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
                                        .addComponent(seniority)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel30))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(position)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel29))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(salary)
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
                    .addComponent(insuranceContribution)
                    .addComponent(socialInsuranceRate_Employee)
                    .addComponent(healthInsurancePremiumRate_Employee)
                    .addComponent(insurancePremiumRateForDependents_Employee)
                    .addComponent(socialInsuranceRate_Company)
                    .addComponent(healthInsurancePremiumRate_Company)
                    .addComponent(insurancePremiumRateForDependents_Company))
                .addGap(285, 285, 285))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label3)
                                .addComponent(fromMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(insuranceContribution))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(socialInsuranceRate_Employee))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(healthInsurancePremiumRate_Employee)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(toMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(salary))))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(position))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29)
                                .addComponent(insurancePremiumRateForDependents_Employee)))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(seniority))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(socialInsuranceRate_Company)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(healthInsurancePremiumRate_Company))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(insurancePremiumRateForDependents_Company))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fromMonth;
    private javax.swing.JLabel healthInsurancePremiumRate_Company;
    private javax.swing.JLabel healthInsurancePremiumRate_Employee;
    private javax.swing.JLabel insuranceContribution;
    private javax.swing.JLabel insurancePremiumRateForDependents_Company;
    private javax.swing.JLabel insurancePremiumRateForDependents_Employee;
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
    private javax.swing.JLabel label3;
    private javax.swing.JLabel position;
    private javax.swing.JLabel salary;
    private javax.swing.JLabel seniority;
    private javax.swing.JLabel socialInsuranceRate_Company;
    private javax.swing.JLabel socialInsuranceRate_Employee;
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
