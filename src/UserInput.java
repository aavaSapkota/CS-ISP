
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
import javax.swing.Timer;
import javax.swing.JFrame.*;
import java.io.*;
import java.util.*;
import java.awt.Graphics;

public class UserInput {
    JFrame game;
    JFrame Sal = new JFrame();
    Vars screen;
    Clear clearHighscores;
    Level1 learn;
    int incorrect;
    int goBack;
    Vars skip;
    int counter;

    Player p;
    Infected inf;
    public Image bkg;
    Timer time;
    int[] timeline = { 400, 900, 1000 };
    boolean run;
    int timing = 1;

    int exposure;
    Board g;
    Level2 play;
    int extraLife;
    boolean pause;
    boolean[] tasks = { false, false };
    boolean proceed = false;

    final int pC = 700;

    public UserInput(JFrame game, Vars screen, Level1 learn, Level2 play) {
        this.game = game;
        this.screen = screen;
        this.learn = learn;
        this.play = play;
        run = false;
        skip = new Vars(false);
        game.addMouseListener(new ML());
        incorrect = 0;

        game.addKeyListener(new AL());
        game.setFocusable(true);
        java.net.URL imgUrl = Main.class.getResource("Level2 background (1).jpg");
        ImageIcon i = new ImageIcon(imgUrl);
        bkg = i.getImage().getScaledInstance(8000, 500, java.awt.Image.SCALE_SMOOTH);
        exposure = 0;
        extraLife = 0;
        p = new Player("Belle [left].png");
        pause = true;

    }
    // source:
    // https://www.youtube.com/watch?v=PbmQrkwR9Ko&list=PLr6-GrHUlVf9SIx5cDhoEMknias5Xyv67&index=44

    // https://www.youtube.com/watch?v=bTaJKm43KGs
    private class ML extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            game.getContentPane().removeAll();
            int x = e.getX();
            int y = e.getY();
            System.out.println("x: " + e.getX() + " y: " + e.getY());
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
                    clearHighscores.setStatus(true);
                    
                } else if (x >= 400 && x <= 588 && y >= 435 && y <= 486) {
                    screen.setScreen(2);
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
                counter++;
                if (counter % 2 == 0)
                    if (x >= 370 && y >= 150 && x <= 660 && y <= 290) { // correct answer
                        screen.setScreen(8);
                        incorrect = 0;
                        p.addPointsL1();
                        skip.setSkip(true);
                    } else if (((x >= 50 && y >= 145 && x <= 355 && y < 295)
                            || (x >= 50 && y >= 310 && x <= 355 && y <= 460)
                            || (x >= 375 && y >= 315 && x <= 660 && y <= 460))) { // incorrect answer
                        goBack = 7;
                        incorrect++;
                        skip.setSkip(false);
                    }
            } else if (screen.getScreen() == 8) {// info 1 screen
                if (x >= 530 && y >= 460 && x <= 675 && y <= 490) {
                    screen.setScreen(9);
                }
            } else if (screen.getScreen() == 9) {// question 2
                counter++;
                if (counter % 2 == 0)
                    if (x >= 40 && y >= 330 && x <= 335 && y <= 490) { // correct answer
                        screen.setScreen(10);
                        incorrect = 0;
                        skip.setSkip(true);
                        p.addPointsL1();
                    } else if ((x >= 360 && y >= 150 && x <= 660 && y <= 290)
                            || (x >= 50 && y >= 310 && x <= 355 && y <= 460)
                            || (x >= 360 && y >= 315 && x <= 660 && y <= 460)) {// incorrect answer
                        goBack = 9;
                        incorrect++;
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
                        p.addPointsL1();
                    } else if ((x >= 50 && y >= 145 && x <= 355 && y < 295)
                            || (x >= 50 && y >= 310 && x <= 355 && y <= 460)
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
                        p.addPointsL1();
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
                        p.addPointsL1();
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
                        p.addPointsL1();
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
                }
            } else if (screen.getScreen() == 21) {// failed page
                if (x >= 120 && y >= 315 && x <= 255 && y <= 340) {
                    screen.setScreen(7);
                    incorrect = 0;
                } else if (x >= 480 && y >= 315 && x <= 610 && y <= 340) {
                    screen.setScreen(2);
                    incorrect = 0;
                }
            } else if (screen.getScreen() == 22) {// Instructions for Level 2
                if (x >= 300 && y >= 475 && x <= 430 && y <= 500) {
                    screen.setScreen(23);
                }
            } else if (screen.getScreen() == 23) { // Character Selection

                if (x >= 100 && y >= 200 && x <= 340 && y <= 430) {
                    p.setImage("Belle [left].png");
                    p.setCharacter("belle");
                    proceed = true;
                } else if (x >= 380 && y >= 200 && x <= 630 && y <= 430) {
                    p.setImage("Barry [right].png");
                    p.setCharacter("barry");
                    proceed = true;
                }

                if (x >= 320 && y >= 485 && x <= 415 && y <= 508 && proceed == true) {
                    screen.setScreen(24);
                }
                extraLife = 0;

            } else if (screen.getScreen() == 24) { // PPE Selection
                counter++;

                if (x >= 125 && y >= 185 && x <= 370 && y <= 300 && p.ppe.get("gloves") == false) {
                    p.ppe.replace("gloves", true);
                    extraLife++;
                } else if (x >= 395 && y >= 185 && x <= 635 && y <= 305 && p.ppe.get("mask") == false) {
                    p.ppe.replace("mask", true);
                    extraLife++;
                } else if (x >= 125 && y >= 325 && x <= 370 && y <= 445 && p.ppe.get("goggles") == false) {
                    p.ppe.replace("goggles", true);
                    extraLife++;
                } else if (x >= 395 && y >= 325 && x <= 635 && y <= 445 && p.ppe.get("hand-sanitizer") == false) {
                    p.ppe.replace("hand-sanitizer", true);
                    extraLife++;
                }
                if (counter % 2 == 0) 
                    if (x >= 300 && y >= 475 && x <= 430 && y <= 500) {
                        screen.setScreen(25);
                    }
            } else if (screen.getScreen() == 25) { // Game Screen
                g = new Board();// Make new instance of Board
                game.add(g); // add to JFrame
                g.setVisible(true);
                game.setVisible(true);
                if (run == false) {

                }
            } else if (screen.getScreen() == 26) { // fail screen
                g.setVisible(false);
                game.getContentPane().remove(g);
                play.failed();
                if (x >= 120 && y >= 315 && x <= 255 && y <= 340) {
                    screen.setScreen(25);// set back to play screen
                } else {
                    screen.setScreen(2);
                }
            }else if(screen.getScreen() == 27){
                if (x >= 120 && y >= 325 && x <= 250 && y <= 355) { // go to main menu
                    screen.setScreen(2);
                } else if (x >= 475 && y >= 330 && x <= 605 && y <= 355) {// go to next level
                    screen.setScreen(2);
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

    // source: https://www.youtube.com/watch?v=hzsPwDr8ibE
    private class Board extends JPanel implements ActionListener {

        Image life, ownwer, nurse;
        int counter;

        public Board() {
            addKeyListener(new AL());
            time = new Timer(5, this);
            time.start();
            inf = new Infected(1700+pC, p, 350);
            run = true;
            counter = 0;
            ownwer = ((new ImageIcon(getClass().getResource("Owner.png"))).getImage().getScaledInstance(50, 50, 100));
            nurse = ((new ImageIcon(getClass().getResource("Nurse.png"))).getImage().getScaledInstance(100, 70, 100));
            life = (new ImageIcon(getClass().getResource("Life.png"))).getImage().getScaledInstance(20, 20, 100);
        }

        public void actionPerformed(ActionEvent e) {
            if (run) {
                if (3 + extraLife <= 0||p.getPos() >= 7600) { // check if there is enough health to continue.
                    run = false;
                }

                p.move(); // moves player
                inf.move(); // moves infected player
                repaint();

                if (p.getY() <= 250 && p.getPos() >= 3875 + pC && p.getPos() <= 3935 + pC) {
                    tasks[0] = true;
                } else if (p.getY() <= 250 && p.getPos() >= 4875 + pC+200 && p.getPos() <= 5005 + pC+200) {
                    tasks[1] = true;
                }

                if (intersect()) {// check if player and infected player collide
                    exposure++; // increase exposure
                    if (exposure % 100 == 0) {
                        extraLife--; // decrease health
                        p.decrementPoints(); // decreace points
                    }
                }
                if (inf.getX() < -100 && (p.getPos() < 3540 + pC || p.getPos() >= 4000 + pC)
                        && (p.getPos() < 4775 + pC +200|| p.getPos() > 5005 + pC+200)) { // timing for new infected players
                    inf = new Infected(250 + ((int) (Math.random() * 150) + 1), p, 500 * timing);
                    timing++;
                }

            } else if (run == false && counter == 0) {
                exposure = 0;
                time.stop(); // stop timer
                if(3 + extraLife <= 0)
                    screen.setScreen(26);
                else 
                    screen.setScreen(27);
                counter++;

            }

        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (run) {
                g.drawImage(bkg, p.getImageX(), 0, null);
                
                for (int i = 0; i < extraLife + 3; i++) {
                    g.drawImage(life, 680 - (25 * i), 10, null);
                }
                g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
                g.drawString(p.getPointsL2() + "", 650, 50);

                if (p.getPos() <= 300 && p.getPos() < 700) {
                    g.setColor(Color.white);
                    g.fillRect(170 - p.getPos() + 300, 85, 200, 50);
                    g.setColor(Color.black);
                    g.setFont(new Font("Calibri", Font.PLAIN, 15));
                    g.drawString("Use the arrow keys to move", 180 - p.getPos() + 300, 100);
                    g.drawString("around your neighboor hood.", 180 - p.getPos() + 300, 115);
                } else if (p.getPos() >= 600 && p.getPos() <= 800) {
                    g.setColor(Color.white);
                    g.fillRect(470, 40, 150, 20);
                    g.fillRect(450 - (20 * extraLife), 5, 150, 20);
                    g.setColor(Color.black);
                    g.setFont(new Font("Calibri", Font.PLAIN, 15));
                    g.drawString("Here are your points -->", 470, 55);
                    g.drawString("Here is your health -->", 450 - (20 * extraLife), 20);
                } else if (p.getPos() >= 1710 && p.getPos() <= 3000) {
                    g.setColor(Color.white);
                    g.fillRect(150 - p.getPos() + 1740, 85, 170, 70);
                    g.setColor(Color.black);
                    g.setFont(new Font("Calibri", Font.PLAIN, 15));
                    g.drawString("Despite the Quarentine,", 180 - p.getPos() + 1710, 100);
                    g.drawString("people are still comming", 180 - p.getPos() + 1710, 115);
                    g.drawString("outside... Stay clear of ", 180 - p.getPos() + 1710, 130);
                    g.drawString("of all the people!", 180 - p.getPos() + 1710, 145);
                } else if (p.getPos() >= 3540 + pC && p.getPos() <= 4000 + pC) {

                    g.drawImage(ownwer, 300 - p.getPos() + 3710 + pC, 300, null);
                    if (tasks[0]) {
                        p.addPointsL2(100);
                        g.setColor(Color.white);
                        g.fillRoundRect(270 - p.getPos() + 3710 + pC, 215, 130, 50, 10, 10);
                        g.setColor(Color.black);
                        g.setFont(new Font("Calibri", Font.PLAIN, 10));
                        g.drawString("Thank you so much! Please ", 275 - p.getPos() + 3710 + pC, 225);
                        g.drawString("enjoy your meal, and come ", 275 - p.getPos() + 3710 + pC, 240);
                        g.drawString("back any time!", 275 - p.getPos() + 3710 + pC, 255);
                    } else {
                        g.setColor(Color.white);
                        g.fillRoundRect(270 - p.getPos() + 3710 + pC, 200, 130, 85, 10, 10);
                        g.setColor(Color.black);
                        g.setFont(new Font("Calibri", Font.PLAIN, 10));
                        g.drawString("Hey there, I'm Sal! I own this", 275 - p.getPos() + 3710 + pC, 205);
                        g.drawString("small business. We're really ", 275 - p.getPos() + 3710 + pC, 220);
                        g.drawString("having a hard time with this ", 275 - p.getPos() + 3710 + pC, 235);
                        g.drawString("pandemic; There's just not ", 275 - p.getPos() + 3710 + pC, 250);
                        g.drawString("enough customers coming!", 275 - p.getPos() + 3710 + pC, 265);

                        g.setColor(Color.white);
                        g.fillRect(0, 470, 730, 40);
                        g.setColor(Color.black);
                        g.setFont(new Font("Calibri", Font.PLAIN, 25));
                        g.drawString("Task: Support a small businesss", 200, 495);

                        g.setColor(Color.red);
                        int[] x = { 410 - p.getPos() + 3710 + pC + 20, 385 - p.getPos() + 3710 + pC + 20,
                                400 - p.getPos() + 3710 + pC + 20, 400 - p.getPos() + 3710 + pC + 20,
                                420 - p.getPos() + 3710 + pC + 20, 420 - p.getPos() + 3710 + pC + 20,
                                435 - p.getPos() + 3710 + pC + 20 };
                        int[] y = { 245 - 50, 230 - 50, 230 - 50, 195 - 50, 195 - 50, 230 - 50, 230 - 50 };
                        g.fillPolygon(x, y, 7);

                    }

                } else if (p.getPos() >= 4775 + pC+200 && p.getPos() <= 5005 + pC+200) {
                    g.drawImage(nurse, 150 - p.getPos() + 4875 + pC +200, 280, null);
                    if (tasks[1]) {
                        p.addPointsL2(100);
                        g.setColor(Color.white);
                        g.fillRoundRect(270 - p.getPos() + 4875 + pC+200, 190, 100, 50, 10, 10);
                        g.setColor(Color.black);
                        g.setFont(new Font("Calibri", Font.PLAIN, 10));
                        g.drawString("Thank you so much! Please ", 275 - p.getPos() + 4875 + pC+102000, 205);
                        g.drawString("stay safe! ", 275 - p.getPos() + 4875 + pC+200, 220);
                    } else {
                        g.setColor(Color.white);
                        g.fillRoundRect(170 - p.getPos() + 4875 + pC+200, 190, 150, 85, 10, 10);
                        g.setColor(Color.black);
                        g.setFont(new Font("Calibri", Font.PLAIN, 10));
                        g.drawString("Frontline workers are some of", 175 - p.getPos() + 4875 + pC+200, 205);
                        g.drawString("the most essential service workers", 175 - p.getPos() + 4875 + pC+200, 220);
                        g.drawString("durring this time. However many ", 175 - p.getPos() + 4875 + pC+200, 235);
                        g.drawString("don't recieve the support they need, ", 175 - p.getPos() + 4875 + pC+200, 250);
                        g.drawString("and have been ignored in the past. ", 175 - p.getPos() + 4875 + pC+200, 265);

                        g.setColor(Color.white);
                        g.fillRect(0, 470, 730, 40);
                        g.setColor(Color.black);
                        g.setFont(new Font("Calibri", Font.PLAIN, 25));
                        g.drawString("Task: Support Frontline workers", 200, 495);

                        g.setColor(new Color(50, 100, 50));
                        g.fillRect(315 - p.getPos() + 4875 + pC+200, 300, 70, 40);

                        g.setColor(Color.white);
                        g.setFont(new Font("Calibri", Font.PLAIN, 15));
                        g.drawString("Donations", 315 - p.getPos() + 4875 + pC+200, 315);

                        g.setColor(Color.blue);
                        int[] x = { 410 - p.getPos() + 4875 + pC +200- 50, 385 - p.getPos() + 4875 + pC+200 - 50,
                                400 - p.getPos() + 4875 + pC+200 - 50, 400 - p.getPos() + 4875 + pC +200- 50,
                                420 - p.getPos() + 4875 + pC+200 - 50, 420 - p.getPos() + 4875 + pC+200 - 50,
                                435 - p.getPos() + 4875 + pC+200 - 50 };
                        int[] y = { 245 + 50, 230 + 50, 230 + 50, 195 + 50, 195 + 50, 230 + 50, 230 + 50 };
                        g.fillPolygon(x, y, 7);

                    }
                }
                
                if (inf.getY() < p.getY()) {
                    g.drawImage(inf.getImage(), inf.getX(), inf.getY(), null);
                    g.drawImage(p.getImage(), p.getX(), p.getY(), null);
                } else {
                    g.drawImage(p.getImage(), p.getX(), p.getY(), null);
                    g.drawImage(inf.getImage(), inf.getX(), inf.getY(), null);
                }
                
                // if(p.ppeI("mask")){
                //     g.drawImage(p.getPpeItem("mask"), p.getX()+5, p.getY()+50, null);
                // }
                // if(p.ppeI("goggles")){
                //     g.drawImage(p.getPpeItem("goggles"), p.getX()+5, p.getY()+50, null);
                // }
                

            } else {
                g.setColor(Color.cyan);
                g.fillRect(0, 0, 700, 500);
                g.setColor(Color.black);
                g.drawString("Click any where to continue", 200, 200);
            }

        }

        private boolean intersect() {
            return (p.getX() + 100 >= inf.getX() && p.getX() + 100 < inf.getX() + 100
                    && ((p.getY() >= inf.getY() + 20 && p.getY() <= inf.getY() + 100)
                            || (p.getY() + 100 >= inf.getY() + 20 && p.getY() + 100 <= inf.getY() + 100)));

        }

    }

    private class AL extends KeyAdapter {
        public void keyReleased(KeyEvent e) {
            p.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            p.keyPressed(e);
        }
    }

}