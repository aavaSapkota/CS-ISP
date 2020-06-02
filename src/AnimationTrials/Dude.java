package AnimationTrials;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Dude {
    //x = x-coordinate ---- dx = change in x coordinate
    int x, dx, y;
    Image still; 

    public Dude(){
        ImageIcon i = new ImageIcon("Infected [front].png");
        still = i.getImage();
        x=10; 
        y = 172; 
    }

    public void move(){
        x+=dx; 
    }

    public void keyPressed (KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT){
            dx=-1;
        }else if(key == KeyEvent.VK_RIGHT){
            dx=1;
        }
    }

    public void keyReleased (KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT){
            dx=0;
        }else if(key == KeyEvent.VK_RIGHT){
            dx=0;
        }
    }

    public int getX(){
        return x;
    }
    public int getDX(){
        return dx;
    }
    public int getY(){
        return y;
    }

    public Image getImage(){
        return still; 
    }

}