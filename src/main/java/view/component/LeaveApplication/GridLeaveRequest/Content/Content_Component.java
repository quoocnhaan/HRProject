/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.GridLeaveRequest.Content;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;
import javax.swing.JPanel;
import model.DateRange;
import view.component.LeaveApplication.GridLeaveRequest.Date.Date_Container;
import view.component.LeaveApplication.GridLeaveRequest.Employee.EmployeeInfo_Container;
import view.component.LeaveApplication.GridLeaveRequest.LeaveRequestForm.LeaveForm_Container;

/**
 *
 * @author LENOVO
 */
public class Content_Component extends javax.swing.JPanel {

    private EmployeeInfo_Container employeeInfo_Container;
    private Date_Container date_Container;
    private LeaveForm_Container leaveForm_Container;
    private static Content_Component instance;

    public Content_Component() {
        initComponents();
        initMyComponents();
        setLayout();
        addComponents();
    }

    public static Content_Component getInstance() {
        if (instance == null) {
            instance = new Content_Component();
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

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
        this.setLayout(new GridBagLayout());
    }

    private void addComponents() {
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 1;
        //gbc.fill = GridBagConstraints.BOTH;
        this.add(employeeInfo_Container, gbc);

        // Thêm hàng cố định vào lưới
        gbc.gridx = 1;
        gbc.gridy = 0;
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(date_Container, gbc);

        // Thêm bảng dữ liệu vào lưới
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1; // Cho phép nội dung mở rộng theo chiều ngang
        gbc.weighty = 1; // Cho phép nội dung mở rộng theo chiều dọc
        this.add(leaveForm_Container, gbc);
    }

    private void initMyComponents() {
        employeeInfo_Container = new EmployeeInfo_Container();
        date_Container = new Date_Container();
        leaveForm_Container = new LeaveForm_Container();
    }

    public void updateDate(DateRange dateRange) {
        date_Container.updateData(dateRange);
    }

    public void updateEmployee() {
        employeeInfo_Container.updateData();
    }
    
    public void updateLeaveForm() {
        leaveForm_Container.updateData();
    }

    public EmployeeInfo_Container getEmployeeInfo_Container() {
        return employeeInfo_Container;
    }

    public Date_Container getDate_Container() {
        return date_Container;
    }

    public LeaveForm_Container getLeaveForm_Container() {
        return leaveForm_Container;
    }

    public void setLeaveForm_Container(LeaveForm_Container leaveForm_Container) {
        this.leaveForm_Container = leaveForm_Container;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
