/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.view;

import java.awt.Frame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import pk.codeapp.controller.CalendarController;
import pk.codeapp.model.Calendar;
import pk.codeapp.model.JumpWindow;

/**
 *
 * @author Jose Pablo Brenes
 */
public class CalendarScreen extends javax.swing.JFrame implements JumpWindow{

    /**
     * Creates new form CalendarScreen
     */
    private Lobby lobby;
    public CalendarController controller;
    private DefaultListModel<String> dates = new DefaultListModel();
    private Calendar actualCalendar;
    public CalendarScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        controller = new CalendarController(this);
        btnCreate.addActionListener(controller);
        btnDelete.addActionListener(controller);
        btnUpdate.addActionListener(controller);
        cmbCalendar.addActionListener(controller);
        btnBack.addActionListener(controller);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbCalendar = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblImageStadium = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblNameStadium = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTeam1 = new javax.swing.JLabel();
        lblvs = new javax.swing.JLabel();
        lblTeam2 = new javax.swing.JLabel();
        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCalendar.setBackground(new java.awt.Color(0, 0, 0));
        cmbCalendar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbCalendar.setForeground(new java.awt.Color(255, 255, 255));
        cmbCalendar.setMaximumRowCount(30);
        cmbCalendar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        getContentPane().add(cmbCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 330, 50));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Calendar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jPanel5.setBackground(new java.awt.Color(98, 153, 70));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImageStadium, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImageStadium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 510, 390));

        jPanel4.setBackground(new java.awt.Color(205, 31, 40));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        lblNameStadium.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblNameStadium.setForeground(new java.awt.Color(255, 255, 255));
        lblNameStadium.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameStadium.setText("Stadium");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameStadium, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(lblNameStadium))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 320, 40));

        jPanel3.setBackground(new java.awt.Color(205, 31, 40));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        lblDate.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("Date");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(lblDate))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 320, 40));

        jPanel2.setBackground(new java.awt.Color(98, 153, 70));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        lblTeam1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTeam1.setForeground(new java.awt.Color(255, 255, 255));
        lblTeam1.setText("Team1");

        lblvs.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblvs.setForeground(new java.awt.Color(255, 255, 255));
        lblvs.setText("vs");

        lblTeam2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblTeam2.setForeground(new java.awt.Color(255, 255, 255));
        lblTeam2.setText("Team2");

        lblImg1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblImg1.setForeground(new java.awt.Color(255, 255, 255));
        lblImg1.setText("img1");

        lblImg2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblImg2.setForeground(new java.awt.Color(255, 255, 255));
        lblImg2.setText("img2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImg1)
                    .addComponent(lblTeam1))
                .addGap(62, 62, 62)
                .addComponent(lblvs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg2)
                    .addComponent(lblTeam2))
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblvs)
                    .addComponent(lblTeam2)
                    .addComponent(lblTeam1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImg1)
                    .addComponent(lblImg2))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 460, 240));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

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

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/ticket.jpg"))); // NOI18N
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
            java.util.logging.Logger.getLogger(CalendarScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblImageStadium;
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JLabel lblNameStadium;
    private javax.swing.JLabel lblTeam1;
    private javax.swing.JLabel lblTeam2;
    private javax.swing.JLabel lblvs;
    // End of variables declaration//GEN-END:variables

    @Override
    public void openWindow(Frame beforeWindow) {
      lobby = (Lobby) beforeWindow;
      this.setVisible(true);
      controller.fillData();
    }

    @Override
    public void jumpBeforeWindow() {
       this.dispose();
       lobby.setVisible(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Get_Set">          
    public JLabel getLblDate() {
        return lblDate;
    }

    public void setLblDate(JLabel lblDate) {
        this.lblDate = lblDate;
    }

    public JLabel getLblImageStadium() {
        return lblImageStadium;
    }

    public void setLblImageStadium(JLabel lblImageStadium) {
        this.lblImageStadium = lblImageStadium;
    }

    public JLabel getLblImg1() {
        return lblImg1;
    }

    public void setLblImg1(JLabel lblImg1) {
        this.lblImg1 = lblImg1;
    }

    public JLabel getLblImg2() {
        return lblImg2;
    }

    public void setLblImg2(JLabel lblImg2) {
        this.lblImg2 = lblImg2;
    }

    public JLabel getLblNameStadium() {
        return lblNameStadium;
    }

    public void setLblNameStadium(JLabel lblNameStadium) {
        this.lblNameStadium = lblNameStadium;
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

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

    public JComboBox<String> getCmbCalendar() {
        return cmbCalendar;
    }

    public void setCmbCalendar(JComboBox<String> cmbCalendar) {
        this.cmbCalendar = cmbCalendar;
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

    public Calendar getActualCalendar() {
        return actualCalendar;
    }

    public void setActualCalendar(Calendar actualCalendar) {
        this.actualCalendar = actualCalendar;
    }
    //</editor-fold>
}
