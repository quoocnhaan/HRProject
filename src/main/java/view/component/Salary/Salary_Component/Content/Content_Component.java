/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.Salary.Salary_Component.Content;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import view.component.Salary.Salary_Component.Data.Data_Container;
import view.component.Salary.Salary_Component.Employee.EmployeeInfo_Container;
import view.component.Salary.Salary_Component.Title.Title_Container;


/**
 *
 * @author LENOVO
 */
public class Content_Component extends javax.swing.JPanel {

    private EmployeeInfo_Container employeeInfo_Container;
    private Title_Container title_Container;

    public Content_Component() {
        initComponents();
        initMyComponents();
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
        this.add(title_Container, gbc);

        // Thêm bảng dữ liệu vào lưới
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1; // Cho phép nội dung mở rộng theo chiều ngang
        gbc.weighty = 1; // Cho phép nội dung mở rộng theo chiều dọc
        this.add(new Data_Container(), gbc);
    }

    private void initMyComponents() {
        employeeInfo_Container = new EmployeeInfo_Container();
        title_Container = new Title_Container();
    }

    public EmployeeInfo_Container getEmployeeInfo_Container() {
        return employeeInfo_Container;
    }

    public Title_Container getDate_Container() {
        return title_Container;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
