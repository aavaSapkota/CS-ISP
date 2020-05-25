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
public class Main implements ActionListener{
    static int screen; 
    JFrame mainScreen = new JFrame("Game Title");
    JButton learn,play,highscores,next; 
    

    public Main(){
        next = new JButton("NEXT");
        screen = 0; 
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        next.addActionListener(this);
        mainScreen.add(next);
        mainScreen.setLayout(new FlowLayout());
        mainScreen.setSize(1000,1000); 
        mainScreen.setVisible(true);
    }

    public void actionPerformed(final ActionEvent e){
        if(e.getSource()==next){
            screen++;
        }else if(screen==2&&e.getSource()==learn){
            screen = 4; 
            mainScreen.remove(learn);
            mainScreen.remove(play);
            mainScreen.remove(highscores);
        }

    }

    public void introduction(){
        mainScreen.getContentPane().setBackground(Color.gray);
        mainScreen.add(learn);
        mainScreen.add(play);
        mainScreen.add(highscores);
    }

    public void mainMenu(){
        mainScreen.getContentPane().setBackground(Color.blue);
    }

    public void highscores(){
        mainScreen.getContentPane().setBackground(Color.red);
    }

    public void learn(){
        mainScreen.getContentPane().setBackground(Color.orange);
    }

    public void play(){
        mainScreen.getContentPane().setBackground(Color.yellow); 
    }

    public void goodbye(){
        mainScreen.getContentPane().setBackground(Color.lightGray);
    }

    public void credits(){
        mainScreen.getContentPane().setBackground(Color.black);
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String args[]){
        Main m = new Main();
        while(screen!=6){
            if(screen==1)m.introduction();
            if(screen==2) m.mainMenu();
            if(screen==3) m.highscores();
            if(screen==4) m.learn();
            if(screen==5) m.play();
            if(screen==6) m.goodbye();
            if(screen==7) m.credits();
            System.out.println(screen);
            
        }
    }
}