package program;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background {
    BufferedImage image;
    double x;
    double y;

    public Background() {
        image = SpriteUtils.loadImage("assets/images/background/0.png");
        x = 0;
        y = 600 - 3109;
    }

    public void render(Graphics g) {
        g.drawImage(image, (int)x, (int)y, null);
    }

    public void run() {
        y += 10;
        if(y >= 0) {
            y = 0;
        }
    }
}
