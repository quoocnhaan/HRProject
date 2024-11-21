
package view.component.BenefitInfo_Component;

import java.awt.FlowLayout;

public class AllComponent_BenefitInfo_Manage extends javax.swing.JPanel {

    public AllComponent_BenefitInfo_Manage() {
        initComponents();
        setLayout();
        addComponent();
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
        this.setLayout(new FlowLayout()); //hang, cot, khoang cach doc, khoang cach ngang
    }

    private void addComponent() {
        this.add(new DayOff_Component());
        this.add(new MaternityLeave_Component());
        this.add(new HealthInsurance_Component());
        this.add(new TransportAllowance_Component());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
