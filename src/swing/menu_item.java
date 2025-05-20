package swing;

import model.model_menu;

public class menu_item extends javax.swing.JPanel {

    private final model_menu data;
    public menu_item(model_menu data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        if (data.getType()==model_menu.MenuType.MENU){
            lbIcon.setIcon(data.toIcon());
        }else{
    }
    }

    public void setSelected(boolean selected){
        if (data.getType()==model_menu.MenuType.MENU){
            if(selected){
               lbIcon.setIcon(data.toIconSelected()); 
            }else{
                lbIcon.setIcon(data.toIcon());
                
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    // End of variables declaration//GEN-END:variables
}
