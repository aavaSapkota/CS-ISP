
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.io.*;
import java.util.*;
import javax.swing.JComponent;
import javax.imageio.ImageIO;
import java.awt.Graphics;

public class Level1 {
    JFrame game;
    Vars screen;
    UserInput input;
    Vars correct;
    JLabel bkg;

    public Level1(JFrame game, Vars screen) {
        this.game = game;
        this.screen = screen;
        correct = new Vars(true, "correct");
        // input = new UserInput(game, screen);
        // while (true) {
            // if (screen.getScreen() == 7){
            //     question1();
            // } else if (screen.getScreen() == 8) {
            //     info1();
            // }else if (screen.getScreen() == 9) {
            //     question2();
            // }else if (screen.getScreen() == 10) {
            //     info2();
            // }else if (screen.getScreen() == 11) {
            //     question3();
            // } else if (screen.getScreen() == 12) {
            //     info3();
            // } else if (screen.getScreen() == 13) {
            //     question4();
            // }else if (screen.getScreen() == 14) {
            //     info4();
            // }else if (screen.getScreen() == 15){
            //     end();
            //     // break;
            // } 
        // }
        // if(correct.getCorrect()==false) failed();

    }

    public void question1() {
        System.out.println("QUESTION 1");
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        bkg = new JLabel(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
        System.out.println ("HELLOOOOOOOOOO");
    }

    public void info1() {
        java.net.URL imgUrl = Main.class.getResource("Level 1-1 (1).jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        bkg.setIcon(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question2() {
        java.net.URL imgUrl = Main.class.getResource("Question 2.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        bkg.setIcon(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info2() {
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        bkg.setIcon(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question3() {
        java.net.URL imgUrl = Main.class.getResource("Question 3.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        bkg.setIcon(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info3() {
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        bkg.setIcon(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question4() {
        java.net.URL imgUrl = Main.class.getResource("Question 4.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        bkg.setIcon(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info4() {
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        bkg.setIcon(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void end(){
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        bkg.setIcon(icon);// gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void failed(){
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        bkg.setIcon(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }
}