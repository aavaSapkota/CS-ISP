import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//source: https://www.youtube.com/watch?v=hzsPwDr8ibE
public class Board extends JPanel implements ActionListener {
    Dude p;
    public Image img;
    Timer time;

    public Board() {
        p = new Dude();
        addKeyListener(new AL());
        setFocusable(true);
        java.net.URL imgUrl = Main.class.getResource("Menu.jpg");
        ImageIcon i = new ImageIcon(imgUrl);
        img = i.getImage().getScaledInstance(700, 500, 100);
        time = new Timer(5, this);
        time.start();
    }

    public void actionPerformed(ActionEvent e) {
        p.move();
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(img, 0, 475-p.ny2, null);
        g.drawImage(p.getImage(), p.getX(), 175, null);
    }

    private class AL extends KeyAdapter {
        public void keyReleased(KeyEvent e) {
            System.out.println("My dude, i'm ded");
            System.out.println(p.getY());
            p.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            p.keyPressed(e);
        }
    }
}