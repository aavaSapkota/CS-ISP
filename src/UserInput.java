
/**
 * Creators: Aava Sapkota and Sarah Zhao
 * Class: ICS4UO-1
 * Teacher: Ms.Krasteva
 * Project: ISP
 */
/**
 * THIS IS TO SEE IF YOU CAN SEE THIS
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.io.*;
import java.util.*;
import javax.swing.JComponent;
import java.awt.Graphics;

public class UserInput extends MouseAdapter implements KeyListener {
    JFrame game;
    Vars screen;
    Vars correct;
    Clear clearHighscores;
    Level1 learn;
    Level2 play;

    public UserInput(JFrame game, Vars screen) {
        this.game = game;
        this.screen = screen;
        game.addKeyListener(this);
        game.addMouseListener(this);
    }

    public UserInput(JFrame game, Vars screen, Vars correct) {
        this.game = game;
        this.screen = screen;
        this.correct = correct;
        game.addKeyListener(this);
        game.addMouseListener(this);
    }
    // source:
    // https://www.youtube.com/watch?v=PbmQrkwR9Ko&list=PLr6-GrHUlVf9SIx5cDhoEMknias5Xyv67&index=44

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
    }

    public void keyReleased(KeyEvent e) {
    }

    // https://www.youtube.com/watch?v=bTaJKm43KGs
    public void mouseClicked(MouseEvent e) {
        game.getContentPane().removeAll();
        int x = e.getX();
        int y = e.getY();
        System.out.println("x: " + x + " y: " + y);
        if (screen.getScreen() == 2) {
            if (x >= 190 && x <= 500 && y >= 230 && y <= 260) {
                screen.setScreen(3);
            } else if (x >= 190 && x <= 500 && y >= 270 && y <= 300) {
                screen.setScreen(4);
            } else if (x >= 190 && x <= 500 && y >= 320 && y <= 350) {
                screen.setScreen(5);
            } else if (x >= 190 && x <= 500 && y >= 360 && y <= 390) {
                screen.setScreen(6);
            }
        } else if (screen.getScreen() == 3) {
            if (x >= 153 && x <= 343 && y >= 435 && y <= 486) {
                screen.setScreen(2);
            } else if (x >= 400 && x <= 588 && y >= 435 && y <= 486) {
                clearHighscores.setStatus(true);
            }
        } else if (screen.getScreen() == 4) {
            if (x >= 240 && x <= 450 && y >= 426 && y <= 470) {
                screen.setScreen(2);
            }
        } else if (screen.getScreen() == 5) {
            if (x >= 285 && y >= 435 && x <= 415 && y <= 465) {
                screen.setScreen(7);
                learn = new Level1(game, screen);
                // System.out.println(learn);
            }
        } else if (screen.getScreen() == 7) { // question 1
            System.out.println("THIS IS WORKING");
            learn.question1();
            if (x >= 360 && y >= 150 && x <= 660 && y <= 290) {
                screen.setScreen(8);
                correct.setCorrect(true);
            }
            else 
            {
                //fail screen
            }
        } else if (screen.getScreen() == 8) {
            screen.setScreen(9);
            learn.info1();
        } else if (screen.getScreen() == 9) {
            learn.question2();
            if (x >= 40 && y >= 330 && x <= 335 && y <= 490) {
                screen.setScreen(10);
                correct.setCorrect(true);
            }
            else {
                //fail screen
            }
        } else if (screen.getScreen() == 10) {
            screen.setScreen(11);
            learn.info2();
        } else if (screen.getScreen() == 11) {
            learn.question3();
            if (x >= 360 && y >= 150 && x <= 660 && y <= 310) {
                screen.setScreen(12);
                correct.setCorrect(true);
            }
            else 
            {
                //fail screen
            }
        } else if (screen.getScreen() == 12) {
            screen.setScreen (13);
            learn.info3();
        } else if (screen.getScreen() == 13) {
            learn.question4();
            if (x >= 35 && y >= 150 && x <= 330 && y <= 310) {
                screen.setScreen(14);
                correct.setCorrect(true);
            }
            else 
            {
                //fail screen
            }
        } else if (screen.getScreen() == 14) {
            screen.setScreen(15);
            learn.info4();
        } else if (screen.getScreen() == 15) {
            learn.question5();
            if (x >= 35 && y >= 150 && x <= 330 && y <= 310) {
                screen.setScreen(16);
                correct.setCorrect(true);
            }
            else 
            {
                //fail screen
            }
            // break;
        } else if (screen.getScreen() == 16) {
            screen.setScreen(17);
            learn.info5();
        } else if (screen.getScreen() == 17) {
            learn.question6();
            if (x >= 40 && y >= 330 && x <= 335 && y <= 490) {
                screen.setScreen(17);
                correct.setCorrect(true);
            }
        }
    }
}