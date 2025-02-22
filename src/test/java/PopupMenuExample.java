/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class PopupMenuExample {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Custom Popup Menu Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a button to trigger the popup
        JButton button = new JButton("...");

        // Create a JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.setPreferredSize(new Dimension(120, 80));  // Set preferred size for the popup menu

        // Create "Edit" and "Delete" menu items
        JMenuItem editItem = new JMenuItem("Edit");
        JMenuItem deleteItem = new JMenuItem("Delete");

        // Customizing the popup menu
        popupMenu.setBorder(new LineBorder(new Color(188, 191, 203), 2, true));  // Add a custom border with rounded corners

        // Customizing the menu items (Edit and Delete)
        customizeMenuItem(editItem, Color.white, Color.BLACK, new Color(245, 247, 251), new Font("Segoe UI", Font.PLAIN, 14));
        customizeMenuItem(deleteItem, Color.white, Color.BLACK, new Color(245, 247, 251), new Font("Segoe UI", Font.PLAIN, 14));

        // Add action listeners to the menu items
        editItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Edit clicked");
            }
        });

        deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Delete clicked");
            }
        });

        // Add items to the popup menu
        popupMenu.add(editItem);
        popupMenu.add(deleteItem);

        // Add an ActionListener to the button to show the popup when clicked
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show the popup below the button
                popupMenu.show(button, button.getWidth() / 2, button.getHeight() / 2);
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set the frame visible
        frame.setVisible(true);
    }

    // Method to customize each menu item (background, foreground, hover effect, cursor)
    private static void customizeMenuItem(JMenuItem menuItem, Color bgColor, Color fgColor, Color hoverColor, Font font) {
        menuItem.setOpaque(true);  // Allow background color to be applied
        menuItem.setBackground(bgColor);  // Set background color
        menuItem.setForeground(fgColor);  // Set foreground color (text color)
        menuItem.setFont(font);  // Set custom font
        menuItem.setPreferredSize(new Dimension(100, 30));  // Set preferred size for menu items

        // Add a hover effect using a mouse listener
        menuItem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menuItem.setBackground(hoverColor);  // Set hover background color
                menuItem.setCursor(new Cursor(Cursor.HAND_CURSOR));  // Change cursor to hand icon when hovering
            }

            @Override
            public void mouseExited(MouseEvent e) {
                menuItem.setBackground(bgColor);  // Revert to normal background color
                menuItem.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));  // Reset cursor when not hovering
            }
        });
    }
}
