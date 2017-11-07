/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.view;

import java.awt.Color;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import pk.codeapp.controller.AppController;
import pk.codeapp.model.JumpWindow;
/**
 *
 * @author Jose Pablo Brenes
 */
public class Lobby extends javax.swing.JFrame{


    /**
     * Creates new form Lobby
     */
     final Color colorBackground = new Color(176,15,21);
     static AppController controller = new AppController();
    public Lobby() {
        
        initComponents();
        controller.createDefaultTeams();
        controller.addDefaultPlayers();
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

        btnMenu = new javax.swing.JButton();
        menuToggle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnStadiums = new javax.swing.JButton();
        btnTeams = new javax.swing.JButton();
        btnCalendars = new javax.swing.JButton();
        btnGroups = new javax.swing.JButton();
        btnResults = new javax.swing.JButton();
        btnStatistics = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon("E:\\Segundo Semestre 2017\\POO\\Proyecto#2\\RusiaIsComing\\WorldCup2018\\WorldCup2018\\WorldChampionCup\\src\\pk\\codeapp\\view\\image\\menu.png")); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        menuToggle.setBackground(new java.awt.Color(2, 120, 181));
        menuToggle.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");

        btnStadiums.setBackground(new java.awt.Color(176, 15, 21));
        btnStadiums.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnStadiums.setForeground(new java.awt.Color(255, 255, 255));
        btnStadiums.setText("Stadiums");
        btnStadiums.setBorder(new javax.swing.border.MatteBorder(null));
        btnStadiums.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStadiumsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStadiumsMouseExited(evt);
            }
        });

        btnTeams.setBackground(new java.awt.Color(176, 15, 21));
        btnTeams.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnTeams.setForeground(new java.awt.Color(255, 255, 255));
        btnTeams.setText("Teams");
        btnTeams.setBorder(new javax.swing.border.MatteBorder(null));
        btnTeams.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTeamsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTeamsMouseExited(evt);
            }
        });
        btnTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeamsActionPerformed(evt);
            }
        });

        btnCalendars.setBackground(new java.awt.Color(176, 15, 21));
        btnCalendars.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnCalendars.setForeground(new java.awt.Color(255, 255, 255));
        btnCalendars.setText("Calendars");
        btnCalendars.setBorder(new javax.swing.border.MatteBorder(null));
        btnCalendars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalendarsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalendarsMouseExited(evt);
            }
        });

        btnGroups.setBackground(new java.awt.Color(176, 15, 21));
        btnGroups.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnGroups.setForeground(new java.awt.Color(255, 255, 255));
        btnGroups.setText("Groups");
        btnGroups.setBorder(new javax.swing.border.MatteBorder(null));
        btnGroups.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGroupsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGroupsMouseExited(evt);
            }
        });

        btnResults.setBackground(new java.awt.Color(176, 15, 21));
        btnResults.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnResults.setForeground(new java.awt.Color(255, 255, 255));
        btnResults.setText("Results");
        btnResults.setBorder(new javax.swing.border.MatteBorder(null));
        btnResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResultsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResultsMouseExited(evt);
            }
        });

        btnStatistics.setBackground(new java.awt.Color(176, 15, 21));
        btnStatistics.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnStatistics.setForeground(new java.awt.Color(255, 255, 255));
        btnStatistics.setText("Statistics");
        btnStatistics.setBorder(new javax.swing.border.MatteBorder(null));
        btnStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStatisticsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStatisticsMouseExited(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout menuToggleLayout = new javax.swing.GroupLayout(menuToggle);
        menuToggle.setLayout(menuToggleLayout);
        menuToggleLayout.setHorizontalGroup(
            menuToggleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuToggleLayout.createSequentialGroup()
                .addGroup(menuToggleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStadiums, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalendars, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGroups, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResults, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 70, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(menuToggleLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuToggleLayout.setVerticalGroup(
            menuToggleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuToggleLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnStadiums, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnCalendars, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnGroups, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnResults, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(menuToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-410, 0, 410, 720));

        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1833, 6, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Segundo Semestre 2017\\POO\\Proyecto#2\\RusiaIsComing\\WorldCup2018\\WorldCup2018\\WorldChampionCup\\src\\pk\\codeapp\\view\\image\\main.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
           move();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnStadiumsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStadiumsMouseEntered
        btnStadiums.setBackground(Color.black);
    }//GEN-LAST:event_btnStadiumsMouseEntered

    private void btnStadiumsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStadiumsMouseExited

       btnStadiums.setBackground(colorBackground);
    }//GEN-LAST:event_btnStadiumsMouseExited

    private void btnTeamsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTeamsMouseEntered
        btnTeams.setBackground(Color.black);
    }//GEN-LAST:event_btnTeamsMouseEntered

    private void btnTeamsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTeamsMouseExited

         btnTeams.setBackground(colorBackground);
    }//GEN-LAST:event_btnTeamsMouseExited

    private void btnCalendarsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalendarsMouseExited

        btnCalendars.setBackground(colorBackground);
    }//GEN-LAST:event_btnCalendarsMouseExited

    private void btnGroupsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGroupsMouseEntered
        btnGroups.setBackground(Color.black);
    }//GEN-LAST:event_btnGroupsMouseEntered

    private void btnGroupsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGroupsMouseExited

        btnGroups.setBackground(colorBackground);
    }//GEN-LAST:event_btnGroupsMouseExited

    private void btnResultsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultsMouseEntered
        btnResults.setBackground(Color.black);
    }//GEN-LAST:event_btnResultsMouseEntered

    private void btnResultsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultsMouseExited

        btnResults.setBackground(colorBackground);
    }//GEN-LAST:event_btnResultsMouseExited

    private void btnStatisticsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatisticsMouseEntered
        btnStatistics.setBackground(Color.black);
    }//GEN-LAST:event_btnStatisticsMouseEntered

    private void btnStatisticsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatisticsMouseExited
        btnStatistics.setBackground(colorBackground);
    }//GEN-LAST:event_btnStatisticsMouseExited

    private void btnCalendarsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalendarsMouseEntered
        btnCalendars.setBackground(Color.black);
    }//GEN-LAST:event_btnCalendarsMouseEntered

    private void btnTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeamsActionPerformed
        MenuTeams menuTeams = new MenuTeams();
        this.setVisible(false);
        menuTeams.openWindow(this);
    }//GEN-LAST:event_btnTeamsActionPerformed

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
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalendars;
    private javax.swing.JButton btnGroups;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnResults;
    private javax.swing.JButton btnStadiums;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JButton btnTeams;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menuToggle;
    // End of variables declaration//GEN-END:variables
public synchronized void move() {
        if(menuToggle.getX()<0){
            menuToggle.setLocation(0,0);

        }
        else{
            menuToggle.setLocation(-410,0);


        }
    }
}
