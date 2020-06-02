package AnimationTrials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Board extends JPanel implements ActionListener{
    Dude p; 
    Image img; 
    Timer time; 

    public Board(){
        p = new Dude();
        setFocusable(true);
        addKeyListener(new AL());
        ImageIcon i= new ImageIcon("Info 5");
        img = i.getImage();
        time = new Timer(5,this);
        time.start();
    }

    public void actionPerformed(ActionEvent e){
        p.move();
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(img, 0, 0, null);
        g.drawImage(p.getImage(), p.getX(), p.getY(),null);

    }

    private class AL extends KeyAdapter{
        public void keyReleased(KeyEvent e){
            p.keyReleased(e);
        }

        public void keyPressed(KeyEvent e){
            p.keyPressed(e);
        }
    }
}