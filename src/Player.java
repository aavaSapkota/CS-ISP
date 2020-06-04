import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
    int x, dx, y, dy, nx2, pos, ePos;
    Image still;
    String fileName;

    public Player(String f) {
        fileName = f; 
        java.net.URL imgUrl = Main.class.getResource(fileName);
        ImageIcon i = new ImageIcon(imgUrl);
        still = i.getImage().getScaledInstance(100, 100, 100);
        x = 175;
        pos = 175; 
        y = 300;
        nx2 = 2000;
    }

    public void move() {
        pos +=dx; 
        nx2 += dx;
        y += dy;
        if(y<250)
            y=y-dy+1;
        else if(y>400)
            y=y-dy-1;
    }

    public int getX() {
        return x;
    }

    public int getImageX(){
        return 2000-nx2;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return still;
    }

    public int getPos(){
        return pos; 
    }

    public void setImage(String i){
        java.net.URL imgUrl = Main.class.getResource(i);
        ImageIcon ic = new ImageIcon(imgUrl);
        still = ic.getImage().getScaledInstance(100, 100, 100);
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
            dy= 1;
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