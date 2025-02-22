package view.component;

import controller.Functional.Functional;
import controller.Session.SharedData;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import org.hibernate.Session;
import util.HibernateUtil;

public class ManageEmployeeDetailInfo_Component extends javax.swing.JPanel {

    long differenceInDays;

    public ManageEmployeeDetailInfo_Component() {
        initComponents();
        initData();
        customComponents();
        setting();
        removeFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title0 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label16 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        chooseImgBtn = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        title = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        departmentName = new javax.swing.JLabel();
        chooseDepartmentBtn = new javax.swing.JButton();
        denyBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        profession = new javax.swing.JComboBox<>();
        name1 = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        name3 = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        name4 = new javax.swing.JTextField();
        label8 = new javax.swing.JLabel();
        name5 = new javax.swing.JTextField();
        label9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        label10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 420));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        title0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title0.setForeground(new java.awt.Color(0, 0, 255));
        title0.setText("Add New Item");

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("ITEM NAME");

        label7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        label3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("STATUS");

        label6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("BRAND");

        label16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label16.setForeground(new java.awt.Color(0, 0, 0));
        label16.setText("GENDER");

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/default.png"))); // NOI18N
        img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        img.setSize(150, 190);

        label14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label14.setForeground(new java.awt.Color(0, 0, 0));
        label14.setText("TYPE");

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

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Enter product's name");
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10ML", "20ML", "30ML", "FULL" }));

        type.setBackground(new java.awt.Color(255, 255, 255));
        type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 0));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IN STOCK", "IN TRANSIT", "OUT OF STOCK", " " }));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        departmentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        departmentName.setForeground(new java.awt.Color(0, 0, 0));
        departmentName.setText("Choose brand");

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
                .addComponent(departmentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        denyBtn.setText("CANCEL");
        denyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        denyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyBtnActionPerformed(evt);
            }
        });

        confirmBtn.setBackground(new java.awt.Color(69, 89, 190));
        confirmBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmBtn.setText("SAVE");
        confirmBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        profession.setBackground(new java.awt.Color(255, 255, 255));
        profession.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profession.setForeground(new java.awt.Color(0, 0, 0));
        profession.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAN", "WOMAN", " " }));

        name1.setBackground(new java.awt.Color(255, 255, 255));
        name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name1.setForeground(new java.awt.Color(0, 0, 0));
        name1.setText("Enter product's code");
        name1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("ITEM CODE");

        name2.setBackground(new java.awt.Color(255, 255, 255));
        name2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name2.setForeground(new java.awt.Color(0, 0, 0));
        name2.setText("Enter product's code");
        name2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name2ActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Q-TY");

        name3.setBackground(new java.awt.Color(255, 255, 255));
        name3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name3.setForeground(new java.awt.Color(0, 0, 0));
        name3.setText("Enter product's code");
        name3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name3ActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("DISCOUNT");

        name4.setBackground(new java.awt.Color(255, 255, 255));
        name4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name4.setForeground(new java.awt.Color(0, 0, 0));
        name4.setText("Enter product's name");
        name4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        label8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 0, 0));
        label8.setText("PRICE");

        name5.setBackground(new java.awt.Color(255, 255, 255));
        name5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name5.setForeground(new java.awt.Color(0, 0, 0));
        name5.setText("Enter product's code");
        name5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        name5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name5ActionPerformed(evt);
            }
        });

        label9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label9.setForeground(new java.awt.Color(0, 0, 0));
        label9.setText("PRICE AFTER DISCOUNT");

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        label10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label10.setForeground(new java.awt.Color(0, 0, 0));
        label10.setText("DESCRIPTION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(title0)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(label8)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(label9)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(name5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(label5)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(label1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(24, 24, 24)
                                                            .addComponent(label6))
                                                        .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(name2)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(label2)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(label14)
                                                        .addComponent(label16))
                                                    .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(profession, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(1, 1, 1)
                                                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label10)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chooseImgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(denyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chooseImgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)
                        .addComponent(label7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(title0)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label14)
                                        .addGap(18, 18, 18)
                                        .addComponent(label16)
                                        .addGap(27, 27, 27)
                                        .addComponent(label3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(profession, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label10)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(label2))
                                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label4)
                                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(label6))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label8)
                                    .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(label5))
                                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(label9))
                                    .addComponent(name5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(denyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
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
        int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn lưu thông tin?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {

            try (Session session = HibernateUtil.getSessionFactory().openSession()) {

                DepartmentDAO departmentDAO = new DepartmentDAOImp(session);
                EmployeeDAO employeeDAO = new EmployeeDAOImp(session);
                ContactDAO contactDAO = new ContactDAOImp(session);
                ContractDAO contractDAO = new ContractDAOImp(session);
                JobDAO jobDAO = new JobDAOImp(session);
                RoleDAO roleDAO = new RoleDAOImp(session);
                AttendanceInformationDAO attendanceInformationDAO = new AttendanceInformationDAOImp(session);

                String employeeName = name.getText();
                String employeeId = id.getText();

                Date birthDate = dateOfBirth.getDate();
                Date startDateValue = startDate.getDate();

                if (birthDate == null || startDateValue == null) {
                    throw new Exception();
                }

                boolean employeeGender = ((String) gender.getSelectedItem()).equalsIgnoreCase("Nam");
                int employeeSeniority = (int) differenceInDays;
                String emailValue = email.getText();
                String phoneValue = phone.getText();
                String placeOfBirthValue = (String) placeOfBirth.getSelectedItem();
                ImageIcon img = (ImageIcon) this.img.getIcon();
                byte[] imgByte = Functional.convertIconToByteArray(img);
                String titleName = (String) title.getSelectedItem();
                String attendanceIdValue = attendanceId.getText();
                String departmentNameValue = departmentName.getText();
                Role role = roleDAO.getByName(titleName);
                String professionValue = (String) profession.getSelectedItem();
                Department department = departmentDAO.getByName(departmentNameValue);

                if (employee == null) {

                    Contact contact = new Contact(emailValue, phoneValue, placeOfBirthValue);

                    double allowance = (role.getId() == 1) ? 5000000 : 500000;

                    RoleDetail roleDetail = new RoleDetail(role, null, allowance, true);
                    AttendanceInformation attendanceInformation = new AttendanceInformation(attendanceIdValue, null, LocalTime.of(9, 0), LocalTime.of(18, 0), true);

                    Employee employee = new Employee(employeeName, attendanceInformation, department, roleDetail, employeeId, imgByte, birthDate, employeeGender, employeeSeniority, null, contact, true);

                    Job job = new Job(startDateValue, professionValue, (String) type.getSelectedItem());

                    List<Contract> contracts = new ArrayList<>();
                    Contract contract = new Contract("contract123", employee, job);
                    contracts.add(contract);

                    contactDAO.add(contact);
                    jobDAO.add(job);
                    employeeDAO.add(employee);
                    contractDAO.add(contract);
                    attendanceInformationDAO.add(attendanceInformation);

                    JOptionPane.showMessageDialog(this, "Thêm nhân viên mới thành công !");

                } else {
                    employee.setDepartment(department);

                    employee.getContact().setPersonalEmail(emailValue);
                    employee.getContact().setPersonalPhone(phoneValue);
                    employee.getContact().setPermanentAddress(placeOfBirthValue);
                    employee.getAttendanceInformation().setAttendanceId(attendanceIdValue);

                    employee.getRoleDetail().setRole(role);

                    employee.setName(employeeName);
                    employee.setImage(imgByte);
                    employee.setDateOfBirth(birthDate);
                    employee.setGender(employeeGender);
                    employee.setSenority(employeeSeniority);

                    employee.getContracts().get(0).getJob().setStartDate(startDateValue);
                    employee.getContracts().get(0).getJob().setProfession(professionValue);
                    employee.getContracts().get(0).getJob().setType((String) type.getSelectedItem());

                    employeeDAO.update(employee);
                    JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công !");
                }
                close();
                ManageEmployeeInfo_Component.getInstance().updateData();
                EmployeeInfo_Component.getInstance().getManagerInfo_Component().updateTotal(employeeDAO.getAll().size());
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin hợp lệ !");
            }
        }
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

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name2ActionPerformed

    private void name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name3ActionPerformed

    private void name5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseDepartmentBtn;
    private javax.swing.JButton chooseImgBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton denyBtn;
    private javax.swing.JLabel departmentName;
    private javax.swing.JLabel img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField name3;
    private javax.swing.JTextField name4;
    private javax.swing.JTextField name5;
    private javax.swing.JComboBox<String> profession;
    private javax.swing.JComboBox<String> title;
    private javax.swing.JLabel title0;
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
        ImageIcon imgValue = Functional.convertByteArrayToIcon(employee.getImage());
        this.img.setIcon(Functional.scaleImg(img, imgValue));

        this.id.setText(employee.getEmployeeId() + "");
        this.name.setText(employee.getName());
        String genderValue = (employee.isGender()) ? "Nam" : "Nữ";
        this.gender.setSelectedItem(genderValue);
        this.dateOfBirth.setDate(employee.getDateOfBirth());
        this.placeOfBirth.setSelectedItem(employee.getContact().getPermanentAddress());

        this.profession.setSelectedItem(employee.getContracts().get(0).getJob().getProfession());
        this.type.setSelectedItem(employee.getContracts().get(0).getJob().getType());
        this.startDate.setDate(employee.getContracts().get(0).getJob().getStartDate());
        this.attendanceId.setText(employee.getAttendanceInformation().getAttendanceId());
        this.departmentName.setText(employee.getDepartment().getName());

        differenceInDays = employee.getSenority();
        if (differenceInDays >= 30) {
            long differenceInMonths = differenceInDays / 30;
            this.senority.setText(differenceInMonths + " tháng");
        } else {
            this.senority.setText(differenceInDays + " ngày");
        }

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
        setPlaceholder(phone);
        setPlaceholder(otherEmail);
        setPlaceholder(attendanceId);
    }

    private void removeFocus() {
        this.addAncestorListener(new javax.swing.event.AncestorListener() {
            @Override
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formMouseClicked(null);
            }

            @Override
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }

            @Override
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
    }
}
