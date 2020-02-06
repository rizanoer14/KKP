package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.konek;

public class jadwal extends javax.swing.JInternalFrame {
private Connection conn = new konek().connect();
private DefaultTableModel tabmode;
 
 protected void datatable(){
        Object[] Baris = {"Kode Sewa","Tanggal","Nama Gedung","Waktu","Penyewa"};
        tabmode = new DefaultTableModel(null, Baris);
        tabeljadwal.setModel(tabmode);
        String sql = "select * from pemesanan order by tanggal asc";
        
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("kode_sewa");
                String b = hasil.getString("tanggal");
                String c = hasil.getString("nama_ruang");
                String d = hasil.getString("waktu");
                String e = hasil.getString("nama_penyewa");
                                
                String[] data={a,b,c,d,e};
                tabmode.addRow(data);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
 
private void cari(){
       Object[] Baris = {"Kode Sewa","Tanggal","Nama Gedung","Waktu","Penyewa"};
           tabmode = new DefaultTableModel(null, Baris);
           tabeljadwal.setModel(tabmode);
           String sql = "select * from pemesanan where nama_ruang or nama_penyewa like '%"+isicari.getText()+"%'";
           try {
               Statement stat = conn.createStatement();
               ResultSet hasil = stat.executeQuery(sql);
               while(hasil.next()){ 
                String a = hasil.getString("kode_sewa");
                String b = hasil.getString("tanggal");
                String c = hasil.getString("nama_ruang");
                String d = hasil.getString("waktu");
                String e = hasil.getString("nama_penyewa");

                   String[] data={a,b,c,d,e};
                   tabmode.addRow(data);
               }
           }catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan!");
           }
   } 
 
    private void hapus(){
        int ok = JOptionPane.showConfirmDialog(null,"Hapus data penyewaan dari penyewa: "+penyewa.getText()+"?","Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql ="delete from pemesanan where kode_sewa= '"+kdsewa.getText()+"' ";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kdsewa.setText("");
                isicari.requestFocus();
                datatable();
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
            }
        }
    }

    public jadwal() {
        initComponents();
        datatable();
        kdsewa.hide();
        penyewa.hide();
        batalsewa.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabeljadwal = new javax.swing.JTable();
        kdsewa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cari = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        isicari = new javax.swing.JTextField();
        batalsewa = new javax.swing.JButton();
        penyewa = new javax.swing.JTextField();
        jdc1 = new com.toedter.calendar.JDateChooser();
        jdc2 = new com.toedter.calendar.JDateChooser();
        cari1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("JADWAL PENYEWAAN RUANG DIKLAT");
        setPreferredSize(new java.awt.Dimension(595, 415));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(580, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jadwal Penyewaan Gedung Wiladatika");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 590, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tabeljadwal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tabeljadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Sewa", "Tanggal", "Nama Gedung", "Waktu", "Penyewa", "Dp"
            }
        ));
        tabeljadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabeljadwal.setGridColor(new java.awt.Color(0, 153, 153));
        tabeljadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeljadwalMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabeljadwal);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 580, 210));

        kdsewa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        kdsewa.setText("kodesewa");
        jPanel2.add(kdsewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nama");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 40, 30));

        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icari.png"))); // NOI18N
        cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        jPanel2.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 50, 30));

        refresh.setBackground(new java.awt.Color(255, 255, 255));
        refresh.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        refresh.setForeground(new java.awt.Color(51, 153, 0));
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ireload.png"))); // NOI18N
        refresh.setText("Refresh");
        refresh.setBorder(null);
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbhapusActionPerformed(evt);
            }
        });
        jPanel2.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 80, 30));

        isicari.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        isicari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isicariActionPerformed(evt);
            }
        });
        isicari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isicariKeyPressed(evt);
            }
        });
        jPanel2.add(isicari, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 120, 30));

        batalsewa.setBackground(new java.awt.Color(255, 255, 255));
        batalsewa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        batalsewa.setForeground(new java.awt.Color(153, 0, 204));
        batalsewa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ihapus.png"))); // NOI18N
        batalsewa.setText("Batal Sewa");
        batalsewa.setBorder(null);
        batalsewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalsewabhapusActionPerformed(evt);
            }
        });
        jPanel2.add(batalsewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 100, 30));

        penyewa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        penyewa.setText("penyewa");
        jPanel2.add(penyewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 60, 30));
        jPanel2.add(jdc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 120, 30));
        jPanel2.add(jdc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        cari1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icari.png"))); // NOI18N
        cari1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari1ActionPerformed(evt);
            }
        });
        jPanel2.add(cari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        cari();
    }//GEN-LAST:event_cariActionPerformed

    private void refreshbhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbhapusActionPerformed
       datatable();
    }//GEN-LAST:event_refreshbhapusActionPerformed

    private void isicariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isicariKeyPressed
          if(evt.getKeyCode() == evt.VK_ENTER){
            cari();
        }
    }//GEN-LAST:event_isicariKeyPressed

    private void tabeljadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeljadwalMouseClicked
        batalsewa.setEnabled(true);
        int bar = tabeljadwal.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        kdsewa.setText(a);
        penyewa.setText(e);
    }//GEN-LAST:event_tabeljadwalMouseClicked

    private void batalsewabhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalsewabhapusActionPerformed
        hapus();
    }//GEN-LAST:event_batalsewabhapusActionPerformed

    private void isicariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isicariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isicariActionPerformed

    private void cari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cari1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalsewa;
    private javax.swing.JButton cari;
    private javax.swing.JButton cari1;
    private javax.swing.JTextField isicari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private com.toedter.calendar.JDateChooser jdc1;
    private com.toedter.calendar.JDateChooser jdc2;
    private javax.swing.JTextField kdsewa;
    private javax.swing.JTextField penyewa;
    private javax.swing.JButton refresh;
    private javax.swing.JTable tabeljadwal;
    // End of variables declaration//GEN-END:variables
}