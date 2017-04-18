/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;

/**
 *
 * @author newso
 */
public class AccountSetting extends javax.swing.JFrame {

    /**
     * Creates new form AccountSetting
     */
    public AccountSetting() {
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

        jpnCheckAllActivity = new javax.swing.JPanel();
        jlbPublicRegis = new javax.swing.JLabel();
        jlbSerchLabel = new javax.swing.JLabel();
        jtfSerchField = new javax.swing.JTextField();
        jpnProfile = new javax.swing.JPanel();
        jlbName = new javax.swing.JLabel();
        jlbFaculty = new javax.swing.JLabel();
        jpnEditProfile = new javax.swing.JPanel();
        jlbEditProfile = new javax.swing.JLabel();
        jpnProfilePicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account Setting");
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setName("AccountSetting"); // NOI18N
        setResizable(false);

        jpnCheckAllActivity.setBackground(new java.awt.Color(255, 234, 214));
        jpnCheckAllActivity.setMinimumSize(new java.awt.Dimension(1024, 768));
        jpnCheckAllActivity.setPreferredSize(new java.awt.Dimension(1024, 768));

        jlbPublicRegis.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlbPublicRegis.setText("KMUTT Public Regis");

        jlbSerchLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbSerchLabel.setText("Serch from event name or location");

        jtfSerchField.setFont(new java.awt.Font("ThaiSans Neue", 0, 18)); // NOI18N
        jtfSerchField.setText("Serch");
        jtfSerchField.setToolTipText("");
        jtfSerchField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfSerchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfSerchFieldMouseClicked(evt);
            }
        });
        jtfSerchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSerchFieldActionPerformed(evt);
            }
        });

        jpnProfile.setBackground(new java.awt.Color(255, 255, 255));
        jpnProfile.setPreferredSize(new java.awt.Dimension(800, 363));

        javax.swing.GroupLayout jpnProfileLayout = new javax.swing.GroupLayout(jpnProfile);
        jpnProfile.setLayout(jpnProfileLayout);
        jpnProfileLayout.setHorizontalGroup(
            jpnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProfileLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jpnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbName, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jpnProfileLayout.setVerticalGroup(
            jpnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnEditProfile.setBackground(new java.awt.Color(255, 255, 255));
        jpnEditProfile.setPreferredSize(new java.awt.Dimension(800, 363));

        jlbEditProfile.setFont(new java.awt.Font("ThaiSans Neue", 0, 36)); // NOI18N
        jlbEditProfile.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlbEditProfile.setText("แก้ไขข้อมูลส่วนตัว");
        jlbEditProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlbEditProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlbEditProfile.setName(""); // NOI18N

        javax.swing.GroupLayout jpnEditProfileLayout = new javax.swing.GroupLayout(jpnEditProfile);
        jpnEditProfile.setLayout(jpnEditProfileLayout);
        jpnEditProfileLayout.setHorizontalGroup(
            jpnEditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEditProfileLayout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jlbEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jpnEditProfileLayout.setVerticalGroup(
            jpnEditProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEditProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbEditProfile)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        jlbEditProfile.getAccessibleContext().setAccessibleDescription("แก้ไขข้อมูลส่วนตัว");

        jpnProfilePicture.setText("ProfliePic");

        javax.swing.GroupLayout jpnCheckAllActivityLayout = new javax.swing.GroupLayout(jpnCheckAllActivity);
        jpnCheckAllActivity.setLayout(jpnCheckAllActivityLayout);
        jpnCheckAllActivityLayout.setHorizontalGroup(
            jpnCheckAllActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCheckAllActivityLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpnCheckAllActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnCheckAllActivityLayout.createSequentialGroup()
                        .addGroup(jpnCheckAllActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbPublicRegis)
                            .addComponent(jlbSerchLabel)
                            .addComponent(jpnEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(jpnCheckAllActivityLayout.createSequentialGroup()
                        .addGroup(jpnCheckAllActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSerchField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jpnCheckAllActivityLayout.setVerticalGroup(
            jpnCheckAllActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCheckAllActivityLayout.createSequentialGroup()
                .addComponent(jlbPublicRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbSerchLabel)
                .addGroup(jpnCheckAllActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnCheckAllActivityLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfSerchField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jpnEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jpnCheckAllActivityLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jpnProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jtfSerchField.getAccessibleContext().setAccessibleName("Serch");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnCheckAllActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnCheckAllActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfSerchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSerchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSerchFieldActionPerformed

    private void jtfSerchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfSerchFieldMouseClicked
        // TODO add your handling code here:
        jtfSerchField.setText("");
    }//GEN-LAST:event_jtfSerchFieldMouseClicked

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
            java.util.logging.Logger.getLogger(AccountSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountSetting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbEditProfile;
    private javax.swing.JLabel jlbFaculty;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbPublicRegis;
    private javax.swing.JLabel jlbSerchLabel;
    private javax.swing.JPanel jpnCheckAllActivity;
    private javax.swing.JPanel jpnEditProfile;
    private javax.swing.JPanel jpnProfile;
    private javax.swing.JLabel jpnProfilePicture;
    private javax.swing.JTextField jtfSerchField;
    // End of variables declaration//GEN-END:variables
}