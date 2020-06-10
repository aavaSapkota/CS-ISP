import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.ImageIcon;

public class Player {
    int x, dx, y, dy, nx2, pos, ePos;
    Image player;
    String fileName;
    String type;
    HashMap<String, Boolean> ppe = new HashMap<String, Boolean>();
    Image[] viewsBelle = { (new ImageIcon(getClass().getClassLoader().getResource("Belle [left].png"))).getImage(),
            (new ImageIcon(getClass().getClassLoader().getResource("Belle [right].png"))).getImage(),
            (new ImageIcon(getClass().getClassLoader().getResource("Belle [front].png"))).getImage() };
    Image[] viewsBerry = { (new ImageIcon(getClass().getClassLoader().getResource("Barry [left].png"))).getImage(),
            (new ImageIcon(getClass().getClassLoader().getResource("Barry [right].png"))).getImage(),
            (new ImageIcon(getClass().getClassLoader().getResource("Barry [front].png"))).getImage() };

    String name;
    int pointsL2;
    int pointsL1;
    boolean move;
    String character;

    public Player(String f) {
        fileName = f;
        java.net.URL imgUrl = Main.class.getResource(fileName);
        player = (new ImageIcon(imgUrl)).getImage().getScaledInstance(130, 100, 100);
        x = 175;
        pos = 175;
        y = 300;
        nx2 = 2000;
        ppe.put("gloves", false);
        ppe.put("mask", false);
        ppe.put("goggles", false);
        ppe.put("hand-sanitizer", false);
    }

    public void move() {
        // incremments position relitive to background
        pos += dx;

        // add
        if (nx2 <= 9285 && nx2 >= 2000) {
            nx2 += dx;
        } else if (nx2 < 2000) {
            nx2++;
        } else if (nx2 >9285) {
            nx2--;
        }

        y += dy;
        if (y < 250)
            y = y - dy + 1;
        else if (y > 400)
            y = y - dy - 1;
    }

    public void setCharacter(String n) {
        character = n;
    }

    public int getPointsL2() {
        return pointsL2;
    }

    public void decrementPoints() {
        pointsL2 -= 10;
    }

    public int getPointsL1() {
        return pointsL1;
    }

    public void addPointsL1() {
        pointsL1 += 10;
    }

    public int getX() {
        return x;
    }

    public int getImageX() {
        return 2000 - nx2;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return player;
    }

    public int getPos() {
        return pos;
    }

    public String getImg() {
        return fileName;
    }

    public void setImage(String i) {
        java.net.URL imgUrl = getClass().getClassLoader().getResource(i);
        ImageIcon ic = new ImageIcon(imgUrl);
        player = ic.getImage().getScaledInstance(180, 100, 100);
    }

    public boolean isMoving() {
        return move;
    }

    public void addPointsL2(int p) {
        pointsL2 += p;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        move = true;

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;

            if(character.equals("belle")){
                setImage("Belle [right].png");
            }else if(character.equals("barry")){
                setImage("Barry [right].png"); 
            }
        } else if (key == KeyEvent.VK_RIGHT) {
            dx = 1;

            if(character.equals("belle")){
                setImage("Belle [left].png");
            }else if(character.equals("barry")){
                setImage("Barry [left].png"); 
            }
        } else if (key == KeyEvent.VK_UP) {
            dy = -1;

        } else if (key == KeyEvent.VK_DOWN) {
            dy = 1;

        }

        // increments points
        if (pos % 20 == 0) {
            pointsL2++;
        }

    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        move = false;

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