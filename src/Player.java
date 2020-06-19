import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.ImageIcon;

public class Player {
    /*VARIABLE DECLARATIONS*/
    private int x, dx, y, dy, nx2, pos, ePos;             //positions 
    private String player;                                //player
    private HashMap<String, Boolean> ppe;                 //PPE select
    private HashMap<String, ArrayList<Image>> ppeItems;   //PPE images 
    private static String[][] scores = new String[11][2]; //highscores

    private ArrayList<Image> mask;          //mask
    private ArrayList<Image> goggles;       //goggles
    private ArrayList<Image> handSani;      //hand sanitizer
    private ArrayList<Image> viewsBelle;    //Belle views (left, right. front)
    private ArrayList<Image> viewsBarry;    //Barry views (left, right. front)

    private int view;                       //view

    private String name;                    //username
    private int pointsL2;                   //Level two points
    private boolean move;                   //movement
    private String character;               //character 

    //player constructor
    public Player(String c) {
        //initializing variables
        character = c;
        x = 125;
        pos = 175;
        y = 300;
        nx2 = 2000;
        pointsL2 = 0;
        view = 0;
        move = false;

        //Initialize all the data structures
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

        //Add images
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

        name = "XXXX";
        

    }

    public void resetScore(){
        //ORIGINAL HIGHSCORES DEFAULT
        for (int x = 0; x < scores.length; x++) {
            scores[x][0] = "XXXX";
            scores[x][1] = "0000";
        }
    }

    public void move() {
        // incremments position relative to background
        pos += dx;

        // move background
        if (nx2 <= 9285 && nx2 >= 2000) {
            nx2 += dx;
        } else if (nx2 < 2000) {
            nx2++;
        } else if (nx2 > 9285) {
            nx2--;
        }

        //move character up and down
        y += dy;
        if (y < 240)
            y = y - dy + 1;
        else if (y > 400)
            y = y - dy - 1;
    }

    //getPPE item
    public Image getPpeItem(String key, String c) {
        if (!key.equals("hand-sanitizer")) {
            if (c.equals("belle"))
                return ppeItems.get(key).get(view + 2);
            return ppeItems.get(key).get(view);
        }
        return handSani.get(0);

    }

    //replace value in ppSet
    public void ppeSet(String key, boolean val){
        ppe.replace(key, val);
    }

    //find PPE 
    public boolean ppeI(String key) {
        return ppe.get(key);
    }

    //get username
    public String getString() {
        return name;
    }

    //set username
    public void setName(String n) {
        name = n;
    }

    //set character
    public void setCharacter(String n) {
        character = n;
    }

    //AAVA
    public int getNx2() {
        return nx2;
    }

    //get character
    public String getCharacter() {
        return character;
    }

    //get Level 2 points
    public int getPointsL2() {
        return pointsL2;
    }

    //deduct Level 2 points
    public void decrementPoints() {
        pointsL2 -= 100;
    }

    //get x position
    public int getX() {
        return x;
    }

    //get Image relitive image
    public int getImageX() {
        return 2000 - nx2;
    }

    //get y position
    public int getY() {
        return y;
    }

    //get image
    public Image getImage() {
        if (character.equals("barry")) {
            return viewsBarry.get(view);
        }
        return viewsBelle.get(view);
    }

    //display task image
    public Image getTask(int t) {
        return handSani.get(t);
    }

    //return total number of player points
    public int getTotalPoints() {
        return pointsL2;
    }

    //get position of character relative to background
    public int getPos() {
        return pos;
    }

    //check if character is moving
    public boolean isMoving() {
        return move;
    }

    //add points to total points
    public void addPointsL2(int p) {
        pointsL2 += p;
    }

    //get current view of character
    public int getView() {
        return view;
    }

    //highscores code
    public static void highscores(Player p) {
        int index =10;  //default position
        for (int i = 0; i < 10; i++) {
            if (Integer.parseInt(scores[i][1]) <= p.getTotalPoints()) {
                
                for (int x = 9; x >= i; x--) {
                    scores[x + 1][0] = scores[x][0]; //shift previous scores
                    scores[x + 1][1] = scores[x][1];
                }
                index = i; //get index of score position
                break; 
            }
        }
        //insert score
        scores[index][0] = p.getName();
        scores[index][1] = Integer.toString(p.getTotalPoints());
    }

    //get highscores
    public static String[][] getScores(){
        return scores; 
    }

    //clear highscores 
    public static void clearScores() {
        for (int i = 0; i < 10; i++) {
            scores[i][0] = "XXXX";
            scores[i][1] = "0000";
        }
    }

    //return name of player
    public String getName(){
        return name; 
    }

    //reset y position 
    public void setDefaultPos(){
        y=300; 
    }

    //movement based on arrow keys AAVA
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        move = true;

        if (key == KeyEvent.VK_LEFT) {
            dx = -3;
            view = 1;
        }
        if (key == KeyEvent.VK_RIGHT) {
            dx = 3;
            view = 0;
        }
        if (key == KeyEvent.VK_UP) {
            dy = -3;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = 3;
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