package cr.una.views;

import javax.swing.*;
import java.awt.event.ActionEvent;

public abstract class BaseView extends JFrame {

    public BaseView() {
    }

    public static JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Mi Menu");

        // create menu items
        JMenuItem menuItem1 = new JMenuItem(new MenuItemAction("MenuItem1"));
        JMenuItem menuItem2 = new JMenuItem(new MenuItemAction("MenuItem2"));
        JMenuItem menuExit = new JMenuItem(new MenuItemAction("Salir de la aplicación"));
        menuExit.addActionListener((event) -> System.exit(0));

        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuExit);

        menuBar.add(menu);

        return menuBar;
    }

    private static class MenuItemAction extends AbstractAction {

        public MenuItemAction(String text) {
            super(text);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Hizo clic en " + e.getActionCommand());
            System.out.println(e.getActionCommand());
        }
    }

}