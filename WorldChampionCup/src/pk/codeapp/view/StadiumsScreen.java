/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.view;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;
import pk.codeapp.controller.StadiumController;
import pk.codeapp.model.JumpWindows;


/**
 *
 * @author Daniel Amador
 */
public class StadiumsScreen extends javax.swing.JFrame implements JumpWindows{
    
    private StadiumController controller ;
    private Frame beforeWindow;
    /**
     * Creates new form NewJFrame
     */
    
    public StadiumsScreen() {
        initComponents();  
        controller = new StadiumController(this);
        //<editor-fold desc="Set Action Listener in buttons" defaultstate="collapsed">
        btnLeft.addActionListener(controller);
        btnRight.addActionListener(controller);
        btnCreate.addActionListener(controller);
        btnDelete.addActionListener(controller);
        btnShow.addActionListener(controller);
        btnUpdate.addActionListener(controller);
        btnBack.addActionListener(controller);
        //</editor-fold>
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblViewRight = new javax.swing.JLabel();
        lblViewCenter = new javax.swing.JLabel();
        lblViewLeft = new javax.swing.JLabel();
        btnRight = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        icon1 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(250, 250, 240));
        jPanel2.setMaximumSize(new java.awt.Dimension(1337, 720));
        jPanel2.setMinimumSize(new java.awt.Dimension(1337, 720));
        jPanel2.setPreferredSize(new java.awt.Dimension(1337, 720));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblViewRight.setAlignmentY(0.0F);
        jPanel2.add(lblViewRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 225, 350, 350));

        lblViewCenter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(lblViewCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 480, 520));

        lblViewLeft.setAlignmentY(0.0F);
        jPanel2.add(lblViewLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 225, 350, 350));

        btnRight.setBackground(new java.awt.Color(255, 255, 255));
        btnRight.setForeground(new java.awt.Color(255, 255, 255));
        btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/jumpRight.jpg"))); // NOI18N
        btnRight.setBorder(null);
        btnRight.setBorderPainted(false);
        btnRight.setFocusPainted(false);
        btnRight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(btnRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(1266, 345, -1, 60));

        btnLeft.setBackground(new java.awt.Color(255, 255, 255));
        btnLeft.setForeground(new java.awt.Color(255, 255, 255));
        btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/jumpLeft.jpg"))); // NOI18N
        btnLeft.setBorder(null);
        btnLeft.setBorderPainted(false);
        btnLeft.setFocusPainted(false);
        btnLeft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(btnLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 345, 40, 60));

        jPanel1.setBackground(new java.awt.Color(224, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/miniButton.jpg"))); // NOI18N
        btnBack.setText("2018 FIFA WORLD CUP RUSSIA™");
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 460, 29));

        btnShow.setBackground(new java.awt.Color(224, 0, 0));
        btnShow.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("Show");
        btnShow.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnShow.setContentAreaFilled(false);
        btnShow.setFocusCycleRoot(true);
        jPanel1.add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 150, 40));

        btnCreate.setBackground(new java.awt.Color(224, 0, 0));
        btnCreate.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreate.setContentAreaFilled(false);
        btnCreate.setFocusCycleRoot(true);
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateMouseClicked(evt);
            }
        });
        jPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 140, 40));

        btnUpdate.setBackground(new java.awt.Color(224, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setFocusCycleRoot(true);
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 130, 40));
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 110, 90));
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 120, 90));

        btnDelete.setBackground(new java.awt.Color(224, 0, 0));
        btnDelete.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.setContentAreaFilled(false);
        btnDelete.setFocusCycleRoot(true);
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 130, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateMouseClicked

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
            java.util.logging.Logger.getLogger(StadiumsScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StadiumsScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StadiumsScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StadiumsScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StadiumsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblViewCenter;
    public javax.swing.JLabel lblViewLeft;
    public javax.swing.JLabel lblViewRight;
    // End of variables declaration//GEN-END:variables

    /*Methods created when implement the interface*/
    /**
     * Open this window when is called from other window
     *
     * @param beforeWindow
     */
    @Override
    public void openWindow(Frame beforeWindow) {
        this.beforeWindow=beforeWindow;
        this.setVisible(true);
    }

    /**
     * go back, return the before window
     */
    @Override
    public void jumpBeforeWindow() {
        beforeWindow.setVisible(true);
        this.dispose();
       
    }
    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnCreate() {
        return btnCreate;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JButton getBtnLeft() {
        return btnLeft;
    }

    public JButton getBtnRight() {
        return btnRight;
    }

    public JButton getBtnShow() {
        return btnShow;
    }
    //</editor-fold>

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

}
