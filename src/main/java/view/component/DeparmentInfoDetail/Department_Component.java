package view.component.DeparmentInfoDetail;

public class Department_Component extends javax.swing.JPanel {

    public Department_Component(String departmentCode, String departmentName, String belong, String organizationLevel, String nameOfTheManager, String theRoleOfTheManager) {
        initComponents();
        setData(departmentCode, departmentName, belong, organizationLevel, nameOfTheManager, theRoleOfTheManager);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        departmentCode = new javax.swing.JLabel();
        departmentName = new javax.swing.JLabel();
        belong = new javax.swing.JLabel();
        organizationLevel = new javax.swing.JLabel();
        nameOfTheManager = new javax.swing.JLabel();
        theRoleOfTheManager = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Phòng ban");

        jLabel1.setText("Mã phòng ban");

        jLabel3.setText("Tên phòng ban");

        jLabel5.setText("Thuộc");

        jLabel7.setText("Cấp tổ chức");

        jLabel2.setText("Tên người quản lý");

        jLabel4.setText("Vai trò người quản lý");

        departmentCode.setText("jLabel6");

        departmentName.setText("jLabel6");

        belong.setText("jLabel6");

        organizationLevel.setText("jLabel6");

        nameOfTheManager.setText("jLabel6");

        theRoleOfTheManager.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departmentCode)
                            .addComponent(departmentName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameOfTheManager)
                            .addComponent(theRoleOfTheManager))
                        .addContainerGap(256, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(belong)
                            .addComponent(organizationLevel))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(title))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1)
                                                .addComponent(departmentCode))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(nameOfTheManager)))))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(theRoleOfTheManager)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(departmentName)))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(belong)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(organizationLevel))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel belong;
    private javax.swing.JLabel departmentCode;
    private javax.swing.JLabel departmentName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nameOfTheManager;
    private javax.swing.JLabel organizationLevel;
    private javax.swing.JLabel theRoleOfTheManager;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void setData(String departmentCode, String departmentName, String belong, String organizationLevel, String nameOfTheManager, String theRoleOfTheManager) {
        this.departmentCode.setText(departmentCode);
        this.departmentName.setText(departmentName);
        this.belong.setText(belong);
        this.organizationLevel.setText(organizationLevel);
        this.nameOfTheManager.setText(nameOfTheManager);
        this.theRoleOfTheManager.setText(theRoleOfTheManager);
    }
}
