/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.model;

/**
 *
 * @author taloey
 */
public class Uploadphoto extends javax.swing.JFrame {

    /**
     * Creates new form Uploadphoto
     */
    public Uploadphoto() {
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

        Boxphoto = new javax.swing.JPanel();
        textupload = new javax.swing.JLabel();
        BoxDetail1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        textDetail1 = new javax.swing.JLabel();
        textsearchclub = new javax.swing.JLabel();
        Boxsearch = new javax.swing.JPanel();
        Bottonsearch = new javax.swing.JButton();
        savebotton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        uploadbotton = new javax.swing.JButton();
        blackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boxphoto.setBackground(new java.awt.Color(255, 255, 255));
        Boxphoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 51)));

        textupload.setFont(new java.awt.Font("Kanit", 0, 36)); // NOI18N
        textupload.setForeground(new java.awt.Color(204, 204, 204));
        textupload.setText("อัพโหลดรูปภาพ");

        javax.swing.GroupLayout BoxphotoLayout = new javax.swing.GroupLayout(Boxphoto);
        Boxphoto.setLayout(BoxphotoLayout);
        BoxphotoLayout.setHorizontalGroup(
            BoxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxphotoLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(textupload, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        BoxphotoLayout.setVerticalGroup(
            BoxphotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxphotoLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(textupload, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        getContentPane().add(Boxphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 450, 370));

        BoxDetail1.setBackground(new java.awt.Color(255, 255, 255));
        BoxDetail1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 0, 0)));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout BoxDetail1Layout = new javax.swing.GroupLayout(BoxDetail1);
        BoxDetail1.setLayout(BoxDetail1Layout);
        BoxDetail1Layout.setHorizontalGroup(
            BoxDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxDetail1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );
        BoxDetail1Layout.setVerticalGroup(
            BoxDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoxDetail1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(BoxDetail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 450, 330));

        textDetail1.setFont(new java.awt.Font("Kanit", 0, 48)); // NOI18N
        textDetail1.setForeground(new java.awt.Color(77, 77, 77));
        textDetail1.setText("รายละเอียด");
        getContentPane().add(textDetail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        textsearchclub.setFont(new java.awt.Font("Kanit", 0, 13)); // NOI18N
        textsearchclub.setText("serach from club or organize for you interest");
        getContentPane().add(textsearchclub, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 290, 20));

        Boxsearch.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BoxsearchLayout = new javax.swing.GroupLayout(Boxsearch);
        Boxsearch.setLayout(BoxsearchLayout);
        BoxsearchLayout.setHorizontalGroup(
            BoxsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        BoxsearchLayout.setVerticalGroup(
            BoxsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(Boxsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 290, 20));

        Bottonsearch.setText("OK");
        Bottonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Bottonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 80, 20));

        savebotton.setBackground(new java.awt.Color(255, 153, 0));
        savebotton.setText("save");
        savebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebottonActionPerformed(evt);
            }
        });
        getContentPane().add(savebotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 230, 60));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Edit");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 140, 40));

        Title.setFont(new java.awt.Font("Kailasa", 0, 36)); // NOI18N
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 50));

        uploadbotton.setText("upload");
        uploadbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbottonActionPerformed(evt);
            }
        });
        getContentPane().add(uploadbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 130, 30));

        blackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        blackground.setText("jLabel1");
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BottonsearchActionPerformed

    private void uploadbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbottonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadbottonActionPerformed

    private void savebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebottonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savebottonActionPerformed

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
    private javax.swing.JPanel BoxDetail1;
    private javax.swing.JPanel Boxphoto;
    private javax.swing.JPanel Boxsearch;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel blackground;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton savebotton;
    private javax.swing.JLabel textDetail1;
    private javax.swing.JLabel textsearchclub;
    private javax.swing.JLabel textupload;
    private javax.swing.JButton uploadbotton;
    // End of variables declaration//GEN-END:variables
}
