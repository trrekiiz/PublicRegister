/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import publicregistergroup.controller.ConnectionBuilder;
import publicregistergroup.model.*;

/**
 *
 * @author ART
 */
public class Homepage extends javax.swing.JFrame {
    static Connection con = ConnectionBuilder.getConnection();
    private int clubIndex;
    private String listClubs;
    DefaultListModel model = new DefaultListModel();

    
    
    public int getClubIndex() {
        return clubIndex;
    }

    /**
     * Creates new form Homepage
     * @return 
     */
    public void setClubIndex(int clubIndex) {
        this.clubIndex = clubIndex;
    }

    public Homepage() {
        initComponents();
        setLocationRelativeTo(null);
        allClubs.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = Clubs.getAllClubs();
            @Override
            public int getSize() {
                return strings.size(); 
            }
            @Override
            public String getElementAt(int i) {
                return strings.get(i); 
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textsearchclub = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Bottonsearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allClubs = new javax.swing.JList<>();
        chooseClub = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        blackground = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textsearchclub.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        textsearchclub.setText("serach from club or organize for you interest");
        getContentPane().add(textsearchclub, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 290, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 300, 30));

        Bottonsearch.setFont(new java.awt.Font("Kanit", 0, 13)); // NOI18N
        Bottonsearch.setText("OK");
        Bottonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Bottonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 80, 30));

        jLabel3.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        jLabel3.setText("KMUTT 126 Pracha Uthit Rd, Khwaeng Bang Mot");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 680, -1, 20));

        jLabel4.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        jLabel4.setText("Khet Thung Khru, Krung Thep Maha Nakhon 10140");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 700, -1, -1));

        jLabel5.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        jLabel5.setText("© Copyright 2017 KMUTT PublicizeHUB");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 720, -1, -1));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel3.setBackground(new java.awt.Color(241, 232, 239));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Quark", 1, 65)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("   PIC");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Quark", 1, 20)); // NOI18N
        jLabel8.setText("ชมรมอาสาพัฒนาชุมชน");

        jLabel9.setFont(new java.awt.Font("Quark", 0, 10)); // NOI18N
        jLabel9.setText("<html> CLUB ID:   <br>CLUB NAME:   <br>DESCRIPTION:  </html>");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton3.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        jButton3.setText("สมัครเข้าร่วมชมรม");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(157, 157, 157))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jButton3)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("", jPanel3);

        jPanel6.setBackground(new java.awt.Color(241, 232, 239));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Quark", 1, 65)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("   PIC");
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Quark", 1, 20)); // NOI18N
        jLabel14.setText("ชมรมอาสาพัฒนาชุมชน");

        jLabel15.setFont(new java.awt.Font("Quark", 0, 10)); // NOI18N
        jLabel15.setText("<html>\nCLUB ID:  \n<br>CLUB NAME:  \n<br>DESCRIPTION: \n</html>");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton5.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        jButton5.setText("สมัครเข้าร่วมชมรม");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(157, 157, 157))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jButton5)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("", jPanel6);

        jPanel7.setBackground(new java.awt.Color(241, 232, 239));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setFont(new java.awt.Font("Quark", 1, 65)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("   PIC");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Quark", 1, 20)); // NOI18N
        jLabel17.setText("ชมรมอาสาพัฒนาชุมชน");

        jLabel18.setFont(new java.awt.Font("Quark", 0, 10)); // NOI18N
        jLabel18.setText("<html>\nCLUB ID:  \n<br>CLUB NAME:  \n<br>DESCRIPTION: \n</html>");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton6.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        jButton6.setText("สมัครเข้าร่วมชมรม");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(157, 157, 157))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jButton6)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("", jPanel7);

        jPanel8.setBackground(new java.awt.Color(241, 232, 239));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setBackground(new java.awt.Color(251, 236, 215));
        jLabel19.setFont(new java.awt.Font("Quark", 1, 65)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("   PIC");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setFont(new java.awt.Font("Quark", 1, 20)); // NOI18N
        jLabel20.setText("ชมรมอาสาพัฒนาชุมชน");

        jLabel21.setFont(new java.awt.Font("Quark", 0, 10)); // NOI18N
        jLabel21.setText("<html>\nCLUB ID:  \n<br>CLUB NAME:  \n<br>DESCRIPTION: \n</html>");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton7.setFont(new java.awt.Font("Quark", 0, 14)); // NOI18N
        jButton7.setText("สมัครเข้าร่วมชมรม");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(157, 157, 157))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jButton7)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("", jPanel8);

        jLabel11.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        jLabel11.setText("ชมรมแนะนำ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 490, 430));

        allClubs.setFont(new java.awt.Font("Quark", 0, 16)); // NOI18N
        allClubs.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                allClubsAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        allClubs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allClubsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(allClubs);

        chooseClub.setFont(new java.awt.Font("Quark", 0, 13)); // NOI18N
        chooseClub.setText(" Click");
        chooseClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseClubMouseClicked(evt);
            }
        });
        chooseClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseClubActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        jLabel2.setText("ชมรมทั้งหมด");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(chooseClub))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseClub))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 440, -1));

        jButton2.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 90, -1));

        Title.setFont(new java.awt.Font("Kailasa", 0, 36)); // NOI18N
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 50));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, -1, 40));
        getContentPane().add(blackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BottonsearchActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       ViewRegist view = new ViewRegist();
       this.setVisible(false);
       view.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        this.setVisible(false);
        log.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       ViewRegist view = new ViewRegist();
       this.setVisible(false);
       view.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       ViewRegist view = new ViewRegist();
       this.setVisible(false);
       view.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       ViewRegist view = new ViewRegist();
       this.setVisible(false);
       view.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed
    
    private void allClubsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allClubsMouseClicked
        /*try {
            // TODO add your handling code here:
            //allClubs.getModel();
            //name = NameTextField.getText();
            //faculty = SurnameTextField.getText();
            //telephone = TelephoneTextField.getText();
            //facebook = FacebookTextField.getText();
            //medicineloss = MedicineTextField.getText();
            //foodloss = FoodTextField.getText();
            //email = EmailTextField.getText();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM clubs order by club_id ASC";
            PreparedStatement pre = con.prepareStatement(sql);
            //pre.setString(1, name);
            //pre.setString(2, faculty);
            //pre.setString(3, telephone);
            ResultSet res = pre.executeQuery();
            //ResultSet res = st.executeQuery(sql);
            int row = 0;
            while((res!=null) && (res.next())){
                model.addElement(res.getInt("club_id") + "  " + res.getString("club_name"));
            }
            res.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        */
        /*ViewClub view = new ViewClub();
        this.setVisible(false);
        view.setVisible(true);*/
       
    }//GEN-LAST:event_allClubsMouseClicked

    private void allClubsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_allClubsAncestorAdded
       
       
        
    }//GEN-LAST:event_allClubsAncestorAdded

    private void chooseClubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseClubMouseClicked
     
    }//GEN-LAST:event_chooseClubMouseClicked

    private void chooseClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseClubActionPerformed
        //JOptionPane.showMessageDialog(null,"You selected : " + allClubs.getSelectedValue());
        clubIndex = allClubs.getSelectedIndex();
        ViewClub view = new ViewClub();
        this.setVisible(false);
        view.setVisible(true);
    }//GEN-LAST:event_chooseClubActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Homepage().setVisible(true);
                jPanel1.setOpaque(false);
                jPanel2.setOpaque(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bottonsearch;
    private javax.swing.JLabel Title;
    private javax.swing.JList<String> allClubs;
    private javax.swing.JLabel blackground;
    private javax.swing.JButton chooseClub;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel textsearchclub;
    // End of variables declaration//GEN-END:variables
}
