package view.component.ManageEmployee.ManageLegalInfoDetail;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JScrollPane;


public class LegalInfo_Component_Manage extends javax.swing.JPanel {

    public LegalInfo_Component_Manage() {
        initComponents();
        this.setPreferredSize(new Dimension(1400, 547));
        setLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(1400, 547));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new BorderLayout());
//        this.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        AllComponent_LegalInfo_Manage right = new AllComponent_LegalInfo_Manage();
        right.setPreferredSize(new Dimension(1120, 2000));

        JScrollPane scrollPane = new JScrollPane(right);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        this.add(scrollPane, BorderLayout.CENTER);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
