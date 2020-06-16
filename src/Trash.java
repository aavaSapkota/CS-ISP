
import java.awt.*;
import javax.swing.ImageIcon;

public class Trash {
    int x, y, dy, dx, cx, cy;
    Image still;
    Player p;
    boolean pickedUp;
    static int objectCount=0;
    int checkpoint = 0; 


    public Trash(int yL, Player p) {
        this.p = p;
        pickedUp = false;
        java.net.URL imgUrl = Main.class.getResource("Infected [right].png");
        still = (new ImageIcon(imgUrl)).getImage().getScaledInstance(130, 100, 100);
        x = 751;
        y = yL;
        checkpoint=2500+(500*(objectCount-1));
        objectCount++;
    }


    public int getX() {

        return  (p.getPos()-checkpoint) ;
    }

    public int getCheckpoint(){
        return 2500+(500*(objectCount-1));
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return still;
    }

}
