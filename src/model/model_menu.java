package model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class model_menu {

    private String icon;
    private MenuType type;

    public model_menu() {
    }

    public model_menu(String icon, MenuType type) {
        this.icon = icon;
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public Icon toIcon() {
        return loadIcon("/icon/" + icon + ".png");
    }

    public Icon toIconSelected() {
        return loadIcon("/icon/" + icon + "_selected.png");
    }

    private Icon loadIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Icon not found: " + path);
            // Balikin icon kosong 
            return new ImageIcon(new byte[0]);
        }
    }

    public static enum MenuType {
        MENU, EMPTY
    }
}
