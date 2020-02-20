package gui;

public class daftar_penginapan extends javax.swing.JInternalFrame {
    
       public daftar_penginapan() {
        initComponents();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        smalam = new javax.swing.JLabel();
        wisma = new javax.swing.JLabel();
        kamar = new javax.swing.JLabel();
        wpelatih = new javax.swing.JLabel();
        kenanga = new javax.swing.JLabel();
        purbo1 = new javax.swing.JLabel();
        belanda = new javax.swing.JLabel();
        purbo2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("DAFTAR PENGINAPAN");
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(595, 480));
        setRequestFocusEnabled(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setPreferredSize(new java.awt.Dimension(580, 735));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Daftar Wisma Penginapan");

        smalam.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        smalam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kar2.jpg"))); // NOI18N
        smalam.setText("Asrama Sedap Malam");
        smalam.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        smalam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        smalam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        smalam.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        smalam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                smalamMouseClicked(evt);
            }
        });

        wisma.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        wisma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sudirman.jpg"))); // NOI18N
        wisma.setText("Wisma");
        wisma.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        wisma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wisma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        wisma.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        wisma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wismaMouseClicked(evt);
            }
        });

        kamar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agus.jpg"))); // NOI18N
        kamar.setText("Kamar");
        kamar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kamar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kamar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kamarMouseClicked(evt);
            }
        });

        wpelatih.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        wpelatih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dewan.jpg"))); // NOI18N
        wpelatih.setText("Wisma Pelatih");
        wpelatih.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        wpelatih.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wpelatih.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        wpelatih.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        wpelatih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wpelatihMouseClicked(evt);
            }
        });

        kenanga.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        kenanga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sudirman.jpg"))); // NOI18N
        kenanga.setText("Asrama Kenanga");
        kenanga.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kenanga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kenanga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kenanga.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kenanga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kenangaMouseClicked(evt);
            }
        });

        purbo1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        purbo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agus.jpg"))); // NOI18N
        purbo1.setText("Sekar Purbo I");
        purbo1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        purbo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purbo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        purbo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        purbo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purbo1MouseClicked(evt);
            }
        });

        belanda.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        belanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kar2.jpg"))); // NOI18N
        belanda.setText("Rumah Belanda");
        belanda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        belanda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        belanda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        belanda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        belanda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                belandaMouseClicked(evt);
            }
        });

        purbo2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        purbo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dewan.jpg"))); // NOI18N
        purbo2.setText("Sekar Purbo II");
        purbo2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        purbo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purbo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        purbo2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        purbo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purbo2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(wisma)
                            .addComponent(wpelatih)
                            .addComponent(kenanga)
                            .addComponent(purbo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kamar)
                            .addComponent(smalam)
                            .addComponent(purbo1)
                            .addComponent(belanda))
                        .addGap(65, 65, 65)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kamar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wisma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(smalam)
                    .addComponent(wpelatih))
                .addGap(35, 35, 35)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(purbo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kenanga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(belanda)
                    .addComponent(purbo2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(panel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wismaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wismaMouseClicked
         new dp_wisma().show();
    }//GEN-LAST:event_wismaMouseClicked

    private void kamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kamarMouseClicked
         new dp_kamar().show();
    }//GEN-LAST:event_kamarMouseClicked

    private void wpelatihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wpelatihMouseClicked
         new dp_pelatih().show();
    }//GEN-LAST:event_wpelatihMouseClicked

    private void smalamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smalamMouseClicked
         new dp_smalam().show();
    }//GEN-LAST:event_smalamMouseClicked

    private void kenangaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kenangaMouseClicked
         new dp_kenanga().show();
    }//GEN-LAST:event_kenangaMouseClicked

    private void purbo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purbo1MouseClicked
         new dp_purbo1().show();
    }//GEN-LAST:event_purbo1MouseClicked

    private void purbo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purbo2MouseClicked
         new dp_purbo2().show();
    }//GEN-LAST:event_purbo2MouseClicked

    private void belandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_belandaMouseClicked
         new dp_belanda().show();
    }//GEN-LAST:event_belandaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel belanda;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kamar;
    private javax.swing.JLabel kenanga;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel purbo1;
    private javax.swing.JLabel purbo2;
    private javax.swing.JLabel smalam;
    private javax.swing.JLabel wisma;
    private javax.swing.JLabel wpelatih;
    // End of variables declaration//GEN-END:variables
}
