
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

public class Main implements ActionListener {
    static int screen;
    static JFrame mainScreen = new JFrame("Game Title");
    JButton learn, play, highscores, next;

    public Main() {
        next = new JButton("NEXT");
        screen = 0;
        next.addActionListener(this);
        mainScreen.add(next);
    }

    public void pauseProgram(){
        JFrame pauseScreen = new JFrame("Pause");
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == next) {
            screen++;
        } else if (screen == 2 && e.getSource() == learn) {
            screen = 4;
            mainScreen.remove(learn);
            mainScreen.remove(play);
            mainScreen.remove(highscores);
        }

    }

    public void introduction() {
        mainScreen.getContentPane().setBackground(Color.gray);

    }

    public void mainMenu() {
        mainScreen.getContentPane().setBackground(Color.blue);
        learn = new JButton("Learn");
        play = new JButton("play");
        highscores = new JButton("Highscores");
        mainScreen.add(learn);
        mainScreen.add(play);
        mainScreen.add(highscores);
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
        mainScreen.setLayout(new FlowLayout());
        mainScreen.setSize(700, 700);
        mainScreen.setVisible(true);
        while (screen != 6) {
            if (screen == 1) {
                m.introduction();
            } else if (screen == 2) {
                m.mainMenu();
            } else if (screen == 3) {
                m.highscores();
            } else if (screen == 4) {
                m.learn();
            } else if (screen == 5) {
                m.play();
            } else if (screen == 6) {
                m.goodbye();
            } else if (screen == 7) {
                m.credits();
            }
            System.out.println(screen);

        }
    }
}