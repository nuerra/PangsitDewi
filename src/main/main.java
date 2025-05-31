package main;
//import Form.Dashboard;
import Form.Admin;
import Form.Laporan;
import Form.Transaksi;
import swing.RoundedPanel;

public class main extends javax.swing.JFrame {

   
    
    public main() {
        initComponents();
        pnlMenu.setLayout(new java.awt.BorderLayout());
        
jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        showDashboard();
    }
});

jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        showAdmin();
    }
});

jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        showTransaksi();
    }
});

jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        showLaporan();
    }
});

jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        showLogout();
    }
});
        ((RoundedPanel) pnlBar).setRoundTopLeft(0);
        ((RoundedPanel) pnlBar).setRoundTopRight(0);
        ((RoundedPanel) pnlBar).setRoundBottomLeft(0);
        ((RoundedPanel) pnlBar).setRoundBottomRight(0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        pnlBar = new swing.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlDashboard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlPusat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlTransaksi = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlKasir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlLogout = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel1.setBackground(new java.awt.Color(228, 213, 232));
        JPanel1.setMinimumSize(new java.awt.Dimension(1000, 625));
        JPanel1.setPreferredSize(new java.awt.Dimension(1000, 625));
        JPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        JPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        pnlMenu.setBackground(new java.awt.Color(228, 213, 232));
        pnlMenu.setMinimumSize(new java.awt.Dimension(929, 558));

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        JPanel1.add(pnlMenu, java.awt.BorderLayout.CENTER);

        pnlBar.setPreferredSize(new java.awt.Dimension(70, 565));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pallate/Line 1.png"))); // NOI18N

        pnlDashboard.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        pnlDashboard.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlDashboard.setOpaque(false);
        pnlDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pallate/Home.png"))); // NOI18N
        pnlDashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 80));

        pnlPusat.setOpaque(false);
        pnlPusat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pallate/Folder.png"))); // NOI18N
        pnlPusat.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 80));

        pnlTransaksi.setOpaque(false);
        pnlTransaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pallate/Database.png"))); // NOI18N
        pnlTransaksi.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 80));

        pnlKasir.setOpaque(false);
        pnlKasir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pallate/Archive.png"))); // NOI18N
        pnlKasir.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 80));

        pnlLogout.setOpaque(false);
        pnlLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pallate/Log out.png"))); // NOI18N
        pnlLogout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 80));

        javax.swing.GroupLayout pnlBarLayout = new javax.swing.GroupLayout(pnlBar);
        pnlBar.setLayout(pnlBarLayout);
        pnlBarLayout.setHorizontalGroup(
            pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBarLayout.createSequentialGroup()
                .addGroup(pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(66, 66, 66))
                    .addComponent(pnlDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPusat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBarLayout.setVerticalGroup(
            pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarLayout.createSequentialGroup()
                .addComponent(pnlDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPusat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(pnlLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JPanel1.add(pnlBar, java.awt.BorderLayout.WEST);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    private void showDashboard() {
    pnlMenu.removeAll();
//    pnlMenu.add(new Dashboard(), java.awt.BorderLayout.CENTER);
    pnlMenu.repaint();
    pnlMenu.revalidate();
}

private void showAdmin() {
    pnlMenu.removeAll();
    pnlMenu.add(new Admin());
    pnlMenu.repaint();
    pnlMenu.revalidate();
}

private void showTransaksi() {
    pnlMenu.removeAll();
    pnlMenu.add(new Transaksi());
    pnlMenu.repaint();
    pnlMenu.revalidate();
}

private void showLaporan() {
    pnlMenu.removeAll();
    pnlMenu.add(new Laporan());
    pnlMenu.repaint();
    pnlMenu.revalidate();
}
private void showLogout() {
    int jawab = javax.swing.JOptionPane.showConfirmDialog(this, "Yakin ingin keluar?", "Logout", javax.swing.JOptionPane.YES_NO_OPTION);
    if (jawab == javax.swing.JOptionPane.YES_OPTION) {
        System.exit(0);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlBar;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlKasir;
    private javax.swing.JPanel pnlLogout;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPusat;
    private javax.swing.JPanel pnlTransaksi;
    // End of variables declaration//GEN-END:variables
}
