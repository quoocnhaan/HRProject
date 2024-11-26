package view.component.SelectEmployee.EmployeeInfo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
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
        String name = "Lâm Quốc Nhân";
        String id = "LQN2005";
        String job = "Web Developer";
        String direct = "Trung tam CDC";
        ImageIcon img = new ImageIcon(getClass().getResource("/img/avatar.jpg"));
        String dateOfBirth = "20/09/2005";
        String place = "Thành phố Hồ Chí Minh";
        String gender = "Nam";
        String startDate = "15/10/2024";
        String seniority = "10/10/2012";
        String type = "Chinh thuc";
        String email = "quocnhan56@gmail.com";
        String phone = "0968270553";
        String twitter = "quocnhan56@gmail.com";
        for (int i = 1; i <= 6; i++) {
            PersonalBasicInfo_Container pi = new PersonalBasicInfo_Container(name, id, job, direct, img, dateOfBirth, place, gender, startDate, seniority, type, email, phone, twitter);
            this.add(pi);
            infoList.add(pi);
        }
    }

    public void updateData(String name, String id, String job, String direct, ImageIcon img, String dateOfBirth, String place,
            String gender, String startDate, String seniority, String type, String email, String phone, String twitter) {

    }

    public List<PersonalBasicInfo_Container> getAll() {
        return infoList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
