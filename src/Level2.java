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
        frame.setTitle("2-D Test Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    // public static void main(String[] args) {
    //     new Level2(frame);
    // }
}