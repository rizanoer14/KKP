package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import koneksi.konek;

public class penyewaan extends java.awt.Dialog {
private Connection conn = new konek().connect();
public String pilih = ""; 
public String fas[] ;
public static String kodepenyewaan, hargapenyewaan;
public boolean cSIMPAN = false;

public static String getkodepenyewaan()
{
    return kodepenyewaan;
}
public static void setpenyewaan(String kodepenyewaan)
{
    penyewaan.kodepenyewaan =kodepenyewaan;
}

public static String gethargapenyewaan()
{
    return hargapenyewaan;
}
public static void sethargapenyewaan(String hargapenyewaan)
{
    penyewaan.hargapenyewaan =hargapenyewaan;
}


//Set - Get pada detail gedung
public String kd_gedung, nm_gedung, hrg, wsiang, wmalam;
    private int m;
    public String getkd_gedung() {
        return this.kd_gedung;
    }
    public void setkd_gedung(String kd_gedung){
        this.kd_gedung = kd_gedung;
        kdgedung.setText(this.kd_gedung);
    }
    
    public String getnm_gedung() {
        return this.nm_gedung;
    }
    public void setnm_gedung(String nm_gedung){
        this.nm_gedung = nm_gedung;
        nama_gedung.setText(this.nm_gedung);
    }
    
    public String gethrg() {
        return this.hrg;
    }
    public void sethrg(String hrg){
       this.hrg = hrg;
       harga.setText(this.hrg);
    }
    
    public String getwsiang(){
        return this.wsiang;
    }
    public void setwsiang(String wsiang){
        this.wsiang = wsiang;
        //time.setText(this.wsiang);
        time.hide();
        malam.hide();
    }
    
    public String getwmalam(){
        return this.wmalam;
    }
    public void setwmalam(String wmalam){
        this.wmalam = wmalam;
        time.setText(this.wmalam);
        siang.hide();
        time.hide();
    }
//==========================================================
    protected void kosong(){
        siang.setEnabled(true);
        malam.setEnabled(true);
    }
//==========================================================    
    public void kodesewa(){
        try{
            String sql = "select kode_sewa from pemesanan order by kode_sewa desc";
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
                if(rs.next()){
                    String kode = rs.getString("kode_sewa").substring(2);
                    String AN = ""+(Integer.parseInt(kode)+1);
                    String Nol = "";
                    
                    if(AN.length()==1){
                        Nol="000";
                    }else if(AN.length()==2){
                        Nol="00";
                    }else if(AN.length()==3){
                        Nol="0";
                     }else if(AN.length()==4){
                        Nol="";
                     }
                    kdsewa.setText("SW" + Nol + AN);
                }else{
                    kdsewa.setText("SW0001");
                }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void nomor(){
        try{
            String sql = "select no from pesan_fasilitas order by no desc";
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
                if(rs.next()){
                    String kode = rs.getString("no").substring(2);
                    String AN = ""+(Integer.parseInt(kode)+1);
                    String Nol = "";
                    
                    if(AN.length()==1){
                        Nol="000";
                    }else if(AN.length()==2){
                        Nol="00";
                    }else if(AN.length()==3){
                        Nol="0";
                     }else if(AN.length()==4){
                        Nol="";
                     }
                    nomor.setText("NO" + Nol + AN);
                }else{
                    nomor.setText("NO0001");
                }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void penyewa(){
        try{
            String sql = "select id_penyewa from pemesanan order by id_penyewa desc";
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
                if(rs.next()){
                    String kode = rs.getString("id_penyewa").substring(1);
                    String AN = ""+(Integer.parseInt(kode)+1);
                    String Nol = "";
                    
                    if(AN.length()==1){
                        Nol="000";
                    }else if(AN.length()==2){
                        Nol="00";
                    }else if(AN.length()==3){
                        Nol="0";
                    }else if(AN.length()==4){
                        Nol="";
                    }
                        kdpenyewa.setText("P" + Nol + AN);
                }else{
                        kdpenyewa.setText("P0001");
                }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
//==========================================================  
   protected void cektanggal(){
   if(tgl.getDate() != null) {
            SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
            String tglcari = ft.format(tgl.getDate());
            String sql = "select * from pemesanan WHERE tanggal='"+tglcari+"' AND kode_ruang=' "+kdgedung.getText()+"' ";
            try {
                int x=0;
                Statement stat = conn.createStatement();
                ResultSet hasil = stat.executeQuery(sql);
                while(hasil.next()){
                    if(hasil.getString("waktu") == "siang") {
                        siang.setSelected(true);
                        System.out.println(hasil.getString("waktu"));
                    } else if(hasil.getString("waktu") == "malam") {
                        malam.setSelected(true);
                        System.out.println(hasil.getString("waktu"));
                    } else {
                        System.out.println(hasil.getString("waktu")+" KOSONG");
                    }
                }
             }catch (Exception e) {
                   e.printStackTrace();
            }
        } else {
              
        }
}
    
    protected void cek(){
        siang.setEnabled(true);
        malam.setEnabled(true);
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
            String tglcari = ft.format(tgl.getDate());
            String sql = "select * from pemesanan WHERE tanggal='"+tglcari+"' AND kode_ruang= '"+kdgedung.getText()+"' ";  
            System.out.println(sql);
            int xx=0;
            try {
                int x=0;
                Statement stat = conn.createStatement();
                ResultSet hasil = stat.executeQuery(sql);            
                String a="";
                while(hasil.next())
                {
                    xx++;
                }
                System.out.println(xx);
             }catch (Exception e) {
                   e.printStackTrace();
            }
            try
            {
            Statement stat = conn.createStatement();
            ResultSet hasil2 = stat.executeQuery(sql);                   
                if(xx==1)
                {
                    try
                    {
                      if(hasil2.next())
                        {
                            if (hasil2.getString("waktu").equalsIgnoreCase("Siang"))
                            {
                                siang.setEnabled(false);
                                JOptionPane.showMessageDialog(this,"Ruang Tersedia: Malam");
                                System.out.println("Siang");
                            }else if(hasil2.getString("waktu").equalsIgnoreCase("Malam"))
                            {
                                 malam.setEnabled(false);
                                JOptionPane.showMessageDialog(this,"Ruang Tersedia: Siang");
                                System.out.println("Malam");
                            }    
                        }    
                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(this,"error");
                    }
                }
                if(xx==2)
                {
                    siang.setEnabled(false);
                    malam.setEnabled(false);
                   JOptionPane.showMessageDialog(this,"Ruang Tidak Tersedia");
                   System.out.println("Malam");        
                }
            }catch(Exception e)
            {
            
            }
}
    
    protected void tambah_fasilitas(){
    String sql = "select * from pemesanan";  
        try {
            int m=0;
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                fas[m] = hasil.getString("kode_sewa");
                m++;
            }
         }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
  }
  
    private void fasilitas(){
          Date HariSekarang = tgl.getDate();
          SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
          String DateTime = ft.format(HariSekarang);

          try{   
            if(siang.isSelected())pilih="Siang";
             else if(malam.isSelected()) pilih="Malam";
             else 
                 pilih="";
            if(pilih.length()==0){
                JOptionPane.showMessageDialog(this,"Pilih Waktu");
            } else {
                if(nm_penyewa.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"Nama Belum Diisi");
                    nm_penyewa.requestFocus();
                } else {
                    if(notelp.getText().length()==0){
                        JOptionPane.showMessageDialog(this,"Nomor Telepon Belum Diisi");
                        notelp.requestFocus();
                    } else {
                            String sql="Insert into pemesanan (kode_sewa,tanggal,kode_ruang,nama_ruang,"
                                          + "harga,waktu,id_penyewa,nama_penyewa,notelp) values (?,?,?,?,?,?,?,?,?)";  
                             PreparedStatement p=(PreparedStatement)conn.prepareStatement(sql);
                             p.setString(1,kdsewa.getText());
                             p.setString(2,DateTime);
                             p.setString(3,kdgedung.getText());
                             p.setString(4,nama_gedung.getText());
                             p.setString(5,harga.getText());
                             p.setString(6, pilih);
                             p.setString(7,kdpenyewa.getText());
                             p.setString(8,nm_penyewa.getText());
                             p.setString(9,notelp.getText());
                             p.executeUpdate();
                            JOptionPane.showMessageDialog(this,"Data Telah Tersimpan");
                            dispose();
                   }    
               } 
            }
          }catch(SQLException e){ 
            System.out.println(e);  
          }
         
    }
    
    public void simpan(){    
          Date HariSekarang = tgl.getDate();
          SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
          String DateTime = ft.format(HariSekarang);
        
          String xa = "Lunas";
          String b = "Belum Lunas";   
        
          try{   
            if(siang.isSelected())pilih="Siang";
             else if(malam.isSelected()) pilih="Malam";
             else 
                 pilih="";
            if(pilih.length()==0){
                JOptionPane.showMessageDialog(this,"Pilih Waktu");
            } else {
                if(nm_penyewa.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"Nama Belum Diisi");
                    nm_penyewa.requestFocus();
                } else {
                    if(notelp.getText().length()==0){
                        JOptionPane.showMessageDialog(this,"Nomor Telepon Belum Diisi");
                        notelp.requestFocus();
                    } else {
                        if(bayar.getText().length()==0){
                            JOptionPane.showMessageDialog(this,"Pembayaran Belum Diisi");
                            bayar.requestFocus();
                        } else{
                            //String sql="Insert into pemesanan (kode_sewa,tanggal,kode_ruang,nama_ruang,"
                            //              + "harga,waktu,id_penyewa,nama_penyewa,notelp,bayar,status) values (?,?,?,?,?,?,?,?,?,?,?)";  
                             String sql = "INSERT INTO pemesanan VALUES (?,?,?,?,?,?,?,?,?,?)";
                             PreparedStatement p=(PreparedStatement)conn.prepareStatement(sql);
                             p.setString(1,kdsewa.getText());
                             p.setString(2,DateTime);
                             p.setString(3,kdgedung.getText());
                             //p.setString(4,nama_gedung.getText());
                             p.setString(4,harga.getText());
                             p.setString(5, pilih);
                             p.setString(6,kdpenyewa.getText());
                             p.setString(7,nm_penyewa.getText());
                             p.setString(8,notelp.getText());
                             p.setString(9,bayar.getText());
                             String terpilih;
                             //String c = harga.getText();      
                             String d = bayar.getText();
                             String ab = harga.getText();
                             int i = Integer.parseInt(d.trim());
                             int j = Integer.parseInt(ab.trim());
                                  if ( i == j){
                                        terpilih = xa;
                                  }else {
                                         terpilih = b;
                                  }    
                                    p.setString(10,terpilih);
                                    p.executeUpdate();
                                    JOptionPane.showMessageDialog(this,"Data Telah Tersimpan");
                                    //dispose();
                       }
                   }    
               } 
            }
          }catch(SQLException e){ 
            System.out.println(e);  
          }
          kodesewa();  
          kosong();
          cSIMPAN = true;
}
//==========================================================
    
    public penyewaan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        kodesewa();
        penyewa();
        nomor();
        //tambah_fasilitas();
       
        time.hide();
        kdsewa.disable();
        kdpenyewa.disable();
        harga.disable();
        kdgedung.disable();
        nama_gedung.disable();
        
        Date date = new Date();
        tgl.setDate(date);
        //date.getDate(tgl);
 }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wkt = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nama3 = new javax.swing.JLabel();
        kdsewa = new javax.swing.JTextField();
        nama4 = new javax.swing.JLabel();
        nama1 = new javax.swing.JLabel();
        nama_gedung = new javax.swing.JTextField();
        Lokasi = new javax.swing.JLabel();
        siang = new javax.swing.JRadioButton();
        malam = new javax.swing.JRadioButton();
        Harga1 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        Harga = new javax.swing.JLabel();
        tgl = new com.toedter.calendar.JDateChooser();
        Lokasi1 = new javax.swing.JLabel();
        notelp = new javax.swing.JTextField();
        nm_penyewa = new javax.swing.JTextField();
        kdpenyewa = new javax.swing.JTextField();
        nama5 = new javax.swing.JLabel();
        nama2 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        kdgedung = new javax.swing.JTextField();
        cekgedung = new javax.swing.JButton();
        Lokasi2 = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        fasilitas = new javax.swing.JButton();
        nomor = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Penyewaan ");

        nama3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nama3.setText("Kode Sewa");

        kdsewa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        nama4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nama4.setText("Kode Gedung");

        nama1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nama1.setText("Nama Gedung");

        nama_gedung.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        Lokasi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Lokasi.setText("Waktu");

        siang.setBackground(new java.awt.Color(255, 255, 255));
        wkt.add(siang);
        siang.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        siang.setText("Siang");

        malam.setBackground(new java.awt.Color(255, 255, 255));
        wkt.add(malam);
        malam.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        malam.setText("Malam");

        Harga1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Harga1.setText("Harga Sewa");

        harga.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        Harga.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Harga.setText("Tanggal Sewa");

        tgl.setDateFormatString("dd MM yyyy");
        tgl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tgl.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tglInputMethodTextChanged(evt);
            }
        });

        Lokasi1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Lokasi1.setText("No. Telepon");

        notelp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        notelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                notelpKeyPressed(evt);
            }
        });

        nm_penyewa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nm_penyewa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nm_penyewaKeyPressed(evt);
            }
        });

        kdpenyewa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        nama5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nama5.setText("Kode Penyewa");

        nama2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nama2.setText("Nama Penyewa");

        simpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/isave.png"))); // NOI18N
        simpan.setText("Simpan");
        simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        batal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        batal.setForeground(new java.awt.Color(255, 0, 0));
        batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iclose.png"))); // NOI18N
        batal.setText("Batal");
        batal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        kdgedung.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        cekgedung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cekgedung.setForeground(new java.awt.Color(255, 51, 51));
        cekgedung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icek.png"))); // NOI18N
        cekgedung.setText("Cek Ketersediaan");
        cekgedung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekgedungActionPerformed(evt);
            }
        });

        Lokasi2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Lokasi2.setText("Bayar (Rp)");

        bayar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        fasilitas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fasilitas.setForeground(new java.awt.Color(0, 102, 51));
        fasilitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/itambah.png"))); // NOI18N
        fasilitas.setText("Fasilitas");
        fasilitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasilitasActionPerformed(evt);
            }
        });

        nomor.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomor))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Harga, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(nama3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kdsewa, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cekgedung)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(siang)
                        .addGap(4, 4, 4)
                        .addComponent(malam))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Harga1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nama1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addComponent(nama4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kdgedung, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama_gedung, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lokasi1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(Lokasi2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nm_penyewa)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(notelp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(21, 21, 21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kdpenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(fasilitas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fasilitas, simpan});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(nomor)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama5)
                            .addComponent(kdpenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nm_penyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lokasi1)
                            .addComponent(notelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lokasi2)
                            .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batal)
                            .addComponent(simpan)
                            .addComponent(cekgedung)
                            .addComponent(fasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kdsewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Harga)
                            .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kdgedung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama_gedung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Harga1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siang)
                            .addComponent(malam)
                            .addComponent(Lokasi))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {batal, cekgedung, fasilitas, simpan});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {harga, kdgedung, kdpenyewa, kdsewa, nama_gedung, nm_penyewa, notelp});

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
       simpan();
       /*try{
            String sql="Insert into detail (kode_sewa,no,harga,hargabayar,hargafas,bayar,total,gdgfas,ket) "
                    + "values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement p=(PreparedStatement)conn.prepareStatement(sql);
            p.setString(1,kdsewa.getText());
            p.setString(2,nomor.getText());
            p.setString(3,harga.getText());
            p.setString(4,bayar.getText());
            int hargagedung = Integer.parseInt(harga.getText().trim());
            int bayargedung = Integer.parseInt(bayar.getText().trim());
            int hargafas = 0;
            int bayarfas = 0;
            int x = hargafas + hargagedung;
            int z = bayarfas + bayargedung;
            String fasilitas = String.valueOf(hargafas);
            String bfasilitas = String.valueOf(bayarfas);
            p.setString(5,fasilitas);
            p.setString(6,bfasilitas);
            
            int a = bayargedung + bayarfas;
            String total = String.valueOf(a);
            p.setString(7,total);
            
            int b =hargagedung + hargafas;
            String gdgfas = String.valueOf(b);
            p.setString(8,gdgfas);
            
            String pilih="";
            if( a < b ){
                pilih="Tidak Lunas";
            }else pilih="Lunas";
            p.setString(9,pilih);
            p.executeUpdate();
            p.close();
        }catch(SQLException e){
            System.out.println(e);
        }finally{
            JOptionPane.showMessageDialog(this,"Data Telah Tersimpan");
        }*/
    }//GEN-LAST:event_simpanActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        kosong();
    }//GEN-LAST:event_batalActionPerformed

    private void tglInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tglInputMethodTextChanged
        cektanggal();
    }//GEN-LAST:event_tglInputMethodTextChanged

    private void cekgedungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekgedungActionPerformed
        cek();
    }//GEN-LAST:event_cekgedungActionPerformed
    
    private void fasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasilitasActionPerformed
         //fasilitas();
         kodepenyewaan = kdsewa.getText();
         hargapenyewaan = harga.getText();
         if(cSIMPAN == false) simpan();
         fasilitas f = new fasilitas();  
        // f.setkd_sewa(fas[m]);
         f.setVisible(true);
         dispose();
    }//GEN-LAST:event_fasilitasActionPerformed

    private void nm_penyewaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nm_penyewaKeyPressed
         if(evt.getKeyCode() == evt.VK_ENTER){
            notelp.requestFocus();
        }
    }//GEN-LAST:event_nm_penyewaKeyPressed

    private void notelpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notelpKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            bayar.requestFocus();
        }
    }//GEN-LAST:event_notelpKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                penyewaan dialog = new penyewaan(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Harga;
    private javax.swing.JLabel Harga1;
    private javax.swing.JLabel Lokasi;
    private javax.swing.JLabel Lokasi1;
    private javax.swing.JLabel Lokasi2;
    private javax.swing.JButton batal;
    private javax.swing.JTextField bayar;
    private javax.swing.JButton cekgedung;
    private javax.swing.JButton fasilitas;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kdgedung;
    private javax.swing.JTextField kdpenyewa;
    private javax.swing.JTextField kdsewa;
    private javax.swing.JRadioButton malam;
    private javax.swing.JLabel nama1;
    private javax.swing.JLabel nama2;
    private javax.swing.JLabel nama3;
    private javax.swing.JLabel nama4;
    private javax.swing.JLabel nama5;
    private javax.swing.JTextField nama_gedung;
    private javax.swing.JTextField nm_penyewa;
    private javax.swing.JLabel nomor;
    private javax.swing.JTextField notelp;
    private javax.swing.JRadioButton siang;
    private javax.swing.JButton simpan;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JTextField time;
    private javax.swing.ButtonGroup wkt;
    // End of variables declaration//GEN-END:variables
}