/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.EmployeeDetailInfo.ListEmployee_Component;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

/**
 *
 * @author LENOVO
 */
public class BasicInfo_Container extends javax.swing.JPanel {

    /**
     * Creates new form Container
     */
    public BasicInfo_Container() {
        initComponents();
        setLayout();
        addComponents();
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
            .addGap(0, 382, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addComponents() {
        ImageIcon img = new ImageIcon(getClass().getResource("/img/avatar.jpg"));
        for (int i = 1; i <= 7; i++) {
            this.add(new BasicInfo_Component_PI("Nguyen Hoang Huu", "Android Developer", "NHH2005", "Hoa Sen", "1 year", img));
        }
    }

    private void setLayout() {
        this.setLayout(new GridLayout(0, 1, 0, 0));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
