import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Infected {
    int x, y, dy, dx, cx, cy;
    Image still;
    Player p; 
    int start;
    boolean startB; 

    public Infected(int yL, Player p, int s) {
        this.p = p; 
        start = s; 
        startB= false; 
        java.net.URL imgUrl = Main.class.getResource("Infected [left].png");
        ImageIcon i = new ImageIcon(imgUrl);
        still = i.getImage().getScaledInstance(130, 100, 100);
        x = 730;
        y = yL;
    }

    public void move() {
        if(p.getPos()>start)
            startB = true; 
        if(startB) x--;
        if(x<0)startB=false; 
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


}