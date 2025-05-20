package swing;

import event.event_menuCallBack;
import event.event_menuSelected;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import model.model_menu;


public class list_menu<E extends Object> extends JList<E> {
    

    public void addEventSelectedMenu(event_menuSelected event) {
      events.add(event);
    }
    
    private final DefaultListModel model;
    private final List<event_menuSelected> events;
    private int selectedIndex = -1;

    public list_menu() {
        model = new DefaultListModel();
        events = new ArrayList<>();
        super.setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if(SwingUtilities.isLeftMouseButton(me)) {
                    int index=locationToIndex(me.getPoint());
                    Object obj=model.getElementAt(index);
                    if(obj instanceof model_menu){
                       model_menu data=(model_menu) obj;
                       if (data.getType()==model_menu.MenuType.MENU) {
                           if(index!=selectedIndex) {
                               selectedIndex=-1;
                               runEvent(index);
                                 
                           }
                       }
                    }else{
                        if(index!=selectedIndex) {
                               selectedIndex=-1;
                               runEvent(index);
                        
                    }    
                }
            }
            }
            
        });
    }

    private void runEvent(int indexChange) {
        for (event_menuSelected event : events) {
            event.menuSelected(indexChange, new event_menuCallBack() {
                @Override
                public void call(int index) {
                  selectedIndex=index;
                  repaint();
                }
            });
        }
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean selected, boolean focus) {
                model_menu data;
                if (o instanceof model_menu) {
                    data = (model_menu) o;
                } else {
                    data = new model_menu("1", model_menu.MenuType.MENU);
                }
                menu_item item = new menu_item(data);
                item.setSelected(index == selectedIndex);
                item.setPreferredSize(new java.awt.Dimension(0, 40));//ubah jarak icon menu bar
                
                return item;
            }
        };
    }

    @Override
    public void setModel(ListModel<E> lm) {
        for (int i = 0; i < lm.getSize(); i++) {
            model.addElement(lm.getElementAt(i));
        }
    }
@Override
public java.awt.Dimension getPreferredSize() {
    return new java.awt.Dimension(200, 300); // ubah sesuai kebutuhan
}

    public void addItem(model_menu data) {
        model.addElement(data);
    }
}
