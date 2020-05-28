
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

public class UserInput extends MouseAdapter implements KeyListener{
    JFrame game;
    Vars screen;
    Clear clearHighscores; 

    public UserInput(JFrame game, Vars screen) {
        this.game = game;
        this.screen = screen;
        game.addKeyListener(this);
        game.addMouseListener(this);
    }
    // source:
    // https://www.youtube.com/watch?v=PbmQrkwR9Ko&list=PLr6-GrHUlVf9SIx5cDhoEMknias5Xyv67&index=44

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
    }

    public void keyReleased(KeyEvent e) {
    }

    // https://www.youtube.com/watch?v=bTaJKm43KGs
    public void mouseClicked(MouseEvent e) {
        game.getContentPane().removeAll();
        int x = e.getX();
        int y = e.getY();
        System.out.println("x: " + x + " y: " + y);
        if (screen.getScreen() == 2) {
            if (x >= 240 && x <= 460 && y >=210 && y <= 240) {
                screen.setScreen(3);
            } else if (x >= 220 && x <= 480 && y >= 270 && y <= 300) {
                screen.setScreen(4);
            } else if (x >= 300 && x <= 420 && y >= 300 && y <= 350) {
                screen.setScreen(5);
            } else if (x >= 300 && x <= 420 && y >= 360 && y <= 405) {
                screen.setScreen(6);
            }
        } else if(screen.getScreen() == 3){
            if(x>=153&&x<=343&&y>=435&&y<=486){
                screen.setScreen(2); 
            }else if(x>=400&&x<=588&&y>=435&&y<=486){
                clearHighscores.setStatus(true); 
            }
        } else if(screen.getScreen()==4){
            if(x>=240&&x<=450&&y>=426&&y<=470){
                screen.setScreen(2);
            }
        } else if(screen.getScreen()==5){
            if(x>=190&&y>=415&&x<=510&&y<=480){
                Level1 play = new Level1(game, screen);
            }
        } else if(screen.getScreen()==7){
            // if(x>=50&&y>=150&&x<=  &&y<=  ){
            //     screen.setScreen()
            // }
        }
    }



}