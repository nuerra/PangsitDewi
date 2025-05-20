package main;

import java.awt.Color;

public class main extends javax.swing.JFrame {

   
    public main() {
        initComponents();
        init();
    }
    
    
    private void init(){
        setBackground(new Color (0,0,0,0)); //bwat remove bg
        menu.initMoving(this);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_border1 = new swing.panel_border();
        menu = new component.menu();
        form_homeBaru1 = new form.form_homeBaru();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout panel_border1Layout = new javax.swing.GroupLayout(panel_border1);
        panel_border1.setLayout(panel_border1Layout);
        panel_border1Layout.setHorizontalGroup(
            panel_border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_border1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form_homeBaru1, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_border1Layout.setVerticalGroup(
            panel_border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_border1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addComponent(form_homeBaru1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private form.form_homeBaru form_homeBaru1;
    private component.menu menu;
    private swing.panel_border panel_border1;
    // End of variables declaration//GEN-END:variables
}
