/**
 * Creators: Aava Sapkota and Sarah Zhao
 * Class: ICS4UO-1
 * Teacher: Ms.Krasteva
 * Project: ISP
 */

 //import libraries
import java.awt.*;
import javax.swing.*;

public class Level1 {
    //variables in level
    private JFrame game;
    private JLabel bkg;
    private Image icon;

    public Level1(JFrame game) { //class constructor
        this.game = game;

    }

    //Question 1 graphics
    public void question1() {
        icon = new ImageIcon("FINAL Question 1.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Info 1 graphics
    public void info1() {
        icon = new ImageIcon("FINAL Info 1.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Question 2 graphics
    public void question2() {
        icon = new ImageIcon("FINAL Question 2.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Info 2 graphics
    public void info2() {
        icon = new ImageIcon("FINAL Info 2.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Question 3 graphics
    public void question3() {
        icon = new ImageIcon("FINAL Question 3.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Info 3 graphics
    public void info3() {
        icon = new ImageIcon("FINAL Info 3.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Question 4 graphics
    public void question4() {
        icon = new ImageIcon("FINAL Question 4.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Info 4 graphics
    public void info4() {
        icon = new ImageIcon("FINAL Info 4.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Question 5 graphics
    public void question5() {
        icon = new ImageIcon("FINAL Question 5.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Info 5 graphics
    public void info5() {
        java.net.URL imgUrl = Main.class.getResource("FINAL Info 5.PNG");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Question 6 graphics
    public void question6() {
        java.net.URL imgUrl = Main.class.getResource("FINAL Question 6.PNG");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Info 6 graphics
    public void info6() {
        icon = new ImageIcon("FINAL Info 6.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Question 7 graphics
    public void question7() {
        java.net.URL imgUrl = Main.class.getResource("FINAL Question 7.PNG");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Info 7 graphics
    public void info7() {
        icon = new ImageIcon("FINAL Info 7.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Question 8 graphics
    public void question8() {
        java.net.URL imgUrl = Main.class.getResource("FINAL Question 8.PNG");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Info 8 graphics
    public void info8() {
        icon = new ImageIcon("FINAL Info 8.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Question 9 graphics
    public void question9() {
        java.net.URL imgUrl = Main.class.getResource("FINAL Question 9.PNG");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Info 9 graphics
    public void info9() {
        icon = new ImageIcon("FINAL Info 9.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Failed graphic
    public void failed() {
        java.net.URL imgUrl = Main.class.getResource("FINAL Failed.PNG");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Incorrect graphic
    public void incorrect() {
        java.net.URL imgUrl = Main.class.getResource("FINAL Incorrect.PNG");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //Level 1 Passed graphic
    public void passed() {
        icon = new ImageIcon(Main.class.getResource("FINAL Passed 1.PNG")).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }
}