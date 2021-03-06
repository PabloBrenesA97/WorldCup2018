/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.view;

import java.awt.Frame;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;
import pk.codeapp.controller.CreateStadiumController;
import pk.codeapp.controller.StadiumController;
import pk.codeapp.model.JumpWindows;
import pk.codeapp.model.Stadium;

/**
 *
 * @author Daniel Amador
 */
public class CreateStadium extends javax.swing.JFrame implements JumpWindows {

    private StadiumsScreen beforeWindow;
    private CreateStadiumController controller;

    /**
     * Creates new form CreateStadium
     */
    public CreateStadium(Stadium show, StadiumController control) {
        initComponents();
        lblId.setEnabled(false);
        controller = new CreateStadiumController(this, control, show);
        this.setLocationRelativeTo(null);
    }

    /**
     * Constructor to edit stadium
     *
     * @param control
     */
    public CreateStadium(StadiumController control) {
        initComponents();
        controller = new CreateStadiumController(this, control);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        lblId = new javax.swing.JTextField();
        lblName = new javax.swing.JTextField();
        lblCity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblCapacity = new javax.swing.JTextField();
        lblShowImage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 220, 30));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, 30));

        lblCity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 220, 30));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Capacity: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("City: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Image");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Id:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jPanel2.setBackground(new java.awt.Color(224, 0, 0));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(224, 0, 0));
        btnBack.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/miniButton.jpg"))); // NOI18N
        btnBack.setText("2018 FIFA WORLD CUP RUSSIA™");
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.setFocusable(false);
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 460, 29));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 50));

        lblCapacity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lblCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 220, 30));

        lblShowImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(lblShowImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 430, 410));

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, -1, -1));

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 100, 40));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/secundary2.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JDialog jDialog1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField lblCapacity;
    public javax.swing.JTextField lblCity;
    public javax.swing.JTextField lblId;
    public javax.swing.JTextField lblName;
    public javax.swing.JLabel lblShowImage;
    // End of variables declaration//GEN-END:variables

    @Override
    public void openWindow(Frame beforeWindow) {
        this.beforeWindow = (StadiumsScreen) beforeWindow;
        this.setVisible(true);

    }

    @Override
    public void jumpBeforeWindow() {
        this.dispose();
        beforeWindow.setVisible(true);
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JLabel getShowImage() {
        return lblShowImage;
    }

    public JTextField getLblCapacity() {
        return lblCapacity;
    }

 
    public JTextField getLblId() {
        return lblId;
    }

    public JTextField getLblName() {
        return lblName;
    }

    public JTextField getLblCity() {
        return lblCity;
    }

}
