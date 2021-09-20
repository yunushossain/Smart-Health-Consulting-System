/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author munazir
 */
public class Reg extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Reg() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfContact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfFullname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Submitbtn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setMinimumSize(new java.awt.Dimension(700, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gender");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));
        getContentPane().add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 320, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Age");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 70, -1));
        getContentPane().add(tfAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 320, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Contact");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));
        getContentPane().add(tfContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 320, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, -1, -1));
        getContentPane().add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 570, 320, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Patient Registration");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 360, -1));
        getContentPane().add(tfFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 320, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Patient name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));
        getContentPane().add(tfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 320, 30));

        buttonGroup1.add(rbMale);
        rbMale.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });
        getContentPane().add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 110, -1));

        buttonGroup1.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rbFemale.setText("Female");
        getContentPane().add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 150, -1));

        jPanel2.setBackground(new java.awt.Color(190, 235, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/picon2.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 110, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 100));

        jPanel1.setBackground(new java.awt.Color(153, 185, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Submitbtn1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Submitbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/save.png"))); // NOI18N
        Submitbtn1.setText("Submit");
        Submitbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submitbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(Submitbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 183, 190));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logout.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 573, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 700, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void Submitbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submitbtn1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_Submitbtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submitbtn1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfContact;
    private javax.swing.JTextField tfFullname;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPass;
    // End of variables declaration//GEN-END:variables

    private boolean validated(UserModel user) {
        boolean isValid = true;
        String msg = "";

        if (!user.getFullname().matches("[a-zA-Z0-9\\s]+")) {
            isValid = false;
            msg += "Full Name Not valid\n";

        }

        if (!user.getUsername().matches("[a-zA-Z]+")) {
            isValid = false;
            msg += "User Name Not valid\n";

        }
        if (!user.getPassword().matches("[0-9]+")) {
            isValid = false;
            msg += "Pass Word Not valid\n";

        }

        if (!user.getGender().matches("[a-zA-Z]+")) {
            isValid = false;
            msg += "Gender Not valid\n";

        }
        if (!user.getAge().matches("[0-9]+")) {
            isValid = false;
            msg += "Age Not valid\n";

        }
        if (!user.getContact().matches("[0-9]+")) {
            isValid = false;
            msg += "Age Not valid\n";

        }
        if (!user.getAddress().matches("[a-zA-Z0-9]+")) {
            isValid = false;
            msg += "Age Not valid\n";

        }

        if (!isValid) {
            JOptionPane.showMessageDialog(null, msg);
        }

        return isValid;
    }
}
