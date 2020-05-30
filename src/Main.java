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
import javax.imageio.ImageIO;
import java.awt.Graphics;

public class Main {
    static Vars screen;
    static UserInput input;
    static JFrame mainScreen = new JFrame("Game Title");


    public Main() {
        screen = new Vars(1);
        mainScreen.setLayout(new FlowLayout());
        mainScreen.setSize(730, 540);
        mainScreen.setVisible(true);
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void introduction() {
        Image icon = new ImageIcon("Title Card.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
        input = new UserInput(mainScreen, screen);
        
        try{
            Thread.sleep(2000);
        }catch(Exception e){}

        screen.setScreen(screen.getScreen()+1);

    }

    public void mainMenu() {
        java.net.URL imgUrl = Main.class.getResource("Menu.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); //Gets background image
        bkg.setBounds(0,0,705,510);
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);

    }

    public void highscores() {
        java.net.URL imgUrl = Main.class.getResource("Highscores.jpg");
        Image icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon(icon)); // gets flowers image
        bkg.setBounds(0,0,700,500);
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    public void learn() {
        java.net.URL imgUrl = Main.class.getResource("Learn Instructions Page.jpg");
        Image icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon(icon)); // gets flowers image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    public void play() {
        Image icon = new ImageIcon("Level 1 Start.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    public void goodbye() {
        screen.setScreen(screen.getScreen()+1);
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
        m.introduction();
        while (true) {
            if (screen.getScreen() == 2) {
                m.mainMenu();
            } else if (screen.getScreen() == 3) {
                m.highscores();
            } else if (screen.getScreen() == 4) {
                m.learn();
            } else if (screen.getScreen() == 5) {
                m.play();
            } else if (screen.getScreen() == 6) {
                m.goodbye();
                break;
            }
            
            // System.out.println(screen.getScreen());
        }
        // source:
        // https://stackoverflow.com/questions/1234912/how-to-programmatically-close-a-jframe
        mainScreen.dispatchEvent(new WindowEvent(mainScreen, WindowEvent.WINDOW_CLOSING));
    }
}