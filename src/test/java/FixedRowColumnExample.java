/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import javax.swing.*;
import java.awt.*;

public class FixedRowColumnExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fixed Row and Column Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel chính chứa các thành phần
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Tạo hàng đầu tiên cố định
        JPanel fixedRowPanel = new JPanel(new GridLayout(1, 0));
        for (int j = 1; j <= 4; j++) {
            JPanel panel = new JPanel();
            panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel.add(new JLabel("Col " + j));
            fixedRowPanel.add(panel);
        }

        // Tạo cột đầu tiên cố định
        JPanel fixedColumnPanel = new JPanel(new GridLayout(0, 1));
        for (int i = 1; i <= 4; i++) {
            JPanel panel = new JPanel();
            panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel.add(new JLabel("Row " + i));
            fixedColumnPanel.add(panel);
        }

        // Tạo bảng chính với các JPanel
        JPanel dataPanel = new JPanel(new GridLayout(4, 4));  // 4x4 bảng dữ liệu
        for (int i = 1; i <= 16; i++) {

                JPanel panel = new JPanel();
                panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel.add(new JLabel("Data " + i + "-" + i));
                dataPanel.add(panel);
            
        }

        // Thêm cột cố định vào lưới
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(fixedColumnPanel, gbc);
        
        // Thêm hàng cố định vào lưới
        gbc.gridx = 1;
        gbc.gridy = 0;
        mainPanel.add(fixedRowPanel, gbc);

        // Thêm bảng dữ liệu vào lưới
        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(dataPanel, gbc);

        // Cuộn bảng dữ liệu chính
        JScrollPane scrollPane = new JScrollPane(dataPanel);
        
        // Cố định cột đầu tiên khi cuộn ngang và hàng đầu tiên khi cuộn dọc
        scrollPane.setRowHeaderView(fixedColumnPanel);
        scrollPane.setColumnHeaderView(fixedRowPanel);

        frame.add(scrollPane);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

