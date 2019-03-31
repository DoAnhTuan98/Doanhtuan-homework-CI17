package program;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by huynq on 7/4/17.
 */
public class Program {
    public static void main(String[] args) {
        GameWindow window = new GameWindow();

        GamePanel panel = new GamePanel(); // replace JPanel by GamePanel
        // set preferredSize cho panel
        panel.setPreferredSize(new Dimension(800, 600));
        window.add(panel);
        // window pack
        window.pack();
        panel.setBackground(Color.CYAN);

        window.setVisible(true);

        panel.gameLoop();
    }
}
