package gui;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.konek;

public class fasilitas extends javax.swing.JFrame {
    String kd_sewa = penyewaan.getkodepenyewaan();
    String hrg_gedung = penyewaan.gethargapenyewaan();
    
    private Connection conn = new konek().connect();
    private DefaultTableModel tabmode, model;

    public void setkd_sewa(){
        kdsewa.setText(kd_sewa);
    } 
    
    public void sethrg_gedung(){
        hrgedung.setText(hrg_gedung);
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
    
    
    
    
    //nampilin tabel fasilitas
    protected void datatable(){
        Object[] Baris = {"No.","Nama Barang","Harga","Keterangan"};
        tabmode = new DefaultTableModel(null, Baris);
        tablefasilitas.setModel(tabmode);
        String sql = "select * from fasilitas;";
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("kd_fasilitas");
                String b = hasil.getString("nama_barang");
                String c = hasil.getString("harga_barang");
                String d = hasil.getString("keterangan");                                             
                String[] data={a,b,c,d};
                tabmode.addRow(data);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
    
    public fasilitas() {
        initComponents();
        setkd_sewa();
        sethrg_gedung();
        this.setLocationRelativeTo(null);
        harga.hide();       
        datatable();
        nomor();
        nomor.hide();
        gedung.hide();
        loadData();
        
    }
    
    protected void loadData(){
        Object[] Baris = {"Nama Barang","Harga","Jumlah","Total"};
        model =new DefaultTableModel(null, Baris);
        tabledetail.setModel(model);
        try {
            Statement stat = conn.createStatement();
            //String sql = "SELECT * FROM  pesan_fasilitas WHERE kode_sewa='"+kdsewa.getText()+"'";
            String sql = "SELECT fs.nama_barang, fs.harga_barang, pf.qty,"
                    + "pf.subtot "
                    + "FROM fasilitas AS fs, pesan_fasilitas AS pf "
                    + "WHERE fs.kd_fasilitas = pf.kd_fasilitas "
                    + "AND pf.kode_sewa = '"+kdsewa.getText()+"'";
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("nama_barang");
                String b = hasil.getString("harga_barang");
                String c = hasil.getString("qty");
                String d = hasil.getString("subtot");             
                String[] data={a,b,c,d};
                model.addRow(data);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        int total = 0;
        for (int i =0; i< tabledetail.getRowCount(); i++){
            double amount = Double.parseDouble((String)tabledetail.getValueAt(i, 3).toString());
            total += amount;
        }
        tftotal.setText(""+total);
    }  
    
    
     public void subtotal(){     
       int a, b, c, d;
        a = Integer.parseInt(harga.getText());
        b = Integer.parseInt(Qty.getText());
        //jumlah1.setText("1");
        if(jumlah1.getText().length()==0){
            jumlah1.setText("1");
        }
        else
            jumlah1.getText();
        
        c = Integer.parseInt(jumlah1.getText());
        d = a*b*c;
        String hsl = Integer.toString(d);
        subtotal.setText(""+hsl);
    }   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tftotal = new javax.swing.JTextField();
        bsimpan = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfbayar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabledetail = new javax.swing.JTable();
        gedung = new javax.swing.JTextField();
        keterangan = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablefasilitas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Qty = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kdsewa = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        barang = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        btambah = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        barang1 = new javax.swing.JLabel();
        ket = new javax.swing.JLabel();
        kdFasilitas = new javax.swing.JLabel();
        nomor = new javax.swing.JTextField();
        jumlah1 = new javax.swing.JTextField();
        nomor1 = new javax.swing.JTextField();
        hrgedung = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Fasilitas Tambahan ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Total Fasilitas (Rp)");

        bsimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bsimpan.setForeground(new java.awt.Color(255, 0, 0));
        bsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/isave.png"))); // NOI18N
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bhapus.setBackground(new java.awt.Color(255, 255, 255));
        bhapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bhapus.setForeground(new java.awt.Color(153, 0, 204));
        bhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ihapus.png"))); // NOI18N
        bhapus.setText("Hapus");
        bhapus.setBorder(null);
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Uang Bayar (Rp)");

        tabledetail.setBackground(new java.awt.Color(0, 102, 0));
        tabledetail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabledetail.setForeground(new java.awt.Color(255, 255, 255));
        tabledetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Nama Barang", "Harga", "Jumlah", "Subtotal"
            }
        ));
        tabledetail.setAlignmentX(1.0F);
        tabledetail.setAlignmentY(1.0F);
        tabledetail.setAutoscrolls(false);
        tabledetail.setGridColor(new java.awt.Color(0, 102, 0));
        tabledetail.setSelectionBackground(new java.awt.Color(0, 204, 153));
        jScrollPane2.setViewportView(tabledetail);

        keterangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        keterangan.setText("Total Fasilitas (Rp)");

        total.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        total.setText("Total Fasilitas (Rp)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(bhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(keterangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(tfbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(gedung, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keterangan)
                    .addComponent(total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(tfbayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gedung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bhapus)
                    .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tablefasilitas.setBackground(new java.awt.Color(0, 102, 0));
        tablefasilitas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablefasilitas.setForeground(new java.awt.Color(255, 255, 255));
        tablefasilitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Nama Barang", "Harga", "Keterangan"
            }
        ));
        tablefasilitas.setAlignmentX(1.0F);
        tablefasilitas.setAlignmentY(1.0F);
        tablefasilitas.setAutoscrolls(false);
        tablefasilitas.setGridColor(new java.awt.Color(0, 102, 0));
        tablefasilitas.setSelectionBackground(new java.awt.Color(0, 204, 153));
        tablefasilitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablefasilitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablefasilitas);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Jumlah");

        Qty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                QtyKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Sub Total(Rp)");

        kdsewa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kdsewa.setText("Kode Sewa");

        subtotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        barang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        barang.setForeground(new java.awt.Color(0, 102, 0));
        barang.setText("Nama Barang");

        harga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        harga.setText("Harga");

        btambah.setBackground(new java.awt.Color(255, 255, 255));
        btambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btambah.setForeground(new java.awt.Color(0, 153, 0));
        btambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/itambah.png"))); // NOI18N
        btambah.setText("Tambah");
        btambah.setToolTipText("");
        btambah.setBorder(null);
        btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btambahActionPerformed(evt);
            }
        });

        bbatal.setBackground(new java.awt.Color(255, 255, 255));
        bbatal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bbatal.setForeground(new java.awt.Color(255, 0, 51));
        bbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icancel.png"))); // NOI18N
        bbatal.setText("Batal    ");
        bbatal.setToolTipText("");
        bbatal.setBorder(null);
        bbatal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        barang1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        barang1.setText("Nama Barang");

        ket.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ket.setText("ket");

        kdFasilitas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kdFasilitas.setText("Kode Fasilitas");

        nomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorActionPerformed(evt);
            }
        });

        jumlah1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jumlah1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jumlah1KeyPressed(evt);
            }
        });

        nomor1.setText("x");
        nomor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomor1ActionPerformed(evt);
            }
        });

        hrgedung.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hrgedung.setText("Harga Gedung");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nomor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(ket, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(barang1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(barang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kdFasilitas)
                                        .addGap(63, 63, 63))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(kdsewa)
                                        .addGap(36, 36, 36)
                                        .addComponent(hrgedung)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kdsewa)
                        .addComponent(hrgedung)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barang1)
                            .addComponent(barang)
                            .addComponent(harga)
                            .addComponent(kdFasilitas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(ket)
                            .addComponent(jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btambah)
                                    .addComponent(bbatal))
                                .addGap(42, 42, 42))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QtyKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            subtotal();
        }
    }//GEN-LAST:event_QtyKeyPressed

    private void tablefasilitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablefasilitasMouseClicked
        int bar = tablefasilitas.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        kdFasilitas.setText(a);
        barang.setText(b);
        harga.setText(c);
        ket.setText("/ "+d);
    }//GEN-LAST:event_tablefasilitasMouseClicked

    private void btambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btambahActionPerformed
        try{   
            //versi database Trw
            //String sql="Insert into pesan_fasilitas(no,kode_sewa,kd_fasilitas,nama_barang"
            //        + ",harga_barang,qty,subtot) values (?,?,?,?,?,?,?)";
            //versi database Devtrw
            String sql="INSERT INTO pesan_fasilitas VALUES (?,?,?,?,?)";
            PreparedStatement p=(PreparedStatement)conn.prepareStatement(sql);  
            p.setString(1,nomor.getText());
            p.setString(2,kdsewa.getText());
            p.setString(3,kdFasilitas.getText());
            //p.setString(4,barang.getText());
            //p.setString(5,harga.getText());
            p.setInt(4,Integer.valueOf(Qty.getText()) );
            p.setInt(5,Integer.valueOf(subtotal.getText()) );
            p.executeUpdate();
            p.close();
        }catch(SQLException e){ 
            System.out.println(e);  
        }finally{  
            JOptionPane.showMessageDialog(this,"Data Telah Tersimpan");  
       }
        loadData();
        Qty.setText("");
        subtotal.setText("");
        nomor();
        ambilharga();
    }//GEN-LAST:event_btambahActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        datatable();
        Qty.setText("");
        subtotal.setText("");
    }//GEN-LAST:event_bbatalActionPerformed

    private void nomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorActionPerformed

    private void jumlah1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlah1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah1KeyPressed

    private void nomor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomor1ActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        try {
            String sql="delete from detail where kode_sewa='"+this.kdsewa.getText()+"' ";
            PreparedStatement p=(PreparedStatement)conn.prepareStatement(sql);
            p.executeUpdate();
            p.close();
        }catch(SQLException e){
            System.out.println("Terjadi Kesalahan");
        }finally{
            JOptionPane.showMessageDialog(this,"Sukses Hapus Data...");
        }
    }//GEN-LAST:event_bhapusActionPerformed

    protected void ambilharga(){
        
        String sql = "select * from pemesanan where kode_sewa='"+kdsewa.getText()+"'";     
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String h = hasil.getString("bayar");
                gedung.setText(h);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        try{
            //String sql="Insert into detail (kode_sewa,no,harga,hargabayar,hargafas,bayar,total,gdgfas,ket) "
            //        + "values (?,?,?,?,?,?,?,?,?)";
            //Versi DevTrw
            String sql="INSERT INTO detail VALUES(?,?,?,?)";
            PreparedStatement p=(PreparedStatement)conn.prepareStatement(sql);
            p.setString(1,kdsewa.getText());
            p.setString(2,nomor.getText());
            p.setString(3,tftotal.getText());
            //p.setString(4,gedung.getText());
            //p.setString(3,hrgedung.getText());
            //p.setString(6,tfbayar.getText());
            
            int a = Integer.parseInt(gedung.getText().trim());
            int b = Integer.parseInt(tfbayar.getText().trim());
            int c = a + b;
            String d = String.valueOf(c);
            total.setText(d);
            //p.setString(7,total.getText());
            
            int e = Integer.parseInt(tftotal.getText().trim());
            int f = Integer.parseInt(hrgedung.getText().trim());
            String g = String.valueOf(e+f);
            //p.setString(8,g);
            
            String pilih="";
            if( c < ( e + f ) ){
                pilih="Tidak Lunas";
            }else pilih="Lunas";
            p.setString(4,pilih);
            p.executeUpdate();
            p.close();
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("INSERT INTO detail VALUES(?,?,?,?)");
            System.out.println("kode_sewa="+kdsewa.getText()+" \nnomor="+nomor.getText()+" \nhargafas="+tftotal.getText()+" \nket=LUNAS");
        }finally{
            JOptionPane.showMessageDialog(this,"Data Telah Tersimpan");
        }
        tftotal.setText("");
        tfbayar.setText("");
        
    }//GEN-LAST:event_bsimpanActionPerformed

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
            java.util.logging.Logger.getLogger(fasilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fasilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fasilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fasilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fasilitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Qty;
    private javax.swing.JLabel barang;
    private javax.swing.JLabel barang1;
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton btambah;
    private javax.swing.JTextField gedung;
    private javax.swing.JLabel harga;
    private javax.swing.JLabel hrgedung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jumlah1;
    private javax.swing.JLabel kdFasilitas;
    private javax.swing.JLabel kdsewa;
    private javax.swing.JLabel ket;
    private javax.swing.JLabel keterangan;
    private javax.swing.JTextField nomor;
    private javax.swing.JTextField nomor1;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabledetail;
    private javax.swing.JTable tablefasilitas;
    private javax.swing.JTextField tfbayar;
    private javax.swing.JTextField tftotal;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
