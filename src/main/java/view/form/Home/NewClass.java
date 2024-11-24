/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.form.Home;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author LENOVO
 */
public class NewClass {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Navigation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Tạo thanh điều hướng
        JPanel navigationPanel = new JPanel();
        JButton btnHome = new JButton("Home");
        JButton btnPage1 = new JButton("Page 1");
        JButton btnPage2 = new JButton("Page 2");
        navigationPanel.add(btnHome);
        navigationPanel.add(btnPage1);
        navigationPanel.add(btnPage2);

        // Tạo CardLayout cho phần content
        JPanel contentPanel = new JPanel(new CardLayout());

        // Tạo các trang (panel) khác nhau
        JPanel homePanel = new JPanel();
        homePanel.add(new JLabel("This is Home Page"));

        JPanel page1Panel = new JPanel();
        page1Panel.add(new JLabel("This is Page 1"));

        JPanel page2Panel = new JPanel();
        page2Panel.add(new JLabel("This is Page 2"));

        // Thêm các panel vào contentPanel
        contentPanel.add(homePanel, "Home");
        contentPanel.add(page1Panel, "Page1");
        contentPanel.add(page2Panel, "Page2");

        // Thêm ActionListener cho các nút
        btnHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (contentPanel.getLayout());
                cl.show(contentPanel, "Home");
            }
        });

        btnPage1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (contentPanel.getLayout());
                cl.show(contentPanel, "Page1");
            }
        });

        btnPage2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (contentPanel.getLayout());
                cl.show(contentPanel, "Page2");
            }
        });

        // Bố cục chính
        frame.setLayout(new BorderLayout());
        frame.add(navigationPanel, BorderLayout.NORTH);  // Thanh điều hướng ở phía trên
        frame.add(contentPanel, BorderLayout.CENTER);   // Nội dung ở giữa

        frame.setVisible(true);
    }
}
