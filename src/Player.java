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

    String name; 
    int pointsL2; 
    int pointsL1; 


    public Player(String f) {
        fileName = f; 
        java.net.URL imgUrl = Main.class.getResource(fileName);
        ImageIcon img = new ImageIcon(imgUrl);
        player = img.getImage().getScaledInstance(150, 100, 100);
        System.out.println("size: "+player.getWidth(null));
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
        //incremments position relitive to background
        pos += dx; 
        
        //increments player points
        if(pos%100==0){
            pointsL2++;
        }
            
        //add 
        if(nx2<=7285&&nx2>=2000){
            nx2 += dx;
        }else if(nx2<2000){
            nx2++;
        }else if(nx2>7285){
            nx2--;
        }
        
        y += dy;
        if(y<250)
            y=y-dy+1;
        else if(y>400)
            y=y-dy-1;
    }

    public int getPointsL2(){
        return pointsL2; 
    }

    public void decrementPoints(){
        pointsL2-=10; 
    }

    public int getPointsL1(){
        return pointsL1;
    }

    public void addPointsL1(){
        pointsL1+=10;
    }

    public int getX() {
        return x;
    }

    public int getImageX(){
        return 2000-nx2;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return player;
    }

    public int getPos(){
        return pos; 
    }

    public String getImg(){
        return fileName;
    }

    public void setImage(String i){
        java.net.URL imgUrl = Main.class.getResource(i);
        ImageIcon ic = new ImageIcon(imgUrl);
        player = ic.getImage().getScaledInstance(180, 100, 100);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT){
            dx = -1;
        }   

        if (key == KeyEvent.VK_RIGHT){
            dx = 1;
        }

        if (key == KeyEvent.VK_UP)
            dy = -1;

        if (key == KeyEvent.VK_DOWN)
            dy= 1;
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