import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.io.*;
import java.util.*;
import javax.swing.JComponent;
import javax.imageio.ImageIO;
import java.awt.Graphics;

public class Level2 {

    JFrame game;
    Vars screen;

    public Level2(JFrame game, Vars screen) {
        this.game = game;
        this.screen = screen; 
    }


    public void charSelect(){
        Image icon = new ImageIcon("Character Select.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    public void PPEOptions() {
        Image icon = new ImageIcon("PPE Select.jpg").getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon (icon)); //Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }
}