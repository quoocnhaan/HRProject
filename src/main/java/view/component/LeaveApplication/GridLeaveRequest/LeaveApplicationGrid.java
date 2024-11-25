/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.GridLeaveRequest;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.component.LeaveApplication.GridLeaveRequest.Content.Content_Component;
import view.component.LeaveApplication.GridLeaveRequest.NextPage.NextPageAndSearch;

/**
 *
 * @author LENOVO
 */
public class LeaveApplicationGrid extends javax.swing.JPanel {

    /**
     * Creates new form LeaveApplication_Component
     */
    public LeaveApplicationGrid() {
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
        //this.add(new Filter_Component(), BorderLayout.WEST);
        this.add(new NextPageAndSearch(), BorderLayout.NORTH);

        Content_Component contentComponent = new Content_Component();

        // Lấy các panel cố định từ Content_Component
        JPanel fixedColumnPanel = contentComponent.getEmployeeInfo_Container();
        JPanel fixedRowPanel = contentComponent.getDate_Container();

        // Tạo JScrollPane cho phần nội dung
        JScrollPane scrollPane = new JScrollPane(contentComponent);

        // Cố định cột đầu tiên khi cuộn ngang và hàng đầu tiên khi cuộn dọc
        scrollPane.setRowHeaderView(fixedColumnPanel);
        scrollPane.setColumnHeaderView(fixedRowPanel);

        // Thêm JScrollPane vào JFrame
        this.add(scrollPane, BorderLayout.CENTER);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
