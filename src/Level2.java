/**
 * Creators: Aava Sapkota and Sarah Zhao
 * Class: ICS4UO-1
 * Teacher: Ms.Krasteva
 * Project: ISP
 */

//import libraries
import java.awt.*;
import javax.swing.*;

public class Level2 {

    //initialize objects
    private JFrame game;
    private Player player; 
    private Image icon; 
    private JLabel bkg;

    //Level2 constructor
    public Level2(JFrame game) {
        this.game = game;
    }

    //character selection graphics
    public void charSelect() {
         icon = new ImageIcon("FINAL Character Selection.PNG").getImage().getScaledInstance(700, 500, 100);
         bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //PPE graphics
    public void PPEOptions() {
         icon = new ImageIcon("FINAL PPE.PNG").getImage().getScaledInstance(700, 500, 100);
         bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        game.add(bkg);
        game.setVisible(true);
    }

    //failed graphics
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
                g.drawString(player.getTotalPoints()+"", 340, 277); //these are x and y positions
            }
        }; //Gets background image
        
        game.getContentPane().add(bkg);
        game.setVisible(true);
        
    }

    //set player variable
    public void setPlayer(Player p){
        player = p;
    }
}