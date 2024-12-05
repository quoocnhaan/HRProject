package view.component.EmployeeDetailInfo;

import controller.Functional.Functional;
import javax.swing.ImageIcon;
import model.Employee;

public class EmployeeDetailInfo_Component extends javax.swing.JPanel {

    private Employee employee;

    public EmployeeDetailInfo_Component(Employee employee) {
        this.employee = employee;
        initComponents();
        initData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title0 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        dateOfBirth = new javax.swing.JLabel();
        placeOfBirth = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        departmentName = new javax.swing.JLabel();
        profession = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        startDate = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        senority = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        otherEmail = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 420));

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
        id.setForeground(new java.awt.Color(255, 0, 51));
        id.setText("LQN2005");

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Lâm Quốc Nhân");

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Giới tính");

        gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 0));
        gender.setText("Nam");

        dateOfBirth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateOfBirth.setForeground(new java.awt.Color(0, 0, 0));
        dateOfBirth.setText("20/09/1900");

        placeOfBirth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        placeOfBirth.setForeground(new java.awt.Color(0, 0, 0));
        placeOfBirth.setText("Thành phố Hồ Chí Minh");

        label4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Ngày sinh");

        label5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Nơi sinh");

        departmentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        departmentName.setForeground(new java.awt.Color(0, 0, 0));
        departmentName.setText("Trung tâm CDC");

        profession.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profession.setForeground(new java.awt.Color(0, 0, 0));
        profession.setText("Phát triển phần mềm");

        label3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Loại nhân viên");

        type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 0));
        type.setText("Chính thức");

        startDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        startDate.setForeground(new java.awt.Color(0, 0, 0));
        startDate.setText("20/09/1900");

        title1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 255));
        title1.setText("Thông tin công việc");

        label6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("Tên phòng ban");

        label8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 0, 0));
        label8.setText("Nghề nghiệp");

        senority.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senority.setForeground(new java.awt.Color(0, 0, 0));
        senority.setText("1 năm 6 tháng");

        label9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label9.setForeground(new java.awt.Color(0, 0, 0));
        label9.setText("Ngày vào làm");

        label10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label10.setForeground(new java.awt.Color(0, 0, 0));
        label10.setText("Thâm niên");

        img.setSize(150, 150);

        phoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumber.setText("0969270553");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("Lâm Quốc Nhân");

        label11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label11.setForeground(new java.awt.Color(0, 0, 0));
        label11.setText("Email khác");

        otherEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        otherEmail.setForeground(new java.awt.Color(0, 0, 0));
        otherEmail.setText("Nam");

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

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Quản lý");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/colorlogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label6)
                                    .addComponent(label8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(label1)
                                                    .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(label, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(id)
                                                    .addComponent(name)
                                                    .addComponent(gender)
                                                    .addComponent(departmentName)
                                                    .addComponent(profession)
                                                    .addComponent(type)))
                                            .addComponent(label3))
                                        .addGap(115, 115, 115)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(label9)
                                                    .addComponent(label10)
                                                    .addComponent(label14))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(title)
                                                    .addComponent(startDate)
                                                    .addComponent(senority)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(label4)
                                                    .addComponent(label5))
                                                .addGap(46, 46, 46)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(placeOfBirth)
                                                    .addComponent(dateOfBirth)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label13)
                                            .addComponent(label11)
                                            .addComponent(label12))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phoneNumber)
                                            .addComponent(email)
                                            .addComponent(otherEmail)))))
                            .addComponent(title1)
                            .addComponent(title2))
                        .addContainerGap(238, Short.MAX_VALUE))))
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
                        .addGap(195, 195, 195)
                        .addComponent(label7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(title0)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label)
                                    .addComponent(id))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1)
                                    .addComponent(name)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(dateOfBirth))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(placeOfBirth))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(gender))
                        .addGap(44, 44, 44)
                        .addComponent(title1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label6)
                                    .addComponent(departmentName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label8)
                                    .addComponent(profession)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label9)
                                    .addComponent(startDate))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label10)
                                    .addComponent(senority))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label3)
                                .addComponent(label14)
                                .addComponent(title)))
                        .addGap(45, 45, 45)
                        .addComponent(title2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label12)
                            .addComponent(phoneNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label13)
                            .addComponent(email))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label11)
                            .addComponent(otherEmail))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JLabel departmentName;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel id;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel name;
    private javax.swing.JLabel otherEmail;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel placeOfBirth;
    private javax.swing.JLabel profession;
    private javax.swing.JLabel senority;
    private javax.swing.JLabel startDate;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title0;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables

    private void initData() {
        ImageIcon img = Functional.convertByteArrayToIcon(employee.getImage());
        this.img.setIcon(img);

        this.id.setText(employee.getId() + "");
        this.name.setText(employee.getName());
        String gender = (employee.isGender()) ? "Nam" : "Nữ";
        this.gender.setText(gender);
        this.dateOfBirth.setText(employee.getDateOfBirth().toString());
        this.placeOfBirth.setText(employee.getContact().getPermanentAddress());

        this.departmentName.setText(employee.getDepartment().getName());
        this.profession.setText(employee.getContracts().get(0).getJob().getProfession());
        this.type.setText(employee.getContracts().get(0).getJob().getType());
        this.startDate.setText(employee.getContracts().get(0).getJob().getStartDate().toString());
        this.senority.setText(employee.getSenority() + "");
        this.title.setText(employee.getRoleDetail().getRole().getName());

        this.phoneNumber.setText(employee.getContact().getPersonalPhone());
        this.email.setText(employee.getContact().getPersonalEmail());
        this.otherEmail.setText(employee.getContact().getPersonalEmail());
    }

}
