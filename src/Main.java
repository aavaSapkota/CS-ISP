
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

public class Main  {
    static Screen screen;
    static UserInput input; 
    static JFrame mainScreen = new JFrame("Game Title");

    public Main() {
        screen = new Screen(0);
        mainScreen.setLayout(new FlowLayout());
        mainScreen.setSize(700, 700);
        mainScreen.setVisible(true);
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        input = new UserInput(mainScreen,screen);
        
    }


    public void introduction() {
        mainScreen.getContentPane().setBackground(Color.gray);

    }

    public void mainMenu() {
        mainScreen.getContentPane().setBackground(Color.blue);
        mainScreen.setVisible(true);
    }

    public void highscores() {
        mainScreen.getContentPane().setBackground(Color.red);
    }

    public void learn() {
        mainScreen.getContentPane().setBackground(Color.orange);
    }

    public void play() {
        mainScreen.getContentPane().setBackground(Color.yellow);
    }

    public void goodbye() {
        mainScreen.getContentPane().setBackground(Color.lightGray);
    }

    public void credits() {
        mainScreen.getContentPane().setBackground(Color.black);
    }

    

    
    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String args[]) {
        Main m = new Main();
        
        while (screen.getScreen() <= 7) {
            if (screen.getScreen()==1) {
                m.introduction();
            } else if (screen.getScreen()==2) {
                m.mainMenu();
            } else if (screen.getScreen()==3) {
                m.highscores();
            } else if (screen.getScreen()==4) {
                m.learn();
            } else if (screen.getScreen()==5) {
                m.play();
            } else if (screen.getScreen()== 6) {
                m.goodbye();
            } else if (screen.getScreen()==7) {
                m.credits();
            }
            System.out.println(screen.getScreen());

        }
        // source: https://stackoverflow.com/questions/1234912/how-to-programmatically-close-a-jframe
        mainScreen.dispatchEvent(new WindowEvent(mainScreen, WindowEvent.WINDOW_CLOSING));
    }
}