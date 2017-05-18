/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

import java.sql.Connection;
import publicregistergroup.controller.ConnectionBuilder;
import publicregistergroup.model.*;


/**
 *
 * @author kz_no
 */
public class ViewRegist extends javax.swing.JFrame {
    static Connection con = ConnectionBuilder.getConnection();
    private String clubName = Clubs.getClub_name(Homepage.getClubIndex());
    //private String clubDescription = Clubs.getClub_description(Homepage.getClubIndex());
    private int club_id = Clubs.getClub_id(Homepage.getClubIndex());
    
    private String stdName = Students.getStd_name(Login.getStdIndex());
    private String stdTel = Students.getStd_tel(Login.getStdIndex());
    private String stdFacebook = Students.getStd_facebook(Login.getStdIndex());
    private String stdMedicine = Students.getStd_medicine(Login.getStdIndex());
    private String stdFood = Students.getStd_food(Login.getStdIndex());
    private String stdEmail = Students.getStd_email(Login.getStdIndex());
    private long stdID = Students.getStd_id(Login.getStdIndex());
    
    
    
    
    /**
     * Creates new form ViewRegist
     */
    public ViewRegist() {
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

        NameClub = new javax.swing.JLabel();
        ClubID = new javax.swing.JLabel();
        ShowClubID = new javax.swing.JLabel();
        เส้นขีดเฉยๆ = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        AnsName = new javax.swing.JLabel();
        Telephone = new javax.swing.JLabel();
        AnsTelephone = new javax.swing.JLabel();
        Facebook = new javax.swing.JLabel();
        AnsFacebook = new javax.swing.JLabel();
        แพ้ยาอะไร = new javax.swing.JLabel();
        Ansแพ้ยาอะไร = new javax.swing.JLabel();
        แพ้อาหาอะไร = new javax.swing.JLabel();
        Ansแพ้อาหารอะไร = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        AnsEmail = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        ShowID = new javax.swing.JLabel();
        seach = new javax.swing.JTextField();
        Edit = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        Bottonsearch1 = new javax.swing.JButton();
        blackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameClub.setFont(new java.awt.Font("Quark", 1, 32)); // NOI18N
        getContentPane().add(NameClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 490, 40));
        NameClub.setText(Clubs.getClub_name(club_id));

        ClubID.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        ClubID.setText("CLUB ID : ");
        getContentPane().add(ClubID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        ShowClubID.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        getContentPane().add(ShowClubID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 257, 260, 20));
        ShowClubID.setText(club_id+"");

        เส้นขีดเฉยๆ.setText("____________________________________________________________________________________________________________________");
        getContentPane().add(เส้นขีดเฉยๆ, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        pic.setFont(new java.awt.Font("Quark", 1, 72)); // NOI18N
        pic.setForeground(new java.awt.Color(153, 153, 153));
        pic.setText("    PIC");
        pic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 274, 277));

        Name.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        Name.setText("Name :");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        AnsName.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        AnsName.setText("Kittiya ");
        getContentPane().add(AnsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        Telephone.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        Telephone.setText("Telephone :");
        getContentPane().add(Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        AnsTelephone.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        AnsTelephone.setText("090-7700443");
        getContentPane().add(AnsTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        Facebook.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        Facebook.setText("Facebook :");
        getContentPane().add(Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        AnsFacebook.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        AnsFacebook.setText("Noey Kittiya");
        getContentPane().add(AnsFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        แพ้ยาอะไร.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        แพ้ยาอะไร.setText("แพ้ยาอะไร :");
        getContentPane().add(แพ้ยาอะไร, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        Ansแพ้ยาอะไร.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        Ansแพ้ยาอะไร.setText("-");
        getContentPane().add(Ansแพ้ยาอะไร, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        แพ้อาหาอะไร.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        แพ้อาหาอะไร.setText("แพ้อาหารอะไร :");
        getContentPane().add(แพ้อาหาอะไร, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        Ansแพ้อาหารอะไร.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        Ansแพ้อาหารอะไร.setText("-");
        getContentPane().add(Ansแพ้อาหารอะไร, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, -1));

        Email.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        Email.setText("E-mail :");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        AnsEmail.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        AnsEmail.setText("kz_noey@hotmail.com");
        getContentPane().add(AnsEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, -1));

        ID.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        ID.setText("ID :");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 40, 30));

        ShowID.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        getContentPane().add(ShowID, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 220, 30));
        ShowID.setText(stdID+"");

        seach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seachActionPerformed(evt);
            }
        });
        getContentPane().add(seach, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 90, 261, 22));

        Edit.setFont(new java.awt.Font("Quark", 0, 10)); // NOI18N
        Edit.setText("EDIT");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        getContentPane().add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, -1, -1));

        Confirm.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        Confirm.setText("CONFIRM");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 610, 110, 37));

        Bottonsearch1.setFont(new java.awt.Font("Kanit", 0, 13)); // NOI18N
        Bottonsearch1.setText("OK");
        Bottonsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bottonsearch1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bottonsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 88, 80, 25));

        blackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/page.jpg"))); // NOI18N
        blackground.setText("jLabel1");
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seachActionPerformed

    private void Bottonsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bottonsearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bottonsearch1ActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
       ViewProfile view = new ViewProfile();
       this.setVisible(false);
       view.setVisible(true);
    }//GEN-LAST:event_EditActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
       Done d = new Done();
       this.setVisible(false);
       d.setVisible(true);
    }//GEN-LAST:event_ConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRegist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRegist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRegist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRegist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRegist().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnsEmail;
    private javax.swing.JLabel AnsFacebook;
    private javax.swing.JLabel AnsName;
    private javax.swing.JLabel AnsTelephone;
    private javax.swing.JLabel Ansแพ้ยาอะไร;
    private javax.swing.JLabel Ansแพ้อาหารอะไร;
    private javax.swing.JButton Bottonsearch1;
    private javax.swing.JLabel ClubID;
    private javax.swing.JButton Confirm;
    private javax.swing.JButton Edit;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Facebook;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameClub;
    private javax.swing.JLabel ShowClubID;
    private javax.swing.JLabel ShowID;
    private javax.swing.JLabel Telephone;
    private javax.swing.JLabel blackground;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField seach;
    private javax.swing.JLabel เส้นขีดเฉยๆ;
    private javax.swing.JLabel แพ้ยาอะไร;
    private javax.swing.JLabel แพ้อาหาอะไร;
    // End of variables declaration//GEN-END:variables
}
