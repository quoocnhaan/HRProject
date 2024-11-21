package view.component.LegalInfoDetail_Component;

public class DriverLicense_Component extends javax.swing.JPanel {

    public DriverLicense_Component() {
        initComponents();
    }

    public DriverLicense_Component(String typeOfDocument, String documentNumber, String dateOfIssue, String expirationDate, String name, String licenseLevel, String licenseIssuingOffice, String status) {
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
        typeOfDocument_add = new javax.swing.JLabel();
        documentNumber_add = new javax.swing.JLabel();
        dateOfIssue_add = new javax.swing.JLabel();
        expirationDate_add = new javax.swing.JLabel();
        name_add = new javax.swing.JLabel();
        licenseLevel_add = new javax.swing.JLabel();
        licenseIssuingOffice_add = new javax.swing.JLabel();
        status_add = new javax.swing.JLabel();

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

        typeOfDocument_add.setText("jLabel1");

        documentNumber_add.setText("jLabel1");

        dateOfIssue_add.setText("jLabel1");

        expirationDate_add.setText("jLabel1");

        name_add.setText("jLabel1");

        licenseLevel_add.setText("jLabel1");

        licenseIssuingOffice_add.setText("jLabel1");

        status_add.setText("jLabel1");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeOfDocument_add)
                            .addComponent(documentNumber_add))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(licenseIssuingOffice_add)
                            .addComponent(status_add))
                        .addGap(262, 262, 262))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfIssue_add)
                            .addComponent(expirationDate_add)
                            .addComponent(name_add)
                            .addComponent(licenseLevel_add))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(licenseIssuingOffice_add))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(status_add)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(date)
                                    .addComponent(typeOfDocument_add))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label11)
                                    .addComponent(documentNumber_add))))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label12)
                    .addComponent(dateOfIssue_add))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label13)
                    .addComponent(expirationDate_add))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label14)
                    .addComponent(name_add))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label15)
                    .addComponent(licenseLevel_add))
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel dateOfIssue_add;
    private javax.swing.JLabel documentNumber_add;
    private javax.swing.JLabel expirationDate_add;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel licenseIssuingOffice_add;
    private javax.swing.JLabel licenseLevel_add;
    private javax.swing.JLabel name_add;
    private javax.swing.JLabel status_add;
    private javax.swing.JLabel title;
    private javax.swing.JLabel typeOfDocument_add;
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
