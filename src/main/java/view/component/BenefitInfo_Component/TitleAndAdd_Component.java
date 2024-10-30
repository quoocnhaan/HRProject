package view.component.BenefitInfo_Component;

import java.awt.Dimension;

public class TitleAndAdd_Component extends javax.swing.JPanel {

    public TitleAndAdd_Component() {
        initComponents();
        this.setPreferredSize(new Dimension(280, 52));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        add_BTN = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        title.setText("NHÂN VIÊN");

        add_BTN.setText("Thêm");
        add_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(add_BTN)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_BTN)
                    .addComponent(title))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_BTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_BTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_BTN;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
