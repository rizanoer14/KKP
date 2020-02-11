package gui;

public class daftar_gedung extends javax.swing.JInternalFrame {
    
       public daftar_gedung() {
        initComponents();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kartini = new javax.swing.JLabel();
        sudirman = new javax.swing.JLabel();
        agus = new javax.swing.JLabel();
        dewantoro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("DAFTAR GEDUNG");
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(595, 415));
        setRequestFocusEnabled(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(580, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daftar Gedung Wiladatika");

        kartini.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        kartini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kar2.jpg"))); // NOI18N
        kartini.setText("Kartini");
        kartini.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kartini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kartini.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kartini.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kartini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kartiniMouseClicked(evt);
            }
        });

        sudirman.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sudirman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sudirman.jpg"))); // NOI18N
        sudirman.setText("Sudirman");
        sudirman.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sudirman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sudirman.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sudirman.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sudirman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sudirmanMouseClicked(evt);
            }
        });

        agus.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        agus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agus.jpg"))); // NOI18N
        agus.setText("Agus Salim");
        agus.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        agus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        agus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        agus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agusMouseClicked(evt);
            }
        });

        dewantoro.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        dewantoro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dewan.jpg"))); // NOI18N
        dewantoro.setText("Dewantoro");
        dewantoro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dewantoro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dewantoro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dewantoro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dewantoro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dewantoroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sudirman)
                            .addComponent(dewantoro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agus)
                            .addComponent(kartini))
                        .addGap(65, 65, 65)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sudirman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kartini)
                    .addComponent(dewantoro))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sudirmanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sudirmanMouseClicked
        new detail_sudirman().show();
    }//GEN-LAST:event_sudirmanMouseClicked

    private void agusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agusMouseClicked
         new detail_agus().show();
    }//GEN-LAST:event_agusMouseClicked

    private void dewantoroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dewantoroMouseClicked
         new detail_dewantoro().show();
    }//GEN-LAST:event_dewantoroMouseClicked

    private void kartiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kartiniMouseClicked
         new detail_kartini().show();
    }//GEN-LAST:event_kartiniMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agus;
    private javax.swing.JLabel dewantoro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kartini;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel sudirman;
    // End of variables declaration//GEN-END:variables
}
