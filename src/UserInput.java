
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


    }
    public void keyReleased(KeyEvent e){}

    //https://www.youtube.com/watch?v=bTaJKm43KGs
    public void mouseClicked(MouseEvent e){
        try{
            Thread.sleep(1000); 
        }catch(Exception a){}
        int x = e.getX(); 
        int y = e.getY();
        System.out.println("x: "+x+" y: "+y);
        if(x>=250&&x<= 485&&y>=175&&y<=220){
            screen.setScreen(3);
        }else if(x>=300&&x<= 420&&y>=238&& y<=285){
            screen.setScreen(4);
        }else if(x>=300&&x<= 420&&y>=300&&y<=350){
            screen.setScreen(5);
        }else if(x>=300&&x<=420&&y>=360&&y<=405){
            screen.setScreen(6);
        }else{
            screen.setScreen(screen.getScreen()+1);
        }

    }

    

    


}