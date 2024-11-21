package view.component.EmployeeDetailInfo.EmployeeDetail;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class AllComponent_Employee extends javax.swing.JPanel {

    public AllComponent_Employee() {
        initComponents();
        this.setPreferredSize(new Dimension(1120, 650));
        setLayout();
        addComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(243, 245, 249));

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
        this.setLayout(new GridLayout(0, 1, 10, 10));
    }

    private void addComponent() {
        this.add(new PersonalProfile_Component());
        this.add(new Hotline_Component());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
