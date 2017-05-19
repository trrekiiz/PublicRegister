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
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import publicregistergroup.controller.ConnectionBuilder;
import static publicregistergroup.view.ViewProfile.con;
import publicregistergroup.model.Students;
import publicregistergroup.model.Clubs;
/**
 *
 * @author taloey
 */
public class Uploadphoto extends JFrame {
    static Connection con = ConnectionBuilder.getConnection();
    private String search;
    private long std_id = Login.getStdId();
   
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
        SearchTextField = new javax.swing.JTextField();
        Bottonsearch = new javax.swing.JButton();
        savebotton = new javax.swing.JButton();
        EditBotton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailArea = new javax.swing.JTextArea();
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

        String clubpicture=null;
        try {
            Statement st = con.createStatement();
            String sql = "SELECT std_role FROM students WHERE std_id = 59130500004";
            ResultSet res = st.executeQuery(sql);
            int club_id =0;
            String std_role=null;
            while (res.next()) {
                std_role = res.getString("std_role");
                club_id = Integer.parseInt(std_role);
                sql = "SELECT club_picture FROM clubs WHERE club_id = ?";
                PreparedStatement pre = con.prepareStatement(sql);
                pre.setInt(1, club_id);
                ResultSet rs = pre.executeQuery();
                if(rs.next()) {
                    clubpicture =rs.getString("club_picture");
                }

                if(std_role!=null){
                    Uploadphotos.setIcon(new ImageIcon((new ImageIcon("src/Images/"+clubpicture).getImage().getScaledInstance(436,366,Image.SCALE_SMOOTH))));
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        getContentPane().add(Boxphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 440, 370));

        textDetail1.setFont(new java.awt.Font("Quark", 0, 40)); // NOI18N
        textDetail1.setForeground(new java.awt.Color(77, 77, 77));
        textDetail1.setText("รายละเอียด");
        getContentPane().add(textDetail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 91, 261, 25));

        Bottonsearch.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        Bottonsearch.setText("OK");
        Bottonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Bottonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 80, 25));

        savebotton.setBackground(new java.awt.Color(213, 186, 55));
        savebotton.setFont(new java.awt.Font("Quark", 0, 30)); // NOI18N
        savebotton.setForeground(new java.awt.Color(255, 255, 255));
        savebotton.setText("Back");
        savebotton.setBorder(null);
        savebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebottonActionPerformed(evt);
            }
        });
        getContentPane().add(savebotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, 230, 40));

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
        getContentPane().add(EditBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 140, 30));

        detailArea.setEditable(false);
        detailArea.setColumns(20);
        detailArea.setFont(new java.awt.Font("Quark", 0, 36)); // NOI18N
        detailArea.setRows(5);
        detailArea.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 51, 0)));
        jScrollPane1.setViewportView(detailArea);
        detailArea.setText(Clubs.getClub_descriptionUpload(std_id));

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 450, 330));

        NameClub.setFont(new java.awt.Font("Quark", 1, 36)); // NOI18N
        getContentPane().add(NameClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 350, 50));
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

        blackground.setIcon(new javax.swing.ImageIcon("/Users/taloey/Desktop/PublicRegister/src/Images/page.jpg")); // NOI18N
        blackground.setText("jLabel1");
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonsearchActionPerformed
        search = SearchTextField.getText();
        String club="";    
        try {
            
           
            String sql = "SELECT * FROM clubs where club_name LIKE '%"+search+"%'";
            PreparedStatement pre = con.prepareStatement(sql);
//            pre.setString(1, "%"+search+"%");
            System.out.println(search+" search la");
             ResultSet res = pre.executeQuery();
             System.out.println("EXE LAEW");
                if(res.next()) {
                    club =res.getString("club_name");
                    System.out.println(club+" clubname");
                }
                
        } catch (SQLException ex) {
            ex.printStackTrace();
        }if (search .equals(club)) {
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame,"Search success","Search club",JOptionPane.PLAIN_MESSAGE);
             // = allClubs.getSelectedIndex();
             ViewClubFromSearch view = new ViewClubFromSearch();
            this.setVisible(false);
             view.setVisible(true);
        }
        else {
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame,"Failed club name","Search club",JOptionPane.ERROR_MESSAGE);
        }
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

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextFieldActionPerformed

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
    private javax.swing.JLabel Uploadphotos;
    private javax.swing.JLabel blackground;
    private javax.swing.JTextArea detailArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton savebotton;
    private javax.swing.JLabel textDetail1;
    private javax.swing.JLabel textupload;
    // End of variables declaration//GEN-END:variables
}
