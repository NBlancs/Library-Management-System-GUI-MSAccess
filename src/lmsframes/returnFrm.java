/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lmsframes;

import java.awt.Image;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class returnFrm extends javax.swing.JFrame {

    /**
     * Creates new form returnFrm
     */
    public returnFrm() {
        initComponents();
        tableupdate();
        Image icon = new ImageIcon(this.getClass().getResource("/iconimage.png")).getImage();
        this.setIconImage(icon);
    }

    java.sql.Connection con;
    java.sql.PreparedStatement pst;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main1 = new rojeru_san.complementos.RSButtonHover();
        admin1 = new rojeru_san.complementos.RSButtonHover();
        issue1 = new rojeru_san.complementos.RSButtonHover();
        returnBook1 = new rojeru_san.complementos.RSButtonHover();
        history1 = new rojeru_san.complementos.RSButtonHover();
        logout1 = new rojeru_san.complementos.RSButtonHover();
        main2 = new rojeru_san.complementos.RSButtonHover();
        admin2 = new rojeru_san.complementos.RSButtonHover();
        issue2 = new rojeru_san.complementos.RSButtonHover();
        returnBook2 = new rojeru_san.complementos.RSButtonHover();
        history2 = new rojeru_san.complementos.RSButtonHover();
        logout2 = new rojeru_san.complementos.RSButtonHover();
        admin = new rojeru_san.complementos.RSButtonHover();
        issue = new rojeru_san.complementos.RSButtonHover();
        returnBook = new rojeru_san.complementos.RSButtonHover();
        history = new rojeru_san.complementos.RSButtonHover();
        logout = new rojeru_san.complementos.RSButtonHover();
        main3 = new rojeru_san.complementos.RSButtonHover();
        fnametxt = new javax.swing.JTextField();
        lnametxt = new javax.swing.JTextField();
        booktitletxt = new javax.swing.JTextField();
        dateissuedtxt = new javax.swing.JTextField();
        duedatetxt = new javax.swing.JTextField();
        daysofusagetxt = new javax.swing.JTextField();
        finetxt = new javax.swing.JTextField();
        overduetxt = new javax.swing.JTextField();
        returnBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        returnTable = new rojerusan.RSTableMetro1();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System - Return Book");
        setMaximumSize(new java.awt.Dimension(976, 579));
        setMinimumSize(new java.awt.Dimension(976, 579));
        setPreferredSize(new java.awt.Dimension(976, 579));
        setResizable(false);
        getContentPane().setLayout(null);

        main1.setBackground(new java.awt.Color(113, 201, 206));
        main1.setBorder(null);
        main1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-menu-24.png"))); // NOI18N
        main1.setColorHover(new java.awt.Color(166, 227, 233));
        main1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main1ActionPerformed(evt);
            }
        });
        getContentPane().add(main1);
        main1.setBounds(0, 95, 48, 24);

        admin1.setBackground(new java.awt.Color(113, 201, 206));
        admin1.setBorder(null);
        admin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-administrative-tools-24.png"))); // NOI18N
        admin1.setColorHover(new java.awt.Color(166, 227, 233));
        admin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin1ActionPerformed(evt);
            }
        });
        getContentPane().add(admin1);
        admin1.setBounds(0, 147, 48, 24);

        issue1.setBackground(new java.awt.Color(113, 201, 206));
        issue1.setBorder(null);
        issue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-24.png"))); // NOI18N
        issue1.setColorHover(new java.awt.Color(166, 227, 233));
        issue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issue1ActionPerformed(evt);
            }
        });
        getContentPane().add(issue1);
        issue1.setBounds(0, 199, 48, 24);

        returnBook1.setBackground(new java.awt.Color(113, 201, 206));
        returnBook1.setBorder(null);
        returnBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-return-24.png"))); // NOI18N
        returnBook1.setColorHover(new java.awt.Color(166, 227, 233));
        returnBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBook1ActionPerformed(evt);
            }
        });
        getContentPane().add(returnBook1);
        returnBook1.setBounds(0, 251, 48, 24);

        history1.setBackground(new java.awt.Color(113, 201, 206));
        history1.setBorder(null);
        history1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-history-24.png"))); // NOI18N
        history1.setColorHover(new java.awt.Color(166, 227, 233));
        history1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history1ActionPerformed(evt);
            }
        });
        getContentPane().add(history1);
        history1.setBounds(0, 303, 48, 24);

        logout1.setBackground(new java.awt.Color(113, 201, 206));
        logout1.setBorder(null);
        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-logout-24.png"))); // NOI18N
        logout1.setColorHover(new java.awt.Color(166, 227, 233));
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });
        getContentPane().add(logout1);
        logout1.setBounds(0, 456, 48, 24);

        main2.setBackground(new java.awt.Color(113, 201, 206));
        main2.setBorder(null);
        main2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-menu-24.png"))); // NOI18N
        main2.setColorHover(new java.awt.Color(166, 227, 233));
        main2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main2ActionPerformed(evt);
            }
        });
        getContentPane().add(main2);
        main2.setBounds(0, 95, 48, 24);

        admin2.setBackground(new java.awt.Color(113, 201, 206));
        admin2.setBorder(null);
        admin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-administrative-tools-24.png"))); // NOI18N
        admin2.setColorHover(new java.awt.Color(166, 227, 233));
        admin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin2ActionPerformed(evt);
            }
        });
        getContentPane().add(admin2);
        admin2.setBounds(0, 147, 48, 24);

        issue2.setBackground(new java.awt.Color(113, 201, 206));
        issue2.setBorder(null);
        issue2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-24.png"))); // NOI18N
        issue2.setColorHover(new java.awt.Color(166, 227, 233));
        issue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issue2ActionPerformed(evt);
            }
        });
        getContentPane().add(issue2);
        issue2.setBounds(0, 199, 48, 24);

        returnBook2.setBackground(new java.awt.Color(113, 201, 206));
        returnBook2.setBorder(null);
        returnBook2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-return-24.png"))); // NOI18N
        returnBook2.setColorHover(new java.awt.Color(166, 227, 233));
        returnBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBook2ActionPerformed(evt);
            }
        });
        getContentPane().add(returnBook2);
        returnBook2.setBounds(0, 251, 48, 24);

        history2.setBackground(new java.awt.Color(113, 201, 206));
        history2.setBorder(null);
        history2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-history-24.png"))); // NOI18N
        history2.setColorHover(new java.awt.Color(166, 227, 233));
        history2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history2ActionPerformed(evt);
            }
        });
        getContentPane().add(history2);
        history2.setBounds(0, 303, 48, 24);

        logout2.setBackground(new java.awt.Color(113, 201, 206));
        logout2.setBorder(null);
        logout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-logout-24.png"))); // NOI18N
        logout2.setColorHover(new java.awt.Color(166, 227, 233));
        logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout2ActionPerformed(evt);
            }
        });
        getContentPane().add(logout2);
        logout2.setBounds(0, 456, 48, 24);

        admin.setBackground(new java.awt.Color(113, 201, 206));
        admin.setBorder(null);
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-administrative-tools-24.png"))); // NOI18N
        admin.setText(" ADMIN TOOLS");
        admin.setColorHover(new java.awt.Color(166, 227, 233));
        admin.setColorText(new java.awt.Color(0, 0, 0));
        admin.setColorTextHover(new java.awt.Color(0, 0, 0));
        admin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin);
        admin.setBounds(240, 15, 120, 24);

        issue.setBackground(new java.awt.Color(113, 201, 206));
        issue.setBorder(null);
        issue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-24.png"))); // NOI18N
        issue.setText(" ISSUE BOOK");
        issue.setColorHover(new java.awt.Color(166, 227, 233));
        issue.setColorText(new java.awt.Color(0, 0, 0));
        issue.setColorTextHover(new java.awt.Color(0, 0, 0));
        issue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });
        getContentPane().add(issue);
        issue.setBounds(382, 15, 120, 24);

        returnBook.setBackground(new java.awt.Color(113, 201, 206));
        returnBook.setBorder(null);
        returnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-return-24.png"))); // NOI18N
        returnBook.setText(" RETURN BOOK");
        returnBook.setColorHover(new java.awt.Color(166, 227, 233));
        returnBook.setColorText(new java.awt.Color(0, 0, 0));
        returnBook.setColorTextHover(new java.awt.Color(0, 0, 0));
        returnBook.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookActionPerformed(evt);
            }
        });
        getContentPane().add(returnBook);
        returnBook.setBounds(510, 15, 130, 24);

        history.setBackground(new java.awt.Color(113, 201, 206));
        history.setBorder(null);
        history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-history-24.png"))); // NOI18N
        history.setText(" HISTORY");
        history.setColorHover(new java.awt.Color(166, 227, 233));
        history.setColorText(new java.awt.Color(0, 0, 0));
        history.setColorTextHover(new java.awt.Color(0, 0, 0));
        history.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        getContentPane().add(history);
        history.setBounds(656, 15, 90, 24);

        logout.setBackground(new java.awt.Color(113, 201, 206));
        logout.setBorder(null);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-logout-24.png"))); // NOI18N
        logout.setText(" LOGOUT");
        logout.setColorHover(new java.awt.Color(166, 227, 233));
        logout.setColorText(new java.awt.Color(0, 0, 0));
        logout.setColorTextHover(new java.awt.Color(0, 0, 0));
        logout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(852, 15, 80, 24);

        main3.setBackground(new java.awt.Color(113, 201, 206));
        main3.setBorder(null);
        main3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-menu-24.png"))); // NOI18N
        main3.setText(" MAIN MENU");
        main3.setColorHover(new java.awt.Color(166, 227, 233));
        main3.setColorText(new java.awt.Color(0, 0, 0));
        main3.setColorTextHover(new java.awt.Color(0, 0, 0));
        main3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        main3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main3ActionPerformed(evt);
            }
        });
        getContentPane().add(main3);
        main3.setBounds(118, 15, 100, 24);

        fnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnametxtActionPerformed(evt);
            }
        });
        getContentPane().add(fnametxt);
        fnametxt.setBounds(135, 333, 200, 25);
        getContentPane().add(lnametxt);
        lnametxt.setBounds(135, 379, 200, 25);

        booktitletxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booktitletxtActionPerformed(evt);
            }
        });
        getContentPane().add(booktitletxt);
        booktitletxt.setBounds(135, 426, 200, 25);
        getContentPane().add(dateissuedtxt);
        dateissuedtxt.setBounds(135, 469, 200, 25);
        getContentPane().add(duedatetxt);
        duedatetxt.setBounds(459, 333, 200, 25);
        getContentPane().add(daysofusagetxt);
        daysofusagetxt.setBounds(459, 379, 200, 25);
        getContentPane().add(finetxt);
        finetxt.setBounds(459, 426, 200, 25);
        getContentPane().add(overduetxt);
        overduetxt.setBounds(459, 469, 200, 25);

        returnBtn.setBackground(new java.awt.Color(204, 255, 204));
        returnBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnBtn.setText("RETURN");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtn);
        returnBtn.setBounds(720, 390, 180, 60);

        returnTable.setForeground(new java.awt.Color(0, 0, 0));
        returnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Book Title", "Fname", "Lname", "Date Issued", "Due Date", "Days of Usage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        returnTable.setBackgoundHead(new java.awt.Color(113, 201, 206));
        returnTable.setBackgoundHover(new java.awt.Color(166, 227, 233));
        returnTable.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        returnTable.setColorSecondary(new java.awt.Color(166, 227, 233));
        returnTable.setColorSecundaryText(new java.awt.Color(51, 51, 51));
        returnTable.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        returnTable.setForegroundHead(new java.awt.Color(0, 0, 0));
        returnTable.setSelectionBackground(new java.awt.Color(57, 62, 70));
        returnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(returnTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(68, 68, 863, 235);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/bare-ReturnBook-Frm.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 960, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void tableupdate() {
        int c;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String path = new File("src/LibaryManangementSystem_db.accdb").getAbsolutePath();
            con = DriverManager.getConnection("jdbc:ucanaccess://" + path);
            pst = con.prepareStatement("SELECT * FROM TBL_borrower");
            rs = pst.executeQuery();

            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) returnTable.getModel();
            dft.setRowCount(0);

            while (rs.next()) {

                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("borrowerid"));
                    v2.add(rs.getString("book"));
                    v2.add(rs.getString("firstname"));
                    v2.add(rs.getString("lastname"));
                    v2.add(rs.getString("dateissued"));
                    v2.add(rs.getString("duedate"));
                    v2.add(rs.getString("daysofusage"));
                    v2.add(rs.getString("payment"));
                }
                dft.addRow(v2);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(returnFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(returnFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private void main1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main1ActionPerformed
        // TODO add your handling code here:
        mainFrm MainFRM = new mainFrm();
        MainFRM.show();
        dispose();
    }//GEN-LAST:event_main1ActionPerformed

    private void admin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin1ActionPerformed
        // TODO add your handling code here:
        adminFrm adminFRM = new adminFrm();
        adminFRM.show();
        dispose();
    }//GEN-LAST:event_admin1ActionPerformed

    private void issue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issue1ActionPerformed
        // TODO add your handling code here:
        issueFrm issueFRM = new issueFrm();
        issueFRM.show();
        dispose();
    }//GEN-LAST:event_issue1ActionPerformed

    private void returnBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBook1ActionPerformed
        // TODO add your handling code here:
        returnFrm returnFRM = new returnFrm();
        returnFRM.show();
        dispose();
    }//GEN-LAST:event_returnBook1ActionPerformed

    private void history1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history1ActionPerformed
        // TODO add your handling code here:
        historyFrm historyFRM = new historyFrm();
        historyFRM.show();
        dispose();
    }//GEN-LAST:event_history1ActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        // TODO add your handling code here:
        loginFrm loginFRM = new loginFrm();
        loginFRM.show();
        dispose();
    }//GEN-LAST:event_logout1ActionPerformed

    private void main2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main2ActionPerformed
        // TODO add your handling code here:
        mainFrm MainFRM = new mainFrm();
        MainFRM.show();
        dispose();
    }//GEN-LAST:event_main2ActionPerformed

    private void admin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin2ActionPerformed
        // TODO add your handling code here:
        adminFrm adminFRM = new adminFrm();
        adminFRM.show();
        dispose();
    }//GEN-LAST:event_admin2ActionPerformed

    private void issue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issue2ActionPerformed
        // TODO add your handling code here:
        issueFrm issueFRM = new issueFrm();
        issueFRM.show();
        dispose();
    }//GEN-LAST:event_issue2ActionPerformed

    private void returnBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBook2ActionPerformed
        // TODO add your handling code here:
        returnFrm returnFRM = new returnFrm();
        returnFRM.show();
        dispose();
    }//GEN-LAST:event_returnBook2ActionPerformed

    private void history2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history2ActionPerformed
        // TODO add your handling code here:
        historyFrm historyFRM = new historyFrm();
        historyFRM.show();
        dispose();
    }//GEN-LAST:event_history2ActionPerformed

    private void logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout2ActionPerformed
        // TODO add your handling code here:
        loginFrm loginFRM = new loginFrm();
        loginFRM.show();
        dispose();
    }//GEN-LAST:event_logout2ActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        adminFrm adminFRM = new adminFrm();
        adminFRM.show();
        dispose();
    }//GEN-LAST:event_adminActionPerformed

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        // TODO add your handling code here:
        issueFrm issueFRM = new issueFrm();
        issueFRM.show();
        dispose();
    }//GEN-LAST:event_issueActionPerformed

    private void returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookActionPerformed
        // TODO add your handling code here:
        returnFrm returnFRM = new returnFrm();
        returnFRM.show();
        dispose();
    }//GEN-LAST:event_returnBookActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        // TODO add your handling code here:
        historyFrm historyFRM = new historyFrm();
        historyFRM.show();
        dispose();
    }//GEN-LAST:event_historyActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        loginFrm loginFRM = new loginFrm();
        loginFRM.show();
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void main3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main3ActionPerformed
        // TODO add your handling code here:
        mainFrm MainFRM = new mainFrm();
        MainFRM.show();
        dispose();
    }//GEN-LAST:event_main3ActionPerformed

    private void fnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnametxtActionPerformed

    private void booktitletxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booktitletxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booktitletxtActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed

        try {
            // TODO add your handling code here:
            String book = booktitletxt.getText();
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String path = new File("src/LibaryManangementSystem_db.accdb").getAbsolutePath();
            con = DriverManager.getConnection("jdbc:ucanaccess://" + path);

            // Update the availability of the book
            pst = con.prepareStatement("UPDATE TBL_books SET Availability = 'Available' WHERE Title = ?");
            pst.setString(1, book);
            pst.executeUpdate();

            // Get the current date and format it as yyyy-MM-dd
            String returnDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

            // Update the returnDate in the TBL_borrower table
            pst = con.prepareStatement("UPDATE TBL_borrower SET returnDate = ? WHERE book = ?");
            pst.setString(1, returnDate);
            pst.setString(2, book);
            pst.executeUpdate();

            // Calculate the number of overdue days
            String dueDateStr = duedatetxt.getText();
            if (dueDateStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please click a record in the table to return book", "Message", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date dueDate;
            try {
                dueDate = sdf.parse(dueDateStr);
            } catch (ParseException ex) {
                Logger logger = Logger.getLogger(returnFrm.class.getName());
                logger.setLevel(Level.OFF);  // Turn off logging for this logger
                JOptionPane.showMessageDialog(this, "Please click on the record again to get the appropriate data types", "Message", JOptionPane.INFORMATION_MESSAGE);
                return; // Skip the rest of the processing if the date can't be parsed
            }
            Date currentDate = new Date();

            int overdueDays = 0;
            int charge = 0;

            if (currentDate.after(dueDate)) {
                long diff = currentDate.getTime() - dueDate.getTime();
                overdueDays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                charge = overdueDays * 50;
            }

            //  Update the JTextFields
            overduetxt.setText(String.valueOf(charge));

            // Update the Fine in the TBL_borrower
            int fine = Integer.parseInt(finetxt.getText());
            pst = con.prepareStatement("UPDATE TBL_borrower SET payment = ? WHERE book = ?");
            pst.setInt(1, fine); // use setDouble if your number type is Double
            pst.setString(2, book);
            pst.executeUpdate();

            // Insert into TBL_returnedBookList before deleting from TBL_borrower
            pst = con.prepareStatement("INSERT INTO TBL_returnedBookList(firstName, lastName, book, dateIssued, dueDate, daysOfUsage, returnDate, payment) SELECT firstName, lastName, book, dateIssued, dueDate, daysOfUsage, returnDate, payment FROM TBL_borrower WHERE book = ?");
            pst.setString(1, book);
            pst.executeUpdate();

            // Insert into customer module before deleting from TBL_borrower
            pst = con.prepareStatement("INSERT INTO TBL_customerModule(firstName,lastName, phoneNumber, emailAddress) SELECT firstName, lastName, phoneNumber, emailAddress FROM TBL_borrower WHERE book = ?");
            pst.setString(1, book);
            pst.executeUpdate();

            // Update the Fine in the TBL_borrower
            pst = con.prepareStatement("UPDATE TBL_returnedBookList SET overdueCharge = ? WHERE book = ?");
            pst.setInt(1, charge); // use setDouble if your number type is Double
            pst.setString(2, book);
            pst.executeUpdate();

            // Delete from TBL_borrower
            pst = con.prepareStatement("DELETE FROM TBL_borrower WHERE book = ?");
            pst.setString(1, book);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Book Returned");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(returnFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(returnFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_returnBtnActionPerformed

    private void returnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) returnTable.getModel();
        int selectedIndex = returnTable.getSelectedRow();
        booktitletxt.setText(model.getValueAt(selectedIndex, 1).toString());
        fnametxt.setText(model.getValueAt(selectedIndex, 2).toString());
        lnametxt.setText(model.getValueAt(selectedIndex, 3).toString());
        dateissuedtxt.setText(model.getValueAt(selectedIndex, 4).toString());
        duedatetxt.setText(model.getValueAt(selectedIndex, 5).toString());
        String daysOfUsage = model.getValueAt(selectedIndex, 6).toString();
        daysofusagetxt.setText(daysOfUsage);

        // Calculate the fines
        int payment = Integer.parseInt(daysOfUsage) * 100;
        finetxt.setText(String.valueOf(payment));
    }//GEN-LAST:event_returnTableMouseClicked

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
            java.util.logging.Logger.getLogger(returnFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover admin;
    private rojeru_san.complementos.RSButtonHover admin1;
    private rojeru_san.complementos.RSButtonHover admin2;
    private javax.swing.JLabel background;
    private javax.swing.JTextField booktitletxt;
    private javax.swing.JTextField dateissuedtxt;
    private javax.swing.JTextField daysofusagetxt;
    private javax.swing.JTextField duedatetxt;
    private javax.swing.JTextField finetxt;
    private javax.swing.JTextField fnametxt;
    private rojeru_san.complementos.RSButtonHover history;
    private rojeru_san.complementos.RSButtonHover history1;
    private rojeru_san.complementos.RSButtonHover history2;
    private rojeru_san.complementos.RSButtonHover issue;
    private rojeru_san.complementos.RSButtonHover issue1;
    private rojeru_san.complementos.RSButtonHover issue2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lnametxt;
    private rojeru_san.complementos.RSButtonHover logout;
    private rojeru_san.complementos.RSButtonHover logout1;
    private rojeru_san.complementos.RSButtonHover logout2;
    private rojeru_san.complementos.RSButtonHover main1;
    private rojeru_san.complementos.RSButtonHover main2;
    private rojeru_san.complementos.RSButtonHover main3;
    private javax.swing.JTextField overduetxt;
    private rojeru_san.complementos.RSButtonHover returnBook;
    private rojeru_san.complementos.RSButtonHover returnBook1;
    private rojeru_san.complementos.RSButtonHover returnBook2;
    private javax.swing.JButton returnBtn;
    private rojerusan.RSTableMetro1 returnTable;
    // End of variables declaration//GEN-END:variables
}
