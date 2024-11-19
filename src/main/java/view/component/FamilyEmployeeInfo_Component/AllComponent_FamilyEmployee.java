package view.component.FamilyEmployeeInfo_Component;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Date;
import javax.swing.JScrollPane;

public class AllComponent_FamilyEmployee extends javax.swing.JPanel {

    public AllComponent_FamilyEmployee() {
        initComponents();
        setLayout();
        addComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new BorderLayout(5, 5));
    }

    private void addComponent() {
        Date date = new Date(155, 10, 11);
        FamilyEmployee_Component right = new FamilyEmployee_Component(true, "Nguyễn", "ABC", "Ba ruột", "Nam", date, true, "01234 0123 4567", date, date, "Cục trưởng cục cảnh sát", date, "Việt Nam", "01234567890123456789", "01234567890123456789123", "01234567890123456789123456", true, true, true, false, date, "Chưa có");
        right.setPreferredSize(new Dimension(1120, 600));
        JScrollPane scrollPane1 = new JScrollPane(right);
        scrollPane1.setBorder(null);
        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        BasicInfo_Container_FamilyEmployee left = new BasicInfo_Container_FamilyEmployee();
        left.setPreferredSize(new Dimension(280, 1000));
        JScrollPane scrollPane2 = new JScrollPane(left);
        scrollPane2.setBorder(null);
        scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        this.add(scrollPane1, BorderLayout.CENTER);
        this.add(scrollPane2, BorderLayout.WEST);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
