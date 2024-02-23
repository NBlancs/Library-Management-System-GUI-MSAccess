/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lmsframes;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class loginFrm extends javax.swing.JFrame {

    /**
     * Creates new form loginFrm
     */
    public loginFrm() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/iconimage.png")).getImage();
        this.setIconImage(icon);
    }

    Connection con;
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginBtn = new rojeru_san.complementos.RSButtonHover();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System by Nblancs");
        setMaximumSize(new java.awt.Dimension(856, 579));
        setMinimumSize(new java.awt.Dimension(856, 579));
        setPreferredSize(new java.awt.Dimension(856, 579));
        setResizable(false);
        getContentPane().setLayout(null);

        usernameField.setBackground(new java.awt.Color(166, 227, 233));
        usernameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameField.setBorder(null);
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField);
        usernameField.setBounds(65, 245, 310, 40);

        passwordField.setBackground(new java.awt.Color(166, 227, 233));
        passwordField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordField.setBorder(null);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField);
        passwordField.setBounds(65, 329, 310, 40);

        loginBtn.setBackground(new java.awt.Color(166, 227, 233));
        loginBtn.setText("LOGIN");
        loginBtn.setColorHover(new java.awt.Color(204, 255, 204));
        loginBtn.setColorText(new java.awt.Color(0, 0, 0));
        loginBtn.setColorTextHover(new java.awt.Color(0, 0, 0));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn);
        loginBtn.setBounds(122, 431, 154, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/bare-Login-Frm.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 840, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
        loginBtnActionPerformed(evt);

    }//GEN-LAST:event_usernameFieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Check if username or password is empty
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password must not be empty", "Message", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try {
            // TODO add your handling code here:
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String path = new File("src/LibaryManangementSystem_db.accdb").getAbsolutePath();
            con = DriverManager.getConnection("jdbc:ucanaccess://" + path);
            pst = con.prepareStatement("SELECT * FROM TBL_accounts WHERE StrComp(Username, ?, 0) = 0 AND StrComp(Password, ?, 0) = 0");
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                mainFrm MainFrm = new mainFrm();
                MainFrm.show();
                dispose();
            } else {
                String message = "Account Does not Exist";
                pst = con.prepareStatement("SELECT * FROM TBL_accounts WHERE Username=?");
                pst.setString(1, username);
                rs = pst.executeQuery();
                if (rs.next()) {
                    message = "Incorrect Password or Username";
                }
                JOptionPane.showMessageDialog(this, message);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(loginFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:       
        loginBtnActionPerformed(evt);
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(loginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private rojeru_san.complementos.RSButtonHover loginBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
