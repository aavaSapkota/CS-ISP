
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
    private JFrame game;
    private JLabel bkg;
    private Image icon;

    public Level1(JFrame game) {
        this.game = game;

    }

    public void question1() {
        icon = new ImageIcon("Question 1.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info1() {
        icon = new ImageIcon("Info 1.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question2() {
        icon = new ImageIcon("Question 2.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info2() {
        icon = new ImageIcon("Info 2.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question3() {
        icon = new ImageIcon("Question 3.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info3() {
        icon = new ImageIcon("Info 3.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question4() {
        icon = new ImageIcon("Question 4.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info4() {
        icon = new ImageIcon("Info 4.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question5() {
        icon = new ImageIcon("Question 5.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info5() {
        java.net.URL imgUrl = Main.class.getResource("Info 5.jpg");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question6() {
        java.net.URL imgUrl = Main.class.getResource("Question 6 (1).jpg");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info6() {
        icon = new ImageIcon("Info 6.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question7() {
        java.net.URL imgUrl = Main.class.getResource("Question 7.jpg");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info7() {
        icon = new ImageIcon("Info 7.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question8() {
        java.net.URL imgUrl = Main.class.getResource("Question 8.jpg");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info8() {
        icon = new ImageIcon("Info 8.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void question9() {
        java.net.URL imgUrl = Main.class.getResource("Question 9.jpg");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void info9() {
        icon = new ImageIcon("Info 9.jpg").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void failed() {
        java.net.URL imgUrl = Main.class.getResource("Failed.jpg");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void incorrect() {
        java.net.URL imgUrl = Main.class.getResource("Incorrect.jpg");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void passed() {
        icon = new ImageIcon(Main.class.getResource("Passed 1.jpg")).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }
}