package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import koneksi.konek;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class menu extends javax.swing.JFrame {

 public void setTanggal(){
        Date skrg = new Date();
        SimpleDateFormat kal = new SimpleDateFormat("E, dd MMMM yyyy");
        tanggal.setText(kal.format(skrg));
    }  
    
    public void setJam(){
    ActionListener taskPerformer = new ActionListener() {

        public void actionPerformed(ActionEvent evt){
              
        String nol_jam = "", nol_menit = "",nol_detik = "";

        java.util.Date dateTime = new java.util.Date();
        int nilai_jam = dateTime.getHours();
        int nilai_menit = dateTime.getMinutes();
        int nilai_detik = dateTime.getSeconds();

        if(nilai_jam <= 9) nol_jam= "0";
        if(nilai_menit <= 9) nol_menit= "0";
        if(nilai_detik <= 9) nol_detik= "0";

        String waktu = nol_jam + Integer.toString(nilai_jam);
        String menit = nol_menit + Integer.toString(nilai_menit);
        String detik = nol_detik + Integer.toString(nilai_detik);

        time.setText(waktu+":"+menit+":"+detik+" WIB");
        
        }              
    };
        new Timer(1000, taskPerformer).start();
}    
    
    private Connection conn = new konek().connect();
   
    
    public menu() {
        initComponents();
        this.setTitle("Aplikasi Penyewaan Ruang Diklat");
        this.setLocationRelativeTo(null);
        setTanggal();
        setJam();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneldasar = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        tanggal1 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        paneldasar2 = new javax.swing.JPanel();
        penginapan = new javax.swing.JButton();
        jadwal = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        saung = new javax.swing.JButton();
        gedung = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        laporan = new javax.swing.JMenu();
        keuangangedung = new javax.swing.JMenu();
        dewantoro = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        KartiniI = new javax.swing.JMenuItem();
        KartiniII = new javax.swing.JMenuItem();
        mawardi = new javax.swing.JMenuItem();
        kusumo = new javax.swing.JMenuItem();
        pandan = new javax.swing.JMenuItem();
        puspita = new javax.swing.JMenuItem();
        AgusSalim = new javax.swing.JMenuItem();
        sarbini = new javax.swing.JMenuItem();
        Sudirman = new javax.swing.JMenuItem();
        keuangansaung = new javax.swing.JMenuItem();
        keuanganpenginapan = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        pgedung = new javax.swing.JMenu();
        dewantoro1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        KartiniI1 = new javax.swing.JMenuItem();
        KartiniII1 = new javax.swing.JMenuItem();
        mawardi1 = new javax.swing.JMenuItem();
        kusumo1 = new javax.swing.JMenuItem();
        pandan1 = new javax.swing.JMenuItem();
        puspita1 = new javax.swing.JMenuItem();
        AgusSalim1 = new javax.swing.JMenuItem();
        sarbini1 = new javax.swing.JMenuItem();
        Sudirman1 = new javax.swing.JMenuItem();
        psaung = new javax.swing.JMenuItem();
        ppenginapan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU UTAMA APLIKASI PENYEWAAN RUANG DIKLAT BERBASIS JAVA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneldasar.setBackground(new java.awt.Color(51, 102, 0));

        panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panel.setPreferredSize(new java.awt.Dimension(595, 480));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panel2.setPreferredSize(new java.awt.Dimension(595, 480));
        panel2.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APLIKASI PENYEWAAN RUANG DIKLAT");

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TAMAN REKREASI WILADATIKA CIBUBUR");

        tanggal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanggal.setForeground(new java.awt.Color(204, 255, 204));
        tanggal.setText("TANGGAL");

        time.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(204, 255, 204));
        time.setText("WAKTU");

        tanggal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanggal1.setForeground(new java.awt.Color(255, 255, 255));
        tanggal1.setText("TANGGAL : ");

        time1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("PUKUL : ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/wiladatika.png"))); // NOI18N

        javax.swing.GroupLayout paneldasarLayout = new javax.swing.GroupLayout(paneldasar);
        paneldasar.setLayout(paneldasarLayout);
        paneldasarLayout.setHorizontalGroup(
            paneldasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldasarLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(paneldasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldasarLayout.createSequentialGroup()
                        .addGroup(paneldasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldasarLayout.createSequentialGroup()
                        .addGroup(paneldasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paneldasarLayout.createSequentialGroup()
                                .addComponent(tanggal1)
                                .addGap(1, 1, 1)
                                .addComponent(tanggal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneldasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paneldasarLayout.createSequentialGroup()
                                .addComponent(time1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(time)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        paneldasarLayout.setVerticalGroup(
            paneldasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldasarLayout.createSequentialGroup()
                .addGroup(paneldasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneldasarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneldasarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addGap(27, 27, 27)
                .addGroup(paneldasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggal)
                    .addComponent(tanggal1)
                    .addComponent(time)
                    .addComponent(time1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneldasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(paneldasar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 1230, 730));

        paneldasar2.setBackground(new java.awt.Color(0, 0, 0));
        paneldasar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        penginapan.setBackground(new java.awt.Color(255, 255, 255));
        penginapan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        penginapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ihome.png"))); // NOI18N
        penginapan.setText("Penginapan");
        penginapan.setActionCommand("");
        penginapan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        penginapan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        penginapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penginapanActionPerformed(evt);
            }
        });
        paneldasar2.add(penginapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, 30));

        jadwal.setBackground(new java.awt.Color(255, 255, 255));
        jadwal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ijadwal.png"))); // NOI18N
        jadwal.setText("Jadwal");
        jadwal.setActionCommand("");
        jadwal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadwalActionPerformed(evt);
            }
        });
        paneldasar2.add(jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 100, 30));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iexit.png"))); // NOI18N
        logout.setText("Logout");
        logout.setActionCommand("");
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        paneldasar2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 100, 30));

        saung.setBackground(new java.awt.Color(255, 255, 255));
        saung.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        saung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/igedung.png"))); // NOI18N
        saung.setText("Saung");
        saung.setActionCommand("");
        saung.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        saung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saungActionPerformed(evt);
            }
        });
        paneldasar2.add(saung, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 30));

        gedung.setBackground(new java.awt.Color(255, 255, 255));
        gedung.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        gedung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/igedung.png"))); // NOI18N
        gedung.setText("Gedung");
        gedung.setActionCommand("");
        gedung.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gedung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gedung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gedungActionPerformed(evt);
            }
        });
        paneldasar2.add(gedung, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 30));

        getContentPane().add(paneldasar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 730));

        laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/idata.png"))); // NOI18N
        laporan.setText("Laporan Keuangan");
        laporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanActionPerformed(evt);
            }
        });

        keuangangedung.setText("Keuangan Gedung");
        keuangangedung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keuangangedungMouseClicked(evt);
            }
        });
        keuangangedung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keuangangedungActionPerformed(evt);
            }
        });

        dewantoro.setText("Dewantoro");
        dewantoro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dewantoro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dewantoroMouseClicked(evt);
            }
        });
        dewantoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dewantoroActionPerformed(evt);
            }
        });
        keuangangedung.add(dewantoro);

        jMenu1.setText("Kartini");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        KartiniI.setText("Kartini I");
        KartiniI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KartiniI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KartiniIActionPerformed(evt);
            }
        });
        jMenu1.add(KartiniI);

        KartiniII.setText("Kartini II");
        KartiniII.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KartiniII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KartiniIIActionPerformed(evt);
            }
        });
        jMenu1.add(KartiniII);

        keuangangedung.add(jMenu1);

        mawardi.setText("Mawardi I");
        mawardi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mawardi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mawardiActionPerformed(evt);
            }
        });
        keuangangedung.add(mawardi);

        kusumo.setText("Parang Kusumo");
        kusumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kusumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kusumoActionPerformed(evt);
            }
        });
        keuangangedung.add(kusumo);

        pandan.setText("Pandansari");
        pandan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pandan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pandanActionPerformed(evt);
            }
        });
        keuangangedung.add(pandan);

        puspita.setText("Puspitasari");
        puspita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        puspita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puspitaActionPerformed(evt);
            }
        });
        keuangangedung.add(puspita);

        AgusSalim.setText("R.H Agus Salim");
        AgusSalim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgusSalim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgusSalimActionPerformed(evt);
            }
        });
        keuangangedung.add(AgusSalim);

        sarbini.setText("Sarbini");
        sarbini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sarbini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sarbiniActionPerformed(evt);
            }
        });
        keuangangedung.add(sarbini);

        Sudirman.setText("Sudirman");
        Sudirman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SudirmanActionPerformed(evt);
            }
        });
        keuangangedung.add(Sudirman);

        laporan.add(keuangangedung);

        keuangansaung.setText("Keuangan Saung");
        keuangansaung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keuangansaung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keuangansaungActionPerformed(evt);
            }
        });
        laporan.add(keuangansaung);

        keuanganpenginapan.setText("Keuangan Penginapan");
        keuanganpenginapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keuanganpenginapanActionPerformed(evt);
            }
        });
        laporan.add(keuanganpenginapan);

        jMenuBar2.add(laporan);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/idata.png"))); // NOI18N
        jMenu2.setText("Laporan Penyewaan");

        pgedung.setText("Penyewaan Gedung");
        pgedung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pgedungMouseClicked(evt);
            }
        });
        pgedung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgedungActionPerformed(evt);
            }
        });

        dewantoro1.setText("Dewantoro");
        dewantoro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dewantoro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dewantoro1ActionPerformed(evt);
            }
        });
        pgedung.add(dewantoro1);

        jMenu3.setText("Kartini");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        KartiniI1.setText("Kartini I");
        KartiniI1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KartiniI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KartiniI1ActionPerformed(evt);
            }
        });
        jMenu3.add(KartiniI1);

        KartiniII1.setText("Kartini II");
        KartiniII1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KartiniII1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KartiniII1ActionPerformed(evt);
            }
        });
        jMenu3.add(KartiniII1);

        pgedung.add(jMenu3);

        mawardi1.setText("Mawardi I");
        mawardi1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mawardi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mawardi1ActionPerformed(evt);
            }
        });
        pgedung.add(mawardi1);

        kusumo1.setText("Parang Kusumo");
        kusumo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kusumo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kusumo1ActionPerformed(evt);
            }
        });
        pgedung.add(kusumo1);

        pandan1.setText("Pandansari");
        pandan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pandan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pandan1ActionPerformed(evt);
            }
        });
        pgedung.add(pandan1);

        puspita1.setText("Puspitasari");
        puspita1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        puspita1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puspita1ActionPerformed(evt);
            }
        });
        pgedung.add(puspita1);

        AgusSalim1.setText("R.H Agus Salim");
        AgusSalim1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgusSalim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgusSalim1ActionPerformed(evt);
            }
        });
        pgedung.add(AgusSalim1);

        sarbini1.setText("Sarbini");
        sarbini1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sarbini1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sarbini1ActionPerformed(evt);
            }
        });
        pgedung.add(sarbini1);

        Sudirman1.setText("Sudirman");
        Sudirman1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sudirman1ActionPerformed(evt);
            }
        });
        pgedung.add(Sudirman1);

        jMenu2.add(pgedung);

        psaung.setText("Penyewaan Saung");
        psaung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psaungActionPerformed(evt);
            }
        });
        jMenu2.add(psaung);

        ppenginapan.setText("Penyewaan Penginapan");
        ppenginapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppenginapanActionPerformed(evt);
            }
        });
        jMenu2.add(ppenginapan);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void penginapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penginapanActionPerformed
        daftar_penginapan m = new daftar_penginapan();
        panel.add(m);
        m.setVisible(true);
    }//GEN-LAST:event_penginapanActionPerformed

    private void jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadwalActionPerformed
        jadwal m = new jadwal();
        panel2.add(m);
        m.setVisible(true);
    }//GEN-LAST:event_jadwalActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        login n = new login();
        n.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(menu.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void saungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saungActionPerformed
        daftar_saung m = new daftar_saung();
        panel.add(m);
        m.setVisible(true);
    }//GEN-LAST:event_saungActionPerformed

    private void gedungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gedungActionPerformed
        daftar_gedung n = new daftar_gedung();
        panel.add(n);
        n.setVisible(true);
    }//GEN-LAST:event_gedungActionPerformed

    private void SudirmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SudirmanActionPerformed
        try {
            HashMap data = new HashMap();
            String lap=("./src/laporan/KSudir.jasper");
            JasperPrint jp = JasperFillManager.fillReport(lap, data, conn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setTitle("Laporan Gedung Sudirman");
            jv.setVisible(true);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Gagal Menampilkan Laporan!");
        }
    }//GEN-LAST:event_SudirmanActionPerformed

    private void AgusSalimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgusSalimActionPerformed
        try {
            HashMap data = new HashMap();
            String lap=("./src/laporan/KAgus.jasper");
            JasperPrint jp = JasperFillManager.fillReport(lap, data, conn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setTitle("Laporan Gedung R.H.Agus Salim");
            jv.setVisible(true);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Gagal Menampilkan Laporan!");
        }
        //coba dari komputer riza
    }//GEN-LAST:event_AgusSalimActionPerformed

    private void KartiniIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KartiniIIActionPerformed
        try {
            HashMap data = new HashMap();
            String lap=("./src/laporan/KKar2.jasper");
            JasperPrint jp = JasperFillManager.fillReport(lap, data, conn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setTitle("Laporan Gedung Kartini II");
            jv.setVisible(true);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Gagal Menampilkan Laporan!");
        }
    }//GEN-LAST:event_KartiniIIActionPerformed

    private void KartiniIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KartiniIActionPerformed
        try {
            HashMap data = new HashMap();
            String lap=("./src/laporan/KKar1.jasper");
            JasperPrint jp = JasperFillManager.fillReport(lap, data, conn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setTitle("Laporan Gedung Kartini I");
            jv.setVisible(true);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Gagal Menampilkan Laporan!");
        }
    }//GEN-LAST:event_KartiniIActionPerformed

    private void dewantoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dewantoroActionPerformed
             try {
            HashMap data = new HashMap();
            String lap=("./src/laporan/KDewan.jasper");
            JasperPrint jp = JasperFillManager.fillReport(lap, data, conn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setTitle("Laporan Gedung Dewantoro");
            jv.setVisible(true);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Gagal Menampilkan Laporan!");
        }             
    }//GEN-LAST:event_dewantoroActionPerformed

    private void keuangansaungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keuangansaungActionPerformed
        periode_saung n = new periode_saung();
        n.setVisible(true);
        /*try {
            HashMap data = new HashMap();
            String lap=("./src/laporan/keuangan_saung.jasper");
            JasperPrint jp = JasperFillManager.fillReport(lap, data, conn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setTitle("Laporan Penyewaan Ruang Diklat");
            jv.setVisible(true);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Gagal Menampilkan Laporan!");
        }
        */
    }//GEN-LAST:event_keuangansaungActionPerformed

    private void keuangangedungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keuangangedungActionPerformed
        periode_gedung n = new periode_gedung();
        n.setVisible(true);
    }//GEN-LAST:event_keuangangedungActionPerformed

    private void keuanganpenginapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keuanganpenginapanActionPerformed
        periode_penginapan n = new periode_penginapan();
        n.setVisible(true);
    }//GEN-LAST:event_keuanganpenginapanActionPerformed

    private void laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanActionPerformed
    
    }//GEN-LAST:event_laporanActionPerformed

    private void psaungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psaungActionPerformed
        psewa_saung n = new psewa_saung();
        n.setVisible(true);
    }//GEN-LAST:event_psaungActionPerformed

    private void pgedungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgedungActionPerformed
        psewa_gedung n = new psewa_gedung();
        n.setVisible(true);
    }//GEN-LAST:event_pgedungActionPerformed

    private void kusumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kusumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kusumoActionPerformed

    private void pandanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pandanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pandanActionPerformed

    private void puspitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puspitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puspitaActionPerformed

    private void mawardiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mawardiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mawardiActionPerformed

    private void sarbiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sarbiniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sarbiniActionPerformed

    private void ppenginapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppenginapanActionPerformed
        psewa_penginapan n = new psewa_penginapan();
        n.setVisible(true);
    }//GEN-LAST:event_ppenginapanActionPerformed

    private void pgedungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pgedungMouseClicked
        psewa_gedung n = new psewa_gedung();
        n.setVisible(true);
    }//GEN-LAST:event_pgedungMouseClicked

    private void keuangangedungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keuangangedungMouseClicked
        periode_gedung n = new periode_gedung();
        n.setVisible(true);
    }//GEN-LAST:event_keuangangedungMouseClicked

    private void dewantoro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dewantoro1ActionPerformed
       try {
            HashMap data = new HashMap();
            String lap=("./src/laporan/PDewan.jasper");
            JasperPrint jp = JasperFillManager.fillReport(lap, data, conn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setTitle("Laporan Gedung Dewantoro");
            jv.setVisible(true);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Gagal Menampilkan Laporan!");
        }
        
    }//GEN-LAST:event_dewantoro1ActionPerformed

    private void KartiniI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KartiniI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KartiniI1ActionPerformed

    private void KartiniII1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KartiniII1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KartiniII1ActionPerformed

    private void mawardi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mawardi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mawardi1ActionPerformed

    private void kusumo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kusumo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kusumo1ActionPerformed

    private void pandan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pandan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pandan1ActionPerformed

    private void puspita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puspita1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puspita1ActionPerformed

    private void AgusSalim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgusSalim1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgusSalim1ActionPerformed

    private void sarbini1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sarbini1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sarbini1ActionPerformed

    private void Sudirman1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sudirman1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sudirman1ActionPerformed

    private void dewantoroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dewantoroMouseClicked
         
    }//GEN-LAST:event_dewantoroMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgusSalim;
    private javax.swing.JMenuItem AgusSalim1;
    private javax.swing.JMenuItem KartiniI;
    private javax.swing.JMenuItem KartiniI1;
    private javax.swing.JMenuItem KartiniII;
    private javax.swing.JMenuItem KartiniII1;
    private javax.swing.JMenuItem Sudirman;
    private javax.swing.JMenuItem Sudirman1;
    private javax.swing.JMenuItem dewantoro;
    private javax.swing.JMenuItem dewantoro1;
    private javax.swing.JButton gedung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JButton jadwal;
    private javax.swing.JMenu keuangangedung;
    private javax.swing.JMenuItem keuanganpenginapan;
    private javax.swing.JMenuItem keuangansaung;
    private javax.swing.JMenuItem kusumo;
    private javax.swing.JMenuItem kusumo1;
    private javax.swing.JMenu laporan;
    private javax.swing.JButton logout;
    private javax.swing.JMenuItem mawardi;
    private javax.swing.JMenuItem mawardi1;
    private javax.swing.JMenuItem pandan;
    private javax.swing.JMenuItem pandan1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel paneldasar;
    private javax.swing.JPanel paneldasar2;
    private javax.swing.JButton penginapan;
    private javax.swing.JMenu pgedung;
    private javax.swing.JMenuItem ppenginapan;
    private javax.swing.JMenuItem psaung;
    private javax.swing.JMenuItem puspita;
    private javax.swing.JMenuItem puspita1;
    private javax.swing.JMenuItem sarbini;
    private javax.swing.JMenuItem sarbini1;
    private javax.swing.JButton saung;
    private javax.swing.JLabel tanggal;
    private javax.swing.JLabel tanggal1;
    private javax.swing.JLabel time;
    private javax.swing.JLabel time1;
    // End of variables declaration//GEN-END:variables
}