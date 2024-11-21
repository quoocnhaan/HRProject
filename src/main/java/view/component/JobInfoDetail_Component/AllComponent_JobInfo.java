package view.component.JobInfoDetail_Component;

import java.awt.FlowLayout;

public class AllComponent_JobInfo extends javax.swing.JPanel {

    public AllComponent_JobInfo() {
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
        this.setLayout(new FlowLayout());

    }

    private void addComponent() {
        this.add(new JobInfo_Component());
        this.add(new TimeKeepingInfo_Component());
        this.add(new WorkDeparment_Component());
        this.add(new Work_Component());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
