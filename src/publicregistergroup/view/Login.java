/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

import java.sql.*;
import javax.swing.*;
import publicregistergroup.controller.*;
import publicregistergroup.model.*;
/**
 *
 * @author newso
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnLogin = new javax.swing.JPanel();
        jpnLoginLeft = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        backgroundInside = new javax.swing.JPanel();
        passwordSeparator = new javax.swing.JSeparator();
        jpfInputPassword = new javax.swing.JPasswordField();
        jlbPassword = new javax.swing.JLabel();
        usernameSeparator = new javax.swing.JSeparator();
        jtfInputUsername = new javax.swing.JTextField();
        jlbUsername = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        jpnLogin.setBackground(new java.awt.Color(255, 255, 255));
        jpnLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnLoginLeft.setBackground(new java.awt.Color(205, 77, 40));

        javax.swing.GroupLayout jpnLoginLeftLayout = new javax.swing.GroupLayout(jpnLoginLeft);
        jpnLoginLeft.setLayout(jpnLoginLeftLayout);
        jpnLoginLeftLayout.setHorizontalGroup(
            jpnLoginLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jpnLoginLeftLayout.setVerticalGroup(
            jpnLoginLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpnLogin.add(jpnLoginLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 807));

        loginButton.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jpnLogin.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 232, 52));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jpnLogin.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 410, -1));

        backgroundInside.setBackground(new java.awt.Color(77, 77, 77));
        backgroundInside.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 0)));

        jpfInputPassword.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        jpfInputPassword.setBorder(null);
        jpfInputPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpfInputPasswordMouseClicked(evt);
            }
        });
        jpfInputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfInputPasswordActionPerformed(evt);
            }
        });

        jlbPassword.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        jlbPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlbPassword.setText(" ");

        jtfInputUsername.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        jtfInputUsername.setText("Username");
        jtfInputUsername.setBorder(null);
        jtfInputUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfInputUsernameMouseClicked(evt);
            }
        });
        jtfInputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfInputUsernameActionPerformed(evt);
            }
        });

        jlbUsername.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        jlbUsername.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout backgroundInsideLayout = new javax.swing.GroupLayout(backgroundInside);
        backgroundInside.setLayout(backgroundInsideLayout);
        backgroundInsideLayout.setHorizontalGroup(
            backgroundInsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundInsideLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(backgroundInsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpfInputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfInputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        backgroundInsideLayout.setVerticalGroup(
            backgroundInsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundInsideLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfInputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(usernameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jlbPassword)
                .addGap(36, 36, 36)
                .addComponent(jpfInputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(passwordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jpnLogin.add(backgroundInside, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 400, 400));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        jpnLogin.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 810));

        sidebar.setBackground(new java.awt.Color(205, 77, 40));

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );

        jpnLogin.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 40, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        if (getLogin() == true) {
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame,"Login Success","Login",JOptionPane.PLAIN_MESSAGE);
            this.setVisible(false);
            Homepage newHome = new Homepage();
            newHome.setVisible(true);
        }
        else {
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame,"Failed to Login \n Please reenter your username or password","Login",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void jpfInputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfInputPasswordActionPerformed
        // TODO add your handling code here:
        jpfInputPassword.setText("Password");
    }//GEN-LAST:event_jpfInputPasswordActionPerformed

    private void jpfInputPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpfInputPasswordMouseClicked
        // TODO add your handling code here:
        jpfInputPassword.setText("");
        jlbPassword.setText("Password");
    }//GEN-LAST:event_jpfInputPasswordMouseClicked

    private void jtfInputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfInputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfInputUsernameActionPerformed

    private void jtfInputUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfInputUsernameMouseClicked
        // TODO add your handling code here:
        jtfInputUsername.setText("");
        jlbUsername.setText("Username");
    }//GEN-LAST:event_jtfInputUsernameMouseClicked

    public boolean getLogin() {
        boolean status = false;
        try {
            String stdUsername;
            String stdPassword;
            stdUsername = jtfInputUsername.getText();
            stdPassword = String.valueOf(jpfInputPassword.getPassword()); // Password not Hash
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement pre;
            String sql;
            sql = "select username, password from user where username = ? and password = ?";
            pre = con.prepareStatement(sql);
            pre.setString(1, stdUsername);
            pre.setString(2, stdPassword);
            ResultSet rec = pre.executeQuery();
            if (rec.next()) {
                //this.setVisible(false);
                //Homepage newHome = new Homepage();
                //newHome.setVisible(true);
                status = true;
            }
            else {
                status = false;
            }
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPanel backgroundInside;
    private javax.swing.JLabel jlbPassword;
    private javax.swing.JLabel jlbUsername;
    private javax.swing.JPasswordField jpfInputPassword;
    private javax.swing.JPanel jpnLogin;
    private javax.swing.JPanel jpnLoginLeft;
    private javax.swing.JTextField jtfInputUsername;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JPanel sidebar;
    private javax.swing.JSeparator usernameSeparator;
    // End of variables declaration//GEN-END:variables
}
