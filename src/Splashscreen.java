import java.awt.*;
import javax.swing.*;
public class Splashscreen extends JPanel
{
    JFrame frame;
    JLabel p;
    Splashscreen(JFrame frame){
        this.frame = frame;
    }
    public void start()
    {
        frame.setVisible(true);
        //loop through to increase logo
         for (int i = 50; i < 300; i += 30) { 
            frame.getContentPane().setBackground(Color.BLACK);
            frame.getContentPane().removeAll();
            Image icon = new ImageIcon("Logo.png").getImage().getScaledInstance(i, i+100, 50);
            p = new JLabel(new ImageIcon(icon)); // Gets background image
            p.setVisible(true);
            frame.add(p);
            frame.setVisible(true);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }

    //end animation
    public void end(){
        p.setVisible(false);
        frame.getContentPane().remove(p);
    }


}