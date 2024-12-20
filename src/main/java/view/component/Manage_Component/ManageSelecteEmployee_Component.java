/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.Manage_Component;

import java.awt.BorderLayout;
import view.component.DepartmentInfo.Department_Component;
import view.component.SelectEmployee.EmployeeInfo.PersonalInfo_Container;
import view.component.SelectEmployee.SelectEmployee_Component;

public class ManageSelecteEmployee_Component extends javax.swing.JPanel {

    private Department_Component department;
    private SelectEmployee_Component selectEmployee;
    private static ManageSelecteEmployee_Component instance;

    public ManageSelecteEmployee_Component() {
        initComponents();
        setLayout();
        addComponents();
    }

    public static ManageSelecteEmployee_Component getInstance() {
        if (instance == null) {
            instance = new ManageSelecteEmployee_Component();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new BorderLayout(0, 0));
    }

    private void addComponents() {
        department = new Department_Component();
        selectEmployee = new SelectEmployee_Component();

        this.add(department, BorderLayout.WEST);
        this.add(selectEmployee, BorderLayout.CENTER);
    }

    public void updateData() {
        PersonalInfo_Container.getInstance().updateData();
        selectEmployee.getEmployeeAndSearch().getPersonalInfo().reset();
    }

    public SelectEmployee_Component getSelectEmployee() {
        return selectEmployee;
    }

    public void setSelectEmployee(SelectEmployee_Component selectEmployee) {
        this.selectEmployee = selectEmployee;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
