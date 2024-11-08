/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.LeaveRequestGridAndFilter.Filter;

import controller.Function.Function;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author LENOVO
 */
public class Filter_Component extends javax.swing.JPanel {

    /**
     * Creates new form Filter_Component
     */
    public int curMonth;
    public String m;

    public Filter_Component() {
        initComponents();
        customComponents();
        initData();
        settingComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        isSelectedDay = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fromDateChooser = new com.toedter.calendar.JDateChooser();
        toDateChooser = new com.toedter.calendar.JDateChooser();
        employeeAmount = new javax.swing.JLabel();
        selectImg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Chọn thời gian");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tháng:");

        month.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        month.setForeground(new java.awt.Color(81, 81, 81));
        month.setText("06/2024");

        isSelectedDay.setForeground(new java.awt.Color(51, 51, 51));
        isSelectedDay.setText("Từ ngày - Đến ngày");
        isSelectedDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isSelectedDayActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Từ ngày");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Đến ngày");

        employeeAmount.setForeground(new java.awt.Color(0, 0, 0));
        employeeAmount.setText("   Chọn nhân viên");
        employeeAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        employeeAmount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        selectImg.setText(" ");
        selectImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nhân viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(employeeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectImg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(isSelectedDay)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(month)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(toDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(month))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(isSelectedDay)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectImg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(381, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void isSelectedDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isSelectedDayActionPerformed
        if (isSelectedDay.isSelected()) {
            this.month.setText("_____");

            fromDateChooser.setEnabled(true);
            toDateChooser.setEnabled(true);
            settingFromDateChooser();
            settingToDateChooser();
        } else {
            month.setText(this.m);

            fromDateChooser.setDate(null);
            fromDateChooser.setEnabled(false);
            toDateChooser.setDate(null);
            toDateChooser.setEnabled(false);
        }
    }//GEN-LAST:event_isSelectedDayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel employeeAmount;
    private com.toedter.calendar.JDateChooser fromDateChooser;
    private javax.swing.JCheckBox isSelectedDay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel month;
    private javax.swing.JLabel selectImg;
    private com.toedter.calendar.JDateChooser toDateChooser;
    // End of variables declaration//GEN-END:variables

    private void settingComponents() {
        fromDateChooser.setEnabled(false);
        toDateChooser.setEnabled(false);
    }

    private void settingFromDateChooser() {
        Calendar cal = Calendar.getInstance();
        fromDateChooser.setCalendar(cal);
    }

    private void settingToDateChooser() {
        Calendar cal = Calendar.getInstance();
        fromDateChooser.getDateEditor().addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                Date selectedDate = fromDateChooser.getDate();  // Lấy ngày được chọn từ DateChooser 1
                if (selectedDate != null) {
                    cal.setTime(selectedDate);
                    toDateChooser.setCalendar(cal);
                    toDateChooser.setMinSelectableDate(selectedDate);  // Đặt ngày tối thiểu cho DateChooser 2
                }
            }
        });
    }

    private void initData() {
        curMonth = LocalDate.now().getMonthValue();
        String m = (curMonth < 10) ? "0" + curMonth : curMonth + "";
        int y = LocalDate.now().getYear();
        this.m = m + "/" + y;
        month.setText(this.m);
    }

    private void customComponents() {
        fromDateChooser.setBorder(null);
        toDateChooser.setBorder(null);
        ImageIcon img = new ImageIcon(getClass().getResource("/icon/add.png"));
        this.selectImg.setSize(25, 25);
        this.selectImg.setIcon(Function.scaleImg(selectImg, img));
    }

}