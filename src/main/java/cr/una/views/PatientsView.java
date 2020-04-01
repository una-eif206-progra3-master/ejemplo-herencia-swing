package cr.una.views;

import javax.swing.*;

public class PatientsView extends BaseView {

    private static JFrame frame;
    private static JMenuBar menuBar;

    public PatientsView() {
        // create a frame
        frame = new JFrame("Menu demo");
        menuBar = createMenuBar();

        frame.setJMenuBar(menuBar);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }


}
