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
import static publicregistergroup.view.ViewProfile.con;

/**
 *
 * @author taloey
 */
public class EditClub extends JFrame {
     static Connection con = ConnectionBuilder.getConnection();
     private String nameclub,detailclub;
    /**
     * Creates new form Uploadphoto
     */
    public EditClub() {
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

        Boxphoto = new javax.swing.JPanel();
        textupload = new javax.swing.JLabel();
        Uploadphotos = new javax.swing.JLabel();
        textDetail1 = new javax.swing.JLabel();
        textsearchclub = new javax.swing.JLabel();
        SearchTextField = new javax.swing.JTextField();
        Bottonsearch = new javax.swing.JButton();
        savebotton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        uploadbotton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailArea = new javax.swing.JTextArea();
        clubname = new javax.swing.JTextField();
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
        savebotton.setText("Save");
        savebotton.setBorder(null);
        savebotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebottonMouseClicked(evt);
            }
        });
        savebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebottonActionPerformed(evt);
            }
        });
        getContentPane().add(savebotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 230, 60));

        Title.setFont(new java.awt.Font("Kailasa", 0, 36)); // NOI18N
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 50));

        uploadbotton.setBackground(new java.awt.Color(213, 186, 55));
        uploadbotton.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        uploadbotton.setForeground(new java.awt.Color(255, 255, 255));
        uploadbotton.setText("upload");
        uploadbotton.setBorder(null);
        uploadbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbottonActionPerformed(evt);
            }
        });
        getContentPane().add(uploadbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 130, 40));

        detailArea.setColumns(20);
        detailArea.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        detailArea.setRows(5);
        detailArea.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 51, 0)));
        jScrollPane1.setViewportView(detailArea);
        String club_description=null;
        try {
            Statement st = con.createStatement();
            String sql = "SELECT std_role FROM students WHERE std_id = 59130500004";
            ResultSet res = st.executeQuery(sql);
            int club_id =0;
            String std_role=null;
            while (res.next()) {
                std_role = res.getString("std_role");
                club_id = Integer.parseInt(std_role);
                sql = "SELECT club_description FROM clubs WHERE club_id = ?";
                PreparedStatement pre = con.prepareStatement(sql);
                pre.setInt(1, club_id);
                ResultSet rs = pre.executeQuery();
                if(rs.next()) {
                    club_description =rs.getString("club_description");
                }

                if(std_role!=null){
                    detailArea.setText(club_description);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 450, 330));

        clubname.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        clubname.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        clubname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubnameActionPerformed(evt);
            }
        });
        getContentPane().add(clubname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, 30));
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
                    clubname.setText(club_name);
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

    private void uploadbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbottonActionPerformed
    JFileChooser fileOpen = new JFileChooser();
        fileOpen.showDialog(null , "Choose Image");
        fileOpen.setAcceptAllFileFilterUsed(false);
        fileOpen.addChoosableFileFilter(new FileNameExtensionFilter(".jpg","jpg"));
        fileOpen.addChoosableFileFilter(new FileNameExtensionFilter(".gif","gif"));
        fileOpen.addChoosableFileFilter(new FileNameExtensionFilter(".png","png"));
        int result = fileOpen.showDialog(null, "Choose Image");
            File selecFile = fileOpen.getSelectedFile();
            String path = selecFile.getAbsolutePath();
           Uploadphotos.setIcon(new ImageIcon((new ImageIcon(path).getImage().getScaledInstance(436,366,Image.SCALE_SMOOTH))));
            
    }//GEN-LAST:event_uploadbottonActionPerformed

    private void savebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebottonActionPerformed
        
        LinkData data = new LinkData();
        this.setVisible(false);
        data.setVisible(true);
    }//GEN-LAST:event_savebottonActionPerformed

    private void clubnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubnameActionPerformed
 
    }//GEN-LAST:event_clubnameActionPerformed

    private void savebottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebottonMouseClicked

         try {
              nameclub = clubname.getText();
            detailclub = detailArea.getText();
             String sql = "UPDATE clubs SET club_name=?, club_description=? WHERE std_role=?";
             PreparedStatement pre = con.prepareStatement(sql);
             pre.setString(1, nameclub);
             pre.setString(2, detailclub);
             pre.executeUpdate(sql);
         } catch (SQLException ex) {
             Logger.getLogger(EditClub.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_savebottonMouseClicked

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
            java.util.logging.Logger.getLogger(EditClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bottonsearch;
    private javax.swing.JPanel Boxphoto;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Uploadphotos;
    private javax.swing.JLabel blackground;
    private javax.swing.JTextField clubname;
    private javax.swing.JTextArea detailArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton savebotton;
    private javax.swing.JLabel textDetail1;
    private javax.swing.JLabel textsearchclub;
    private javax.swing.JLabel textupload;
    private javax.swing.JButton uploadbotton;
    // End of variables declaration//GEN-END:variables
}