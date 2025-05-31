package Form;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import Database.database;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class PusatAdmin extends javax.swing.JPanel {

    private Connection conn;
    
    public PusatAdmin() {
        initComponents();
        conn = database.getConnetion();
        getDataKasir();
        getDataProduk();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_main = new javax.swing.JPanel();
        pn_2button = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tPusatAdmin = new javax.swing.JLabel();
        roundPusatAdmin1 = new swing.RoundPusatAdmin();
        btnToKasir = new necesario.RSMaterialButtonCircle();
        btnToProduk = new necesario.RSMaterialButtonCircle();
        pn_kasir = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tPusatAdmin1 = new javax.swing.JLabel();
        btnBackKasir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKasir = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        CBPosisi = new javax.swing.JComboBox<>();
        CBrfid = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kasir = new javax.swing.JTable();
        btnTambahK = new javax.swing.JButton();
        btnPerbaruiK = new javax.swing.JButton();
        btnBatalK = new javax.swing.JButton();
        btnHapusK = new javax.swing.JButton();
        pn_produk = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tPusatAdmin2 = new javax.swing.JLabel();
        btnBackProduk = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_produk = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIDProduk = new javax.swing.JTextField();
        txtProduk = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        CBStok = new javax.swing.JComboBox<>();
        CBKategori = new javax.swing.JComboBox<>();
        txtBarcode = new javax.swing.JTextField();
        btnTambahP = new javax.swing.JButton();
        btnPerbaruiP = new javax.swing.JButton();
        btnBatalP = new javax.swing.JButton();
        btnHapusP = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 224, 234));
        setLayout(new java.awt.CardLayout());

        pn_main.setBackground(new java.awt.Color(230, 224, 234));
        pn_main.setLayout(new java.awt.CardLayout());

        pn_2button.setBackground(new java.awt.Color(230, 224, 234));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tPusatAdmin.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tPusatAdmin.setForeground(new java.awt.Color(119, 74, 123));
        tPusatAdmin.setText("Pusat Admin");
        tPusatAdmin.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tPusatAdmin)
                .addContainerGap(629, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tPusatAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPusatAdmin1.setRoundBottomLeft(100);
        roundPusatAdmin1.setRoundBottomRight(100);
        roundPusatAdmin1.setRoundTopLeft(100);
        roundPusatAdmin1.setRoundTopRight(100);

        btnToKasir.setBackground(new java.awt.Color(230, 224, 234));
        btnToKasir.setForeground(new java.awt.Color(119, 74, 123));
        btnToKasir.setText("Kasir");
        btnToKasir.setToolTipText("");
        btnToKasir.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btnToKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToKasirActionPerformed(evt);
            }
        });

        btnToProduk.setBackground(new java.awt.Color(230, 224, 234));
        btnToProduk.setForeground(new java.awt.Color(119, 74, 123));
        btnToProduk.setText("Produk");
        btnToProduk.setToolTipText("");
        btnToProduk.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btnToProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToProdukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPusatAdmin1Layout = new javax.swing.GroupLayout(roundPusatAdmin1);
        roundPusatAdmin1.setLayout(roundPusatAdmin1Layout);
        roundPusatAdmin1Layout.setHorizontalGroup(
            roundPusatAdmin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPusatAdmin1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnToKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(btnToProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        roundPusatAdmin1Layout.setVerticalGroup(
            roundPusatAdmin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPusatAdmin1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(roundPusatAdmin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnToProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_2buttonLayout = new javax.swing.GroupLayout(pn_2button);
        pn_2button.setLayout(pn_2buttonLayout);
        pn_2buttonLayout.setHorizontalGroup(
            pn_2buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_2buttonLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(pn_2buttonLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(roundPusatAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_2buttonLayout.setVerticalGroup(
            pn_2buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_2buttonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(roundPusatAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pn_main.add(pn_2button, "card2");

        pn_kasir.setBackground(new java.awt.Color(230, 224, 234));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tPusatAdmin1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tPusatAdmin1.setForeground(new java.awt.Color(119, 74, 123));
        tPusatAdmin1.setText("Pengaturan Kasir");
        tPusatAdmin1.setToolTipText("");

        btnBackKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arrow1.png"))); // NOI18N
        btnBackKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackKasirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tPusatAdmin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackKasir)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tPusatAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackKasir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("ID Kasir");

        jLabel2.setText("Nama");

        jLabel3.setText("Password");

        jLabel4.setText("Posisi");

        jLabel5.setText("RFID");

        CBPosisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kasir", "Admin" }));

        CBrfid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3706319161", "3707379001" }));

        tbl_kasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Kasir", "Nama", "Password", "Posisi", "RFID"
            }
        ));
        tbl_kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_kasirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_kasir);

        btnTambahK.setText("Tambah");
        btnTambahK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahKActionPerformed(evt);
            }
        });

        btnPerbaruiK.setText("Perbarui");
        btnPerbaruiK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerbaruiKActionPerformed(evt);
            }
        });

        btnBatalK.setText("Batal");
        btnBatalK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalKActionPerformed(evt);
            }
        });

        btnHapusK.setText("Hapus");
        btnHapusK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_kasirLayout = new javax.swing.GroupLayout(pn_kasir);
        pn_kasir.setLayout(pn_kasirLayout);
        pn_kasirLayout.setHorizontalGroup(
            pn_kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kasirLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pn_kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_kasirLayout.createSequentialGroup()
                        .addGroup(pn_kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKasir)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword)
                            .addComponent(CBPosisi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBrfid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pn_kasirLayout.createSequentialGroup()
                                .addGroup(pn_kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pn_kasirLayout.createSequentialGroup()
                                .addComponent(btnTambahK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPerbaruiK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatalK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(btnHapusK)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        pn_kasirLayout.setVerticalGroup(
            pn_kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kasirLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_kasirLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBPosisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBrfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn_kasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambahK)
                            .addComponent(btnPerbaruiK)
                            .addComponent(btnBatalK)
                            .addComponent(btnHapusK)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pn_main.add(pn_kasir, "card3");

        pn_produk.setBackground(new java.awt.Color(230, 224, 234));

        jLabel6.setText("ID Produk");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tPusatAdmin2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tPusatAdmin2.setForeground(new java.awt.Color(119, 74, 123));
        tPusatAdmin2.setText("Pengaturan Produk");
        tPusatAdmin2.setToolTipText("");

        btnBackProduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arrow1.png"))); // NOI18N
        btnBackProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackProdukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tPusatAdmin2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 519, Short.MAX_VALUE)
                .addComponent(btnBackProduk)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackProduk)
                    .addComponent(tPusatAdmin2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_produk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Produk", "Produk", "Harga", "Stok", "Kategori", "Barcode"
            }
        ));
        tbl_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_produkMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_produk);

        jLabel7.setText("Produk");

        jLabel8.setText("Harga");

        jLabel9.setText("Stok");

        jLabel10.setText("Kategori");

        jLabel11.setText("Barcode");

        CBStok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Tidak Tersedia" }));

        CBKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman" }));

        btnTambahP.setText("Tambah");
        btnTambahP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPActionPerformed(evt);
            }
        });

        btnPerbaruiP.setText("Perbarui");
        btnPerbaruiP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerbaruiPActionPerformed(evt);
            }
        });

        btnBatalP.setText("Batal");
        btnBatalP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalPActionPerformed(evt);
            }
        });

        btnHapusP.setText("Hapus");
        btnHapusP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_produkLayout = new javax.swing.GroupLayout(pn_produk);
        pn_produk.setLayout(pn_produkLayout);
        pn_produkLayout.setHorizontalGroup(
            pn_produkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_produkLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pn_produkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBStok, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(txtIDProduk)
                    .addComponent(txtProduk)
                    .addComponent(txtHarga)
                    .addComponent(CBKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBarcode)
                    .addGroup(pn_produkLayout.createSequentialGroup()
                        .addComponent(btnTambahP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPerbaruiP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatalP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHapusP)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(pn_produkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_produkLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(26, 26, 26)))
        );
        pn_produkLayout.setVerticalGroup(
            pn_produkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_produkLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(pn_produkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_produkLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addComponent(CBKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn_produkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambahP)
                            .addComponent(btnPerbaruiP)
                            .addComponent(btnBatalP)
                            .addComponent(btnHapusP))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_produkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_produkLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(413, Short.MAX_VALUE)))
        );

        pn_main.add(pn_produk, "card4");

        add(pn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnToKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToKasirActionPerformed
        // TODO add your handling code here:
        pn_main.removeAll();
        pn_main.add(pn_kasir);
        pn_main.repaint();
        pn_main.revalidate(); 
    }//GEN-LAST:event_btnToKasirActionPerformed

    private void btnToProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToProdukActionPerformed
        // TODO add your handling code here:
        pn_main.removeAll();
        pn_main.add(pn_produk);
        pn_main.repaint();
        pn_main.revalidate(); 
    }//GEN-LAST:event_btnToProdukActionPerformed

    private void btnBatalKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalKActionPerformed
        // TODO add your handling code here:
        resetFormKasir();
    }//GEN-LAST:event_btnBatalKActionPerformed

    private void btnHapusPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusPActionPerformed
        // TODO add your handling code here:
        try {
    int selectedRow = tbl_produk.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus.");
        return;
    }

    int idProduk = Integer.parseInt(tbl_produk.getValueAt(selectedRow, 0).toString());

    int confirm = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data ini?", "Hapus", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        String sql = "DELETE FROM produk WHERE id_produk=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, idProduk);
        st.executeUpdate();
        st.close();

        JOptionPane.showMessageDialog(this, "Data produk berhasil dihapus.");
        getDataProduk();
        resetFormProduk();
    }
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Gagal menghapus data produk.");
}
    }//GEN-LAST:event_btnHapusPActionPerformed

    private void btnTambahKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKActionPerformed
        // TODO add your handling code here:
        try {
        String sql = "INSERT INTO kasir (username, password, posisi, RFID) VALUES (?, ?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, txtUsername.getText());
            st.setString(2, txtPassword.getText());
            st.setString(3, CBPosisi.getSelectedItem().toString());
            st.setString(4, CBrfid.getSelectedItem().toString());
        st.executeUpdate();
        st.close();

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        getDataKasir();
        resetFormKasir();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Gagal menyimpan data");
    }
    }//GEN-LAST:event_btnTambahKActionPerformed

    private void btnPerbaruiKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerbaruiKActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbl_kasir.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang akan diubah!");
        return;
    }

    int id = (int) tbl_kasir.getValueAt(selectedRow, 0); // assuming 0 is the id_admin column

    try {
        String sql = "UPDATE kasir SET username = ?, password = ?, posisi = ? WHERE id_admin = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, txtUsername.getText());
        st.setString(2, txtPassword.getText());
        st.setString(3, CBPosisi.getSelectedItem().toString());
        st.setString(4, CBrfid.getSelectedItem().toString());
        st.setInt(5, id); // WHERE id_admin = ?

        st.executeUpdate();
        st.close();

        JOptionPane.showMessageDialog(this, "Data berhasil diubah");
        getDataKasir();
        resetFormKasir();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Gagal mengubah data");
    }
    }//GEN-LAST:event_btnPerbaruiKActionPerformed

    private void tbl_kasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_kasirMouseClicked
        // TODO add your handling code here:
        int row = tbl_kasir.getSelectedRow();
        txtUsername.setText(tbl_kasir.getValueAt(row, 1).toString());
        txtPassword.setText(tbl_kasir.getValueAt(row, 2).toString());
        CBPosisi.setSelectedItem(tbl_kasir.getValueAt(row, 3).toString());
        CBrfid.setSelectedItem(tbl_kasir.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tbl_kasirMouseClicked

    private void btnHapusKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbl_kasir.getSelectedRow();
        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
        return;
    }

    int id = (int) tbl_kasir.getValueAt(selectedRow, 0); // assuming column 0 = id_admin

    try {
        String sql = "DELETE FROM kasir WHERE id_admin = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, id);
        st.executeUpdate();
        st.close();

        JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
        getDataKasir();
        resetFormKasir();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Gagal menghapus data");
    }
    }//GEN-LAST:event_btnHapusKActionPerformed

    private void tbl_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_produkMouseClicked
        // TODO add your handling code here:
        int row = tbl_produk.getSelectedRow();
        txtProduk.setText(tbl_produk.getValueAt(row, 1).toString());
        txtHarga.setText(tbl_produk.getValueAt(row, 2).toString());
        CBStok.setSelectedItem(tbl_produk.getValueAt(row, 3).toString());
        CBKategori.setSelectedItem(tbl_produk.getValueAt(row, 4).toString());
        txtBarcode.setText(tbl_produk.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tbl_produkMouseClicked

    private void btnTambahPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPActionPerformed
        // TODO add your handling code here:
    try {
    String sql = "INSERT INTO produk (nama_produk, harga, stok, kategori, Barcode) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, txtProduk.getText());
        st.setDouble(2, Double.parseDouble(txtHarga.getText()));
        st.setString(3, CBStok.getSelectedItem().toString());
        st.setString(4, CBKategori.getSelectedItem().toString());
        st.setString(5, txtBarcode.getText());
        st.executeUpdate();
        st.close();

        JOptionPane.showMessageDialog(this, "Data produk berhasil ditambahkan.");
        getDataProduk(); // refresh table
        resetFormProduk();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Gagal menambahkan data produk.");
    }
    }//GEN-LAST:event_btnTambahPActionPerformed

    private void btnPerbaruiPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerbaruiPActionPerformed
        // TODO add your handling code here:
        try {
    int selectedRow = tbl_produk.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin diupdate.");
        return;
    }

    int idProduk = Integer.parseInt(tbl_produk.getValueAt(selectedRow, 0).toString());

    String sql = "UPDATE produk SET nama_produk=?, harga=?, stok=?, kategori=? WHERE id_produk=?";
    PreparedStatement st = conn.prepareStatement(sql);
    st.setString(1, txtProduk.getText());
    st.setDouble(2, Double.parseDouble(txtHarga.getText()));
    st.setString(3, CBStok.getSelectedItem().toString());
    st.setString(4, CBKategori.getSelectedItem().toString());
    st.setString(5, txtBarcode.getText());
    st.setInt(6, idProduk);
    st.executeUpdate();
    st.close();

    JOptionPane.showMessageDialog(this, "Data produk berhasil diupdate.");
    getDataProduk();
    resetFormProduk();
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Gagal mengupdate data produk.");
}
    }//GEN-LAST:event_btnPerbaruiPActionPerformed

    private void btnBatalPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalPActionPerformed
        // TODO add your handling code here:
        resetFormProduk();
    }//GEN-LAST:event_btnBatalPActionPerformed

    private void btnBackKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackKasirActionPerformed
        // TODO add your handling code here:
        pn_kasir.removeAll();
        pn_kasir.add(pn_main);
        pn_kasir.repaint();
        pn_kasir.revalidate(); 
    }//GEN-LAST:event_btnBackKasirActionPerformed

    private void btnBackProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackProdukActionPerformed
        // TODO add your handling code here:
        pn_produk.removeAll();
        pn_produk.add(pn_main);
        pn_produk.repaint();
        pn_produk.revalidate(); 
    }//GEN-LAST:event_btnBackProdukActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBKategori;
    private javax.swing.JComboBox<String> CBPosisi;
    private javax.swing.JComboBox<String> CBStok;
    private javax.swing.JComboBox<String> CBrfid;
    private javax.swing.JButton btnBackKasir;
    private javax.swing.JButton btnBackProduk;
    private javax.swing.JButton btnBatalK;
    private javax.swing.JButton btnBatalP;
    private javax.swing.JButton btnHapusK;
    private javax.swing.JButton btnHapusP;
    private javax.swing.JButton btnPerbaruiK;
    private javax.swing.JButton btnPerbaruiP;
    private javax.swing.JButton btnTambahK;
    private javax.swing.JButton btnTambahP;
    private necesario.RSMaterialButtonCircle btnToKasir;
    private necesario.RSMaterialButtonCircle btnToProduk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pn_2button;
    private javax.swing.JPanel pn_kasir;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_produk;
    private swing.RoundPusatAdmin roundPusatAdmin1;
    private javax.swing.JLabel tPusatAdmin;
    private javax.swing.JLabel tPusatAdmin1;
    private javax.swing.JLabel tPusatAdmin2;
    private javax.swing.JTable tbl_kasir;
    private javax.swing.JTable tbl_produk;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIDProduk;
    private javax.swing.JTextField txtKasir;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtProduk;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

private void resetFormKasir() {
    txtUsername.setText("");
    txtPassword.setText("");
    CBPosisi.setSelectedIndex(0);
    CBrfid.setSelectedIndex(0);
    }

private void resetFormProduk() {
    txtProduk.setText("");
    txtHarga.setText("");
    CBStok.setSelectedIndex(0);
    CBKategori.setSelectedIndex(0);
    txtBarcode.setText("");
    }
    
public void getDataKasir() {
    DefaultTableModel model = (DefaultTableModel) tbl_kasir.getModel();
    model.setRowCount(0);
    
    try {
        String sql = "SELECT * FROM kasir";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id_admin"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("posisi"),
                rs.getInt("RFID")
            });
        }
        
        rs.close();
        st.close();
    } catch (Exception e) {
        e.printStackTrace();
        Logger.getLogger(PusatAdmin.class.getName()).log(Level.SEVERE, null, e);
    }
}

public void getDataProduk() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID Produk");
    model.addColumn("Nama Produk");
    model.addColumn("Harga");
    model.addColumn("Stok");
    model.addColumn("Kategori");
    model.addColumn("Barcode");

    try {
        String sql = "SELECT * FROM produk";
        Statement st = database.getConnetion().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id_produk"),
                rs.getString("nama_produk"),
                rs.getDouble("harga"),
                rs.getString("stok"),
                rs.getString("kategori"),
                rs.getInt("Barcode")
            });
        }
        tbl_produk.setModel(model);
        rs.close();
        st.close();
    } catch (Exception e) {
        e.printStackTrace();
        Logger.getLogger(PusatAdmin.class.getName()).log(Level.SEVERE, null, e);
    }
    
}}
