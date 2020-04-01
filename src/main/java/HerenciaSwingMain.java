import cr.una.views.PatientsView;

import javax.swing.*;
import java.io.IOException;

public class HerenciaSwingMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        });
    }

    public static void createAndShowGUI() throws Exception {
        PatientsView patientsView = new PatientsView();
    }
}
