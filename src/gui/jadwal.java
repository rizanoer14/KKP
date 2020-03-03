package gui;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.konek;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class jadwal extends javax.swing.JInternalFrame {
private Connection conn = new konek().connect();
private DefaultTableModel tabmode;

 protected void datatable(){
        Object[] Baris = {"Kode Sewa","Tanggal","Nama Gedung","Waktu","Pelanggan","Harga","Bayar","Status"};
        tabmode = new DefaultTableModel(null, Baris);
        tabeljadwal.setModel(tabmode);
        String sql = "SELECT * from pemesanan INNER JOIN detail ON pemesanan.kode_sewa = detail.kode_sewa";
        
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("kode_sewa");
                String b = hasil.getString("tanggal");
                String c = hasil.getString("nama_ruang");
                String d = hasil.getString("waktu");
                String e = hasil.getString("nama_penyewa");
                String h = hasil.getString("gdgfas");
                String f = hasil.getString("total");
                String g = hasil.getString("ket");

                
                String[] data={a,b,c,d,e,h,f,g};
                tabmode.addRow(data);
                
                
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
 
 private void caribet(){
       Object[] Baris = {"Kode Sewa","Tanggal","Nama Gedung","Waktu","Pelanggan","Harga","Bayar","Status"};
           tabmode = new DefaultTableModel(null, Baris);
           tabeljadwal.setModel(tabmode);
           String sql = "SELECT * FROM pemesanan INNER JOIN detail ON pemesanan.kode_sewa = detail.kode_sewa"
                   + "WHERE tanggal or nama_penyewa like '%"+isicari.getText()+"%'";
           try {
               Statement stat = conn.createStatement();
               ResultSet hasil = stat.executeQuery(sql);
               while(hasil.next()){ 
                String a = hasil.getString("kode_sewa");
                String b = hasil.getString("tanggal");
                String c = hasil.getString("nama_ruang");
                String d = hasil.getString("waktu");
                String e = hasil.getString("nama_penyewa");
                String h = hasil.getString("gdgfas");
                String f = hasil.getString("total");
                String g = hasil.getString("ket");

                   String[] data={a,b,c,d,e,h,f,g};
                   tabmode.addRow(data);
               }
           }catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan!");
        }
 }
 
 private void cari(){
       Object[] Baris = {"Kode Sewa","Tanggal","Nama Gedung","Waktu","Pelanggan","Harga","Bayar","Status"};
           tabmode = new DefaultTableModel(null, Baris);
           tabeljadwal.setModel(tabmode);
           String sql = "select * from pemesanan INNER JOIN detail ON pemesanan.kode_sewa = detail.kode_sewa"
                   + "where tanggal like '%"+isicari.getText()+"%' "+
                   "or nama_penyewa like '%"+isicari.getText()+"%'"+
                   "or status like '%"+isicari.getText()+"%'"+
                   "or nama_ruang like '%"+isicari.getText()+"%'";
           try {
               Statement stat = conn.createStatement();
               ResultSet hasil = stat.executeQuery(sql);
               while(hasil.next()){ 
                String a = hasil.getString("kode_sewa");
                String b = hasil.getString("tanggal");
                String c = hasil.getString("nama_ruang");
                String d = hasil.getString("waktu");
                String e = hasil.getString("nama_penyewa");
                String h = hasil.getString("gdgfas");
                String f = hasil.getString("total");
                String g = hasil.getString("ket");
                String[] data={a,b,c,d,e,h,f,g};
                tabmode.addRow(data);
               }
           }catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan!");
           }
   } 
 
 private void hapus(){
        int ok = JOptionPane.showConfirmDialog(null,"Hapus data penyewaan dari pelanggan: "+penyewa.getText()+"?","Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql ="delete from pemesanan INNER JOIN detail ON pemesanan.kode_sewa=detail.kode_sewa"
                    + " where kode_sewa= '"+kdsewa.getText()+"' ";
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
        stat.hide();
        bayar1.hide();
        bayar2.hide();
        batalsewa.setEnabled(false);
        
        Date date = new Date();
        jdc1.setDate(date);
        jdc2.setDate(date);
       // System.out.println("Data dari dialog:\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kdsewa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        caritgl = new javax.swing.JButton();
        isicari = new javax.swing.JTextField();
        penyewa = new javax.swing.JTextField();
        jdc1 = new com.toedter.calendar.JDateChooser();
        jdc2 = new com.toedter.calendar.JDateChooser();
        batalsewa = new javax.swing.JButton();
        bayar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bayar1 = new javax.swing.JTextField();
        bayar2 = new javax.swing.JTextField();
        stat = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        kurang = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabeljadwal = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        ged = new javax.swing.JLabel();
        fas = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("JADWAL PENYEWAAN ");
        setPreferredSize(new java.awt.Dimension(595, 480));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(580, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jadwal Penyewaan");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 590, -1));

        kdsewa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        kdsewa.setText("kodesewa");
        jPanel2.add(kdsewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nama");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 40, 30));

        caritgl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icari.png"))); // NOI18N
        caritgl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caritgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caritglActionPerformed(evt);
            }
        });
        jPanel2.add(caritgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 50, 30));

        isicari.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        isicari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isicariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                isicariKeyReleased(evt);
            }
        });
        jPanel2.add(isicari, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 160, 30));

        penyewa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        penyewa.setText("penyewa");
        jPanel2.add(penyewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, 20));
        jPanel2.add(jdc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 30));
        jPanel2.add(jdc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, 30));

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
        jPanel2.add(batalsewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 110, 30));

        bayar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bayarKeyPressed(evt);
            }
        });
        jPanel2.add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 120, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Bayar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 40, 20));
        jPanel2.add(bayar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));
        jPanel2.add(bayar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));
        jPanel2.add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        refresh.setBackground(new java.awt.Color(255, 255, 255));
        refresh.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        refresh.setForeground(new java.awt.Color(51, 153, 0));
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ireload.png"))); // NOI18N
        refresh.setText("Perbarui");
        refresh.setBorder(null);
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbhapusActionPerformed(evt);
            }
        });
        jPanel2.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 80, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Kurang");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 44, 20));

        kurang.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(kurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 120, -1));

        tabeljadwal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tabeljadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Sewa", "Tanggal", "Nama Gedung", "Waktu", "Pelanggan", "Bayar (Rp)", "Status"
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

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 560, 200));

        jButton1.setText("Cetak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        ged.setText("jLabel5");
        jPanel2.add(ged, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        fas.setText("jLabel5");
        jPanel2.add(fas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caritglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caritglActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String from = (String) sdf.format(jdc1.getDate());
        String to = (String) sdf.format(jdc2.getDate());
        
        Object[] Baris = {"Kode Sewa","Tanggal","Nama Gedung","Waktu","Penyewa","Harga","Bayar","Status"};
           tabmode = new DefaultTableModel(null, Baris);
           tabeljadwal.setModel(tabmode);
           String sql = "select * from pemesanan INNER JOIN detail ON pemesanan.kode_sewa"
                   + "=detail.kode_sewa where tanggal BETWEEN '"+from+"' AND '"+to+"' "
                   + "ORDER BY tanggal ASC";
           try {
               
               Statement stat = conn.createStatement();
               ResultSet hasil = stat.executeQuery(sql);
               while(hasil.next()){ 
                String a = hasil.getString("kode_sewa");
                String b = hasil.getString("tanggal");
                String c = hasil.getString("nama_ruang");
                String d = hasil.getString("waktu");
                String e = hasil.getString("nama_penyewa");
                String h = hasil.getString("gdgfas");
                String f = hasil.getString("total");
                String g = hasil.getString("ket");

                   String[] data={a,b,c,d,e,h,f,g};
                   tabmode.addRow(data);
               }
           }catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan!");
           }
    }//GEN-LAST:event_caritglActionPerformed

    private void refreshbhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbhapusActionPerformed
       datatable();
       kurang.setText("");
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
        String f = tabmode.getValueAt(bar,6).toString();
        String h = tabmode.getValueAt(bar, 5).toString();
        String i = tabmode.getValueAt(bar,7).toString();
        kdsewa.setText(a);
        penyewa.setText(e);
        bayar1.setText(f);//bayar
        bayar2.setText(h);// harga
        stat.setText(i);//status
        
        int x = Integer.parseInt(h.trim());
        int y = Integer.parseInt(f.trim());
        int z = x-y;
        
        String zz = String.valueOf(z);
        kurang.setText(zz);
    }//GEN-LAST:event_tabeljadwalMouseClicked

    private void batalsewabhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalsewabhapusActionPerformed
        hapus();
        datatable();
        kurang.setText("");
    }//GEN-LAST:event_batalsewabhapusActionPerformed

    private void isicariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isicariKeyReleased
        cari();
    }//GEN-LAST:event_isicariKeyReleased

    private void bayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayarKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
           try{
               String sql="update detail set total=?,status=? where kode_sewa='"+kdsewa.getText()+"'";
               String sqli="update pemesanan set bayar=?,status=? where kode_sewa='"+kdsewa.getText()+"'";
               String sqly="update pesan_fas set subtot=? where kode_sewa='"+kdsewa.getText()+"'";
                PreparedStatement p=(PreparedStatement)conn.prepareStatement(sql);
                PreparedStatement p1=(PreparedStatement)conn.prepareStatement(sqli);
                PreparedStatement p2=(PreparedStatement)conn.prepareStatement(sqly);
                
                String terpilih;
                String a = bayar1.getText();
                String b = bayar2.getText();
                String c = stat.getText();
                String d = bayar.getText();
                
                int aa = Integer.parseInt(a.trim());
                int ba = Integer.parseInt(b.trim());
                int da = Integer.parseInt(d.trim());

                int ca = da + aa;
                if (ca >= ba) 
                    terpilih ="Lunas";
                else terpilih ="Belum Lunas";
               
                String x = String.valueOf(ca);
                
                p.setString(1,x);
                p.setString(2,terpilih);
                p1.setString(1,ged.getText());
                p1.setString(2,terpilih);
                p2.setString(1,fas.getText());
                p.executeUpdate();
                p1.executeUpdate();
                p2.executeUpdate();
                JOptionPane.showMessageDialog(this,"Data Telah Tersimpan");
            }catch(SQLException e){ 
                 System.out.println(e);  
            }datatable();
            bayar.setText("");
            kurang.setText("");
        }
    }//GEN-LAST:event_bayarKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Map param = new HashMap();
        SimpleDateFormat frmt = new SimpleDateFormat("yyyy-MM-dd");
        String date1;
        
        date1 = frmt.format(kdsewa.getText());
        param.put("kd", date1);
        try {
       //   File f = new File("D:/KKP/wildat/src/laporan/Laporan.jrxml");
            File f = new File("C:\\Users\\Hp\\Documents\\NetBeansProjects\\KKP\\KKP\\src\\struk\\dp.jrxml");
            JasperReport j = JasperCompileManager.compileReport(f.getAbsolutePath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(j, param, conn);
            JasperViewer jv = new JasperViewer(jasperPrint, false);
            jv.setTitle("Uang Muka");
            jv.setVisible(true);
            //dispose();
        }
        catch(Exception e) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Gagal Menampilkan Laporan"+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalsewa;
    private javax.swing.JTextField bayar;
    private javax.swing.JTextField bayar1;
    private javax.swing.JTextField bayar2;
    private javax.swing.JButton caritgl;
    private javax.swing.JLabel fas;
    private javax.swing.JLabel ged;
    private javax.swing.JTextField isicari;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private com.toedter.calendar.JDateChooser jdc1;
    private com.toedter.calendar.JDateChooser jdc2;
    private javax.swing.JTextField kdsewa;
    private javax.swing.JTextField kurang;
    private javax.swing.JTextField penyewa;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField stat;
    private javax.swing.JTable tabeljadwal;
    // End of variables declaration//GEN-END:variables
}
