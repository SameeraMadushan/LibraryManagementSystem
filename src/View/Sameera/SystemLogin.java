/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Sameera;

import static Controller.UserController.login;
import static Controller.UserController.validateEmail;
import Model.UserModel;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sameera
 */
public class SystemLogin extends javax.swing.JFrame {


    public SystemLogin() {
        initComponents();
        this.setLocationRelativeTo(null); //Setting to display in the center of screen
    }

    public void viewLoginFrame(boolean status) {
        jTextFieldEmail.setText("");
        jPasswordFieldUserPassword.setText("");
        LoginPanel.setVisible(status);
        jDesktopPaneLogin.setVisible(status);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDesktopPaneLogin = new javax.swing.JDesktopPane();
        LoginPanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonUserLogin = new javax.swing.JButton();
        jPasswordFieldUserPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jDesktopPaneLogin.setBackground(new java.awt.Color(0, 102, 102));
        jDesktopPaneLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 102, 102));
        emailLabel.setText("Email");
        LoginPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 70, 30));

        passwordLabel.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 102, 102));
        passwordLabel.setText("Password");
        LoginPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 60, 30));

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(0, 102, 102));
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldEmail.setToolTipText("Enter Username");
        jTextFieldEmail.setAutoscrolls(false);
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        LoginPanel.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 250, 30));

        jButtonUserLogin.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUserLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonUserLogin.setForeground(new java.awt.Color(0, 102, 102));
        jButtonUserLogin.setText("Login");
        jButtonUserLogin.setToolTipText("");
        jButtonUserLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jButtonUserLogin.setFocusPainted(false);
        jButtonUserLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonUserLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonUserLoginMouseExited(evt);
            }
        });
        jButtonUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserLoginActionPerformed(evt);
            }
        });
        LoginPanel.add(jButtonUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 90, 28));

        jPasswordFieldUserPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordFieldUserPassword.setForeground(new java.awt.Color(0, 102, 102));
        jPasswordFieldUserPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordFieldUserPassword.setToolTipText("Enter Password");
        jPasswordFieldUserPassword.setAutoscrolls(false);
        jPasswordFieldUserPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        LoginPanel.add(jPasswordFieldUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 250, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        LoginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jDesktopPaneLogin.add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneLogin)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneLogin)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserLoginActionPerformed
        // TODO add your handling code here:
//viewLoginFrame(false);
//LibraryMain member=new LibraryMain("Sameera Madushan");
//member.setVisible(true);
//this.dispose();
        UserModel user = new UserModel();
        user.setEmail(jTextFieldEmail.getText());
        user.setPassword(jPasswordFieldUserPassword.getText());

        if (validateEmail(jTextFieldEmail.getText())) {
            if (user.getPassword().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please enter Password!",
                        "Oops!", JOptionPane.ERROR_MESSAGE);
                
            } else {
                try {
                    String userType = login(user);
                    if (userType.equals("Librarian")) {
                        //view UI of Librarian

                    } else if (userType.equals("Library Manager")) {
                        //view UI of Library Manager 

                    } else if (userType.equals("Member")) {
                        //view UI of Member
                        System.out.println("Logged in successfully");
                        //set visibility of login and library member
                        viewLoginFrame(false);
                        LibraryMain member=new LibraryMain(user.getEmail());
                        member.setVisible(true);
                        this.dispose();

                    } else if (userType.isEmpty()) {
                        System.out.println("Login Fail");
                        JOptionPane.showMessageDialog(rootPane, "Email or Password "
                                + "Incorrect!", "Oops!", JOptionPane.ERROR_MESSAGE);

                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SystemLogin.class.getName()).log(Level.SEVERE, null, ex);

                } catch (SQLException ex) {
                    Logger.getLogger(SystemLogin.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please enter valid Email "
                    + "address!", "Oops!", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jButtonUserLoginActionPerformed

    private void jButtonUserLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUserLoginMouseExited
        // TODO add your handling code here:
        jButtonUserLogin.setBackground(Color.white);
        jButtonUserLogin.setForeground(new Color(102, 152, 225));
    }//GEN-LAST:event_jButtonUserLoginMouseExited

    private void jButtonUserLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUserLoginMouseEntered
        // TODO add your handling code here:
        jButtonUserLogin.setBackground(new Color(102, 152, 225));
        jButtonUserLogin.setForeground(Color.white);
    }//GEN-LAST:event_jButtonUserLoginMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Metal look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Metal (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel LoginPanel;
    javax.swing.JLabel emailLabel;
    javax.swing.JButton jButtonUserLogin;
    javax.swing.JDesktopPane jDesktopPaneLogin;
    javax.swing.JLabel jLabel1;
    javax.swing.JPasswordField jPasswordFieldUserPassword;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable jTable1;
    javax.swing.JTextField jTextFieldEmail;
    javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
