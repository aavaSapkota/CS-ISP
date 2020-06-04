import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//source: https://www.youtube.com/watch?v=hzsPwDr8ibE
public class Board extends JPanel implements ActionListener {
    Player p;
    Infected inf; 
    public Image img;
    Timer time;

    public Board() {
        p = new Player("Owner.png");
        inf = new Infected(350, p, 200);
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
        inf.move();
        repaint();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(img, p.getImageX(), 0, null);
        g.drawImage(p.getImage(), p.getX(), p.getY(), null);
        g.drawImage(inf.getImage(), inf.getX(), inf.getY(), null);
        System.out.println("inf x: "+inf.getX()+" p x: "+p.getPos());

    }

    private class AL extends KeyAdapter {
        public void keyReleased(KeyEvent e) {
            p.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            p.keyPressed(e);
        }
    }
}