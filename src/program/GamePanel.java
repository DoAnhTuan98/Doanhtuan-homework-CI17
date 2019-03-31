package program;

import tklibs.Mathx;
import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel {
    Background background;
    Player player; // image, x, y

    public GamePanel() {
        background = new Background();
        player = new Player(); // image, x, y
    }

    @Override
    public void paint(Graphics g) {
        background.render(g);
        player.render(g); // draw playerImage
    }

    public void runAll() {
        background.run();
        player.run(); // player run
    }

    public void gameLoop() {
        long lastTime = 0;
        while(true) {
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastTime >= 1000 / 60) {
                this.repaint(); // render anh
                this.runAll(); // chay logic
                lastTime = currentTime;
            }
        }
    }
}
