
import java.awt.*;
import javax.swing.ImageIcon;

public class Trash {
    int x, y, dy, dx, cx, cy;
    Image still;
    Player p;
    boolean pickedUp;
    static int objectCount = 0;
    int start;
    int[] checkPoints = { 1700, 2500, 3700, 4700 };
    int c = 0;

    public Trash(int yL, Player p, int s) {
        this.p = p;
        pickedUp = false;
        java.net.URL imgUrl = Main.class.getResource("Infected [right].png");
        still = (new ImageIcon(imgUrl)).getImage().getScaledInstance(130, 100, 100);
        x = 750;
        y = yL;
        start = s;
        objectCount++;
    }

    public int getX() {
        if (pickedUp == false) {
            return (p.getPos() - checkPoints[c]);
        }
        return 30;
    }

    public void nextCheckpoint() {
        if (c+1 < 4)
            c++;
    }

    public int getCheckPoint() {
        return checkPoints[c];
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return still;
    }

}
