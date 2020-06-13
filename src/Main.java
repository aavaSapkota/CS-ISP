
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
    static Level1 learn;
    static Level2 play;
    static int running = 0; 
    Image icon;
    JLabel bkg;

    public Main() {
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainScreen.setSize(730, 540);
        mainScreen.setVisible(true);
        mainScreen.setLocationRelativeTo(null);
        screen = new Vars(28); //set up starting screen
        learn = new Level1(mainScreen, screen);
        play = new Level2(mainScreen, screen);
    }

    public void splashScreen(){
        Splashscreen a = new Splashscreen(mainScreen);
        a.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        a.end();
    }

    public void introduction() {
        icon = new ImageIcon("Title Card.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
        input = new UserInput(mainScreen, screen, learn, play);
        screen.setScreen(screen.getScreen() + 1);

    }

    public void mainMenu() {
        java.net.URL imgUrl = Main.class.getResource("Menu.jpg");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // gets flowers image
        bkg.setBounds(0, 0, 705, 510);
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);

    }

    public void highscores() {
        java.net.URL imgUrl = Main.class.getResource("Highscores.jpg");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // gets flowers image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    public void learn() {
        java.net.URL imgUrl = Main.class.getResource("Instruction.jpg");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // gets flowers image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    public void level1() {
        icon = new ImageIcon("Level 1 Start (1).jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    public void level2() {
        java.net.URL imgUrl = Main.class.getResource("Level 2 Start.jpg");
         icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
         bkg = new JLabel(new ImageIcon(icon)); // gets flowers image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    public void goodbye() {
        screen.setScreen(screen.getScreen() + 1);
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
        m.splashScreen();
        m.introduction();
        while (true) {
            if (screen.getScreen() == 2) {
                m.mainMenu();
            } else if (screen.getScreen() == 3) {
                m.highscores();
            } else if (screen.getScreen() == 4) {
                m.learn();
            } else if (screen.getScreen() == 5) {
                m.level1();
            } else if (screen.getScreen() == 6) {
                m.goodbye();
                break;
            } else if (screen.getScreen() == 7) { // question 1
                learn.question1();
            } else if (screen.getScreen() == 8) {// info 1 screen
                learn.info1();
            } else if (screen.getScreen() == 9) {// question 2
                learn.question2();
            } else if (screen.getScreen() == 10) {// info 2 screen
                learn.info2();
            } else if (screen.getScreen() == 11) {// question 3
                learn.question3();
            } else if (screen.getScreen() == 12) {// info 3 screen
                learn.info3();
            } else if (screen.getScreen() == 13) {// question 4
                learn.question4();
            } else if (screen.getScreen() == 14) {// info 4 screen
                learn.info4();
            } else if (screen.getScreen() == 15) {// question 5
                learn.question5();
            } else if (screen.getScreen() == 16) {// info 5 screen
                learn.info5();
            } else if (screen.getScreen() == 17) {// question 6
                learn.question6();
            } else if (screen.getScreen() == 18) {// info 6 screen
                learn.info6();
            } else if (screen.getScreen() == 19) {// question 7
                learn.question7();
            } else if (screen.getScreen() == 20) {// info 7 screen
                learn.info7();
            } else if (screen.getScreen() == 21) {// question 8
                learn.question8();
            } else if (screen.getScreen() == 22) {// info 8 screen
                learn.info8();
            } else if (screen.getScreen() == 23) {// question 9
                learn.question9();
            } else if (screen.getScreen() == 24) {// info 9 screen
                learn.info9();
            } else if (screen.getScreen() == 25) { // passed screen
                learn.passed();
            } else if (screen.getScreen() == 26) {// incorrect page
                learn.incorrect();
            } else if (screen.getScreen() == 27) {// failed page
                learn.failed();
            } else if (screen.getScreen() == 28) {// Level 2 start page
                m.level2();
            } else if (screen.getScreen() == 29) { // character select
                play.charSelect();
            } else if (screen.getScreen() == 30) { // PPE selection page
                play.PPEOptions();
            } else if(input.screen.getScreen() == 32){ //failed screen
                play.failed();
            }else if(input.screen.getScreen() == 33){ //passed screen
                play.passed();
            } 
            System.out.print("");
            
        }
        // source:
        // https://stackoverflow.com/questions/1234912/how-to-programmatically-close-a-jframe
        mainScreen.dispatchEvent(new WindowEvent(mainScreen, WindowEvent.WINDOW_CLOSING));
    }
}
