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
import pk.codeapp.controller.ResultController;
import pk.codeapp.model.JumpWindow;
import pk.codeapp.model.Result;

/**
 *
 * @author Jose Pablo Brenes
 */
public class ResultScreen extends javax.swing.JFrame implements JumpWindow{

    /**
     * Creates new form ResultScreen
     */
    private Frame beforeWindow;
    private ResultController controller;
    private Result actualResult;
    public ResultScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        controller = new ResultController(this);
        cmbResult.addActionListener(controller);
        btnBack.addActionListener(controller);
        btnCreate.addActionListener(controller);
        btnDelete.addActionListener(controller);
        btnUpdate.addActionListener(controller);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
            java.util.logging.Logger.getLogger(MenuTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultScreen().setVisible(true);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblvs = new javax.swing.JLabel();
        lblTotalOffsides = new javax.swing.JLabel();
        lblTotalCorner1 = new javax.swing.JLabel();
        lblTotalCorner = new javax.swing.JLabel();
        lblnameTotalCorner = new javax.swing.JLabel();
        lblTotalFaults = new javax.swing.JLabel();
        lblTeam6 = new javax.swing.JLabel();
        lblTotalRC = new javax.swing.JLabel();
        lblTeam5 = new javax.swing.JLabel();
        lblTotalYC = new javax.swing.JLabel();
        lblTeam4 = new javax.swing.JLabel();
        lblMinutes = new javax.swing.JLabel();
        lblTeam3 = new javax.swing.JLabel();
        lblPositionBalonT2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPositionBalonT1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblGoalsTeam1 = new javax.swing.JLabel();
        lblGoalsTeam2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTie = new javax.swing.JLabel();
        lblTeamLoser = new javax.swing.JLabel();
        lblNameTeamLoser = new javax.swing.JLabel();
        lblTeamWinner = new javax.swing.JLabel();
        lblNameTeamWinner = new javax.swing.JLabel();
        lblimg2 = new javax.swing.JLabel();
        lblimg1 = new javax.swing.JLabel();
        lblTeam2 = new javax.swing.JLabel();
        lblTeam1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbResult = new javax.swing.JComboBox<>();
        lblResult = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName(""); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblvs.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblvs.setForeground(new java.awt.Color(255, 255, 255));
        lblvs.setText("VS");
        getContentPane().add(lblvs, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        lblTotalOffsides.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTotalOffsides.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTotalOffsides, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 640, 130, 50));

        lblTotalCorner1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTotalCorner1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCorner1.setText("Total Offsides");
        getContentPane().add(lblTotalCorner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 610, -1, -1));

        lblTotalCorner.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTotalCorner.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTotalCorner, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 560, 130, 50));

        lblnameTotalCorner.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblnameTotalCorner.setForeground(new java.awt.Color(255, 255, 255));
        lblnameTotalCorner.setText("Total Corners");
        getContentPane().add(lblnameTotalCorner, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, -1, -1));

        lblTotalFaults.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTotalFaults.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTotalFaults, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 480, 130, 50));

        lblTeam6.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTeam6.setForeground(new java.awt.Color(255, 255, 255));
        lblTeam6.setText("Total Faults");
        getContentPane().add(lblTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, -1, -1));

        lblTotalRC.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTotalRC.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTotalRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 130, 50));

        lblTeam5.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTeam5.setForeground(new java.awt.Color(255, 255, 255));
        lblTeam5.setText("Total Red Card");
        getContentPane().add(lblTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, -1, -1));

        lblTotalYC.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTotalYC.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTotalYC, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, 130, 50));

        lblTeam4.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTeam4.setForeground(new java.awt.Color(255, 255, 255));
        lblTeam4.setText("Total Yellow Card");
        getContentPane().add(lblTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, -1, -1));

        lblMinutes.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblMinutes.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblMinutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 130, 60));

        lblTeam3.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTeam3.setForeground(new java.awt.Color(255, 255, 255));
        lblTeam3.setText("Minutes Played");
        getContentPane().add(lblTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, -1, -1));

        lblPositionBalonT2.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        lblPositionBalonT2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblPositionBalonT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 80, 50));

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PositionBalon:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, -1));

        lblPositionBalonT1.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        lblPositionBalonT1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblPositionBalonT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 80, 50));

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PositionBalon:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        lblGoalsTeam1.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        lblGoalsTeam1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblGoalsTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 80, 50));

        lblGoalsTeam2.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        lblGoalsTeam2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblGoalsTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 80, 50));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TotalGoals:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, -1, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TotalGoals:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        lblTie.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTie.setForeground(new java.awt.Color(255, 255, 255));
        lblTie.setText("Tie");
        getContentPane().add(lblTie, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        lblTeamLoser.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        lblTeamLoser.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTeamLoser, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 190, 50));

        lblNameTeamLoser.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        lblNameTeamLoser.setForeground(new java.awt.Color(255, 255, 255));
        lblNameTeamLoser.setText("Team Loser");
        getContentPane().add(lblNameTeamLoser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        lblTeamWinner.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        lblTeamWinner.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTeamWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 190, 50));

        lblNameTeamWinner.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        lblNameTeamWinner.setForeground(new java.awt.Color(255, 255, 255));
        lblNameTeamWinner.setText("Team Winner");
        getContentPane().add(lblNameTeamWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        lblimg2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblimg2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblimg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 110, 50));

        lblimg1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblimg1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblimg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, 50));

        lblTeam2.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        lblTeam2.setForeground(new java.awt.Color(255, 255, 255));
        lblTeam2.setText("Team 2");
        getContentPane().add(lblTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        lblTeam1.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        lblTeam1.setForeground(new java.awt.Color(255, 255, 255));
        lblTeam1.setText("Team 1");
        getContentPane().add(lblTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        btnBack.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<2018 FIFA WORLD CUP RUSSIA™");
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreate)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        cmbResult.setBackground(new java.awt.Color(0, 0, 0));
        cmbResult.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        cmbResult.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cmbResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 270, 50));

        lblResult.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblResult.setForeground(new java.awt.Color(255, 255, 255));
        lblResult.setText("Result");
        getContentPane().add(lblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/unnamed-1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void openWindow(Frame beforeWindow) {
      this.beforeWindow=beforeWindow;
      this.setVisible(true);
      controller.fillComboBox();
      if(Lobby.controller.getListResults().size()>0){
          this.actualResult=Lobby.controller.getListResults().get(0);
          controller.fillAllInformation();
      }
    }

    @Override
    public void jumpBeforeWindow() {
        this.dispose();
        this.beforeWindow.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGoalsTeam1;
    private javax.swing.JLabel lblGoalsTeam2;
    private javax.swing.JLabel lblMinutes;
    private javax.swing.JLabel lblNameTeamLoser;
    private javax.swing.JLabel lblNameTeamWinner;
    private javax.swing.JLabel lblPositionBalonT1;
    private javax.swing.JLabel lblPositionBalonT2;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTeam1;
    private javax.swing.JLabel lblTeam2;
    private javax.swing.JLabel lblTeam3;
    private javax.swing.JLabel lblTeam4;
    private javax.swing.JLabel lblTeam5;
    private javax.swing.JLabel lblTeam6;
    private javax.swing.JLabel lblTeamLoser;
    private javax.swing.JLabel lblTeamWinner;
    private javax.swing.JLabel lblTie;
    private javax.swing.JLabel lblTotalCorner;
    private javax.swing.JLabel lblTotalCorner1;
    private javax.swing.JLabel lblTotalFaults;
    private javax.swing.JLabel lblTotalOffsides;
    private javax.swing.JLabel lblTotalRC;
    private javax.swing.JLabel lblTotalYC;
    private javax.swing.JLabel lblimg1;
    private javax.swing.JLabel lblimg2;
    private javax.swing.JLabel lblnameTotalCorner;
    private javax.swing.JLabel lblvs;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

    public JButton getBtnCreate() {
        return btnCreate;
    }

    public void setBtnCreate(JButton btnCreate) {
        this.btnCreate = btnCreate;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    public JComboBox<String> getCmbResult() {
        return cmbResult;
    }

    public void setCmbResult(JComboBox<String> cmbResult) {
        this.cmbResult = cmbResult;
    }

    public Result getActualResult() {
        return actualResult;
    }

    public void setActualResult(Result actualResult) {
        this.actualResult = actualResult;
    }

    public JLabel getLblGoalsTeam1() {
        return lblGoalsTeam1;
    }

    public void setLblGoalsTeam1(JLabel lblGoalsTeam1) {
        this.lblGoalsTeam1 = lblGoalsTeam1;
    }

    public JLabel getLblGoalsTeam2() {
        return lblGoalsTeam2;
    }

    public void setLblGoalsTeam2(JLabel lblGoalsTeam2) {
        this.lblGoalsTeam2 = lblGoalsTeam2;
    }

    public JLabel getLblMinutes() {
        return lblMinutes;
    }

    public void setLblMinutes(JLabel lblMinutes) {
        this.lblMinutes = lblMinutes;
    }

    public JLabel getLblPositionBalonT1() {
        return lblPositionBalonT1;
    }

    public void setLblPositionBalonT1(JLabel lblPositionBalonT1) {
        this.lblPositionBalonT1 = lblPositionBalonT1;
    }

    public JLabel getLblPositionBalonT2() {
        return lblPositionBalonT2;
    }

    public void setLblPositionBalonT2(JLabel lblPositionBalonT2) {
        this.lblPositionBalonT2 = lblPositionBalonT2;
    }

    public JLabel getLblResult() {
        return lblResult;
    }

    public void setLblResult(JLabel lblResult) {
        this.lblResult = lblResult;
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

    public JLabel getLblTeamLoser() {
        return lblTeamLoser;
    }

    public void setLblTeamLoser(JLabel lblTeamLoser) {
        this.lblTeamLoser = lblTeamLoser;
    }

    public JLabel getLblTeamWinner() {
        return lblTeamWinner;
    }

    public void setLblTeamWinner(JLabel lblTeamWinner) {
        this.lblTeamWinner = lblTeamWinner;
    }

 

    public JLabel getLblTotalFaults() {
        return lblTotalFaults;
    }

    public void setLblTotalFaults(JLabel lblTotalFaults) {
        this.lblTotalFaults = lblTotalFaults;
    }

    public JLabel getLblTotalOffsides() {
        return lblTotalOffsides;
    }

    public void setLblTotalOffsides(JLabel lblTotalOffsides) {
        this.lblTotalOffsides = lblTotalOffsides;
    }

    public JLabel getLblTotalRC() {
        return lblTotalRC;
    }

    public void setLblTotalRC(JLabel lblTotalRC) {
        this.lblTotalRC = lblTotalRC;
    }

    public JLabel getLblTotalYC() {
        return lblTotalYC;
    }

    public void setLblTotalYC(JLabel lblTotalYC) {
        this.lblTotalYC = lblTotalYC;
    }

    public JLabel getLblimg1() {
        return lblimg1;
    }

    public void setLblimg1(JLabel lblimg1) {
        this.lblimg1 = lblimg1;
    }

    public JLabel getLblimg2() {
        return lblimg2;
    }

    public void setLblimg2(JLabel lblimg2) {
        this.lblimg2 = lblimg2;
    }

    public JLabel getLblTie() {
        return lblTie;
    }

    public void setLblTie(JLabel lblTie) {
        this.lblTie = lblTie;
    }

    public JLabel getLblNameTeamLoser() {
        return lblNameTeamLoser;
    }

    public void setLblNameTeamLoser(JLabel lblNameTeamLoser) {
        this.lblNameTeamLoser = lblNameTeamLoser;
    }

    public JLabel getLblNameTeamWinner() {
        return lblNameTeamWinner;
    }

    public void setLblNameTeamWinner(JLabel lblNameTeamWinner) {
        this.lblNameTeamWinner = lblNameTeamWinner;
    }

    public ResultController getController() {
        return controller;
    }

    public void setController(ResultController controller) {
        this.controller = controller;
    }

    public JLabel getLblTotalCorner() {
        return lblTotalCorner;
    }

    public void setLblTotalCorner(JLabel lblTotalCorner) {
        this.lblTotalCorner = lblTotalCorner;
    }
    
    
    
}
