/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.view;

import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import pk.codeapp.controller.CreateorUpdateResultController;
import pk.codeapp.model.JumpWindow;

/**
 *
 * @author Jose Pablo Brenes
 */
public class CreateorUpdateResult extends javax.swing.JFrame implements JumpWindow{

    /**
     * Creates new form CreateorUpdateResult
     */
    private String fuction;
    private ResultScreen resultScreen;
    private CreateorUpdateResultController controller;
    public CreateorUpdateResult() {
        initComponents();
        this.setLocationRelativeTo(null);
        controller = new CreateorUpdateResultController(this);
        btnBack.addActionListener(controller);
        btnAdd.addActionListener(controller);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        txtOffsides = new javax.swing.JTextField();
        txtFaults = new javax.swing.JTextField();
        txtCorners = new javax.swing.JTextField();
        txtRedCard = new javax.swing.JTextField();
        txtMinPlayed = new javax.swing.JTextField();
        txtYellowCard = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPosBalonE2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPosBalonE1 = new javax.swing.JTextField();
        txtGoalsTeam2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGoalsTeam1 = new javax.swing.JTextField();
        cmbTeam2 = new javax.swing.JComboBox<>();
        cmbTeam1 = new javax.swing.JComboBox<>();
        lblTeam2 = new javax.swing.JLabel();
        lblTeam1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Default");
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 260, 70));

        txtOffsides.setBackground(new java.awt.Color(0, 0, 0));
        txtOffsides.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        txtOffsides.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtOffsides, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 310, 120, 40));

        txtFaults.setBackground(new java.awt.Color(0, 0, 0));
        txtFaults.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        txtFaults.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtFaults, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 120, 40));

        txtCorners.setBackground(new java.awt.Color(0, 0, 0));
        txtCorners.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        txtCorners.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtCorners, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 220, 120, 40));

        txtRedCard.setBackground(new java.awt.Color(0, 0, 0));
        txtRedCard.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        txtRedCard.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtRedCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 120, 40));

        txtMinPlayed.setBackground(new java.awt.Color(0, 0, 0));
        txtMinPlayed.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        txtMinPlayed.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtMinPlayed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 120, 120, 40));

        txtYellowCard.setBackground(new java.awt.Color(0, 0, 0));
        txtYellowCard.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        txtYellowCard.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtYellowCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 120, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total Offsides:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total Corners:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Min Played:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Faults:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Red Card:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Yellow Card:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        txtPosBalonE2.setBackground(new java.awt.Color(0, 0, 0));
        txtPosBalonE2.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        txtPosBalonE2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPosBalonE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 120, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Balon's Position:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        txtPosBalonE1.setBackground(new java.awt.Color(0, 0, 0));
        txtPosBalonE1.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        txtPosBalonE1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPosBalonE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 120, 40));

        txtGoalsTeam2.setBackground(new java.awt.Color(0, 0, 0));
        txtGoalsTeam2.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        txtGoalsTeam2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtGoalsTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 120, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Goals:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        txtGoalsTeam1.setBackground(new java.awt.Color(0, 0, 0));
        txtGoalsTeam1.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        txtGoalsTeam1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtGoalsTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 120, 40));

        cmbTeam2.setBackground(new java.awt.Color(0, 0, 0));
        cmbTeam2.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        cmbTeam2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cmbTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 220, 40));

        cmbTeam1.setBackground(new java.awt.Color(0, 0, 0));
        cmbTeam1.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        cmbTeam1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cmbTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 220, 40));

        lblTeam2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblTeam2.setForeground(new java.awt.Color(255, 255, 255));
        lblTeam2.setText("Team 2");
        getContentPane().add(lblTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        lblTeam1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblTeam1.setForeground(new java.awt.Color(255, 255, 255));
        lblTeam1.setText("Team 1");
        getContentPane().add(lblTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        btnBack.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<2018 FIFA WORLD CUP RUSSIA™");
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(785, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Segundo Semestre 2017\\POO\\Proyecto#2\\RusiaIsComing\\WorldCup2018\\Clases\\WorldCup2018\\WorldChampionCup\\src\\pk\\codeapp\\view\\image\\RiversMosku.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateorUpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateorUpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateorUpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateorUpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateorUpdateResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    public javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbTeam1;
    private javax.swing.JComboBox<String> cmbTeam2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTeam1;
    private javax.swing.JLabel lblTeam2;
    private javax.swing.JTextField txtCorners;
    private javax.swing.JTextField txtFaults;
    private javax.swing.JTextField txtGoalsTeam1;
    private javax.swing.JTextField txtGoalsTeam2;
    private javax.swing.JTextField txtMinPlayed;
    private javax.swing.JTextField txtOffsides;
    private javax.swing.JTextField txtPosBalonE1;
    private javax.swing.JTextField txtPosBalonE2;
    private javax.swing.JTextField txtRedCard;
    private javax.swing.JTextField txtYellowCard;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnAdd = btnAdd;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

  

    public JComboBox<String> getCmbTeam1() {
        return cmbTeam1;
    }

    public void setCmbTeam1(JComboBox<String> cmbTeam1) {
        this.cmbTeam1 = cmbTeam1;
    }

    public JComboBox<String> getCmbTeam2() {
        return cmbTeam2;
    }

    public void setCmbTeam2(JComboBox<String> cmbTeam2) {
        this.cmbTeam2 = cmbTeam2;
    }

    public JTextField getTxtCorners() {
        return txtCorners;
    }

    public void setTxtCorners(JTextField txtCorners) {
        this.txtCorners = txtCorners;
    }

    public JTextField getTxtFaults() {
        return txtFaults;
    }

    public void setTxtFaults(JTextField txtFaults) {
        this.txtFaults = txtFaults;
    }

    public JTextField getTxtGoalsTeam1() {
        return txtGoalsTeam1;
    }

    public void setTxtGoalsTeam1(JTextField txtGoalsTeam1) {
        this.txtGoalsTeam1 = txtGoalsTeam1;
    }

    public JTextField getTxtGoalsTeam2() {
        return txtGoalsTeam2;
    }

    public void setTxtGoalsTeam2(JTextField txtGoalsTeam2) {
        this.txtGoalsTeam2 = txtGoalsTeam2;
    }

    public JTextField getTxtMinPlayed() {
        return txtMinPlayed;
    }

    public void setTxtMinPlayed(JTextField txtMinPlayed) {
        this.txtMinPlayed = txtMinPlayed;
    }

    public JTextField getTxtOffsides() {
        return txtOffsides;
    }

    public void setTxtOffsides(JTextField txtOffsides) {
        this.txtOffsides = txtOffsides;
    }

    public JTextField getTxtPosBalonE1() {
        return txtPosBalonE1;
    }

    public void setTxtPosBalonE1(JTextField txtPosBalonE1) {
        this.txtPosBalonE1 = txtPosBalonE1;
    }

    public JTextField getTxtPosBalonE2() {
        return txtPosBalonE2;
    }

    public void setTxtPosBalonE2(JTextField txtPosBalonE2) {
        this.txtPosBalonE2 = txtPosBalonE2;
    }

    public JTextField getTxtRedCard() {
        return txtRedCard;
    }

    public void setTxtRedCard(JTextField txtRedCard) {
        this.txtRedCard = txtRedCard;
    }

    public JTextField getTxtYellowCard() {
        return txtYellowCard;
    }

    public void setTxtYellowCard(JTextField txtYellowCard) {
        this.txtYellowCard = txtYellowCard;
    }

    public ResultScreen getResultScreen() {
        return resultScreen;
    }

    public void setResultScreen(ResultScreen resultScreen) {
        this.resultScreen = resultScreen;
    }

    public JLabel getLblTeam1() {
        return lblTeam1;
    }

    public void setLblTeam1(JLabel lblTeam1) {
        this.lblTeam1 = lblTeam1;
    }

    public JLabel getLblTeam2() {
        return lblTeam2;
    }

    public void setLblTeam2(JLabel lblTeam2) {
        this.lblTeam2 = lblTeam2;
    }

    public String getFuction() {
        return fuction;
    }

    public void setFuction(String fuction) {
        this.fuction = fuction;
    }
    
    @Override
    public void openWindow(Frame beforeWindow) {
        this.resultScreen=(ResultScreen) beforeWindow;
        this.setVisible(true);
        controller.fillData();
    }

    @Override
    public void jumpBeforeWindow() {
        this.dispose();
        resultScreen.setVisible(true);
    }
    
}
