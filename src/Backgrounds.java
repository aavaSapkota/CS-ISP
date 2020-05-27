import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.io.*;
import java.util.*;
import javax.swing.JComponent;
import javax.imageio.ImageIO;
import java.awt.Graphics;

//source: https://stackoverflow.com/questions/1466240/how-to-set-an-image-as-a-background-for-frame-in-swing-gui-of-java
public class Backgrounds extends JComponent{
    private Image bkg; 

    public Backgrounds(String filename){
        try{
            bkg = ImageIO.read(new File(filename));
        }catch(Exception e){}
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(bkg, 0, 0, this);
    }

}