package view.component.Manage_Component;

import com.toedter.calendar.JDateChooser;
import controller.DAO.ContactDAO;
import controller.DAO.ContractDAO;
import controller.DAO.DepartmentDAO;
import controller.DAO.EmployeeDAO;
import controller.DAO.JobDAO;
import controller.DAO.RoleDAO;
import controller.DAO.RoleDetailDAO;
import controller.DAOImp.ContactDAOImp;
import controller.DAOImp.ContractDAOImp;
import controller.DAOImp.DepartmentDAOImp;
import controller.DAOImp.EmployeeDAOImp;
import controller.DAOImp.JobDAOImp;
import controller.DAOImp.RoleDAOImp;
import controller.DAOImp.RoleDetailDAOImp;
import controller.Functional.Functional;
import controller.Session.SharedData;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import model.Contact;
import model.Contract;
import model.Department;
import model.Employee;
import model.Job;
import model.Role;
import model.RoleDetail;
import org.hibernate.Session;
import util.HibernateUtil;

public class ManageEmployeeDetailInfo_Component extends javax.swing.JPanel {

    long differenceInDays;

    public ManageEmployeeDetailInfo_Component(Employee employee) {
        initComponents();
        initData(employee);
        setting();
    }

    public ManageEmployeeDetailInfo_Component() {
        initComponents();
        initData();
        customComponents();
        setting();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title0 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        chooseImgBtn = new javax.swing.JButton();
        gender = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        profession = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        otherEmail = new javax.swing.JTextField();
        placeOfBirth = new javax.swing.JTextField();
        startDate = new com.toedter.calendar.JDateChooser();
        dateOfBirth = new com.toedter.calendar.JDateChooser();
        senority = new javax.swing.JLabel();
        title = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        departmentName = new javax.swing.JLabel();
        chooseDepartmentBtn = new javax.swing.JButton();
        denyBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 420));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        title0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title0.setForeground(new java.awt.Color(0, 0, 255));
        title0.setText("Thông tin cá nhân ");

        label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setText("Mã nhân viên");

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Tên nhân viên");

        label7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 0, 0));
        id.setText("LQN2005");

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Giới tính");

        label4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Ngày sinh");

        label5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Nơi sinh");

        label3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Loại nhân viên");

        title1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 255));
        title1.setText("Thông tin công việc");

        label6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("Tên phòng ban");

        label8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 0, 0));
        label8.setText("Nghề nghiệp");

        label9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label9.setForeground(new java.awt.Color(0, 0, 0));
        label9.setText("Ngày vào làm");

        label10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label10.setForeground(new java.awt.Color(0, 0, 0));
        label10.setText("Thâm niên");

        img.setSize(150, 150);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/default.png"))); // NOI18N
        img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        label11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label11.setForeground(new java.awt.Color(0, 0, 0));
        label11.setText("Email khác");

        title2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 255));
        title2.setText("Thông tin liên hệ");

        label12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label12.setForeground(new java.awt.Color(0, 0, 0));
        label12.setText("Số điện thoại");

        label13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label13.setForeground(new java.awt.Color(0, 0, 0));
        label13.setText("Email cá nhân");

        label14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label14.setForeground(new java.awt.Color(0, 0, 0));
        label14.setText("Chức vụ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/colorlogo.png"))); // NOI18N

        chooseImgBtn.setBackground(new java.awt.Color(69, 89, 190));
        chooseImgBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chooseImgBtn.setForeground(new java.awt.Color(255, 255, 255));
        chooseImgBtn.setText("Tải ảnh");
        chooseImgBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseImgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImgBtnActionPerformed(evt);
            }
        });

        gender.setBackground(new java.awt.Color(255, 255, 255));
        gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 0));
        gender.setText("Nhập giới tính");
        gender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        phone.setBackground(new java.awt.Color(255, 255, 255));
        phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(0, 0, 0));
        phone.setText("Nhập số điện thoại");
        phone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Nhập tên của nhân viên");
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        profession.setBackground(new java.awt.Color(255, 255, 255));
        profession.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profession.setForeground(new java.awt.Color(0, 0, 0));
        profession.setText("Nhập nghề nghiệp");
        profession.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("Nhập email");
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        otherEmail.setBackground(new java.awt.Color(255, 255, 255));
        otherEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        otherEmail.setForeground(new java.awt.Color(0, 0, 0));
        otherEmail.setText("Nhập email khác");
        otherEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        placeOfBirth.setBackground(new java.awt.Color(255, 255, 255));
        placeOfBirth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        placeOfBirth.setForeground(new java.awt.Color(0, 0, 0));
        placeOfBirth.setText("Nhập nơi sinh");
        placeOfBirth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        startDate.setBackground(new java.awt.Color(255, 255, 255));
        startDate.setForeground(new java.awt.Color(0, 0, 0));
        startDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dateOfBirth.setBackground(new java.awt.Color(255, 255, 255));
        dateOfBirth.setForeground(new java.awt.Color(0, 0, 0));
        dateOfBirth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        senority.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senority.setForeground(new java.awt.Color(0, 0, 0));
        senority.setText("...");

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "HR", "Nhân viên" }));

        type.setBackground(new java.awt.Color(255, 255, 255));
        type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 0));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chính thức", "Thử việc" }));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        departmentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        departmentName.setForeground(new java.awt.Color(0, 0, 0));
        departmentName.setText("Trung tâm CDC");

        chooseDepartmentBtn.setBackground(new java.awt.Color(69, 89, 190));
        chooseDepartmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        chooseDepartmentBtn.setText("...");
        chooseDepartmentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseDepartmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseDepartmentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(departmentName, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseDepartmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chooseDepartmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        denyBtn.setBackground(new java.awt.Color(255, 255, 255));
        denyBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        denyBtn.setForeground(new java.awt.Color(255, 0, 51));
        denyBtn.setText("Hủy");
        denyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        denyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyBtnActionPerformed(evt);
            }
        });

        confirmBtn.setBackground(new java.awt.Color(69, 89, 190));
        confirmBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmBtn.setText("Lưu");
        confirmBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label7)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title1)
                                .addContainerGap(715, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(title2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label12)
                                            .addComponent(label11)
                                            .addComponent(label13))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(otherEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(label1)
                                                .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(id)
                                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label8)
                                                .addComponent(label3)
                                                .addComponent(label6))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(profession, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label9)
                                        .addGap(18, 18, 18)
                                        .addComponent(startDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label14)
                                                .addGap(59, 59, 59))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(label10)
                                                .addGap(43, 43, 43)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(senority)
                                            .addComponent(title, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(denyBtn)
                                            .addGap(36, 36, 36)
                                            .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label4)
                                                .addComponent(label5))
                                            .addGap(46, 46, 46)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(dateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                                .addComponent(placeOfBirth)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chooseImgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(chooseImgBtn)
                        .addGap(150, 150, 150)
                        .addComponent(label7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(title0)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label)
                                    .addComponent(id))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label2)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(title1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label4)
                                    .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(placeOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label9)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label8)
                                    .addComponent(profession, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label10)
                                    .addComponent(senority))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3)
                                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label14)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(title2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label12)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label13)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label11)
                            .addComponent(otherEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(denyBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chooseDepartmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseDepartmentBtnActionPerformed
        JDialog popup = new JDialog(SwingUtilities.getWindowAncestor(this), "Chọn phòng ban", Dialog.ModalityType.APPLICATION_MODAL);
        popup.getContentPane().setLayout(new BorderLayout());
        popup.getContentPane().add(new ManageSelectDepartment_Component());
        popup.setSize(500, 600);
        popup.setLocationRelativeTo(null);
        popup.setVisible(true);

        this.departmentName.setText(SharedData.getInstance().getCurDepartment());

    }//GEN-LAST:event_chooseDepartmentBtnActionPerformed

    private void chooseImgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseImgBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "bmp"));

        int returnValue = fileChooser.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());

            img.setIcon(Functional.scaleImg(img, imageIcon));
        }
    }//GEN-LAST:event_chooseImgBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            DepartmentDAO departmentDAO = new DepartmentDAOImp(session);
            EmployeeDAO employeeDAO = new EmployeeDAOImp(session);
            ContactDAO contactDAO = new ContactDAOImp(session);
            ContractDAO contractDAO = new ContractDAOImp(session);
            JobDAO jobDAO = new JobDAOImp(session);
            RoleDAO roleDAO = new RoleDAOImp(session);
            RoleDetailDAO detailDAO = new RoleDetailDAOImp(session);

            String employeeName = name.getText();
            String employeeId = id.getText();
            Date birthDate = dateOfBirth.getDate();
            boolean employeeGender = gender.getText().equalsIgnoreCase("Nam");
            int employeeSeniority = (int) differenceInDays;
            String emailValue = email.getText();
            String phoneValue = phone.getText();
            String placeOfBirthValue = placeOfBirth.getText();
            ImageIcon img = (ImageIcon) this.img.getIcon();
            byte[] imgByte = Functional.convertIconToByteArray(img);
            String titleName = (String) title.getSelectedItem();

            String departmentNameValue = departmentName.getText();
            Department department = departmentDAO.getByName(departmentNameValue);

            Contact contact = new Contact(emailValue, phoneValue, placeOfBirthValue);

            Role role = roleDAO.getByName(titleName);
            double allowance = (role.getId() == 1) ? 5000000 : 500000;

            RoleDetail roleDetail = new RoleDetail(role, null, allowance, true);

            Employee employee = new Employee(employeeName, department, roleDetail, employeeId, imgByte, birthDate, employeeGender, employeeSeniority, null, contact);

            Job job = new Job(startDate.getDate(), profession.getText(), (String) type.getSelectedItem());

            List<Contract> contracts = new ArrayList<>();
            Contract contract = new Contract("contract123", employee, job);
            contracts.add(contract);

            contactDAO.add(contact);
            jobDAO.add(job);
            employeeDAO.add(employee);
            contractDAO.add(contract);

        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "Thêm nhân viên mới thành công !");
        close();
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void denyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyBtnActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Xác nhận hủy?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            close();
        }
    }//GEN-LAST:event_denyBtnActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        this.requestFocusInWindow();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseDepartmentBtn;
    private javax.swing.JButton chooseImgBtn;
    private javax.swing.JButton confirmBtn;
    private com.toedter.calendar.JDateChooser dateOfBirth;
    private javax.swing.JButton denyBtn;
    private javax.swing.JLabel departmentName;
    private javax.swing.JTextField email;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel id;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField otherEmail;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField placeOfBirth;
    private javax.swing.JTextField profession;
    private javax.swing.JLabel senority;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JComboBox<String> title;
    private javax.swing.JLabel title0;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables

    private void initData() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            EmployeeDAO employeeDAO = new EmployeeDAOImp(session);
            int size = employeeDAO.getAll().size();
            String id = generateID(size);
            this.id.setText(id);
        } catch (Exception e) {
        }
    }

    private void initData(Employee employee) {
        ImageIcon img = Functional.convertByteArrayToIcon(employee.getImage());
        this.img.setIcon(img);

        this.id.setText(employee.getId() + "");
        this.name.setText(employee.getName());
        String gender = (employee.isGender()) ? "Nam" : "Nữ";
        this.gender.setText(gender);
        this.dateOfBirth.setDate(employee.getDateOfBirth());
        this.placeOfBirth.setText(employee.getContact().getPermanentAddress());

        this.profession.setText(employee.getContracts().get(0).getJob().getProfession());
        this.type.setSelectedItem(employee.getContracts().get(0).getJob().getType());
        this.startDate.setDate(employee.getContracts().get(0).getJob().getStartDate());
        this.senority.setText(employee.getSenority() + "");
        this.title.setSelectedItem(employee.getRoleDetail().getRole().getName());

        this.phone.setText(employee.getContact().getPersonalPhone());
        this.email.setText(employee.getContact().getPersonalEmail());
        this.otherEmail.setText(employee.getContact().getPersonalEmail());
    }

    public String generateID(int employeeCount) {
        String prefix = "LQN";

        int newIDNumber = employeeCount + 1;

        String newNumberPart = String.format("%04d", newIDNumber);

        return prefix + newNumberPart;
    }

    private void customComponents() {
        Date currentDate = new Date();
        startDate.setMaxSelectableDate(currentDate);

        startDate.addPropertyChangeListener("date", (evt) -> {
            Date selectedDate = startDate.getDate();
            if (selectedDate != null) {

                long differenceInMillis = currentDate.getTime() - selectedDate.getTime();

                differenceInDays = differenceInMillis / (24 * 60 * 60 * 1000);

                if (differenceInDays >= 30) {
                    long differenceInMonths = differenceInDays / 30;
                    this.senority.setText(differenceInMonths + " tháng");
                } else {
                    this.senority.setText(differenceInDays + " ngày");
                }
            }
        });
    }

    private void close() {
        Window parentWindow = SwingUtilities.getWindowAncestor(this);
        if (parentWindow != null) {
            parentWindow.dispose();
        }
    }

    private void setPlaceholder(final JTextField textField) {
        String placeholder = textField.getText();

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(java.awt.Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(java.awt.Color.GRAY);
                }
            }
        });

        textField.setForeground(java.awt.Color.GRAY);
    }

    private void setting() {
        setPlaceholder(name);
        setPlaceholder(email);
        setPlaceholder(gender);
        setPlaceholder(phone);
        setPlaceholder(placeOfBirth);
        setPlaceholder(profession);
        setPlaceholder(otherEmail);
    }
}