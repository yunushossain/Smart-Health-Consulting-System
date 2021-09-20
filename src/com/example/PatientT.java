/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author munazir
 */
public class PatientT extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public PatientT() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        Pdeletebtn = new javax.swing.JButton();
        Pexit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patinent Name", "Username", "Password", "Gender", "Age", "Contact", "Address"
            }
        ));
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 795, 265));

        Pdeletebtn.setBackground(new java.awt.Color(153, 183, 190));
        Pdeletebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pdeletebtn.setText("View List");
        Pdeletebtn.setActionCommand("");
        Pdeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PdeletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Pdeletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 119, -1));

        Pexit.setBackground(new java.awt.Color(153, 183, 190));
        Pexit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logout.png"))); // NOI18N
        Pexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PexitActionPerformed(evt);
            }
        });
        getContentPane().add(Pexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 183, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(190, 235, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registration Patients");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 306, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 790, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        // TODO add your handling code here:

        //int selectedRow = dataTable.getSelectedRow();
        // dataTable.getValueAt(selectedRow, 0);
     

    }//GEN-LAST:event_dataTableMouseClicked

    private void PdeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PdeletebtnActionPerformed
        // TODO add your handling code here:
        
        
        loadTable();

    
    }//GEN-LAST:event_PdeletebtnActionPerformed

    private void PexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PexitActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new Admin().setVisible(true);
    }//GEN-LAST:event_PexitActionPerformed

           // pst.setString(3, buttonGroup1.getSelection().getActionCommand());
           
         // pst.setString(3, "male");

            


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
            java.util.logging.Logger.getLogger(PatientT.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientT.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientT.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientT.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pdeletebtn;
    private javax.swing.JButton Pexit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
    

   
    private void loadTable() {
        String sql = "Select * from login_table where userrole = ? ";
        DefaultTableModel dm = (DefaultTableModel) dataTable.getModel();
        Connection conn;
        try {
            conn = DBConnector.getConnection();

        } catch (SQLException ex) {
            Logger.getLogger(PatientT.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
       

        int rowCount = dataTable.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            dm.removeRow(0);
        }

        try {
            conn = DBConnector.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "patient");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String fullname = rs.getString("fullname");
                String name = rs.getString("username");
                String pass = rs.getString("password");
                String gender = rs.getString("gender");
                String age = rs.getString("age");
                String contact = rs.getString("contact");
                String address = rs.getString("address");

                dm.addRow(new Object[]{fullname, name, pass, gender, age, contact, address});
                //update();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

}