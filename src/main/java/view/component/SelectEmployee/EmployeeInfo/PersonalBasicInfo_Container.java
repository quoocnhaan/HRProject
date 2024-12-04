/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.SelectEmployee.EmployeeInfo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.border.MatteBorder;
import view.component.EmployeeBasicInfo.EmployeeInfo.Contact_Component;
import view.component.EmployeeBasicInfo.EmployeeInfo.DateAndGender_Component;
import view.component.EmployeeBasicInfo.EmployeeInfo.NameAndJob_Component;
import view.component.EmployeeBasicInfo.EmployeeInfo.Status_Component;
import view.component.Title_CheckBox.CheckBox_Component;

/**
 *
 * @author LENOVO
 */
public class PersonalBasicInfo_Container extends javax.swing.JPanel {

    private CheckBox_Component checkBox;
    private NameAndJob_Component nameAndJob;
    private DateAndGender_Component dateAndGender;
    private Status_Component status;
    private Contact_Component contact;

    public PersonalBasicInfo_Container(String name, String id, String job, String direct, ImageIcon img, String dateOfBirth, String place,
            String gender, String startDate, String seniority, String type, String email, String phone, String twitter) {
        initComponents();
        setLayout();
        customComponents();
        addComponent(name, id, job, direct, img, dateOfBirth, place, gender, startDate, seniority, type, email, phone, twitter);
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
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addComponent(String name, String id, String job, String direct, ImageIcon img, String dateOfBirth, String place,
            String gender, String startDate, String seniority, String type, String email, String phone, String twitter) {
        checkBox = new CheckBox_Component();
        nameAndJob = new NameAndJob_Component(name, id, job, direct, img);
        dateAndGender = new DateAndGender_Component(dateOfBirth, place, gender);
        status = new Status_Component(startDate, seniority, type);
        contact = new Contact_Component(email, phone, twitter);

        addMouseListenerToComponent(nameAndJob, "NameAndJob");
        addMouseListenerToComponent(dateAndGender, "DateAndGender");
        addMouseListenerToComponent(status, "Status");
        addMouseListenerToComponent(contact, "Contact");

        this.add(checkBox);
        this.add(nameAndJob);
        this.add(dateAndGender);
        this.add(status);
        this.add(contact);
    }

    private void setLayout() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
    }

    private void customComponents() {
        this.setBorder(new MatteBorder(0, 0, 1, 0, Color.GRAY));
    }

    public CheckBox_Component getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(CheckBox_Component checkBox) {
        this.checkBox = checkBox;
    }

    public NameAndJob_Component getNameAndJob() {
        return nameAndJob;
    }

    public void setNameAndJob(NameAndJob_Component nameAndJob) {
        this.nameAndJob = nameAndJob;
    }

    public DateAndGender_Component getDateAndGender() {
        return dateAndGender;
    }

    public void setDateAndGender(DateAndGender_Component dateAndGender) {
        this.dateAndGender = dateAndGender;
    }

    public Status_Component getStatus() {
        return status;
    }

    public void setStatus(Status_Component status) {
        this.status = status;
    }

    public Contact_Component getContact() {
        return contact;
    }

    public void setContact(Contact_Component contact) {
        this.contact = contact;
    }

    public void changeStatusCheckBox(boolean isCheck) {
        checkBox.getCheck().setSelected(isCheck);
    }

    private void addMouseListenerToComponent(JComponent component, String componentName) {
        component.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                boolean check = checkBox.getCheck().isSelected();
                checkBox.getCheck().setSelected(!check);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
