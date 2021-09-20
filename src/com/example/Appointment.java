package com.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Appointment extends javax.swing.JFrame {
    
    List<UserModel> doctors;
    private UserModel user;
    
    public Appointment() {
        initComponents();
        setLocationRelativeTo(null);
        doctors = new ArrayList<>();
        updateDoctorList();
        updatedoctorCombo();
    }
    
    Appointment(UserModel user) {
        this();
        this.user = user;
        tfpatientfName.setText(user.getFullname());
        tfpGender.setText(user.getGender());
        tfpAge.setText(user.getAge());
        tfpContact.setText(user.getContact());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfpatientfName = new javax.swing.JTextField();
        tfpGender = new javax.swing.JTextField();
        tfpAge = new javax.swing.JTextField();
        tfpContact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combodoctorfName = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tfhospital = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfdepartment = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tafproblem = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        asubmitbtn = new javax.swing.JButton();
        bexitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Book Appointment");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 70, 296, 33));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Patient Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 156, 122, 24));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 214, 122, 24));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 268, 122, 24));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Contact");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 314, 122, 24));

        tfpatientfName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfpatientfName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(tfpatientfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 154, 285, -1));

        tfpGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfpGender.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(tfpGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 212, 285, -1));

        tfpAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfpAge.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(tfpAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 266, 285, -1));

        tfpContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfpContact.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(tfpContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 312, 285, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Select Doctor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 368, 122, 24));

        combodoctorfName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combodoctorfNameItemStateChanged(evt);
            }
        });
        getContentPane().add(combodoctorfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 371, 285, 31));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Hospital");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 469, 122, 24));

        tfhospital.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfhospital.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(tfhospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 459, 285, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Department");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 415, 122, 24));

        tfdepartment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfdepartment.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(tfdepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 413, 285, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Problem");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 519, 122, 24));

        tafproblem.setColumns(20);
        tafproblem.setRows(5);
        jScrollPane1.setViewportView(tafproblem);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 507, 285, 75));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Select Date");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 122, 24));
        getContentPane().add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 608, 285, 29));

        jPanel1.setBackground(new java.awt.Color(153, 183, 190));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asubmitbtn.setBackground(new java.awt.Color(153, 183, 190));
        asubmitbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        asubmitbtn.setText("Submit");
        asubmitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asubmitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(asubmitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 690, 90, 40));

        bexitbtn.setBackground(new java.awt.Color(153, 183, 190));
        bexitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logout.png"))); // NOI18N
        bexitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(bexitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asubmitbtnActionPerformed
        // TODO add your handling code here:

        String patientfName = tfpatientfName.getText();
        String pGender = tfpGender.getText();
        String pAge = tfpAge.getText();
        String pContact = tfpContact.getText();
        String doctorfName = combodoctorfName.getSelectedItem().toString();
        String department = tfdepartment.getText();
        String hospital = tfhospital.getText();
        String problem = tafproblem.getText();
        String dusername = getDoctorsUsername();
        String pusername = user.getUsername();
        
        Date getdate = new Date(dateChooser.getDate().getTime());
        
        AppointModel apponit = new AppointModel(
                patientfName,
                pusername,
                pGender,
                pAge,
                pContact,
                doctorfName,
                dusername,
                department,
                hospital,
                problem,
                getdate,
                "pending"
        );
        try {
            String sql = " insert into appoint_table(patientfname,pusername,pgender,page,pcontact,doctorfname,dusername,derpartment,hospital,problem,date,status) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            
            Connection conn = DBConnector.getConnection();
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, apponit.getPatientfName());
            ps.setString(2, apponit.getPusername());
            ps.setString(3, apponit.getpGender());
            ps.setString(4, apponit.getpAge());
            ps.setString(5, apponit.getpContact());
            ps.setString(6, apponit.getDoctorfName());
            ps.setString(7, apponit.getDusername());
            ps.setString(8, apponit.getDepartment());
            ps.setString(9, apponit.getHospital());
            ps.setString(10, apponit.getProblem());
            ps.setDate(11, apponit.getGetdate());
            ps.setString(12, apponit.getStatus());
            ps.execute();
            
            
            
            
           
            
            
            
            System.out.println("Added Success");
            
            dispose();
            new Patient().setVisible(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        

    }//GEN-LAST:event_asubmitbtnActionPerformed

    private void combodoctorfNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combodoctorfNameItemStateChanged
        int selectedIndex = combodoctorfName.getSelectedIndex();
        UserModel doctor = doctors.get(selectedIndex);
        tfdepartment.setText(doctor.getContact());
        tfhospital.setText(doctor.getAddress());
    }//GEN-LAST:event_combodoctorfNameItemStateChanged

    private void bexitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        new Patient().setVisible(true);
    }//GEN-LAST:event_bexitbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asubmitbtn;
    private javax.swing.JButton bexitbtn;
    private javax.swing.JComboBox<String> combodoctorfName;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tafproblem;
    private javax.swing.JTextField tfdepartment;
    private javax.swing.JTextField tfhospital;
    private javax.swing.JTextField tfpAge;
    private javax.swing.JTextField tfpContact;
    private javax.swing.JTextField tfpGender;
    private javax.swing.JTextField tfpatientfName;
    // End of variables declaration//GEN-END:variables

    private void updateDoctorList() {
        String sql = "Select * from login_table where userrole = ? ";
        
        Connection conn;
        try {
            conn = DBConnector.getConnection();
            
        } catch (SQLException ex) {
            Logger.getLogger(AddDoctor.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conn = DBConnector.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "doctor");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String fullname = rs.getString("fullname");
                String name = rs.getString("username");
                String pass = rs.getString("password");
                String gender = rs.getString("gender");
                String age = rs.getString("age");
                String contact = rs.getString("contact");
                String address = rs.getString("address");
                String userrole = rs.getString("userrole");
                
                UserModel doctor = new UserModel(fullname, name, pass, userrole, gender, age, contact, address);
                doctors.add(doctor);

                //update();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    
    private void updatedoctorCombo() {
        
        for (UserModel doctor : doctors) {
            doctor.getFullname();
            combodoctorfName.addItem(doctor.getFullname());
        }
        
    }
    
    private String getDoctorsUsername() {
        int selectedIndex = combodoctorfName.getSelectedIndex();
        UserModel doctor = doctors.get(selectedIndex);
        return doctor.getUsername();
    }
    
    void setUser(UserModel user) {
        this.user = user;
    }
}