
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
    static Screen screen;
    static UserInput input;
    static JFrame mainScreen = new JFrame("Game Title");

    public Main() {
        screen = new Screen(1);
        mainScreen.setLayout(new FlowLayout());
        mainScreen.setSize(700, 500);
        mainScreen.setVisible(true);
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        input = new UserInput(mainScreen, screen);

    }

    public void introduction() {
        mainScreen.getContentPane().removeAll();
        //source: https://stackoverflow.com/questions/6810581/how-to-center-the-text-in-a-jlabel
        JLabel title = new JLabel(
                "<html><div style='text-align: center; margin-top: 50px'> PHOENIX GAMES </div></html>");
        mainScreen.add(title);
        // mainScreen.getContentPane().setBackground(Color.gray);
        
        try {

            Image backgroundImage = ImageIO.read(new File("Menu Page.jpg"));
            java.net.URL imgUrl = Main.class.getResource("Menu Page.jpg");
            ImageIcon icon = new ImageIcon(imgUrl);
            JLabel l = new JLabel(icon);
            JLabel i = new JLabel("MAIN MENU");
            mainScreen.add(l);
            mainScreen.add(i);
            Thread.sleep(1000);
        } catch (Exception a) {
        }
        ;
        mainScreen.remove(title);

    }

    public void mainMenu() {
        try {
            //source: https://stackoverflow.com/questions/13011705/how-to-add-an-imageicon-to-a-jframe
            Image backgroundImage = ImageIO.read(new File("Menu Page.jpg"));
            java.net.URL imgUrl = Main.class.getResource("Menu Page.jpg");
            ImageIcon icon = new ImageIcon(imgUrl);
            JLabel l = new JLabel(icon);
            JLabel i = new JLabel("MAIN MENU");
            mainScreen.add(l);
            mainScreen.add(i);
            Thread.sleep(1000);
        } catch (Exception a) {}
        

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
            if (screen.getScreen() == 1) {
                m.introduction();
            } else if (screen.getScreen() == 2) {
                m.mainMenu();
            } else if (screen.getScreen() == 3) {
                m.highscores();
            } else if (screen.getScreen() == 4) {
                m.learn();
            } else if (screen.getScreen() == 5) {
                m.play();
            } else if (screen.getScreen() == 6) {
                m.goodbye();
            } else if (screen.getScreen() == 7) {
                m.credits();
            }
            System.out.println(screen.getScreen());

        }
        // source:
        // https://stackoverflow.com/questions/1234912/how-to-programmatically-close-a-jframe
        mainScreen.dispatchEvent(new WindowEvent(mainScreen, WindowEvent.WINDOW_CLOSING));
    }
}