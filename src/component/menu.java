package component;

import event.event_menuCallBack;
import event.event_menuSelected;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Path2D;
import javax.swing.JFrame;
import javax.swing.Timer;
import model.model_menu;
import java.beans.Beans;

public class menu extends javax.swing.JPanel {

    private int selectedIndex = -1;
    private Timer timer;
    private boolean toUp;
    private int menuYTarget;
    private int menuY;
    private int speed = 2;
    private event_menuCallBack callBack;
    private int x;
    private int y;

    public menu() {
        initComponents();
        setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        list_menu.setOpaque(false);

        // Jalankan logika hanya saat runtime (bukan di design time)
        if (!Beans.isDesignTime()) {
            setupLogic();
        }
    }

    // Logika animasi dan event listener dipisah agar design view tidak error
    private void setupLogic() {
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toUp) {
                    if (menuY <= menuYTarget - 5) {
                        menuY = menuYTarget;
                        repaint();
                        timer.stop();
                        if (callBack != null) callBack.call(selectedIndex);
                    } else {
                        menuY -= speed;
                        repaint();
                    }
                } else {
                    if (menuY >= menuYTarget + 5) {
                        menuY = menuYTarget;
                        repaint();
                        timer.stop();
                        if (callBack != null) callBack.call(selectedIndex);
                    } else {
                        menuY += speed;
                        repaint();
                    }
                }
            }
        });

        list_menu.addEventSelectedMenu(new event_menuSelected() {
            @Override
            public void menuSelected(int index, event_menuCallBack callBack) {
                if (index != selectedIndex) {
                    menu.this.callBack = callBack;
                    toUp = selectedIndex > index;
                    speed = (selectedIndex == -1) ? 20 : 2;
                    selectedIndex = index;
                    menuYTarget = selectedIndex * 35 + list_menu.getY();
                    if (!timer.isRunning()) {
                        timer.start();
                    }
                }
            }
        });

        initData(); // Tambahkan data menu
    }

    private void initData() {
        list_menu.addItem(new model_menu("1", model_menu.MenuType.MENU));
        list_menu.addItem(new model_menu("2", model_menu.MenuType.MENU));
        list_menu.addItem(new model_menu("3", model_menu.MenuType.MENU));
        list_menu.addItem(new model_menu("4", model_menu.MenuType.MENU));
        list_menu.addItem(new model_menu("5", model_menu.MenuType.MENU));
        list_menu.addItem(new model_menu("6", model_menu.MenuType.MENU));
        list_menu.addItem(new model_menu("7", model_menu.MenuType.MENU));

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        panelMoving = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_menu = new swing.list_menu<>();

        panelMoving.setOpaque(false);
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 4));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setViewportView(list_menu);

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#AD8CCB"), 0, getHeight(), Color.decode("#989FD2"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

        if (selectedIndex >= 0) {
            int menuX = 10;
            int height = 36;
            int width = getWidth();
            int menuHeight = 40;
            int offsetY = jSeparator1.getY() + jSeparator1.getHeight() + 5;
            int highlightHeight = 36;
            int highlightY = offsetY + (selectedIndex * menuHeight) + (menuHeight - highlightHeight) / 3 + 3;

            g2.setColor(new Color(242, 242, 242));
            g2.fillRoundRect(menuX, highlightY, width, height, 40, 40);

            Path2D.Float f = new Path2D.Float();
            f.moveTo(width - 30, highlightY);
            f.curveTo(width - 10, highlightY, width, highlightY, width, highlightY - 25);
            f.lineTo(width, highlightY + height + 35);
            f.curveTo(width, highlightY + height, width - 10, highlightY + height, width - 30, highlightY + height);
            g2.fill(f);
        }

        super.paintComponent(grphcs);
    }

    public void initMoving(JFrame frame) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX() + 6;
                y = me.getY() + 6;
            }
        });

        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                frame.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private swing.list_menu<String> list_menu;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration
}
