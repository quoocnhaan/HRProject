/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.BenefitsInfo_Component;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Right_Container_BI extends javax.swing.JPanel {

    public Right_Container_BI() {
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

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new FlowLayout());
        HealthInsurance_Component_BI heathlnsurance = new HealthInsurance_Component_BI();
        DayOff_Component_BI dayOff = new DayOff_Component_BI();
        MaternityLeave_Component_BI maternityLeave = new MaternityLeave_Component_BI();
        TimeKeepingInfo_Component_BI timeKeepingInfo = new TimeKeepingInfo_Component_BI();
        TransportAllowance_Component_BI transportAllowance = new TransportAllowance_Component_BI();
        RemoteWork_Component_BI remoteWork = new RemoteWork_Component_BI();
        
        this.add(heathlnsurance);
        this.add(dayOff);
        this.add(maternityLeave);
        this.add(timeKeepingInfo);
        this.add(transportAllowance);
        this.add(remoteWork);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
