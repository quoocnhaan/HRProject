/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.EmployeeBasicInfo.EmployeeInfo;

import controller.DAO.EmployeeDAO;
import controller.DAOImp.EmployeeDAOImp;
import controller.Functional.Functional;
import controller.Session.SharedData;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import model.Employee;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author LENOVO
 */
public class PersonalInfo_Container extends javax.swing.JPanel {

    private static PersonalInfo_Container instance;
    private List<PersonalBasicInfo_Container> infoList;

    public PersonalInfo_Container() {
        initComponents();
        setLayout();
        addComponents();
    }

    public static PersonalInfo_Container getInstance() {
        if (instance == null) {
            instance = new PersonalInfo_Container();
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
        this.setLayout(new GridLayout(0, 1, 0, 0));
    }

    private void addComponents() {
        infoList = new ArrayList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            EmployeeDAO employeeDAO = new EmployeeDAOImp(session);
            List<Employee> list = employeeDAO.getAll();
            for (Employee employee : list) {
                System.out.println(employee.getEmployeeId());
                PersonalBasicInfo_Container pi = new PersonalBasicInfo_Container(employee);
                this.add(pi);
                infoList.add(pi);
                System.out.println(employee.getEmployeeId());
            }
        } catch (Exception e) {
            System.out.println(this.getClass().getName() + e);
        }
    }

    public void updateDataFromSelecteEmployee() {
        infoList.clear();
        this.removeAll();
        List<Employee> list = SharedData.getInstance().getEmployee_Selected();
        for (Employee employee : list) {
            PersonalBasicInfo_Container pi = new PersonalBasicInfo_Container(employee);
            this.add(pi);
            infoList.add(pi);
        }
        this.validate();
        this.repaint();
    }

    public void updateData() {
        infoList.clear();
        this.removeAll();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            EmployeeDAO employeeDAO = new EmployeeDAOImp(session);
            List<Employee> list = employeeDAO.getAll();
            for (Employee employee : list) {
                PersonalBasicInfo_Container pi = new PersonalBasicInfo_Container(employee);
                this.add(pi);
                infoList.add(pi);
            }
        } catch (Exception e) {
            System.out.println(this.getClass().getName() + e + "2");
        }
        this.validate();
        this.repaint();
    }

    public List<PersonalBasicInfo_Container> getAll() {
        return infoList;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
