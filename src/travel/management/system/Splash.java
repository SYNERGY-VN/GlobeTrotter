package travel.management.system;

import javax.swing.*;

public class Splash extends JFrame {
    Splash() {
        setSize(1200, 600);
        setLocation(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Splash();
    }
}
