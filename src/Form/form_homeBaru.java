package form;

import component.card;
import javax.swing.ImageIcon;
import model.model_card;
import swing.ScrollBar;
import swing.WrapLayout;

public class form_homeBaru extends javax.swing.JPanel {

    public form_homeBaru() {
        initComponents();
        panel.setPreferredSize(null); // agar isi mengikuti layout
        init();

    }

    private void init() {
        panel.setLayout(new WrapLayout(WrapLayout.LEADING));
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/1.png")), "Nasi Jeruk Telur Dadar", "Deskripsi 1")));
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/2.png")), "Nasi Jeruk Ayam Krispi", "Deskripsi 1")));
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/3.png")), "Nasi Jeruk Rempela Ati", "Desc 1")));
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/4.png")), "Nasi Jeruk Paru", "Deskripsi 1")));
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/5.png")), "Mie Pangsit", "Deskripsi 1")));
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/6.png")), "Pangsit Kuah", "Deskripsi 1")));
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/7.png")), "Mie Goreng", "Deskripsi 1")));
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/8.png")), "Nasi Goreng", "Deskripsi 1")));
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/9.png")), "Nasi Goreng Mawut", "Deskripsi 1")));
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/10.png")), "Ayam Goreng", "Deskripsi 1")));
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/11.png")), "Fried Chicken", "Deskripsi 1")));
        panel.add(new card(new model_card(new ImageIcon(getClass().getResource("/Image/12.png")), "Ayam Geprek", "Deskripsi 1")));
        panel.revalidate();
        panel.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        jScrollPane1.setBorder(null);

        panel.setPreferredSize(new java.awt.Dimension(800, 1200));
        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
