
/**
 * Creators: Aava Sapkota and Sarah Zhao
 * Class: ICS4UO-1
 * Teacher: Ms.Krasteva
 * Project: ISP
 */
/**
 * THIS IS TO SEE IF YOU CAN SEE THIS
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.io.*;
import java.util.*;
import javax.swing.JComponent;
import java.awt.Graphics;

public class UserInput extends MouseAdapter implements  KeyListener{
    JFrame game;
    Screen screen; 
    public UserInput(JFrame game, Screen screen){
        this.game = game; 
        this.screen=screen;
        game.addKeyListener(this); 
        game.addMouseListener(this);
    }
//source: https://www.youtube.com/watch?v=PbmQrkwR9Ko&list=PLr6-GrHUlVf9SIx5cDhoEMknias5Xyv67&index=44
    
    public void keyTyped(KeyEvent e){}
    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode(); 

        if (keyCode == KeyEvent.VK_0) {
            screen.setScreen(screen.getScreen()+1);
        } else if (keyCode == KeyEvent.VK_1) {
            screen.setScreen(3);
        }else if (keyCode == KeyEvent.VK_2) {
            screen.setScreen(4);
        }else if (keyCode == KeyEvent.VK_3) {
            screen.setScreen(5);
        }
    }
    public void keyReleased(KeyEvent e){}

    //https://www.youtube.com/watch?v=bTaJKm43KGs
    public void mousePressed(MouseEvent e){
        int x = e.getX(); 
        int y = e.getY();

    }

    

    


}