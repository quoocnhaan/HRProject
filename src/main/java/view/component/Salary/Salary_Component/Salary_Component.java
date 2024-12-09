/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.Salary.Salary_Component;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.component.Salary.Salary_Component.Content.Content_Component;
import view.component.Search.Search;

/**
 *
 * @author LENOVO
 */
public class Salary_Component extends javax.swing.JPanel {

    private JScrollPane content;

    public Salary_Component() {
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
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
    }

    private void addComponents() {
        // Lấy các panel cố định từ Content_Component
        JPanel fixedColumnPanel = Content_Component.getInstance().getEmployeeInfo_Container();
        JPanel fixedRowPanel = Content_Component.getInstance().getDate_Container();

        // Tạo JScrollPane cho phần nội dung
        content = new JScrollPane(Content_Component.getInstance());

        // Cố định cột đầu tiên khi cuộn ngang và hàng đầu tiên khi cuộn dọc
        content.setRowHeaderView(fixedColumnPanel);
        content.setColumnHeaderView(fixedRowPanel);

        this.add(new Search(), BorderLayout.NORTH);
        this.add(content, BorderLayout.CENTER);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
