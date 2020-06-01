
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
    Clear clearHighscores;
    Level1 learn;
    Level2 play;
    int incorrect;
    int goBack;
    Vars skip;
    int counter;

    public UserInput(JFrame game, Vars screen, Level1 learn) {
        this.game = game;
        this.screen = screen;
        this.learn = learn;
        skip = new Vars(false);
        game.addKeyListener(this);
        game.addMouseListener(this);
        incorrect = 0;
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
        System.out.println("x: " + x + " y: " + y + " incorrect: " + incorrect);

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
            if (x >= 300 && y >= 475 && x <= 430 && y <= 500) {
                screen.setScreen(7);
                counter = 0;
                // System.out.println(learn);
            } // -------------------------------------------------------------GAME SCREENS
              // START ( LEVEL ONE )
        } else if (screen.getScreen() == 7) { // question 1
            learn.question1();
            counter++;
            System.out.println("This is so evil");
            if (counter % 2 == 0)
                if (x >= 370 && y >= 150 && x <= 660 && y <= 290) { // correct answer
                    screen.setScreen(8);
                    incorrect = 0;
                    System.out.println("INCORRECT: " + incorrect);
                    skip.setSkip(true);
                } else if (((x >= 50 && y >= 145 && x <= 355 && y < 295)
                        || (x >= 50 && y >= 310 && x <= 355 && y <= 460)
                        || (x >= 375 && y >= 315 && x <= 660 && y <= 460))) { // incorrect answer
                    goBack = 7;
                    incorrect++;
                    skip.setSkip(false);
                    System.out.println("FAILED1: x: " + x + " y: " + y);
                }
        } else if (screen.getScreen() == 8) {// info 1 screen
            if (x >= 530 && y >= 460 && x <= 675 && y <= 490) {
                screen.setScreen(9);
            }
        } else if (screen.getScreen() == 9) {// question 2
            learn.question2();
            counter++;
            if (counter % 2 == 0)
                if (x >= 40 && y >= 330 && x <= 335 && y <= 490) { // correct answer
                    screen.setScreen(10);
                    incorrect = 0;
                    skip.setSkip(true);
                } else if ((x >= 360 && y >= 150 && x <= 660 && y <= 290)
                        || (x >= 50 && y >= 310 && x <= 355 && y <= 460)
                        || (x >= 360 && y >= 315 && x <= 660 && y <= 460)) {// incorrect answer
                    goBack = 9;
                    incorrect++;
                    System.out.println("FAILED1: x: " + x + " y: " + y);
                    skip.setSkip(false);
                }
        } else if (screen.getScreen() == 10) {// info 2 screen
            if (x >= 530 && y >= 460 && x <= 675 && y <= 490) {
                screen.setScreen(11);
            }
        } else if (screen.getScreen() == 11) {// question 3
            counter++;
            if (counter % 2 == 0)
                if (x >= 360 && y >= 150 && x <= 660 && y <= 290) {// correct
                    screen.setScreen(12);
                    incorrect = 0;
                    skip.setSkip(true);
                } else if ((x >= 50 && y >= 145 && x <= 355 && y < 295) || (x >= 50 && y >= 310 && x <= 355 && y <= 460)
                        || (x >= 360 && y >= 315 && x <= 660 && y <= 460)) { // incorrect
                    goBack = 11;
                    incorrect++;
                    skip.setSkip(false);
                }
        } else if (screen.getScreen() == 12) {// info 3 screen
            if (x >= 530 && y >= 460 && x <= 675 && y <= 490) {
                screen.setScreen(13);
            }
        } else if (screen.getScreen() == 13) {// question 4
            counter++;
            if (counter % 2 == 0)
                if (x >= 50 && y >= 145 && x <= 355 && y < 295) { // correct
                    screen.setScreen(14);
                    incorrect = 0;
                    skip.setSkip(true);
                } else if ((x >= 360 && y >= 150 && x <= 660 && y <= 290)
                        || (x >= 50 && y >= 310 && x <= 355 && y <= 460)
                        || (x >= 360 && y >= 315 && x <= 660 && y <= 460)) {// incorrect
                    goBack = 13;
                    incorrect++;
                    skip.setSkip(false);
                }
        } else if (screen.getScreen() == 14) {// info 4 screen
            if (x >= 530 && y >= 460 && x <= 675 && y <= 490) {
                screen.setScreen(15);
            }
        } else if (screen.getScreen() == 15) {// question 5
            counter++;
            if (counter % 2 == 0)
                if (x >= 50 && y >= 145 && x <= 355 && y < 295) {// correct
                    screen.setScreen(16);
                    incorrect = 0;
                    skip.setSkip(true);
                } else if ((x >= 360 && y >= 150 && x <= 660 && y <= 290)
                        || (x >= 50 && y >= 310 && x <= 355 && y <= 460)
                        || (x >= 360 && y >= 315 && x <= 660 && y <= 460)) {// incorrect
                    goBack = 15;
                    incorrect++;
                    skip.setSkip(false);
                }
        } else if (screen.getScreen() == 16) {// info 5 screen
            if (x >= 530 && y >= 460 && x <= 675 && y <= 490) {
                screen.setScreen(17);
            }
        } else if (screen.getScreen() == 17) {// question 6
            counter++;
            if (counter % 2 == 0)
                if (x >= 50 && y >= 310 && x <= 355 && y <= 460) {// correct
                    incorrect = 0;
                    screen.setScreen(18);
                    skip.setSkip(true);
                } else if ((x >= 360 && y >= 150 && x <= 660 && y <= 290)
                        || (x >= 50 && y >= 145 && x <= 355 && y < 295)
                        || (x >= 360 && y >= 315 && x <= 660 && y <= 460)) {// incorrect
                    goBack = 17;
                    incorrect++;
                    skip.setSkip(false);
                }
        } else if (screen.getScreen() == 18) {// info 6 screen
            if (x >= 530 && y >= 460 && x <= 675 && y <= 490) {
                screen.setScreen(19);
            }
        } else if (screen.getScreen() == 19) { // passed screen
            if (x >= 120 && y >= 325 && x <= 250 && y <= 355) { // go to main menu
                screen.setScreen(2);
            } else if (x >= 475 && y >= 330 && x <= 605 && y <= 355) {// go to next level
                screen.setScreen(22);
            }
        } else if (screen.getScreen() == 20) {// incorrect page
            if (x >= 300 && y >= 340 && x <= 430 && y <= 365) {
                screen.setScreen(goBack);
                skip.setSkip(true);
                System.out.println("goBack: " + goBack);
            }
        } else if (screen.getScreen() == 21) {// failed page
            if (x >= 120 && y >= 315 && x <= 255 && y <= 340) {
                screen.setScreen(7);
                incorrect = 0;
            } else if (x >= 480 && y >= 315 && x <= 610 && y <= 340) {
                screen.setScreen(2);
                incorrect = 0;
            }
        }

        if (!skip.getSkip())
            if (incorrect == 1) {
                screen.setScreen(20);
            } else if (incorrect == 2) {
                screen.setScreen(21);
            }
    }
}