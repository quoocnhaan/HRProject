/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.form.Home.Header;

import controller.DAO.RoleDAO;
import controller.DAOImp.RoleDAOImp;
import controller.Functional.Functional;
import controller.Session.MySession;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import model.Function;
import model.Role;
import org.hibernate.Session;
import util.HibernateUtil;
import view.form.Home.MainContent.MainContent;

/**
 *
 * @author LENOVO
 */
public class Header extends javax.swing.JPanel {

    JPopupMenu popupMenu;

    public Header() {
        initComponents();
        addComponents();
        initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        personalImg = new javax.swing.JLabel();
        menuBtnCont = new javax.swing.JPanel();
        menuBtn = new javax.swing.JLabel();
        backBtnCont = new javax.swing.JPanel();
        backBtn = new javax.swing.JLabel();
        notiBtnCont = new javax.swing.JPanel();
        notiBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        logo.setBackground(new java.awt.Color(255, 51, 51));
        logo.setForeground(new java.awt.Color(255, 51, 51));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/colorlogo.png"))); // NOI18N
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logo.setSize(54, 54);

        personalImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personalImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        personalImg.setSize(54, 54);

        menuBtnCont.setBackground(new java.awt.Color(255, 255, 255));

        menuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/6.png"))); // NOI18N
        menuBtn.setText(" ");
        menuBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBtn.setMaximumSize(new java.awt.Dimension(25, 25));
        menuBtn.setMinimumSize(new java.awt.Dimension(0, 0));
        menuBtn.setSize(25,25);
        menuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuBtnContLayout = new javax.swing.GroupLayout(menuBtnCont);
        menuBtnCont.setLayout(menuBtnContLayout);
        menuBtnContLayout.setHorizontalGroup(
            menuBtnContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBtnContLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuBtnContLayout.setVerticalGroup(
            menuBtnContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBtnContLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backBtnCont.setBackground(new java.awt.Color(255, 255, 255));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4.png"))); // NOI18N
        backBtn.setToolTipText("");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setMaximumSize(new java.awt.Dimension(25, 25));
        backBtn.setPreferredSize(new java.awt.Dimension(25, 25));
        backBtn.setSize(25,25);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backBtnContLayout = new javax.swing.GroupLayout(backBtnCont);
        backBtnCont.setLayout(backBtnContLayout);
        backBtnContLayout.setHorizontalGroup(
            backBtnContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backBtnContLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backBtnContLayout.setVerticalGroup(
            backBtnContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backBtnContLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        notiBtnCont.setBackground(new java.awt.Color(255, 255, 255));

        notiBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/25.png"))); // NOI18N
        notiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notiBtn.setSize(25, 25);
        notiBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notiBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notiBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout notiBtnContLayout = new javax.swing.GroupLayout(notiBtnCont);
        notiBtnCont.setLayout(notiBtnContLayout);
        notiBtnContLayout.setHorizontalGroup(
            notiBtnContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notiBtnContLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        notiBtnContLayout.setVerticalGroup(
            notiBtnContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notiBtnContLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtnCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuBtnCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 719, Short.MAX_VALUE)
                .addComponent(notiBtnCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personalImg, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(personalImg, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menuBtnCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(backBtnCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(notiBtnCont, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        MainContent.getInstance().changePage("F0000");
    }//GEN-LAST:event_backBtnMouseClicked

    private void menuBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMouseEntered
        menuBtnCont.setBackground(new Color(243, 246, 248));
    }//GEN-LAST:event_menuBtnMouseEntered

    private void backBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseEntered
        backBtnCont.setBackground(new Color(243, 246, 248));
    }//GEN-LAST:event_backBtnMouseEntered

    private void notiBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notiBtnMouseEntered
        notiBtnCont.setBackground(new Color(243, 246, 248));
    }//GEN-LAST:event_notiBtnMouseEntered

    private void menuBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMouseExited
        menuBtnCont.setBackground(Color.white);
    }//GEN-LAST:event_menuBtnMouseExited

    private void backBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseExited
        backBtnCont.setBackground(Color.white);
    }//GEN-LAST:event_backBtnMouseExited

    private void notiBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notiBtnMouseExited
        notiBtnCont.setBackground(Color.white);
    }//GEN-LAST:event_notiBtnMouseExited

    private void menuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMouseClicked
        popupMenu.show(menuBtn, menuBtn.getWidth() / 2, menuBtn.getHeight() / 2);
    }//GEN-LAST:event_menuBtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JPanel backBtnCont;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel menuBtn;
    private javax.swing.JPanel menuBtnCont;
    private javax.swing.JLabel notiBtn;
    private javax.swing.JPanel notiBtnCont;
    private javax.swing.JLabel personalImg;
    // End of variables declaration//GEN-END:variables

    private void addComponents() {

    }

    private void initData() {
        popupMenu = new JPopupMenu();

        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            RoleDAO roleDAO = new RoleDAOImp(session);
            Role r1 = roleDAO.get(1);

            for (Function function : r1.getFunctions()) {
                JMenuItem item = new JMenuItem(function.getName());
                item.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        MainContent.getInstance().changePage(function.getFunctionId());
                    }
                });
                popupMenu.add(item);
            }
        }
        ImageIcon img = Functional.convertByteArrayToIcon(MySession.currentEmployee.getImage());
        this.personalImg.setIcon(Functional.scaleImg(this.personalImg, img));
    }
}
