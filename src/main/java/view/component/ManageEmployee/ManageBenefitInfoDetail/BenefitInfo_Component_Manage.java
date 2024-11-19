
package view.component.ManageEmployee.ManageBenefitInfoDetail;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JScrollPane;

public class BenefitInfo_Component_Manage extends javax.swing.JPanel {

    public BenefitInfo_Component_Manage() {
        initComponents();
        setLayout();
        addComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(1120, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addComponent() {
        
        AllComponent_BenefitInfo_Manage right = new AllComponent_BenefitInfo_Manage();
        right.setPreferredSize(new Dimension(1120, 1000));
        JScrollPane scrollPane = new JScrollPane(right);
        scrollPane.setBorder(null);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        this.add(scrollPane, BorderLayout.CENTER);
    }

    private void setLayout() {
        this.setLayout(new BorderLayout());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
