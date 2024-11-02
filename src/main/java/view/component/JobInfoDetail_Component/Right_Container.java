/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.JobInfoDetail_Component;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;

/**
 *
 * @author user
 */
public class Right_Container extends javax.swing.JPanel {

    /**
     * Creates new form Right_Component
     */
    public Right_Container() {
        initComponents();
        setLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new FlowLayout());
        JobInfo_Component jobInfo = new JobInfo_Component();
        TimeKeepingInfo_Component timeKeepingInfo = new TimeKeepingInfo_Component();
        WorkDeparment_Component workDeparment = new WorkDeparment_Component();
        Work_Component work = new Work_Component();

        this.add(jobInfo);
        this.add(timeKeepingInfo);
        this.add(workDeparment);
        this.add(work);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
