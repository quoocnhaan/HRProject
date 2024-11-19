package view.component.ManageEmployee.ManageLegalInfoDetail;

public class DriverLicense_Component_Manage extends javax.swing.JPanel {

    public DriverLicense_Component_Manage() {
        initComponents();
    }

    public DriverLicense_Component_Manage(String typeOfDocument, String documentNumber, String dateOfIssue, String expirationDate, String name, String licenseLevel, String licenseIssuingOffice, String status) {
        initComponents();
        setData(typeOfDocument, documentNumber, dateOfIssue, expirationDate, name, licenseLevel, licenseIssuingOffice, status);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        typeOfDocument_add = new javax.swing.JTextPane();
        expirationDate = new javax.swing.JScrollPane();
        expirationDate_add = new javax.swing.JTextPane();
        name = new javax.swing.JScrollPane();
        name_add = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        licenseLevel_add = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        licenseIssuingOffice_add = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        status_add = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        documentNumber_add = new javax.swing.JTextPane();
        dateOfIssue = new javax.swing.JScrollPane();
        dateOfIssue_add = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 350));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Giấy phép lái xe");

        label12.setText("Ngày cấp");

        label13.setText("Hết hạn");

        label15.setText("Mức độ bằng lái");

        jLabel2.setText("Cơ quan cấp bằng lái");

        jLabel4.setText("Trạng thái");

        date.setText("Loại giấy tờ");

        label14.setText("Tên người sở hữu");

        label11.setText("Số giấy tờ");

        jScrollPane1.setViewportView(typeOfDocument_add);

        expirationDate.setViewportView(expirationDate_add);

        name.setViewportView(name_add);

        jScrollPane2.setViewportView(licenseLevel_add);

        jScrollPane3.setViewportView(licenseIssuingOffice_add);

        jScrollPane4.setViewportView(status_add);

        jScrollPane5.setViewportView(documentNumber_add);

        dateOfIssue.setViewportView(dateOfIssue_add);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label11)
                    .addComponent(date)
                    .addComponent(label12)
                    .addComponent(label13)
                    .addComponent(label14)
                    .addComponent(label15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(expirationDate)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane5)
                    .addComponent(dateOfIssue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(date)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label11)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label12)
                    .addComponent(dateOfIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label13)
                    .addComponent(expirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label14)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label15)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JScrollPane dateOfIssue;
    private javax.swing.JTextPane dateOfIssue_add;
    private javax.swing.JTextPane documentNumber_add;
    private javax.swing.JScrollPane expirationDate;
    private javax.swing.JTextPane expirationDate_add;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JTextPane licenseIssuingOffice_add;
    private javax.swing.JTextPane licenseLevel_add;
    private javax.swing.JScrollPane name;
    private javax.swing.JTextPane name_add;
    private javax.swing.JTextPane status_add;
    private javax.swing.JLabel title;
    private javax.swing.JTextPane typeOfDocument_add;
    // End of variables declaration//GEN-END:variables

    private void setData(String typeOfDocument, String documentNumber, String dateOfIssue, String expirationDate, String name, String licenseLevel, String licenseIssuingOffice, String status) {
        this.typeOfDocument_add.setText(typeOfDocument);
        this.documentNumber_add.setText(documentNumber);
        this.dateOfIssue_add.setText(dateOfIssue);
        this.expirationDate_add.setText(expirationDate);
        this.name_add.setText(name);
        this.licenseLevel_add.setText(licenseLevel);
        this.licenseIssuingOffice_add.setText(licenseIssuingOffice);
        this.status_add.setText(status);
    }

}
