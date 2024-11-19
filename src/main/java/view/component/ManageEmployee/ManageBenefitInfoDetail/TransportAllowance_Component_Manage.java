package view.component.ManageEmployee.ManageBenefitInfoDetail;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TransportAllowance_Component_Manage extends javax.swing.JPanel {

    public TransportAllowance_Component_Manage() {
        initComponents();
    }

    public TransportAllowance_Component_Manage(String items, String levelOfBenefits, String benefitsRegulations) {
        initComponents();
        setData(items, levelOfBenefits, benefitsRegulations);
    }

    private ImageIcon scaleImg(JLabel jLabel, String url) {
        title.setSize(20, 20);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(url));
        Image image = imageIcon.getImage();
        Image scaleImage = image.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaleImage);
        return scaledIcon;
    }

    private void setImg() {
        String urlTitle = "/img/infor.png";

        ImageIcon iconTitle = scaleImg(title, urlTitle);

        title.setIcon(iconTitle);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        maNhanVien1 = new javax.swing.JLabel();
        genderEmployee = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        purposeOfReceivingBenefits = new javax.swing.JTextPane();
        levelOfBenefits = new javax.swing.JScrollPane();
        allowanceAmount = new javax.swing.JTextPane();
        benefitsRegulations = new javax.swing.JScrollPane();
        travelExpenses = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 220));

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("Trợ cấp đi lại");

        date.setText("Mục đích trợ cấp");

        maNhanVien1.setText("Quy định về chi phí đi lại");

        genderEmployee.setText("Mức trợ cấp");

        jScrollPane1.setViewportView(purposeOfReceivingBenefits);

        levelOfBenefits.setViewportView(allowanceAmount);

        benefitsRegulations.setViewportView(travelExpenses);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date)
                            .addComponent(genderEmployee)
                            .addComponent(maNhanVien1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(benefitsRegulations)
                            .addComponent(levelOfBenefits, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(650, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(levelOfBenefits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(genderEmployee))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(benefitsRegulations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maNhanVien1))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane allowanceAmount;
    private javax.swing.JScrollPane benefitsRegulations;
    private javax.swing.JLabel date;
    private javax.swing.JLabel genderEmployee;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane levelOfBenefits;
    private javax.swing.JLabel maNhanVien1;
    private javax.swing.JTextPane purposeOfReceivingBenefits;
    private javax.swing.JLabel title;
    private javax.swing.JTextPane travelExpenses;
    // End of variables declaration//GEN-END:variables

    private void setData(String items, String allowanceAmount, String travelExpenses) {
        this.purposeOfReceivingBenefits.setText(items);
        this.allowanceAmount.setText(allowanceAmount);
        this.travelExpenses.setText(travelExpenses);
    }
    
}
