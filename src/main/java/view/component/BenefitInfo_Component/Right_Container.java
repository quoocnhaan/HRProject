/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.BenefitInfo_Component;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Right_Container extends javax.swing.JPanel {

    public Right_Container() {
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
        HealthInsurance_Component heathlnsurance = new HealthInsurance_Component();
        DayOff_Component dayOff = new DayOff_Component();
        MaternityLeave_Component maternityLeave = new MaternityLeave_Component();
        TimeKeepingInfo_Component timeKeepingInfo = new TimeKeepingInfo_Component();
        TransportAllowance_Component transportAllowance = new TransportAllowance_Component();
        RemoteWork_Component remoteWork = new RemoteWork_Component();
        
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
