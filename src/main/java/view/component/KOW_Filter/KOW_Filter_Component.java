/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.KOW_Filter;

import controller.DAO.AttendanceInformationDAO;
import controller.DAO.AttendanceRecordsDAO;
import controller.DAO.EmployeeDAO;
import controller.DAOImp.AttendanceInformationDAOImp;
import controller.DAOImp.AttendanceRecordsDAOImp;
import controller.DAOImp.EmployeeDAOImp;
import controller.Functional.Functional;
import controller.Session.SharedData;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.sql.Date;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.AttendanceData;
import model.AttendanceInformation;
import model.AttendanceRecords;
import model.Data;
import model.Employee;
import model.Period;
import org.hibernate.Session;
import util.HibernateUtil;
import view.component.Manage_Component.ManageAttendance_Component;
import view.component.Manage_Component.ManageLeaveApplication_Component;
import view.component.Manage_Component.ManageSelecteEmployee_Component;

/**
 *
 * @author LENOVO
 */
public class KOW_Filter_Component extends javax.swing.JPanel {

    public KOW_Filter_Component() {
        initComponents();
        customComponents();
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
        employeeAmount = new javax.swing.JLabel();
        selectImg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        period = new javax.swing.JComboBox<>();
        getDataBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Thông tin chấm công");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Kỳ chấm công:");

        employeeAmount.setForeground(new java.awt.Color(0, 0, 0));
        employeeAmount.setText("   Chọn nhân viên");
        employeeAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        employeeAmount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeAmountMouseClicked(evt);
            }
        });

        selectImg.setText(" ");
        selectImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nhân viên");

        updateBtn.setBackground(new java.awt.Color(69, 89, 190));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Cập nhật");
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });

        period.setBackground(new java.awt.Color(255, 255, 255));
        period.setForeground(new java.awt.Color(0, 0, 0));
        period.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11/2024", "12/2024" }));

        getDataBtn.setBackground(new java.awt.Color(69, 89, 190));
        getDataBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getDataBtn.setForeground(new java.awt.Color(255, 255, 255));
        getDataBtn.setText("Phát sinh công");
        getDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(period, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(employeeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectImg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(period, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectImg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(getDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked

        long size = SharedData.getInstance().getEmployee_Attendance().size();
        if (size == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên");
            return;
        }
        transferData();


    }//GEN-LAST:event_updateBtnMouseClicked

    private void employeeAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeAmountMouseClicked
        ManageSelecteEmployee_Component.getInstance().getSelectEmployee().getBtn().setParentName("ManageAttendance_Component");
        JDialog popup = new JDialog(SwingUtilities.getWindowAncestor(this), "Manage Selected Employee", Dialog.ModalityType.APPLICATION_MODAL);
        popup.getContentPane().setLayout(new BorderLayout());
        popup.getContentPane().add(ManageSelecteEmployee_Component.getInstance());
        popup.setSize(1470, 600);  // Kích thước của popup
        popup.setLocationRelativeTo(null);  // Hiển thị ở giữa màn hình
        popup.setVisible(true);  // Hiển thị popup
    }//GEN-LAST:event_employeeAmountMouseClicked

    private void getDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataBtnActionPerformed
        try {
            getData();
            JOptionPane.showMessageDialog(null, "Phát sinh công thành công !\n Hãy cập nhật lại dữ liệu !");
        } catch (ParseException ex) {
            Logger.getLogger(KOW_Filter_Component.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_getDataBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel employeeAmount;
    private javax.swing.JButton getDataBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> period;
    private javax.swing.JLabel selectImg;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void customComponents() {
        ImageIcon img = new ImageIcon(getClass().getResource("/icon/add.png"));
        this.selectImg.setSize(25, 25);
        this.selectImg.setIcon(Functional.scaleImg(selectImg, img));
    }

    private void transferData() {
        Period periodValue = new Period((String) period.getSelectedItem());
        ManageAttendance_Component.getInstance().updateData(periodValue);
    }

    public void updateData() {
        long size = SharedData.getInstance().getEmployee_Attendance().stream()
                .filter(e -> e != null)
                .count();
        this.employeeAmount.setText("   Chọn nhân viên (" + size + ")");
    }

    public List<AttendanceData> processAttendanceFile(String filePath) throws IOException {
        List<AttendanceData> attendanceList = new ArrayList<>();
        Map<String, AttendanceData> attendanceMap = new HashMap<>();
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        for (String line : lines) {
            String[] parts = line.split(" ");

            if (parts.length == 3) {
                String attendanceId = parts[0];
                String dateWork = parts[1];
                String time = parts[2];

                AttendanceData attendanceData = attendanceMap.getOrDefault(attendanceId, new AttendanceData(attendanceId));
                attendanceData.addData(dateWork, time);

                attendanceMap.put(attendanceId, attendanceData);
            }
        }

        attendanceList.addAll(attendanceMap.values());
        return attendanceList;
    }

    private void getData() throws ParseException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            AttendanceInformationDAO attendanceInformationDAO = new AttendanceInformationDAOImp(session);
            AttendanceRecordsDAO attendanceRecordsDAO = new AttendanceRecordsDAOImp(session);

            List<AttendanceData> attendanceList = processAttendanceFile("C:\\Users\\PC\\Desktop\\data.txt");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            for (AttendanceData ad : attendanceList) {
                AttendanceInformation attendanceInformation = attendanceInformationDAO.getByAttendanceInformationId(ad.getAttendanceId());

                for (Data d : ad.getDatas()) {
                    try {
                        LocalDate localDate = LocalDate.parse(d.getDateWork(), formatter);

                        Date workDate = Date.valueOf(localDate);
                        LocalTime startTime = LocalTime.parse(d.getTimeIn(), timeFormatter);
                        LocalTime endTime = (d.getTimeOut() != null) ? LocalTime.parse(d.getTimeOut(), timeFormatter) : null;

                        Duration duration = Duration.between(startTime, endTime);
                        double kow = duration.toMinutes();

                        double fractionalPart = kow - Math.floor(kow);

                        double roundedKow = kow;
                        if (fractionalPart < 0.5) {
                            roundedKow = Math.floor(kow);
                        } else if (fractionalPart == 0.5) {
                            roundedKow = kow;
                        } else {
                            roundedKow = Math.ceil(kow);
                        }

                        AttendanceRecords attendanceRecords = attendanceRecordsDAO.findByAttendanceInformationAndDate(attendanceInformation, workDate);

                        if (attendanceRecords != null) {
                            attendanceRecords.setStartTime(startTime);
                            attendanceRecords.setEndTime(endTime);
                            attendanceRecords.setKow(roundedKow);
                            attendanceRecordsDAO.update(attendanceRecords);
                        } else {
                            attendanceRecords = new AttendanceRecords(attendanceInformation, workDate, startTime, endTime, roundedKow, true);
                            attendanceRecordsDAO.add(attendanceRecords);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
