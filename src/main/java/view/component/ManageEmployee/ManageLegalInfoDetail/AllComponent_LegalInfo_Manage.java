package view.component.ManageEmployee.ManageLegalInfoDetail;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class AllComponent_LegalInfo_Manage extends javax.swing.JPanel {

    public AllComponent_LegalInfo_Manage() {
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
        DriverLicense_Component_Manage driverLicense = new DriverLicense_Component_Manage();
        BankCard_Component_Manage bankCard = new BankCard_Component_Manage();
        EmploymentContract_Component_Manage employeeContract = new EmploymentContract_Component_Manage();
        Resignation_Component_Manage resignation = new Resignation_Component_Manage();

        this.add(driverLicense);
        this.add(bankCard);
        this.add(employeeContract);
        this.add(resignation);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
