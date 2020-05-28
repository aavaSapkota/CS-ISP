
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

    public Level1(JFrame game, Vars screen){
        this.game = game; 
        this.screen = screen;
        input = new UserInput(this.game, this.screen); 
        question1(); 
    }

    public void question1(){
        java.net.URL imgUrl = Main.class.getResource("Question 1.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets flowers image
        bkg.setBounds(0,0,700,500);
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }
}