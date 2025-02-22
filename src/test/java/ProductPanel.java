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
import model.Product;

class ProductPanel extends JPanel {

    public ProductPanel(Product product) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Margin around components

        // Adding product image (placeholder)
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2; // Make the image span two rows
        gbc.anchor = GridBagConstraints.WEST; // Align to the left
        JLabel imageLabel = new JLabel(); // Placeholder for image
        imageLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/home_e.png"))); // Placeholder image
        add(imageLabel, gbc);

        // Setting up Segoe UI font with fallback to Arial
        Font segoeFont = new Font("Segoe UI", Font.PLAIN, 16);
        if (!segoeFont.getFamily().equalsIgnoreCase("Segoe UI")) {
            segoeFont = new Font("Arial", Font.PLAIN, 16); // Fallback to Arial
        }

        // Adding product name (spanning across columns)
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 2; // Span across two columns for name and brand
        gbc.weightx = 1.0; // Stretch horizontally to take up more space
        gbc.fill = GridBagConstraints.HORIZONTAL; // Ensure it fills the space
        JLabel nameLabel = new JLabel("<html><b>" + product.getName() + "</b></html>");
        nameLabel.setFont(segoeFont.deriveFont(Font.BOLD, 16));
        add(nameLabel, gbc);

        // Adding size and style details (aligned with name)
        gbc.gridy = 1;
        gbc.gridwidth = 2; // Spanning across two columns again
        JLabel sizeStyleLabel = new JLabel("Code: " + product.getCode());
        sizeStyleLabel.setFont(segoeFont.deriveFont(Font.PLAIN, 14));
        add(sizeStyleLabel, gbc);

        // Adding brand
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JLabel brandLabel = new JLabel(product.getDescription());
        brandLabel.setFont(segoeFont.deriveFont(Font.PLAIN, 14));
        add(brandLabel, gbc);

        // Adding quantity
        gbc.gridx = 4;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(5, 20, 5, 20);
        JLabel qtyLabel = new JLabel(String.valueOf(product.getAmount()));
        qtyLabel.setFont(segoeFont.deriveFont(Font.PLAIN, 14));
        add(qtyLabel, gbc);

        // Adding status
        gbc.gridx = 5;
        gbc.insets = new Insets(5, 20, 5, 20);
        JLabel statusLabel = new JLabel(product.isStatus() + "");
        statusLabel.setFont(segoeFont.deriveFont(Font.PLAIN, 14));
        add(statusLabel, gbc);

        // Adding price
        gbc.gridx = 6;
        gbc.insets = new Insets(5, 20, 5, 5);
        JLabel priceLabel = new JLabel(String.format("$%.2f", product.getPrice()));
        priceLabel.setFont(segoeFont.deriveFont(Font.PLAIN, 14));
        add(priceLabel, gbc);
    }
}
