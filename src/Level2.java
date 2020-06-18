import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.io.*;
import java.util.*;

import javax.imageio.ImageIO;

public class Level2 {

    private JFrame game;
    private Player player; 
    private Image icon; 
    private JLabel bkg;

    public Level2(JFrame game) {
        this.game = game;
    }

    public void charSelect() {
         icon = new ImageIcon("FINAL Character Selection.PNG").getImage().getScaledInstance(700, 500, 100);
         bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void PPEOptions() {
         icon = new ImageIcon("FINAL PPE.PNG").getImage().getScaledInstance(700, 500, 100);
         bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void failed() {
        java.net.URL imgUrl = Main.class.getResource("FINAL Failed.PNG");
         icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
         bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //source: https://stackoverflow.com/questions/36271536/jlabel-text-position
    public void passed() {
        java.net.URL imgUrl = Main.class.getResource("FINAL_Passed_2.png");
         icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
         bkg = new JLabel(new ImageIcon (icon)){
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setFont(new Font("Consolas", Font.PLAIN, 20));
                g.drawString(player.getTotalPoints()+"", 320, 300); //these are x and y positions
            }
        }; //Gets background image
        
        game.getContentPane().add(bkg);
        game.setVisible(true);
        
    }

    public void setPlayer(Player p){
        player = p;
    }
}