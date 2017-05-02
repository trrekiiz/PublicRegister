/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

import java.awt.Image;
import java.io.File;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import publicregistergroup.controller.ConnectionBuilder;

/**
 *
 * @author taloey
 */
public class Uploadphoto extends JFrame {
    static Connection con = ConnectionBuilder.getConnection();
    /**
     * Creates new form Uploadphoto
     */
    public Uploadphoto() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boxphoto = new javax.swing.JPanel();
        textupload = new javax.swing.JLabel();
        Uploadphotos = new javax.swing.JLabel();
        textDetail1 = new javax.swing.JLabel();
        textsearchclub = new javax.swing.JLabel();
        SearchTextField = new javax.swing.JTextField();
        Bottonsearch = new javax.swing.JButton();
        savebotton = new javax.swing.JButton();
        EditBotton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        NameClub = new javax.swing.JLabel();
        blackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boxphoto.setBackground(new java.awt.Color(255, 255, 255));
        Boxphoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 51)));

        textupload.setFont(new java.awt.Font("Quark", 0, 48)); // NOI18N
        textupload.setForeground(new java.awt.Color(204, 204, 204));
        textupload.setText("อัพโหลดรูปภาพ");

        javax.swing.GroupLayout BoxphotoLayout = new javax.swing.GroupLayout(Boxphoto);
        Boxphoto.setLayout(BoxphotoLayout);
        BoxphotoLayout.setHorizontalGroup(
            BoxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxphotoLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(textupload, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addComponent(Uploadphotos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BoxphotoLayout.setVerticalGroup(
            BoxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxphotoLayout.createSequentialGroup()
                .addComponent(Uploadphotos, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textupload, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        getContentPane().add(Boxphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 440, 370));

        textDetail1.setFont(new java.awt.Font("Quark", 0, 52)); // NOI18N
        textDetail1.setForeground(new java.awt.Color(77, 77, 77));
        textDetail1.setText("รายละเอียด");
        getContentPane().add(textDetail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        textsearchclub.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        textsearchclub.setText("serach from club or organize for you interest");
        getContentPane().add(textsearchclub, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 290, 20));
        getContentPane().add(SearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 300, 30));

        Bottonsearch.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        Bottonsearch.setText("OK");
        Bottonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Bottonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 80, 30));

        savebotton.setBackground(new java.awt.Color(213, 186, 55));
        savebotton.setFont(new java.awt.Font("Quark", 0, 48)); // NOI18N
        savebotton.setForeground(new java.awt.Color(255, 255, 255));
        savebotton.setText("Back");
        savebotton.setBorder(null);
        savebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebottonActionPerformed(evt);
            }
        });
        getContentPane().add(savebotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 230, 60));

        EditBotton.setBackground(new java.awt.Color(213, 186, 55));
        EditBotton.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        EditBotton.setForeground(new java.awt.Color(255, 255, 255));
        EditBotton.setText("Edit");
        EditBotton.setBorder(null);
        EditBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBottonActionPerformed(evt);
            }
        });
        getContentPane().add(EditBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 140, 40));

        Title.setFont(new java.awt.Font("Kailasa", 0, 36)); // NOI18N
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 51, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 450, 330));

        NameClub.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        getContentPane().add(NameClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 260, 30));
        String club_name=null;
        try {
            Statement st = con.createStatement();
            String sql = "SELECT std_role FROM students WHERE std_id = 59130500004";
            ResultSet res = st.executeQuery(sql);
            int club_id =0;
            String std_role=null;
            while (res.next()) {
                std_role = res.getString("std_role");
                club_id = Integer.parseInt(std_role);
                sql = "SELECT club_name FROM clubs WHERE club_id = ?";
                PreparedStatement pre = con.prepareStatement(sql);
                pre.setInt(1, club_id);
                ResultSet rs = pre.executeQuery();
                if(rs.next()) {
                    club_name =rs.getString("club_name");
                }

                if(std_role!=null){
                    NameClub.setText(club_name);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        blackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        blackground.setText("jLabel1");
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BottonsearchActionPerformed

    private void savebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebottonActionPerformed
        // TODO add your handling code here:
        LinkData data = new LinkData();
        this.setVisible(false);
        data.setVisible(true);
    }//GEN-LAST:event_savebottonActionPerformed

    private void EditBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBottonActionPerformed
               EditClub edit = new EditClub();
        this.setVisible(false);
        edit.setVisible(true);
    }//GEN-LAST:event_EditBottonActionPerformed

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
            java.util.logging.Logger.getLogger(Uploadphoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uploadphoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uploadphoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uploadphoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uploadphoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bottonsearch;
    private javax.swing.JPanel Boxphoto;
    private javax.swing.JButton EditBotton;
    private javax.swing.JLabel NameClub;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Uploadphotos;
    private javax.swing.JLabel blackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton savebotton;
    private javax.swing.JLabel textDetail1;
    private javax.swing.JLabel textsearchclub;
    private javax.swing.JLabel textupload;
    // End of variables declaration//GEN-END:variables
}
