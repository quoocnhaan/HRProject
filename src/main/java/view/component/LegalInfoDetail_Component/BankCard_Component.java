package view.component.LegalInfoDetail_Component;

import java.util.Date;

public class BankCard_Component extends javax.swing.JPanel {

    public BankCard_Component() {
        initComponents();
    }

    public BankCard_Component(String cardType, String cardNumber, String cardHolderNameer, String cardStatus, String transactionBank, Date startDate, Date endDate, String termsAndConditions) {
        initComponents();
        setData(cardType, cardNumber, cardHolderNameer, cardStatus, transactionBank, startDate, endDate, termsAndConditions);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        genderEmployee = new javax.swing.JLabel();
        birthdayEmployee = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        maNhanVien1 = new javax.swing.JLabel();
        nameEmployee = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        startDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        cardType = new javax.swing.JLabel();
        cardNumber = new javax.swing.JLabel();
        cardHolderNameer = new javax.swing.JLabel();
        cardStatus = new javax.swing.JLabel();
        transactionBank = new javax.swing.JLabel();
        termsAndConditions = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 310));

        jLabel10.setText("Điều kiện và điều khoản");

        genderEmployee.setText("Tên chủ thẻ");

        birthdayEmployee.setText("Trạng thái thẻ");

        jLabel4.setText("Ngày cấp");

        jLabel5.setText("Ngày hết hạn");

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Thẻ ngân hàng");

        date.setText("Loại thẻ");

        maNhanVien1.setText("Ngân hàng giao dịch");

        nameEmployee.setText("Số thẻ");

        cardType.setText("jLabel1");

        cardNumber.setText("jLabel1");

        cardHolderNameer.setText("jLabel1");

        cardStatus.setText("jLabel1");

        transactionBank.setText("jLabel1");

        termsAndConditions.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(maNhanVien1)
                    .addComponent(birthdayEmployee)
                    .addComponent(genderEmployee)
                    .addComponent(date)
                    .addComponent(nameEmployee))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardType)
                            .addComponent(cardNumber)
                            .addComponent(cardHolderNameer)
                            .addComponent(cardStatus)
                            .addComponent(transactionBank))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(startDate, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(endDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(termsAndConditions))
                        .addGap(88, 88, 88))))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(date)
                                    .addComponent(cardType))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nameEmployee)
                                            .addComponent(cardNumber))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(genderEmployee)
                                            .addComponent(cardHolderNameer))
                                        .addGap(40, 40, 40))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(birthdayEmployee)
                                        .addComponent(cardStatus))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(termsAndConditions))))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maNhanVien1)
                        .addComponent(transactionBank)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthdayEmployee;
    private javax.swing.JLabel cardHolderNameer;
    private javax.swing.JLabel cardNumber;
    private javax.swing.JLabel cardStatus;
    private javax.swing.JLabel cardType;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JLabel nameEmployee;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JLabel termsAndConditions;
    private javax.swing.JLabel title;
    private javax.swing.JLabel transactionBank;
    // End of variables declaration//GEN-END:variables

    private void setData(String cardType, String cardNumber, String cardHolderNameer, String cardStatus, String transactionBank, Date startDate, Date endDate, String termsAndConditions) {
        this.cardType.setText(cardType);
        this.cardNumber.setText(cardNumber);
        this.cardHolderNameer.setText(cardHolderNameer);
        this.cardStatus.setText(cardStatus);
        this.transactionBank.setText(transactionBank);
        this.startDate.setDate(startDate);
        this.endDate.setDate(endDate);
        this.termsAndConditions.setText(termsAndConditions);
    }

}
