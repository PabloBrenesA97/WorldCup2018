/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.view;

import java.awt.Frame;
import pk.codeapp.controller.GroupController;
import pk.codeapp.model.JumpWindow;
/**
 *
 * @author Daniel Amador
 */
public class GroupScreen extends javax.swing.JFrame implements JumpWindow{
    private Lobby beforeWindow;
    public static  GroupController gController;
    /**
     * Creates new form GroupScreen
     */
    public GroupScreen() {
        initComponents();
         this.setLocationRelativeTo(null);
        gController= new GroupController(this);
        addAtionPerformat();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneGroup1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnEditA = new javax.swing.JButton();
        lblA1 = new javax.swing.JLabel();
        lblA2 = new javax.swing.JLabel();
        lblA3 = new javax.swing.JLabel();
        lblA4 = new javax.swing.JLabel();
        nameA4 = new javax.swing.JLabel();
        nameA1 = new javax.swing.JLabel();
        nameA2 = new javax.swing.JLabel();
        nameA3 = new javax.swing.JLabel();
        paneGroup2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnEditB = new javax.swing.JButton();
        lblB1 = new javax.swing.JLabel();
        nameB1 = new javax.swing.JLabel();
        lblB2 = new javax.swing.JLabel();
        nameB2 = new javax.swing.JLabel();
        lblB3 = new javax.swing.JLabel();
        nameB3 = new javax.swing.JLabel();
        lblB4 = new javax.swing.JLabel();
        nameB4 = new javax.swing.JLabel();
        paneGroup3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnEditC = new javax.swing.JButton();
        lblC1 = new javax.swing.JLabel();
        nameC1 = new javax.swing.JLabel();
        lblC2 = new javax.swing.JLabel();
        nameC2 = new javax.swing.JLabel();
        lblC3 = new javax.swing.JLabel();
        nameC3 = new javax.swing.JLabel();
        lblC4 = new javax.swing.JLabel();
        nameC4 = new javax.swing.JLabel();
        paneGroup4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnEditD = new javax.swing.JButton();
        lblD1 = new javax.swing.JLabel();
        nameD1 = new javax.swing.JLabel();
        lblD2 = new javax.swing.JLabel();
        nameD2 = new javax.swing.JLabel();
        lblD3 = new javax.swing.JLabel();
        nameD3 = new javax.swing.JLabel();
        lblD4 = new javax.swing.JLabel();
        nameD4 = new javax.swing.JLabel();
        paneGroup5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnEditE = new javax.swing.JButton();
        lblE1 = new javax.swing.JLabel();
        nameE1 = new javax.swing.JLabel();
        lblE2 = new javax.swing.JLabel();
        nameE2 = new javax.swing.JLabel();
        lblE3 = new javax.swing.JLabel();
        nameE3 = new javax.swing.JLabel();
        lblE4 = new javax.swing.JLabel();
        nameE4 = new javax.swing.JLabel();
        paneGroup6 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnEditG = new javax.swing.JButton();
        lblG1 = new javax.swing.JLabel();
        nameG1 = new javax.swing.JLabel();
        lblG2 = new javax.swing.JLabel();
        nameG2 = new javax.swing.JLabel();
        lblG3 = new javax.swing.JLabel();
        nameG3 = new javax.swing.JLabel();
        lblG4 = new javax.swing.JLabel();
        nameG4 = new javax.swing.JLabel();
        paneGroup8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnEditH = new javax.swing.JButton();
        lblH1 = new javax.swing.JLabel();
        nameH1 = new javax.swing.JLabel();
        lblH2 = new javax.swing.JLabel();
        nameH2 = new javax.swing.JLabel();
        lblH3 = new javax.swing.JLabel();
        nameH3 = new javax.swing.JLabel();
        lblH4 = new javax.swing.JLabel();
        nameH4 = new javax.swing.JLabel();
        paneGroup7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnEditF = new javax.swing.JButton();
        lblF1 = new javax.swing.JLabel();
        nameF1 = new javax.swing.JLabel();
        lblF2 = new javax.swing.JLabel();
        nameF2 = new javax.swing.JLabel();
        lblF3 = new javax.swing.JLabel();
        nameF3 = new javax.swing.JLabel();
        lblF4 = new javax.swing.JLabel();
        nameF4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneGroup1.setBackground(new java.awt.Color(250, 250, 240));
        paneGroup1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(51, 153, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Group A");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        btnEditA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/iconEdit.png"))); // NOI18N
        btnEditA.setEnabled(false);
        jPanel9.add(btnEditA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 60, 40));

        paneGroup1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblA1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup1.add(lblA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 42, 28));

        lblA2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup1.add(lblA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 42, 28));

        lblA3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup1.add(lblA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 42, 28));

        lblA4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup1.add(lblA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 42, 28));

        nameA4.setText("Name Team");
        paneGroup1.add(nameA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 225, -1, -1));

        nameA1.setText("Name Team");
        paneGroup1.add(nameA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 65, -1, -1));

        nameA2.setText("Name Team");
        paneGroup1.add(nameA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 125, -1, -1));

        nameA3.setText("Name Team");
        paneGroup1.add(nameA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 175, -1, -1));

        getContentPane().add(paneGroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 250, 300));

        paneGroup2.setBackground(new java.awt.Color(250, 250, 240));
        paneGroup2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(51, 153, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Group B");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        btnEditB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/iconEdit.png"))); // NOI18N
        btnEditB.setEnabled(false);
        jPanel10.add(btnEditB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 60, 40));

        paneGroup2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup2.add(lblB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 42, 28));

        nameB1.setText("Name Team");
        paneGroup2.add(nameB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 65, -1, -1));

        lblB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup2.add(lblB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 42, 28));

        nameB2.setText("Name Team");
        paneGroup2.add(nameB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 125, -1, -1));

        lblB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup2.add(lblB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 42, 28));

        nameB3.setText("Name Team");
        paneGroup2.add(nameB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 175, -1, -1));

        lblB4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup2.add(lblB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 42, 28));

        nameB4.setText("Name Team");
        paneGroup2.add(nameB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 225, -1, -1));

        getContentPane().add(paneGroup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 250, 300));

        paneGroup3.setBackground(new java.awt.Color(250, 250, 240));
        paneGroup3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(51, 153, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Group C");
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        btnEditC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/iconEdit.png"))); // NOI18N
        btnEditC.setEnabled(false);
        jPanel11.add(btnEditC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 60, 40));

        paneGroup3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup3.add(lblC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 42, 28));

        nameC1.setText("Name Team");
        paneGroup3.add(nameC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 65, -1, -1));

        lblC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup3.add(lblC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 42, 28));

        nameC2.setText("Name Team");
        paneGroup3.add(nameC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 125, -1, -1));

        lblC3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup3.add(lblC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 42, 28));

        nameC3.setText("Name Team");
        paneGroup3.add(nameC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 175, -1, -1));

        lblC4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup3.add(lblC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 42, 28));

        nameC4.setText("Name Team");
        paneGroup3.add(nameC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 225, -1, -1));

        getContentPane().add(paneGroup3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 250, 300));

        paneGroup4.setBackground(new java.awt.Color(250, 250, 240));
        paneGroup4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(51, 153, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Group D");
        jPanel12.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        btnEditD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/iconEdit.png"))); // NOI18N
        btnEditD.setEnabled(false);
        jPanel12.add(btnEditD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 60, 40));

        paneGroup4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup4.add(lblD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 42, 28));

        nameD1.setText("Name Team");
        paneGroup4.add(nameD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 65, -1, -1));

        lblD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup4.add(lblD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 42, 28));

        nameD2.setText("Name Team");
        paneGroup4.add(nameD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 125, -1, -1));

        lblD3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup4.add(lblD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 42, 28));

        nameD3.setText("Name Team");
        paneGroup4.add(nameD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 175, -1, -1));

        lblD4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup4.add(lblD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 42, 28));

        nameD4.setText("Name Team");
        paneGroup4.add(nameD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 225, -1, -1));

        getContentPane().add(paneGroup4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 250, 300));

        paneGroup5.setBackground(new java.awt.Color(250, 250, 240));
        paneGroup5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(51, 153, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Group E");
        jPanel13.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        btnEditE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/iconEdit.png"))); // NOI18N
        btnEditE.setEnabled(false);
        jPanel13.add(btnEditE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 60, 40));

        paneGroup5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblE1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup5.add(lblE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 42, 28));

        nameE1.setText("Name Team");
        paneGroup5.add(nameE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 65, -1, -1));

        lblE2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup5.add(lblE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 42, 28));

        nameE2.setText("Name Team");
        paneGroup5.add(nameE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 125, -1, -1));

        lblE3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup5.add(lblE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 42, 28));

        nameE3.setText("Name Team");
        paneGroup5.add(nameE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 175, -1, -1));

        lblE4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup5.add(lblE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 42, 28));

        nameE4.setText("Name Team");
        paneGroup5.add(nameE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 225, -1, -1));

        getContentPane().add(paneGroup5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 250, 300));

        paneGroup6.setBackground(new java.awt.Color(250, 250, 240));
        paneGroup6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(51, 153, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Group G");
        jPanel15.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        btnEditG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/iconEdit.png"))); // NOI18N
        btnEditG.setEnabled(false);
        jPanel15.add(btnEditG, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 60, 40));

        paneGroup6.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblG1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup6.add(lblG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 42, 28));

        nameG1.setText("Name Team");
        paneGroup6.add(nameG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 65, -1, -1));

        lblG2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup6.add(lblG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 42, 28));

        nameG2.setText("Name Team");
        paneGroup6.add(nameG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 125, -1, -1));

        lblG3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup6.add(lblG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 42, 28));

        nameG3.setText("Name Team");
        paneGroup6.add(nameG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 175, -1, -1));

        lblG4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup6.add(lblG4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 42, 28));

        nameG4.setText("Name Team");
        paneGroup6.add(nameG4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 225, -1, -1));

        getContentPane().add(paneGroup6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 250, 300));

        paneGroup8.setBackground(new java.awt.Color(250, 250, 240));
        paneGroup8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(51, 153, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Group H");
        jPanel16.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        btnEditH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/iconEdit.png"))); // NOI18N
        btnEditH.setEnabled(false);
        jPanel16.add(btnEditH, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 60, 40));

        paneGroup8.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblH1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup8.add(lblH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 42, 28));

        nameH1.setText("Name Team");
        paneGroup8.add(nameH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 65, -1, -1));

        lblH2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup8.add(lblH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 42, 28));

        nameH2.setText("Name Team");
        paneGroup8.add(nameH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 125, -1, -1));

        lblH3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup8.add(lblH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 42, 28));

        nameH3.setText("Name Team");
        paneGroup8.add(nameH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 175, -1, -1));

        lblH4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup8.add(lblH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 42, 28));

        nameH4.setText("Name Team");
        paneGroup8.add(nameH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 225, -1, -1));

        getContentPane().add(paneGroup8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 400, 250, 300));

        paneGroup7.setBackground(new java.awt.Color(250, 250, 240));
        paneGroup7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(51, 153, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Group F");
        jPanel14.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        btnEditF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/view/image/iconEdit.png"))); // NOI18N
        btnEditF.setEnabled(false);
        jPanel14.add(btnEditF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 60, 40));

        paneGroup7.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup7.add(lblF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 42, 28));

        nameF1.setText("Name Team");
        paneGroup7.add(nameF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 65, -1, -1));

        lblF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup7.add(lblF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 42, 28));

        nameF2.setText("Name Team");
        paneGroup7.add(nameF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 125, -1, -1));

        lblF3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup7.add(lblF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 42, 28));

        nameF3.setText("Name Team");
        paneGroup7.add(nameF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 175, -1, -1));

        lblF4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paneGroup7.add(lblF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 42, 28));

        nameF4.setText("Name Team");
        paneGroup7.add(nameF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 225, -1, -1));

        getContentPane().add(paneGroup7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 250, 300));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        jLabel1.setBackground(new java.awt.Color(250, 250, 240));
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
            java.util.logging.Logger.getLogger(GroupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBack;
    public javax.swing.JButton btnEditA;
    public javax.swing.JButton btnEditB;
    public javax.swing.JButton btnEditC;
    public javax.swing.JButton btnEditD;
    public javax.swing.JButton btnEditE;
    public javax.swing.JButton btnEditF;
    public javax.swing.JButton btnEditG;
    public javax.swing.JButton btnEditH;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JLabel lblA1;
    public javax.swing.JLabel lblA2;
    public javax.swing.JLabel lblA3;
    public javax.swing.JLabel lblA4;
    public javax.swing.JLabel lblB1;
    public javax.swing.JLabel lblB2;
    public javax.swing.JLabel lblB3;
    public javax.swing.JLabel lblB4;
    public javax.swing.JLabel lblC1;
    public javax.swing.JLabel lblC2;
    public javax.swing.JLabel lblC3;
    public javax.swing.JLabel lblC4;
    public javax.swing.JLabel lblD1;
    public javax.swing.JLabel lblD2;
    public javax.swing.JLabel lblD3;
    public javax.swing.JLabel lblD4;
    public javax.swing.JLabel lblE1;
    public javax.swing.JLabel lblE2;
    public javax.swing.JLabel lblE3;
    public javax.swing.JLabel lblE4;
    public javax.swing.JLabel lblF1;
    public javax.swing.JLabel lblF2;
    public javax.swing.JLabel lblF3;
    public javax.swing.JLabel lblF4;
    public javax.swing.JLabel lblG1;
    public javax.swing.JLabel lblG2;
    public javax.swing.JLabel lblG3;
    public javax.swing.JLabel lblG4;
    public javax.swing.JLabel lblH1;
    public javax.swing.JLabel lblH2;
    public javax.swing.JLabel lblH3;
    public javax.swing.JLabel lblH4;
    public javax.swing.JLabel nameA1;
    public javax.swing.JLabel nameA2;
    public javax.swing.JLabel nameA3;
    public javax.swing.JLabel nameA4;
    public javax.swing.JLabel nameB1;
    public javax.swing.JLabel nameB2;
    public javax.swing.JLabel nameB3;
    public javax.swing.JLabel nameB4;
    public javax.swing.JLabel nameC1;
    public javax.swing.JLabel nameC2;
    public javax.swing.JLabel nameC3;
    public javax.swing.JLabel nameC4;
    public javax.swing.JLabel nameD1;
    public javax.swing.JLabel nameD2;
    public javax.swing.JLabel nameD3;
    public javax.swing.JLabel nameD4;
    public javax.swing.JLabel nameE1;
    public javax.swing.JLabel nameE2;
    public javax.swing.JLabel nameE3;
    public javax.swing.JLabel nameE4;
    public javax.swing.JLabel nameF1;
    public javax.swing.JLabel nameF2;
    public javax.swing.JLabel nameF3;
    public javax.swing.JLabel nameF4;
    public javax.swing.JLabel nameG1;
    public javax.swing.JLabel nameG2;
    public javax.swing.JLabel nameG3;
    public javax.swing.JLabel nameG4;
    public javax.swing.JLabel nameH1;
    public javax.swing.JLabel nameH2;
    public javax.swing.JLabel nameH3;
    public javax.swing.JLabel nameH4;
    private javax.swing.JPanel paneGroup1;
    private javax.swing.JPanel paneGroup2;
    private javax.swing.JPanel paneGroup3;
    private javax.swing.JPanel paneGroup4;
    private javax.swing.JPanel paneGroup5;
    private javax.swing.JPanel paneGroup6;
    private javax.swing.JPanel paneGroup7;
    private javax.swing.JPanel paneGroup8;
    // End of variables declaration//GEN-END:variables

    @Override
    public void openWindow(Frame beforeWindow) {
        this.beforeWindow = (Lobby) beforeWindow;
        this.setVisible(true);
    }
    

    @Override
    public void jumpBeforeWindow() {
        this.dispose();
        beforeWindow.setVisible(true);
    }
    public void addAtionPerformat(){
        btnBack.addActionListener(gController);
        btnEditA.addActionListener(gController);
        btnEditB.addActionListener(gController);
        btnEditC.addActionListener(gController);
        btnEditD.addActionListener(gController);
        btnEditE.addActionListener(gController);
        btnEditF.addActionListener(gController);
        btnEditG.addActionListener(gController);
        btnEditH.addActionListener(gController);
    }
}
