import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
    int x, dx, y, dy, ny2;
    Image still;

    public Player() {
        java.net.URL imgUrl = Main.class.getResource("Owner.png");
        ImageIcon i = new ImageIcon(imgUrl);
        still = i.getImage().getScaledInstance(100, 100, 100);
        x = 75;
        y = 10;
        ny2 = 500;
    }

    public void move() {
        x += dx;
        ny2 += dy;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return still;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT)
            dx = -1;

        if (key == KeyEvent.VK_RIGHT)
            dx = 1;

        if (key == KeyEvent.VK_UP)
            dy = -1;

        if (key == KeyEvent.VK_DOWN)
            dy = 1;
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT)
            dx = 0;

        else if (key == KeyEvent.VK_RIGHT)
            dx = 0;

        else if (key == KeyEvent.VK_UP)
            dy = 0;

        else if (key == KeyEvent.VK_DOWN)
            dy = 0;
    }

}