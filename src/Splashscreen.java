import java.awt.*;
import javax.swing.*;
public class Splashscreen extends JPanel
{
    JFrame frame;
    public void start()
    {
        frame = new JFrame();
        frame.setSize(730, 540);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         for (int i = 50; i < 300; i += 30) { 
            frame.getContentPane().setBackground(Color.BLACK);
            frame.getContentPane().removeAll();
            Image icon = new ImageIcon("Logo.png").getImage().getScaledInstance(i, i+100, 50);
            JLabel p = new JLabel(new ImageIcon(icon)); // Gets background image
            p.setVisible(true);
            frame.add(p);
            frame.setVisible(true);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }

    public static void main (String[]args){
        Splashscreen s = new Splashscreen();
        s.start();
    }

}