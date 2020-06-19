/**
 * Creators: Aava Sapkota and Sarah Zhao
 * Class: ICS4UO-1
 * Teacher: Ms.Krasteva
 * Project: ISP
 */

//import libraries
import java.awt.*;
import javax.swing.ImageIcon;

public class Infected {
    //variable declarations
    private int x, y, dy, dx, cx, cy; //infected person position
    private Image still; //image of infected 
    private Player p;  //Player variable
    //animation 
    private int start;
    private boolean startB; 

    public Infected(int yL, Player p, int s) {//constuctor
        this.p = p; 
        start = s; 
        startB= false; 
        java.net.URL imgUrl = Main.class.getResource("Infected [left].png"); //set infected image
        still = (new ImageIcon(imgUrl)).getImage().getScaledInstance(130, 100, 100);
        x = 730;//set starting X pos
        y = yL; //set staring Y pos
    }

    //animate infected person
    public void move() {
        if(p.getPos()>start)
            startB = true; 
        if(startB) x-=4;
        if(x<0)startB=false; 
    }

    //return x value
    public int getX() {
        return x;
    }

    //return y value
    public int getY() {
        return y;
    }

    //return image
    public Image getImage() {
        return still;
    }


}