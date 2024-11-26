/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.LeaveApplication.GridLeaveRequest;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.component.LeaveApplication.GridLeaveRequest.Content.Content_Component;
import view.component.LeaveApplication.GridLeaveRequest.ChangePage.ChangePageAndSearch;

/**
 *
 * @author LENOVO
 */
public class LeaveApplicationGrid extends javax.swing.JPanel {

    private ChangePageAndSearch changePageAndSearch;
    private JScrollPane content;
    
    public LeaveApplicationGrid() {
        initComponents();
        setLayout();
        addComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
    }

    private void addComponents() {
        changePageAndSearch = new ChangePageAndSearch();
        this.add(changePageAndSearch, BorderLayout.NORTH);

        Content_Component contentComponent = new Content_Component();

        JPanel fixedColumnPanel = contentComponent.getEmployeeInfo_Container();
        JPanel fixedRowPanel = contentComponent.getDate_Container();

        content = new JScrollPane(contentComponent);

        content.setRowHeaderView(fixedColumnPanel);
        content.setColumnHeaderView(fixedRowPanel);

        this.add(content, BorderLayout.CENTER);
    }

    public ChangePageAndSearch getChangePageAndSearch() {
        return changePageAndSearch;
    }

    public void setChangePageAndSearch(ChangePageAndSearch changePageAndSearch) {
        this.changePageAndSearch = changePageAndSearch;
    }

    public JScrollPane getContent() {
        return content;
    }

    public void setContent(JScrollPane content) {
        this.content = content;
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
