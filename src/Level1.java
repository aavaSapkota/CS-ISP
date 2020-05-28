
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
    private boolean correct;

    public Level1(JFrame game, Vars screen) {
        this.game = game;
        screen = new Vars(7);
        correct = true;
        input = new UserInput(this.game, this.screen);
        while (screen.getScreen()<16) {
            if (screen.getScreen() == 7){
                question1();
                if (correct) {
                    info1();
                }else{
                    failed();
                }
            } else if (screen.getScreen() == 9) {
                question2();
            } else if (screen.getScreen() == 10) {
                info2();
            } else if (screen.getScreen() == 11) {
                question3();
            } else if (screen.getScreen() == 12) {
                info3();
            } else if (screen.getScreen() == 13) {
                question4();
            } else if (screen.getScreen() == 14) {
                info4();
            } else if (screen.getScreen() == 15){
                end();
            } 
        }

    }

    public void question1() {
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info1() {
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question2() {
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info2() {
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question3() {
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info3() {
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question4() {
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info4() {
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void end(){
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void failed(){
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets question image
        bkg.setBounds(0, 0, 700, 500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }
}