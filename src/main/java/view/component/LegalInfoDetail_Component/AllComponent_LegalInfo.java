package view.component.LegalInfoDetail_Component;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class AllComponent_LegalInfo extends javax.swing.JPanel {

    public AllComponent_LegalInfo() {
        initComponents();
        this.setPreferredSize(new Dimension(1120, 547));
        setLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new FlowLayout());
        DriverLicense_Component driverLicense = new DriverLicense_Component();
        BankCard_Component bankCard = new BankCard_Component();
        EmploymentContract_Component employeeContract = new EmploymentContract_Component();
        Resignation_Component resignation = new Resignation_Component();

        this.add(driverLicense);
        this.add(bankCard);
        this.add(employeeContract);
        this.add(resignation);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
