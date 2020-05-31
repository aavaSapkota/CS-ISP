
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

    }

    public void question1() {
        Image icon = new ImageIcon("Question 1.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info1() {
        Image icon = new ImageIcon("Info 1.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question2() {
        Image icon = new ImageIcon("Question 2.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info2() {
        Image icon = new ImageIcon("Info 2.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question3() {
        Image icon = new ImageIcon("Question 3.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info3() {
        Image icon = new ImageIcon("Info 3.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question4() {
        Image icon = new ImageIcon("Question 4.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info4() {
        Image icon = new ImageIcon("Info 4.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question5() {
        Image icon = new ImageIcon("Question 5.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info5() {
        java.net.URL imgUrl = Main.class.getResource("Info 5.jpg");
        Image icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }
    public void question6() {
        System.out.println("Ang, ur age is showing");
        java.net.URL imgUrl = Main.class.getResource("Question 6 (1).jpg");
        Image icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info6() {
        Image icon = new ImageIcon("Info 6.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void failed(){
        java.net.URL imgUrl = Main.class.getResource("Failed.jpg");
        Image icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
        
        
    }

    public void incorrect(){
        java.net.URL imgUrl = Main.class.getResource("Fail.jpg");
        Image icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
        
    }

    public void passed(){
        java.net.URL imgUrl = Main.class.getResource("Passed 1.jpg");
        Image icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
        
    }
}