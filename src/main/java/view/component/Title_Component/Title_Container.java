package view.component.Title_Component;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class Title_Container extends javax.swing.JPanel {

    public Title_Container() {
        initComponents();
        setLayout();
        addComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new GridLayout(1,5,0,0));
    }

    private void addComponent() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/job.png"));
        for (int i = 1; i <= 5; i++) {
            this.add(new Title_Component(icon, "Thông tin công việc"));
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
