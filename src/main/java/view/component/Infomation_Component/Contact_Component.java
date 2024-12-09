/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.Infomation_Component;

import controller.Functional.Functional;
import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author LENOVO
 */
public class Contact_Component extends javax.swing.JPanel {

    /**
     * Creates new form Contact_Component
     */
    public Contact_Component(String email, String phone, String twitter) {
        initComponents();
        addIcon();
        this.setPreferredSize(new Dimension(280, 100));
        this.email.setText(email);
        this.phone.setText(phone);
        this.twitter.setText(twitter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailIcon = new javax.swing.JLabel();
        phoneIcon = new javax.swing.JLabel();
        twitterIcon = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        emailIcon.setMaximumSize(new java.awt.Dimension(50, 50));
        emailIcon.setMinimumSize(new java.awt.Dimension(1, 1));
        emailIcon.setPreferredSize(new java.awt.Dimension(18, 18));
        emailIcon.setSize(18, 18);

        phoneIcon.setMaximumSize(new java.awt.Dimension(50, 50));
        phoneIcon.setMinimumSize(new java.awt.Dimension(1, 1));
        phoneIcon.setPreferredSize(new java.awt.Dimension(18, 18));
        phoneIcon.setSize(16, 16);

        twitterIcon.setMaximumSize(new java.awt.Dimension(50, 50));
        twitterIcon.setMinimumSize(new java.awt.Dimension(1, 1));
        twitterIcon.setPreferredSize(new java.awt.Dimension(18, 18));
        twitterIcon.setSize(16, 16);

        email.setForeground(new java.awt.Color(124, 124, 124));
        email.setText("quocnhan56@gmail.com");

        phone.setForeground(new java.awt.Color(124, 124, 124));
        phone.setText("0968270553");

        twitter.setForeground(new java.awt.Color(124, 124, 124));
        twitter.setText("quocnhan56@gmail.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(twitterIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(phoneIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email)
                    .addComponent(phone)
                    .addComponent(twitter))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(twitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twitterIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailIcon;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel phoneIcon;
    private javax.swing.JLabel twitter;
    private javax.swing.JLabel twitterIcon;
    // End of variables declaration//GEN-END:variables

    private void addIcon() {
        ImageIcon emailIcon = new ImageIcon(getClass().getResource("/icon/email.png"));
        ImageIcon phoneIcon = new ImageIcon(getClass().getResource("/icon/phone.png"));
        ImageIcon twitterIcon = new ImageIcon(getClass().getResource("/icon/twitter.png"));

        this.emailIcon.setIcon(Functional.scaleImg(this.emailIcon, emailIcon));
        this.phoneIcon.setIcon(Functional.scaleImg(this.emailIcon, phoneIcon));
        this.twitterIcon.setIcon(Functional.scaleImg(this.emailIcon, twitterIcon));

    }
}