/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.JobInfoDetail_Component;

import view.component.PersonalInfoDetail_Component.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JScrollBar;

/**
 *
 * @author user
 */
public class BasicInfo_Search_Title_Container_JI extends javax.swing.JPanel {

    /**
     * Creates new form BasicInfo_Search_Title
     */
    public BasicInfo_Search_Title_Container_JI() {
        initComponents();
        setLayout();
        this.setPreferredSize(new Dimension(280, 490));

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
            .addGap(0, 280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new BorderLayout());
        TitleAndAdd_Component_JI titleAndAdd = new TitleAndAdd_Component_JI();
        BasicInfo_Search_container_JI basicInfoAndSearch = new BasicInfo_Search_container_JI();
        this.add(titleAndAdd, BorderLayout.NORTH);
        this.add(basicInfoAndSearch, BorderLayout.CENTER);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
