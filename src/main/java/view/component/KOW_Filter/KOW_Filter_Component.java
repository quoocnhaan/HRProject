/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.KOW_Filter;

import controller.DAO.AttendanceInformationDAO;
import controller.DAO.AttendanceRecordsDAO;
import controller.DAO.EmployeeDAO;
import controller.DAO.PayPeriodDAO;
import controller.DAO.SalaryDAO;
import controller.DAOImp.AttendanceInformationDAOImp;
import controller.DAOImp.AttendanceRecordsDAOImp;
import controller.DAOImp.EmployeeDAOImp;
import controller.DAOImp.PayPeriodDAOImp;
import controller.DAOImp.SalaryDAOImp;
import controller.Functional.Functional;
import controller.Session.SharedData;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
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
import model.PayPeriod;
import model.Period;
import model.Salary;
import org.hibernate.Session;
import util.HibernateUtil;
import view.component.Manage_Component.ManageAttendance_Component;
import view.component.Manage_Component.ManageSalary_Component;
import view.component.Manage_Component.ManageSelecteEmployee_Component;

/**
 *
 * @author LENOVO
 */
public class KOW_Filter_Component extends javax.swing.JPanel {

    private String parentName;
    private long employeeSize;

    public KOW_Filter_Component(String parentName) {
        this.parentName = parentName;
        initComponents();
        initData();
        customComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        employeeAmount = new javax.swing.JLabel();
        selectImg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        period = new javax.swing.JComboBox<>();
        getDataBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        title1.setBackground(new java.awt.Color(255, 255, 255));
        title1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        title1.setForeground(new java.awt.Color(51, 51, 51));
        title1.setText("Thông tin chấm công");

        title2.setBackground(new java.awt.Color(255, 255, 255));
        title2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setText("Kỳ chấm công:");

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
                            .addComponent(title1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title2)
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
                .addComponent(title1)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title2)
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
        if (employeeSize == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên");
            return;
        }
        transferData();
    }//GEN-LAST:event_updateBtnMouseClicked

    private void employeeAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeAmountMouseClicked

        switch (parentName) {
            case "ManageAttendance_Component":
                ManageSelecteEmployee_Component.getInstance().getSelectEmployee().getBtn().setParentName("ManageAttendance_Component");
                break;
            case "ManageSalary_Component":
                ManageSelecteEmployee_Component.getInstance().getSelectEmployee().getBtn().setParentName("ManageSalary_Component");
                break;
            default:
                System.out.println("Error in transferData function in KOW_Filter");
        }
        JDialog popup = new JDialog(SwingUtilities.getWindowAncestor(this), "Manage Selected Employee", Dialog.ModalityType.APPLICATION_MODAL);
        popup.getContentPane().setLayout(new BorderLayout());
        popup.getContentPane().add(ManageSelecteEmployee_Component.getInstance());
        popup.setSize(1470, 600);
        popup.setLocationRelativeTo(null);
        popup.setVisible(true);
    }//GEN-LAST:event_employeeAmountMouseClicked

    private void getDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataBtnActionPerformed
        try {
            getData();
            JOptionPane.showMessageDialog(null, "Phát sinh công thành công !\n Hãy cập nhật lại dữ liệu !");
        } catch (ParseException ex) {
            Logger.getLogger(KOW_Filter_Component.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(KOW_Filter_Component.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KOW_Filter_Component.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_getDataBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel employeeAmount;
    private javax.swing.JButton getDataBtn;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> period;
    private javax.swing.JLabel selectImg;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void customComponents() {
        ImageIcon img = new ImageIcon(getClass().getResource("/icon/add.png"));
        this.selectImg.setSize(25, 25);
        this.selectImg.setIcon(Functional.scaleImg(selectImg, img));
    }

    private void transferData() {
        try (Session sesison = HibernateUtil.getSessionFactory().openSession()) {
            PayPeriodDAO payPeriodDAO = new PayPeriodDAOImp(sesison);
            PayPeriod periodValue = payPeriodDAO.getByPayPeriodCode((String) period.getSelectedItem());
            switch (parentName) {
                case "ManageAttendance_Component":
                    ManageAttendance_Component.getInstance().updateData(periodValue);
                    break;
                case "ManageSalary_Component":
                    ManageSalary_Component.getInstance().updateData(periodValue);
                    break;
                default:
                    System.out.println("Error in transferData function in KOW_Filter");
            }
        } catch (Exception e) {
            System.out.println(e + "KOW");
        }

    }

    public void updateData() {
        switch (parentName) {
            case "ManageAttendance_Component":
                employeeSize = SharedData.getInstance().getEmployee_Attendance().stream()
                        .filter(e -> e != null)
                        .count();
                break;
            case "ManageSalary_Component":
                employeeSize = SharedData.getInstance().getEmployee_Salary().stream()
                        .filter(e -> e != null)
                        .count();
                break;
            default:
        }
        this.employeeAmount.setText("   Chọn nhân viên (" + employeeSize + ")");
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

    private void getData() throws ParseException, URISyntaxException, IOException {
        URL resourceUrl = getClass().getResource("/data.txt");
        List<AttendanceData> attendanceList = null;
        if (resourceUrl != null) {
            try {

                File file = new File(resourceUrl.toURI());
//
//                String filePath = file.getAbsolutePath();

                String home = System.getProperty("user.home");  // Get the user's home directory
                String filePath = home + "/data.txt";  // Path to data.txt in the user's home directory

                attendanceList = processAttendanceFile(filePath);

                updateAttendanceRecords(attendanceList);

                updateSalary();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File not found");
        }

    }

    private void updateSalary() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            AttendanceInformationDAO attendanceInformationDAO = new AttendanceInformationDAOImp(session);
            PayPeriodDAO periodDAO = new PayPeriodDAOImp(session);
            AttendanceRecordsDAO attendanceRecordsDAO = new AttendanceRecordsDAOImp(session);
            EmployeeDAO employeeDAO = new EmployeeDAOImp(session);
            SalaryDAO salaryDAO = new SalaryDAOImp(session);

            List<AttendanceInformation> attendanceInformationList = attendanceInformationDAO.getAll();
            System.out.println(attendanceInformationList.size());
            List<PayPeriod> payPeriodList = periodDAO.getAll();
            for (PayPeriod payPeriod : payPeriodList) {
                for (AttendanceInformation attendanceInfo : attendanceInformationList) {
                    List<AttendanceRecords> attendanceRecordsList = attendanceRecordsDAO.getByAttendanceInformationAndPayPeriod(attendanceInfo, payPeriod.getStartDate(), payPeriod.getEndDate());
                    double totalKow = attendanceRecordsList.stream()
                            .mapToDouble(AttendanceRecords::getKow)
                            .sum();

                    double calculatedSalary = totalKow * 2000;

                    Employee employee = employeeDAO.getByAttendanceId(attendanceInfo.getAttendanceId());

                    Salary existingSalary = salaryDAO.getByEmployeeAndPayPeriod(employee, payPeriod);

                    if (existingSalary != null) {
                        existingSalary.setSalary(calculatedSalary);
                        salaryDAO.update(existingSalary);

                    } else {
                        Salary newSalary = new Salary(employee, payPeriod, calculatedSalary, true);
                        salaryDAO.add(newSalary);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void initData() {
        switch (parentName) {
            case "ManageAttendance_Component":
                title1.setText("Thông tin chấm công");
                title2.setText("Kỳ chấm công");
                break;
            case "ManageSalary_Component":
                title1.setText("Tính lương");
                title2.setText("Kỳ lương");
            default:
        }
    }

    private void updateAttendanceRecords(List<AttendanceData> attendanceList) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            AttendanceInformationDAO attendanceInformationDAO = new AttendanceInformationDAOImp(session);
            AttendanceRecordsDAO attendanceRecordsDAO = new AttendanceRecordsDAOImp(session);
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
        }
    }
}
