package view.component.BenefitInfo_Component;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TransportAllowance_Component extends javax.swing.JPanel {

    public TransportAllowance_Component() {
        initComponents();
    }

    public TransportAllowance_Component(String items, String levelOfBenefits, String benefitsRegulations) {
        initComponents();
        setData(items, levelOfBenefits, benefitsRegulations);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        maNhanVien1 = new javax.swing.JLabel();
        genderEmployee = new javax.swing.JLabel();
        purposeOfReceivingBenefits = new javax.swing.JLabel();
        allowanceAmount = new javax.swing.JLabel();
        travelExpenses = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 220));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Trợ cấp đi lại");

        date.setText("Mục đích trợ cấp");

        maNhanVien1.setText("Quy định về chi phí đi lại");

        genderEmployee.setText("Mức trợ cấp");

        purposeOfReceivingBenefits.setText("jLabel1");

        allowanceAmount.setText("jLabel1");

        travelExpenses.setText("jLabel1");

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
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date)
                            .addComponent(genderEmployee)
                            .addComponent(maNhanVien1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(purposeOfReceivingBenefits, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(allowanceAmount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(travelExpenses, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(823, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date)
                            .addComponent(purposeOfReceivingBenefits))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(genderEmployee)
                        .addComponent(allowanceAmount)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maNhanVien1)
                    .addComponent(travelExpenses))
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allowanceAmount;
    private javax.swing.JLabel date;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel purposeOfReceivingBenefits;
    private javax.swing.JLabel title;
    private javax.swing.JLabel travelExpenses;
    // End of variables declaration//GEN-END:variables

    private void setData(String items, String allowanceAmount, String travelExpenses) {
        this.purposeOfReceivingBenefits.setText(items);
        this.allowanceAmount.setText(allowanceAmount);
        this.travelExpenses.setText(travelExpenses);
    }
    
}
