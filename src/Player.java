import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.ImageIcon;

public class Player {
    int x, dx, y, dy, nx2, pos, ePos;
    String player;
    HashMap<String, Boolean> ppe ;
    HashMap<String, ArrayList<Image>> ppeItems;
    static HashMap<String, Integer> scores = new HashMap<String, Integer>();

    ArrayList<Image> mask;
    ArrayList<Image> goggles;
    ArrayList<Image> handSani;
    ArrayList<Image> viewsBelle ;
    ArrayList<Image> viewsBarry;

    int view;

    String name;
    int pointsL2;
    boolean move;
    String character;

    public Player(String c) {
        character = c;
        x = 175;
        pos = 175;
        y = 300;
        nx2 = 2000;
        pointsL2 = 0;
        view = 0;
        move = false;

        ppe = new HashMap<String, Boolean>();
        ppeItems = new HashMap<String, ArrayList<Image>>();

        mask = new ArrayList<Image>();
        goggles = new ArrayList<Image>();
        handSani = new ArrayList<Image>();
        viewsBelle = new ArrayList<Image>();
        viewsBarry = new ArrayList<Image>();
        ppe.put("gloves", false);
        ppe.put("mask", false);
        ppe.put("goggles", false);
        ppe.put("hand-sanitizer", false);

        mask.add((new ImageIcon(getClass().getClassLoader().getResource("MASK - BARRY LEFT (1).png"))).getImage()
                .getScaledInstance(170, 80, 100));
        mask.add((new ImageIcon(getClass().getClassLoader().getResource("MASK - BARRY RIGHT (1).png"))).getImage()
                .getScaledInstance(170, 80, 100));
        mask.add((new ImageIcon(getClass().getClassLoader().getResource("MASK - BELLE RIGHT.png"))).getImage()
                .getScaledInstance(100, 80, 100));
        mask.add((new ImageIcon(getClass().getClassLoader().getResource("MASK - BELLE LEFT.png"))).getImage()
                .getScaledInstance(100, 80, 100));

        ppeItems.put("mask", mask);

        goggles.add((new ImageIcon(getClass().getClassLoader().getResource("BARRY - GOGGLES RIGHT.png"))).getImage()
                .getScaledInstance(150, 80, 100));
        goggles.add((new ImageIcon(getClass().getClassLoader().getResource("BARRY - GOGGLES LEFT.png"))).getImage()
                .getScaledInstance(150, 80, 100));
        goggles.add((new ImageIcon(getClass().getClassLoader().getResource("BELLE - GOGGLES RIGHT.png"))).getImage()
                .getScaledInstance(80, 50, 100));
        goggles.add((new ImageIcon(getClass().getClassLoader().getResource("BELLE - GOGGLES LEFT.png"))).getImage()
                .getScaledInstance(80, 50, 100));
        ppeItems.put("goggles", goggles);

        handSani.add((new ImageIcon(getClass().getClassLoader().getResource("handSanitizer.png"))).getImage()
                .getScaledInstance(15, 30, 100));
        handSani.add((new ImageIcon(getClass().getClassLoader().getResource("Takeout.png"))).getImage()
                .getScaledInstance(20, 25, 100));
        ppeItems.put("hand-sanitizer", handSani);

        viewsBelle.add((new ImageIcon(getClass().getClassLoader().getResource("Belle [left].png"))).getImage()
                .getScaledInstance(180, 100, 100));
        viewsBelle.add((new ImageIcon(getClass().getClassLoader().getResource("Belle [right].png"))).getImage()
                .getScaledInstance(180, 100, 100));

        viewsBarry.add((new ImageIcon(getClass().getClassLoader().getResource("Barry [right].png"))).getImage()
                .getScaledInstance(180, 100, 100));
        viewsBarry.add((new ImageIcon(getClass().getClassLoader().getResource("Barry [left].png"))).getImage()
                .getScaledInstance(180, 100, 100));

        scores.put(name, 0);

    }

    public void move() {
        // incremments position relitive to background
        pos += dx;

        // add
        if (nx2 <= 9285 && nx2 >= 2000) {
            nx2 += dx;
        } else if (nx2 < 2000) {
            nx2++;
        } else if (nx2 > 9285) {
            nx2--;
        }

        y += dy;
        if (y < 250)
            y = y - dy + 1;
        else if (y > 400)
            y = y - dy - 1;
    }

    public Image getPpeItem(String key, String c) {
        if (!key.equals("hand-sanitizer")) {
            if (c.equals("belle"))
                return ppeItems.get(key).get(view + 2);
            return ppeItems.get(key).get(view);
        }
        return handSani.get(0);

    }

    public boolean ppeI(String key) {
        return ppe.get(key);
    }

    public String getString() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setCharacter(String n) {
        character = n;
    }

    public int getNx2(){
        return nx2; 
    }

    public String getCharacter() {
        return character;
    }

    public int getPointsL2() {
        return pointsL2;
    }

    public void decrementPoints() {
        pointsL2 -= 100;
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
        if (character.equals("barry")) {
            return viewsBarry.get(view);
        }
        return viewsBelle.get(view);
    }

    public Image getTask(int t) {
        return handSani.get(t);
    }

    public int getTotalPoints() {
        return 90 + pointsL2;
    }

    public int getPos() {
        return pos;
    }

    public boolean isMoving() {
        return move;
    }

    public void addPointsL2(int p) {
        pointsL2 += p;
    }

    public int getView() {
        return view;
    }

    public static void addScore() {

    }

    public void highscores() {
        if (scores.size() < 11) {
            for (String s : scores.keySet()) {
                if (scores.get(s) < getTotalPoints()) {
                    scores.remove(s, scores.get(s));
                    scores.put(name, getTotalPoints());
                    break;
                }
            }
        }
        for (String i : scores.keySet()) {
            System.out.println("key: " + i + "value: " + scores.get(i));
        }
    }

    public void clearScores() {
        scores.clear();
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        move = true;

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
            view = 1;
        }
        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
            view = 0;
        }
        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
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