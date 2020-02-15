/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;

/**
 *
 * @author MODOFWAR
 */
public class HalAwalPelamar extends javax.swing.JFrame {

    /**
     * Creates new form HalAwalPelamar
     */
    public HalAwalPelamar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JButton getBuatBerkas() {
        return BuatBerkas;
    }

    public JButton getCariPelamar() {
        return CariPelamar;
    }

    public JButton getDataPelamar() {
        return DataPelamar;
    }

    public JButton getHapusPelamar() {
        return HapusPelamar;
    }

    public JButton getMinatLowongan() {
        return MinatLowongan;
    }

    public JButton getTambahPelamar() {
        return TambahPelamar;
    }

    public JButton getButtonBack() {
        return buttonBack;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        perusahaan3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        MainMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        perusahaan2 = new javax.swing.JButton();
        TambahPelamar = new javax.swing.JButton();
        HapusPelamar = new javax.swing.JButton();
        DataPelamar = new javax.swing.JButton();
        CariPelamar = new javax.swing.JButton();
        BuatBerkas = new javax.swing.JButton();
        MinatLowongan = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        perusahaan4 = new javax.swing.JButton();

        perusahaan3.setBackground(new java.awt.Color(0, 0, 0));
        perusahaan3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        perusahaan3.setForeground(new java.awt.Color(255, 255, 255));
        perusahaan3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        perusahaan3.setBorderPainted(false);
        perusahaan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perusahaan3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Awal Pelamar");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MainMenu.setBackground(new java.awt.Color(0, 0, 0));
        MainMenu.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/d.jpg"))); // NOI18N

        perusahaan2.setBackground(new java.awt.Color(255, 120, 0));
        perusahaan2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        perusahaan2.setForeground(new java.awt.Color(255, 255, 255));
        perusahaan2.setText("JOBSEEKER");
        perusahaan2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        perusahaan2.setBorderPainted(false);
        perusahaan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perusahaan2ActionPerformed(evt);
            }
        });

        TambahPelamar.setBackground(new java.awt.Color(255, 102, 0));
        TambahPelamar.setForeground(new java.awt.Color(255, 255, 255));
        TambahPelamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/output-onlinepngtools.png"))); // NOI18N
        TambahPelamar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        TambahPelamar.setBorderPainted(false);
        TambahPelamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahPelamarActionPerformed(evt);
            }
        });

        HapusPelamar.setBackground(new java.awt.Color(255, 102, 0));
        HapusPelamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/CCC.png"))); // NOI18N
        HapusPelamar.setBorderPainted(false);

        DataPelamar.setBackground(new java.awt.Color(255, 102, 0));
        DataPelamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/DDD.png"))); // NOI18N
        DataPelamar.setBorderPainted(false);

        CariPelamar.setBackground(new java.awt.Color(255, 102, 0));
        CariPelamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/EEE.png"))); // NOI18N
        CariPelamar.setBorderPainted(false);

        BuatBerkas.setBackground(new java.awt.Color(255, 102, 0));
        BuatBerkas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/gg.png"))); // NOI18N
        BuatBerkas.setBorderPainted(false);

        MinatLowongan.setBackground(new java.awt.Color(255, 102, 0));
        MinatLowongan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/LL.png"))); // NOI18N
        MinatLowongan.setBorderPainted(false);

        buttonBack.setBackground(new java.awt.Color(255, 255, 255));
        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/33.png"))); // NOI18N
        buttonBack.setBorderPainted(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   CREATE");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    DELETE");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("      VIEW");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("   SEARCH");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("      ADD");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("    APPLY");

        perusahaan4.setBackground(new java.awt.Color(0, 0, 0));
        perusahaan4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        perusahaan4.setForeground(new java.awt.Color(255, 255, 255));
        perusahaan4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        perusahaan4.setBorderPainted(false);
        perusahaan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perusahaan4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perusahaan4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perusahaan2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(MainMenuLayout.createSequentialGroup()
                            .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TambahPelamar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(MainMenuLayout.createSequentialGroup()
                                    .addComponent(HapusPelamar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(DataPelamar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CariPelamar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BuatBerkas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MinatLowongan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(MainMenuLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, 0))
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perusahaan2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perusahaan4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TambahPelamar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HapusPelamar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataPelamar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CariPelamar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuatBerkas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinatLowongan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(buttonBack)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahPelamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahPelamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TambahPelamarActionPerformed

    private void perusahaan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perusahaan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perusahaan2ActionPerformed

    private void perusahaan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perusahaan3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perusahaan3ActionPerformed

    private void perusahaan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perusahaan4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perusahaan4ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HalAwalPelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HalAwalPelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HalAwalPelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HalAwalPelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HalAwalPelamar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuatBerkas;
    private javax.swing.JButton CariPelamar;
    private javax.swing.JButton DataPelamar;
    private javax.swing.JButton HapusPelamar;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JButton MinatLowongan;
    private javax.swing.JButton TambahPelamar;
    private javax.swing.JButton buttonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton perusahaan2;
    private javax.swing.JButton perusahaan3;
    private javax.swing.JButton perusahaan4;
    // End of variables declaration//GEN-END:variables
}
