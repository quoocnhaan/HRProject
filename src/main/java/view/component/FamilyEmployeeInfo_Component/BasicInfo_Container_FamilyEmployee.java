package view.component.FamilyEmployeeInfo_Component;

import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class BasicInfo_Container_FamilyEmployee extends javax.swing.JPanel {

    public BasicInfo_Container_FamilyEmployee() {
        initComponents();
        setLayout();
        addComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(280, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addComponents() {
        ImageIcon img = new ImageIcon(getClass().getResource("/img/avatar.jpg"));
        for (int i = 1; i <= 10; i++) {
            this.add(new BasicInfo_Component_FamilyEmployee("Nguyen Hoang Huu", "50 Tuổi", "producer", "Ba ruột", img));
        }
    }

    private void setLayout() {
        this.setLayout(new GridLayout(0, 1, 0, 0));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
