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

public class CustomTableUI extends JFrame {

    public CustomTableUI() {
        setTitle("Custom Table UI");
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use GridBagLayout for flexible column widths
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // First Column: Name (Wider than other columns)
        gbc.gridx = 0; // First column
        gbc.gridy = 0; // First row
        gbc.gridwidth = 2; // Span 2 columns for the NAME
        gbc.weightx = 2.0; // Make it grow more when resized
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(createLabel("Nike Air Huarache Drift\nSize: 8.5 US\nStyle: AH7334-700", Color.WHITE), gbc);

        // Second Column: Brand
        gbc.gridx = 2; // Second column
        gbc.gridy = 0; // First row
        gbc.gridwidth = 1; // Span 1 column
        gbc.weightx = 1.0; // Regular size
        panel.add(createLabel("Nike", Color.LIGHT_GRAY), gbc);

        // Third Column: Quantity
        gbc.gridx = 3; // Third column
        gbc.gridy = 0; // First row
        gbc.weightx = 0.5; // Less weight to be smaller
        panel.add(createLabel("1", Color.LIGHT_GRAY), gbc);

        // Fourth Column: Status
        gbc.gridx = 4; // Fourth column
        gbc.gridy = 0; // First row
        panel.add(createLabel("In stock", Color.LIGHT_GRAY), gbc);

        // Fifth Column: Price
        gbc.gridx = 5; // Fifth column
        gbc.gridy = 0; // First row
        gbc.weightx = 0.5; // Smaller column
        panel.add(createLabel("$280.00", Color.LIGHT_GRAY), gbc);

        // Add panel to frame
        add(panel);
        setVisible(true);
    }

    // Utility to create labels with custom background
    private JLabel createLabel(String text, Color bgColor) {
        JLabel label = new JLabel("<html>" + text.replaceAll("\n", "<br>") + "</html>", JLabel.CENTER);
        label.setOpaque(true);
        label.setBackground(bgColor);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return label;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CustomTableUI::new);
    }
}
