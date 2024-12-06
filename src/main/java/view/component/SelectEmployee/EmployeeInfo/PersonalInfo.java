/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.SelectEmployee.EmployeeInfo;

import controller.DAO.EmployeeDAO;
import controller.DAOImp.EmployeeDAOImp;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollPane;
import model.Employee;
import org.hibernate.Session;
import util.HibernateUtil;

public class PersonalInfo extends javax.swing.JPanel {

    private TitleEmployeeBasicInfo_Component title;
    private JScrollPane content;
    private static PersonalInfo instance;

    public PersonalInfo() {
        initComponents();
        setLayout();
        addComponents();
    }

    public static PersonalInfo getInstance() {
        if (instance == null) {
            instance = new PersonalInfo();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private void setLayout() {
        this.setLayout(new BorderLayout());
    }

    private void addComponents() {
        title = new TitleEmployeeBasicInfo_Component();
        this.add(title, BorderLayout.NORTH);

        content = new JScrollPane(PersonalInfo_Container.getInstance());
        content.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        content.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        content.setBorder(null);

        this.add(content, BorderLayout.CENTER);
    }

    public TitleEmployeeBasicInfo_Component getTitle() {
        return title;
    }

    public void setTitle(TitleEmployeeBasicInfo_Component title) {
        this.title = title;
    }

    public JScrollPane getContent() {
        return content;
    }

    public void setContent(JScrollPane content) {
        this.content = content;
    }

    public void changeStatusCheckBox(boolean isCheck) {
        List<PersonalBasicInfo_Container> list = PersonalInfo_Container.getInstance().getAll();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).changeStatusCheckBox(isCheck);
        }
    }

    public void reset() {
        title.getCheckAll().getCheckbox().setSelected(false);
    }

    public List<Employee> getSelectedEmployee() {
        List<PersonalBasicInfo_Container> list = PersonalInfo_Container.getInstance().getAll();
        List<Employee> result = new ArrayList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            EmployeeDAO employeeDAO = new EmployeeDAOImp(session);
            for (int i = 0; i < list.size(); i++) {
                PersonalBasicInfo_Container cur = list.get(i);
                if (cur.getCheckBox().getCheck().isSelected()) {
                    Employee e = employeeDAO.getByEmployeeId(cur.getNameAndJob().getId().getText());
                    result.add(e);
                }
            }
        } catch (Exception e) {
            System.out.println(this.getClass().getName() + e);
        }
        return result;
    }
}
