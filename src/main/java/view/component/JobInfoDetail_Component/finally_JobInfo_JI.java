/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.JobInfoDetail_Component;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JScrollPane;

/**
 *
 * @author user
 */
public class finally_JobInfo_JI extends javax.swing.JPanel {

    /**
     * Creates new form AllPanel
     */
    public finally_JobInfo_JI() {
        initComponents();
        this.setPreferredSize(new Dimension(1400, 600));
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
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new BorderLayout());

        Right_Container_JI right = new Right_Container_JI();

        JScrollPane scrollPane = new JScrollPane(new Right_Container_JI());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        BasicInfo_Filter_PersonalInfo_Container_JI left = new BasicInfo_Filter_PersonalInfo_Container_JI();
        this.add(left, BorderLayout.WEST);
        this.add(right, BorderLayout.CENTER);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
