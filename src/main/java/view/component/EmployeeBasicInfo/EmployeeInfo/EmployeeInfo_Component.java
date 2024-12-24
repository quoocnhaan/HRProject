/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.EmployeeBasicInfo.EmployeeInfo;

import controller.DAO.EmployeeDAO;
import controller.DAOImp.EmployeeDAOImp;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author LENOVO
 */
public class EmployeeInfo_Component extends javax.swing.JPanel {

    private ManagerInfo_Component managerInfo_Component;
    private PersonalInfo personalInfo;
    private static EmployeeInfo_Component instance;

    public EmployeeInfo_Component() {
        initComponents();
        initData();
        setLayout();
        addComponent();
    }

    public static EmployeeInfo_Component getInstance() {
        if (instance == null) {
            instance = new EmployeeInfo_Component();
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
            .addGap(0, 547, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new BorderLayout());
    }

    private void initData() {
        int total = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            EmployeeDAO employeeDAO = new EmployeeDAOImp(session);
            total = employeeDAO.getTotal();
        }
        String name = "Lam Quoc Nhan";
        String position = "Tong Giam Doc |";
        String companyName = "FireTech";
        String phoneNumber = "(+84) 9682705533 |";
        String email = "quocnhan56@gmail.com";
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/img/logo1.png"));
        managerInfo_Component = new ManagerInfo_Component(name, position, companyName, phoneNumber, email, total + "", imageIcon);
        personalInfo = PersonalInfo.getInstance();
    }

    private void addComponent() {
        this.add(managerInfo_Component, BorderLayout.NORTH);
        this.add(personalInfo, BorderLayout.CENTER);
    }

    public ManagerInfo_Component getManagerInfo_Component() {
        return managerInfo_Component;
    }

    public void setManagerInfo_Component(ManagerInfo_Component managerInfo_Component) {
        this.managerInfo_Component = managerInfo_Component;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
