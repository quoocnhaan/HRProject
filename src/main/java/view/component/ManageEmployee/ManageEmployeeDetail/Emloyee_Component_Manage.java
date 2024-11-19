
package view.component.ManageEmployee.ManageEmployeeDetail;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JScrollPane;

public class Emloyee_Component_Manage extends javax.swing.JPanel {

    public Emloyee_Component_Manage() {
        initComponents();
        setLayout();
        addComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(243, 245, 249));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new BorderLayout(0,5));
    }

    private void addComponent() {

        AllComponent_Employee_Manage personalProfile_Hotline = new AllComponent_Employee_Manage();
        personalProfile_Hotline.setPreferredSize(new Dimension(1120, 650));

        JScrollPane scrollPane = new JScrollPane(personalProfile_Hotline);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        this.add(scrollPane, BorderLayout.CENTER);

        this.add(scrollPane, BorderLayout.CENTER);
        //this.add(new Title_Container(), BorderLayout.NORTH);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
