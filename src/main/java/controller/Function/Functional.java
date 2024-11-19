/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Function;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author LENOVO
 */
public class Functional {

    public static ImageIcon scaleImg(JLabel jLabel, String url) {
        ImageIcon imageIcon = new ImageIcon(Functional.class.getResource(url));
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        return scaledIcon;
    }

    public static ImageIcon scaleImg(JLabel jLabel, ImageIcon icon) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        return scaledIcon;
    }

    public static byte[] convertIconToByteArray(ImageIcon icon) throws IOException {
        // Step 1: Get the Image from the ImageIcon
        Image img = icon.getImage();

        // Step 2: Convert the Image to BufferedImage
        BufferedImage bufferedImage = new BufferedImage(
                img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        bufferedImage.getGraphics().drawImage(img, 0, 0, null);

        // Step 3: Write the BufferedImage to a ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png", baos); // You can choose "jpg" or another format

        // Step 4: Get the byte array from the ByteArrayOutputStream
        return baos.toByteArray();
    }

}
