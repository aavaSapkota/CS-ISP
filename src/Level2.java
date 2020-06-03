import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.io.*;
import java.util.*;
import javax.swing.JComponent;
import javax.imageio.ImageIO;
import java.awt.Graphics;

public class Level2 {

    JFrame frame;
    Vars screen;

    public Level2(JFrame frame) {
        this.frame = frame;
        frame.add(new Board());
        frame.setVisible(true);
    }

    // public static void main(String[] args) {
    //     new Level2(frame);
    // }
}