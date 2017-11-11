/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.view;

import java.awt.Frame;
import pk.codeapp.controller.ShowPlayerInfoController;
import pk.codeapp.model.JumpWindow;

/**
 *
 * @author Daniel Amador
 */
public class ShowPlayerInfo extends javax.swing.JFrame implements JumpWindow {

    private StatisticsScreen beforeWindow;
    private ShowPlayerInfoController controller;
    /**
     * Creates new form ShowPlayerInfo
     */
    public ShowPlayerInfo() {
        initComponents();
        controller= new ShowPlayerInfoController(this);
        addActionLister();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnBack1 = new javax.swing.JButton();
        cmbTeams = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGoals = new javax.swing.JLabel();
        lblYellowCards = new javax.swing.JLabel();
        lblRedCards = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        lblId2 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblPosition1 = new javax.swing.JLabel();
        lblAge1 = new javax.swing.JLabel();
        lblYellowCards1 = new javax.swing.JLabel();
        lblRedCards1 = new javax.swing.JLabel();
        lblNumber1 = new javax.swing.JLabel();
        lblGoals1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));

        btnBack1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setText("<2018 FIFA WORLD CUP RUSSIA™");
        btnBack1.setBorderPainted(false);
        btnBack1.setContentAreaFilled(false);
        btnBack1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        cmbTeams.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jPanel1.add(cmbTeams, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 40));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel1.setText("Select a Team");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Oldest player");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jRadioButton2.setText("Youngest player");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, 30));

        lblId.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblId.setForeground(new java.awt.Color(0, 102, 102));
        lblId.setText("ID: ");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        lblName.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 102, 102));
        lblName.setText("Name: ");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        lblPosition.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblPosition.setForeground(new java.awt.Color(0, 102, 102));
        lblPosition.setText("Position:");
        jPanel1.add(lblPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        lblAge.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblAge.setForeground(new java.awt.Color(0, 102, 102));
        lblAge.setText("Age:");
        jPanel1.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        lblGoals.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblGoals.setForeground(new java.awt.Color(0, 102, 102));
        lblGoals.setText("Goals:");
        jPanel1.add(lblGoals, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, 40));

        lblYellowCards.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblYellowCards.setForeground(new java.awt.Color(0, 102, 102));
        lblYellowCards.setText("#");
        jPanel1.add(lblYellowCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        lblRedCards.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblRedCards.setForeground(new java.awt.Color(0, 102, 102));
        lblRedCards.setText("#");
        jPanel1.add(lblRedCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, 40));

        lblNumber.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(0, 102, 102));
        lblNumber.setText("Number:");
        jPanel1.add(lblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, -1, 50));

        lblId2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblId2.setText("ID: ");
        jPanel1.add(lblId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        lblName1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblName1.setText("Name: ");
        jPanel1.add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        lblPosition1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblPosition1.setText("Position:");
        jPanel1.add(lblPosition1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        lblAge1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblAge1.setText("Age:");
        jPanel1.add(lblAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        lblYellowCards1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblYellowCards1.setText("Quantity of Yellow Cards:");
        jPanel1.add(lblYellowCards1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        lblRedCards1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblRedCards1.setText("Quantity of Red Cards:");
        jPanel1.add(lblRedCards1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 40));

        lblNumber1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblNumber1.setText("Number:");
        jPanel1.add(lblNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 50));

        lblGoals1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblGoals1.setText("Goals:");
        jPanel1.add(lblGoals1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 800, 600));

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
            java.util.logging.Logger.getLogger(ShowPlayerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowPlayerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowPlayerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowPlayerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowPlayerInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBack1;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cmbTeams;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JRadioButton jRadioButton2;
    public javax.swing.JLabel lblAge;
    public javax.swing.JLabel lblAge1;
    public javax.swing.JLabel lblGoals;
    public javax.swing.JLabel lblGoals1;
    public javax.swing.JLabel lblId;
    public javax.swing.JLabel lblId2;
    public javax.swing.JLabel lblName;
    public javax.swing.JLabel lblName1;
    public javax.swing.JLabel lblNumber;
    public javax.swing.JLabel lblNumber1;
    public javax.swing.JLabel lblPosition;
    public javax.swing.JLabel lblPosition1;
    public javax.swing.JLabel lblRedCards;
    public javax.swing.JLabel lblRedCards1;
    public javax.swing.JLabel lblYellowCards;
    public javax.swing.JLabel lblYellowCards1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void openWindow(Frame beforeWindow) {
        this.beforeWindow = (StatisticsScreen) beforeWindow;
        this.setVisible(true);
    }

    @Override
    public void jumpBeforeWindow() {
        beforeWindow.setEnabled(true);
        this.dispose();
        
    }

    private void addActionLister() {
       btnBack1.addActionListener(controller);
       jRadioButton1.addActionListener(controller);
       jRadioButton2.addActionListener(controller);
       cmbTeams.addActionListener(controller);
       
    }

}