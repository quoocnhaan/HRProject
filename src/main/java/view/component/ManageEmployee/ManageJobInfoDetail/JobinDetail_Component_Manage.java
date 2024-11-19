package view.component.ManageEmployee.ManageJobInfoDetail;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JScrollPane;

public class JobinDetail_Component_Manage extends javax.swing.JPanel {

    public JobinDetail_Component_Manage() {
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
        this.setLayout(new BorderLayout());
    }

    private void addComponent() {
        AllComponent_JobInfo_Manage right = new AllComponent_JobInfo_Manage();
        right.setPreferredSize(new Dimension(1120, 1250));
        
        JScrollPane scrollPane = new JScrollPane(right);
        scrollPane.setBorder(null);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        this.add(scrollPane, BorderLayout.CENTER);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
