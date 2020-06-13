import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.io.*;
import java.util.*;

import javax.imageio.ImageIO;

public class Level2 {

    JFrame game;
    Vars screen;
    Player player; 

    public Level2(JFrame game, Vars screen) {
        this.game = game;
        this.screen = screen; 
    }

    public void charSelect() {
        Image icon = new ImageIcon("Character Select (1).jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void PPEOptions() {
        Image icon = new ImageIcon("PPE Select (1).jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void failed() {
        java.net.URL imgUrl = Main.class.getResource("Failed.jpg");
        Image icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //source: https://stackoverflow.com/questions/36271536/jlabel-text-position
    public void passed() {
        java.net.URL imgUrl = Main.class.getResource("Passed 2.jpg");
        Image icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)){
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