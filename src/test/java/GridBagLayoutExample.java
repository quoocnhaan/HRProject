/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class GridBagLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Grid Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);

        // Tạo panel với GridLayout (1 hàng, 5 cột)
        JPanel gridPanel = new JPanel(new GridLayout(1, 5, 10, 10));
        gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Panel đầu tiên có thể chứa nhiều thành phần
        JPanel namePanel = new JPanel();
        namePanel.setLayout(new BoxLayout(namePanel, BoxLayout.Y_AXIS));
        JLabel productName = new JLabel("Nike Air Huarache Drift");
        JLabel productDetails = new JLabel("Size: 8,5 US  Style: AH7334-700");
        namePanel.add(productName);
        namePanel.add(productDetails);

        // Thêm panel đầu tiên vào lưới
        gridPanel.add(namePanel);

        // Thêm các thành phần khác vào lưới
        gridPanel.add(new JLabel("Nike")); // Brand
        gridPanel.add(new JLabel("1")); // Q-TY
        gridPanel.add(new JLabel("In stock")); // Status
        gridPanel.add(new JLabel("$280.00")); // Retail Price

        // Thêm lưới vào khung
        frame.add(gridPanel);
        frame.setVisible(true);
    }
}
