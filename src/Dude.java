import java.awt.*;
import java.awt.event.KeyEvent;
 
import javax.swing.ImageIcon;
 
public class Dude {
        int x, dx, y, dy, ny2;
        Image still;
 
        public Dude() {
                ImageIcon i = new ImageIcon("Owner.png");
                still = i.getImage().getScaledInstance(100, 100, 100);
                x = 75;
                y = 170;
                ny2 = 500;
        }
 
        public void move() {
                x = x + dx;
                y = y + dy;
        }
 
        public int getX() {
                return x;
        }
 
        public int getY() {
                return y;
        }
 
        public Image getImage() {
                return still;
        }
 
        public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                        dx = -1;
 
                if (key == KeyEvent.VK_RIGHT)
                        dx = 1;

                if (key == KeyEvent.VK_UP)
                        dy = -1;
                
                if (key == KeyEvent.VK_DOWN)
                        dy = 1;
        }
 
        public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();
 
                if (key == KeyEvent.VK_LEFT)
                        dx = 0;
 
                else if (key == KeyEvent.VK_RIGHT)
                        dx = 0;

                else if (key == KeyEvent.VK_UP)
                        dy = 0;
                
                else if (key == KeyEvent.VK_DOWN)
                        dy = 0;
        }
 
}