
/**
 * Creators: Aava Sapkota and Sarah Zhao
 * Class: ICS4UO-1
 * Teacher: Ms.Krasteva
 * Project: ISP
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.Graphics;

public class UserInput {

    //declare variables
    private JFrame game; //main frame
    private Vars screen; //store screen
    private int incorrect; // count number of incorrect questions, level1 
    private int goBack;//record return screen to after
    private Vars skip; //skip 
    private int counter;

    private Player p;
    private Infected inf;
    private Image bkg;
    private Timer time;
    private boolean run;

    private int exposure;
    private Board g;
    private Level2 play;
    private int extraLife;

    private boolean proceed = false;

    private int nameCounter;
    private boolean charSelect;

    int runCounter = 0;

    AL keyInput = new AL();
    int taskCompletion = 0;
    private boolean[] tasks = { false, false };
    private boolean[] landed = { false, false };
    int timing;

    private final int pC = 920;

    Image backgroundImg = (new ImageIcon(Main.class.getResource("FINAL Level 2 Background.png"))).getImage()
            .getScaledInstance(7000, 500, java.awt.Image.SCALE_SMOOTH);
    Image landing1 = (new ImageIcon(Main.class.getResource("FINAL Task 1.PNG"))).getImage().getScaledInstance(730, 500,
            java.awt.Image.SCALE_SMOOTH);
    Image landing2 = (new ImageIcon(Main.class.getResource("FINAL Task 2.PNG"))).getImage().getScaledInstance(730, 500,
            java.awt.Image.SCALE_SMOOTH);

    public UserInput(JFrame game, Vars screen, Level2 play, Player p) {
        this.game = game;
        this.screen = screen;
        this.play = play;
        run = false;
        skip = new Vars(false);
        game.addMouseListener(new ML());
        incorrect = 0;

        game.setFocusable(true);
        bkg = backgroundImg;
        exposure = 0;
        extraLife = 0;

        nameCounter = 0;
        charSelect = false;
        proceed = false;

    }
    // source:
    // https://www.youtube.com/watch?v=PbmQrkwR9Ko&list=PLr6-GrHUlVf9SIx5cDhoEMknias5Xyv67&index=44

    // https://www.youtube.com/watch?v=bTaJKm43KGs
    private class ML extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            game.getContentPane().removeAll();
            int x = e.getX();
            int y = e.getY();
            System.out.println("x: " + x + " y: " + y);
            if (screen.getScreen() == 2) { // menu
                charSelect = false;
                nameCounter = 0;
                if (x >= 210 && x <= 520 && y >= 235 && y <= 260) { // highscores
                    screen.setScreen(3);
                } else if (x >= 210 && x <= 520 && y >= 275 && y <= 300) { // instructions
                    screen.setScreen(4);
                } else if (x >= 210 && x <= 520 && y >= 320 && y <= 345) { // level 1 start
                    screen.setScreen(5);
                } else if (x >= 210 && x <= 520 && y >= 360 && y <= 385) { // exit
                    screen.setScreen(6);
                }
            } else if (screen.getScreen() == 3) { // highscores
                if (x >= 240 && x <= 315 && y >= 450 && y <= 485) { // clear
                    screen.setScreen(2);
                } else if (x >= 415 && x <= 490 && y >= 450 && y <= 485) { // menu
                    Player.clearScores();
                }
            } else if (screen.getScreen() == 4) { // instructions
                if (x >= 300 && x <= 430 && y >= 430 && y <= 460) {
                    screen.setScreen(2);
                }
            } else if (screen.getScreen() == 5) { // level 1 start
                if (x >= 300 && y >= 440 && x <= 430 && y <= 470) {
                    screen.setScreen(7);
                    counter = 0;
                } // -------------------------------------------------------------GAME SCREENS
                  // START ( LEVEL ONE )
            } else if (screen.getScreen() == 6) {
                counter++;
                if (counter % 2 == 0) {
                    screen.setScreen(34);
                }

            } else if (screen.getScreen() == 7) { // question 1
                counter++;
                if (counter % 2 == 0)
                    if (x >= 380 && y >= 145 && x <= 675 && y <= 300) { // correct answer: B
                        screen.setScreen(8);
                        incorrect = 0;
                        skip.setSkip(true);
                    } else if (((x >= 55 && y >= 145 && x <= 350 && y <= 300)
                            || (x >= 55 && y >= 315 && x <= 350 && y <= 470)
                            || (x >= 380 && y >= 315 && x <= 675 && y <= 470))) { // incorrect answer
                        goBack = 7;
                        incorrect++;
                        skip.setSkip(false);
                    }
            } else if (screen.getScreen() == 8) {// info 1 screen
                if (x >= 525 && y >= 460 && x <= 675 && y <= 490) {
                    screen.setScreen(9);
                }
            } else if (screen.getScreen() == 9) {// question 2
                counter++;
                if (counter % 2 == 0)
                    if (x >= 55 && y >= 315 && x <= 350 && y <= 470) { // correct answer: C
                        screen.setScreen(10);
                        incorrect = 0;
                        skip.setSkip(true);
                    } else if ((x >= 55 && y >= 145 && x <= 350 && y <= 300)
                            || (x >= 380 && y >= 145 && x <= 675 && y <= 300)
                            || (x >= 380 && y >= 315 && x <= 675 && y <= 470)) {// incorrect answer
                        goBack = 9;
                        incorrect++;
                        skip.setSkip(false);
                    }
            } else if (screen.getScreen() == 10) {// info 2 screen
                if (x >= 525 && y >= 460 && x <= 675 && y <= 490) {
                    screen.setScreen(11);
                }
            } else if (screen.getScreen() == 11) {// question 3
                counter++;
                if (counter % 2 == 0)
                    if (x >= 380 && y >= 145 && x <= 675 && y <= 300) {// correct answer: B
                        screen.setScreen(12);
                        incorrect = 0;
                        skip.setSkip(true);

                    } else if ((x >= 55 && y >= 145 && x <= 350 && y <= 300)
                            || (x >= 55 && y >= 315 && x <= 350 && y <= 470)
                            || (x >= 380 && y >= 315 && x <= 675 && y <= 470)) { // incorrect
                        goBack = 11;
                        incorrect++;
                        skip.setSkip(false);
                    }
            } else if (screen.getScreen() == 12) {// info 3 screen
                if (x >= 525 && y >= 460 && x <= 675 && y <= 490) {
                    screen.setScreen(13);
                }
            } else if (screen.getScreen() == 13) {// question 4
                counter++;
                if (counter % 2 == 0)
                    if (x >= 55 && y >= 145 && x <= 350 && y <= 300) { // correct answer: A
                        screen.setScreen(14);
                        incorrect = 0;
                        skip.setSkip(true);
                    } else if ((x >= 380 && y >= 145 && x <= 675 && y <= 300)
                            || (x >= 55 && y >= 315 && x <= 350 && y <= 470)
                            || (x >= 380 && y >= 315 && x <= 675 && y <= 470)) {// incorrect
                        goBack = 13;
                        incorrect++;
                        skip.setSkip(false);
                    }
            } else if (screen.getScreen() == 14) {// info 4 screen
                if (x >= 525 && y >= 460 && x <= 675 && y <= 490) {
                    screen.setScreen(15);
                }
            } else if (screen.getScreen() == 15) {// question 5
                counter++;
                if (counter % 2 == 0)
                    if (x >= 55 && y >= 145 && x <= 350 && y <= 300) {// correct answer: A
                        screen.setScreen(16);
                        incorrect = 0;
                        skip.setSkip(true);
                    } else if ((x >= 380 && y >= 145 && x <= 675 && y <= 300)
                            || (x >= 55 && y >= 315 && x <= 350 && y <= 470)
                            || (x >= 380 && y >= 315 && x <= 675 && y <= 470)) {// incorrect
                        goBack = 15;
                        incorrect++;
                        skip.setSkip(false);
                    }
            } else if (screen.getScreen() == 16) {// info 5 screen
                if (x >= 525 && y >= 460 && x <= 675 && y <= 490) {
                    screen.setScreen(17);
                }
            } else if (screen.getScreen() == 17) {// question 6
                counter++;
                if (counter % 2 == 0)
                    if (x >= 55 && y >= 315 && x <= 350 && y <= 470) {// correct answer: C
                        incorrect = 0;
                        screen.setScreen(18);
                        skip.setSkip(true);
                    } else if ((x >= 55 && y >= 145 && x <= 350 && y <= 300)
                            || (x >= 380 && y >= 145 && x <= 675 && y <= 300)
                            || (x >= 380 && y >= 315 && x <= 675 && y <= 470)) {// incorrect
                        goBack = 17;
                        incorrect++;
                        skip.setSkip(false);
                    }
            } else if (screen.getScreen() == 18) {// info 6 screen
                if (x >= 525 && y >= 460 && x <= 675 && y <= 490) {
                    screen.setScreen(19);
                }
            } else if (screen.getScreen() == 19) {// question 7
                counter++;
                if (counter % 2 == 0)
                    if (x >= 380 && y >= 315 && x <= 675 && y <= 470) {// correct answer: D
                        incorrect = 0;
                        screen.setScreen(20);
                        skip.setSkip(true);
                    } else if ((x >= 55 && y >= 145 && x <= 350 && y <= 300)
                            || (x >= 380 && y >= 145 && x <= 675 && y <= 300)
                            || (x >= 55 && y >= 315 && x <= 350 && y <= 470)) {// incorrect
                        goBack = 19;
                        incorrect++;
                        skip.setSkip(false);
                    }
            } else if (screen.getScreen() == 20) {// info 7 screen
                if (x >= 525 && y >= 460 && x <= 675 && y <= 490) {
                    screen.setScreen(21);
                }
            } else if (screen.getScreen() == 21) {// question 8
                counter++;
                if (counter % 2 == 0)
                    if (x >= 55 && y >= 315 && x <= 350 && y <= 470) {// correct answer: C
                        incorrect = 0;
                        screen.setScreen(22);
                        skip.setSkip(true);
                    } else if ((x >= 55 && y >= 145 && x <= 350 && y <= 300)
                            || (x >= 380 && y >= 145 && x <= 675 && y <= 300)
                            || (x >= 380 && y >= 315 && x <= 675 && y <= 470)) {// incorrect
                        goBack = 21;
                        incorrect++;
                        skip.setSkip(false);
                    }
            } else if (screen.getScreen() == 22) {// info 8 screen
                if (x >= 525 && y >= 460 && x <= 675 && y <= 490) {
                    screen.setScreen(23);
                }
            } else if (screen.getScreen() == 23) {// question 9
                counter++;
                if (counter % 2 == 0)
                    if (x >= 380 && y >= 145 && x <= 675 && y <= 300) {// correct answer: B
                        incorrect = 0;
                        screen.setScreen(24);
                        skip.setSkip(true);
                    } else if ((x >= 55 && y >= 145 && x <= 350 && y <= 300)
                            || (x >= 55 && y >= 315 && x <= 350 && y <= 470)
                            || (x >= 380 && y >= 315 && x <= 675 && y <= 470)) {// incorrect
                        goBack = 23;
                        incorrect++;
                        skip.setSkip(false);
                    }
            } else if (screen.getScreen() == 24) {// info 9 screen
                if (x >= 525 && y >= 460 && x <= 675 && y <= 490) {
                    screen.setScreen(25);
                }
            } else if (screen.getScreen() == 25) { // passed screen
                if (x >= 120 && y >= 345 && x <= 250 && y <= 370) { // go to main menu
                    screen.setScreen(2);
                } else if (x >= 475 && y >= 345 && x <= 605 && y <= 370) {// go to next level
                    screen.setScreen(28);
                }
            } else if (screen.getScreen() == 26) {// incorrect page
                if (x >= 315 && y >= 355 && x <= 415 && y <= 375) {
                    screen.setScreen(goBack);
                    skip.setSkip(true);
                }
            } else if (screen.getScreen() == 27) {// failed page
                if (x >= 120 && y >= 330 && x <= 260 && y <= 360) {
                    screen.setScreen(2);
                    incorrect = 0;
                } else if (x >= 470 && y >= 330 && x <= 605 && y <= 360) {
                    screen.setScreen(7);
                    incorrect = 0;
                }
            } else if (screen.getScreen() == 28) {// Instructions for Level 2
                if (x >= 300 && y >= 475 && x <= 430 && y <= 500) {
                    screen.setScreen(29);
                }
            } else if (screen.getScreen() == 29) { // Character Selection
                if (!charSelect) {
                    p = new Player("jumbo");
                    charSelect = true;
                    proceed = false;
                }
                play.setPlayer(p);
                if (nameCounter == 0)
                    p.setName(JOptionPane.showInputDialog("What's your name?"));
                nameCounter++;
                counter++;
                if (counter % 2 == 0){
                    if (x >= 90 && y >= 190 && x <= 335 && y <= 420) {
                        p.setCharacter("belle");
                        game.setVisible(true);
                        proceed = true;
                    } else if (x >= 390 && y >= 190 && x <= 640 && y <= 420) {
                        p.setCharacter("barry");
                        proceed = true;
                    }
                    
                }
                    
                
                

                if (x >= 320 && y >= 455 && x <= 410 && y <= 480 && proceed == true) {
                    screen.setScreen(30);
                    game.addKeyListener(keyInput);
                    counter = 0;

                }
                runCounter = 0;
                extraLife = 0;

            } else if (screen.getScreen() == 30) { // PPE Selection
                counter++;
                if (x >= 105 && y >= 185 && x <= 355 && y <= 305 && p.ppeI("gloves") == false) {
                    p.ppeSet("gloves", true);
                    extraLife++;
                } else if (x >= 395 && y >= 185 && x <= 635 && y <= 305 && p.ppeI("mask") == false) {
                    p.ppeSet("mask", true);
                    extraLife++;
                } else if (x >= 105 && y >= 325 && x <= 355 && y <= 445 && p.ppeI("goggles") == false) {
                    p.ppeSet("goggles", true);
                    extraLife++;
                } else if (x >= 395 && y >= 325 && x <= 635 && y <= 445 && p.ppeI("hand-sanitizer") == false) {
                    p.ppeSet("hand-sanitizer", true);
                    extraLife++;
                }

                if (counter % 2 == 0)
                    if (x >= 315 && y >= 470 && x <= 430 && y <= 495) {
                        screen.setScreen(31);
                    }
            } else if (screen.getScreen() == 31) { // Game Screen
                if (runCounter == 0) {
                    tasks[0] = false;
                    tasks[1] = false;
                    timing = 0;
                    taskCompletion = 0;
                    runCounter++;
                }
                g = new Board();// Make new instance of Board
                game.add(g); // add to JFrame
                g.setVisible(true);
                game.setVisible(true);

            } else if (screen.getScreen() == 32) { // fail screen
                game.removeKeyListener(keyInput);
                g.setVisible(false);
                game.getContentPane().remove(g);
                runCounter = 0;
                play.failed();
                System.out.println("extra life: " + extraLife);

                if (x >= 120 && y >= 330 && x <= 260 && y <= 360) {
                    screen.setScreen(2);
                } else if (x >= 470 && y >= 330 && x <= 605 && y <= 360) {
                    screen.setScreen(28);// set back to play screen
                    charSelect = false;
                }
                charSelect = false;
                nameCounter = 0;
            } else if (screen.getScreen() == 33) {// pass screen
                runCounter = 0;
                System.out.println(p.getTotalPoints());
                counter++;
                if (counter % 2 == 0) {
                    if (x >= 120 && y >= 340 && x <= 250 && y <= 365) { // go to main menu
                        screen.setScreen(2);
                        Player.highscores(p);
                    } else if (x >= 475 && y >= 340 && x <= 605 && y <= 365) {// Play again.
                        screen.setScreen(28);
                        Player.highscores(p);
                    }
                }
                charSelect = false;
                nameCounter = 0;

                game.removeKeyListener(keyInput);
            }

            if (!skip.getSkip())
                if (incorrect == 1) {
                    screen.setScreen(26);
                } else if (incorrect == 2) {
                    screen.setScreen(27);
                }
        }

    }

    // source: https://www.youtube.com/watch?v=hzsPwDr8ibE
    private class Board extends JPanel implements ActionListener {

        Image life, ownwer, nurse, continuePage;
        int counter;
        int t;
        int pointTime;

        // Trash garbage;
        int c = 0;

        // board constructor
        public Board() {
            addKeyListener(new AL());
            time = new Timer(5, this);
            time.start();
            inf = new Infected(2000, p, 350);
            run = true;
            counter = 0;
            pointTime = 0;
            t = 0;
            ownwer = ((new ImageIcon(getClass().getResource("Owner.png"))).getImage().getScaledInstance(50, 50, 100));
            nurse = ((new ImageIcon(getClass().getResource("Nurse.png"))).getImage().getScaledInstance(100, 70, 100));
            life = (new ImageIcon(getClass().getResource("Life.png"))).getImage().getScaledInstance(20, 20, 100);
            continuePage = (new ImageIcon(getClass().getResource("FINAL Continue.png"))).getImage().getScaledInstance(730, 510, 100);

            System.out.println("Starting level: " + extraLife);
        }

        public void actionPerformed(ActionEvent e) {
            if (run) {
                if ((3 + extraLife) <= 0 || p.getPos() >= 6440) { // check if there is enough health to continue.
                    run = false;
                }
                if (p.isMoving() == true)
                    t++;
                if (t > 0 && t % 10 == 0) {
                    p.addPointsL2(10);
                    t++;
                }

                p.move(); // moves player
                inf.move(); // moves infected player
                repaint();

                if (!landed[0] && taskCompletion == 0 && p.getY() <= 250 && p.getPos() >= 3875 + pC
                        && p.getPos() <= 3935 + pC) {
                    landed[0] = true;
                    taskCompletion++;
                    extraLife--;
                    System.out.println("Closer to death at shop " + (extraLife + 3));
                } else if (!landed[1] && taskCompletion == 1 && p.getY() <= 250 && p.getPos() >= 4875 + pC + 100
                        && p.getPos() <= 5005 + pC + 100) {
                    landed[1] = true;
                    taskCompletion++;
                    extraLife--;
                    System.out.println("Closer to death at hospital " + (extraLife + 3));
                }

                if (intersect() && !landed[0] && !landed[1]) {// check if player and infected player collide
                    exposure++; // increase exposure
                    if (exposure % 100 == 0) {
                        System.out.println("Life before death: " + (extraLife + 3));
                        extraLife--; // decrease health
                        p.decrementPoints(); // decrease points
                        System.out.println("Closer to death " + (extraLife + 3));
                    }
                }
                if (inf.getX() < 0 && (p.getPos() > 1000) && (p.getPos() < 3540 + pC || p.getPos() >= 4000 + pC)
                        && (p.getPos() < 4775 + pC + 200 || p.getPos() > 5005 + pC + 200) && !landed[0] && !landed[1]) { // timing
                    inf = new Infected(250 + ((int) (Math.random() * 150) + 1), p, 500 * timing);// infected
                    timing++;// players
                }

            } else if (run == false && counter == 0) {
                exposure = 0;
                time.stop(); // stop timer
                if (3 + extraLife <= 0 || !tasks[0] || !tasks[1]) {
                    screen.setScreen(32);
                } else if (tasks[0] && tasks[1])
                    screen.setScreen(33);
                counter++;
            }

        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (run && !landed[0] && !landed[1]) {
                g.drawImage(bkg, p.getImageX(), 0, null);

                g.setColor(new Color(201, 242, 195));
                g.fillRect(10, 10, 80, 70);
                g.setColor(new Color(234, 251, 232));
                g.fillRoundRect(15, 40, 30, 30, 7, 7);
                g.fillRoundRect(50, 40, 30, 30, 7, 7);
                g.setColor(Color.black);
                g.setFont(new Font("Calibri", Font.PLAIN, 10));
                g.drawString("Equiped with: ", 15, 30); // option for handsanitizer and takeout bag
                for (int i = 0; i < extraLife + 3; i++) {
                    g.drawImage(life, 680 - (25 * i), 10, null);
                }
                g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
                g.drawString(p.getPointsL2() + "", 650, 50);
                if (p.getNx2() > 2000) {
                    if (p.getPos() <= 300 && p.getPos() < 750) {
                        g.setColor(Color.white);
                        g.fillRect(170 - p.getPos() + 300, 85, 200, 50);
                        g.setColor(Color.black);
                        g.setFont(new Font("Calibri", Font.PLAIN, 15));
                        g.drawString("Use the arrow keys to move", 180 - p.getPos() + 300, 100);
                        g.drawString("around your neighboorhood.", 180 - p.getPos() + 300, 115);
                        g.setColor(Color.white);
                        g.fillRect(470, 40, 150, 20);
                        g.fillRect(450 - (20 * extraLife), 5, 150, 20);
                        g.setColor(Color.black);
                        g.setFont(new Font("Calibri", Font.PLAIN, 15));
                        g.drawString("Here are your points -->", 470, 55); // gestures to point
                        g.drawString("Here is your health -->", 450 - (20 * extraLife), 20); // life/health points
                                                                                             // expressed in hearts
                    } else if (p.getPos() >= 800 && p.getPos() <= 1000) {
                        g.setColor(Color.white);
                        g.fillRect(175 - p.getPos() + 800, 85, 170, 70);
                        g.setColor(Color.black);
                        g.setFont(new Font("Calibri", Font.PLAIN, 15));
                        g.drawString("Despite the quarantine,", 180 - p.getPos() + 800, 100); // warning label near
                                                                                              // park
                        g.drawString("people are still going", 180 - p.getPos() + 800, 115);
                        g.drawString("outside... stay clear of ", 180 - p.getPos() + 800, 130);
                        g.drawString("of all the infected people!", 180 - p.getPos() + 800, 145);
                    } else if (p.getPos() >= 1410 && p.getPos() <= 2700) {

                    } else if (p.getPos() >= 3540 + pC && p.getPos() <= 4000 + pC) {

                        g.drawImage(ownwer, 300 - p.getPos() + 3710 + pC, 300, null);
                        if (tasks[0]) {
                            if (pointTime == 0) {
                                p.addPointsL2(100);
                            }
                            pointTime++;
                            g.setColor(Color.white);
                            g.fillRoundRect(270 - p.getPos() + 3710 + pC, 215, 130, 50, 10, 10);
                            g.setColor(Color.black);
                            g.setFont(new Font("Calibri", Font.PLAIN, 10));
                            g.drawString("Thank you so much! Please ", 275 - p.getPos() + 3710 + pC, 225); // Sal's
                                                                                                           // message
                                                                                                           // (if you
                                                                                                           // help)
                            g.drawString("enjoy your meal, and come ", 275 - p.getPos() + 3710 + pC, 240);
                            g.drawString("back any time!", 275 - p.getPos() + 3710 + pC, 255);
                        } else {
                            pointTime = 0;
                            g.setColor(Color.white);
                            g.fillRoundRect(270 - p.getPos() + 3710 + pC, 190, 130, 85, 10, 10);
                            g.setColor(Color.black);
                            g.setFont(new Font("Calibri", Font.PLAIN, 10));
                            g.drawString("Hey there, I'm Sal! I own this", 275 - p.getPos() + 3710 + pC, 205); // Sal
                                                                                                               // explaining
                                                                                                               // the
                                                                                                               // problem
                            g.drawString("small business. We're really ", 275 - p.getPos() + 3710 + pC, 220);
                            g.drawString("having a hard time during this ", 275 - p.getPos() + 3710 + pC, 235);
                            g.drawString("pandemic; there's just not ", 275 - p.getPos() + 3710 + pC, 250);
                            g.drawString("enough customers coming!", 275 - p.getPos() + 3710 + pC, 265);

                            g.setColor(Color.white);
                            g.fillRect(0, 470, 730, 40);
                            g.setColor(Color.black);
                            g.setFont(new Font("Calibri", Font.PLAIN, 25));
                            g.drawString("Task: Support a small business's", 200, 495); // task

                            g.setColor(Color.red);
                            int[] x = { 410 - p.getPos() + 3710 + pC + 20, 385 - p.getPos() + 3710 + pC + 20,
                                    400 - p.getPos() + 3710 + pC + 20, 400 - p.getPos() + 3710 + pC + 20,
                                    420 - p.getPos() + 3710 + pC + 20, 420 - p.getPos() + 3710 + pC + 20,
                                    435 - p.getPos() + 3710 + pC + 20 };
                            int[] y = { 245 - 50, 230 - 50, 230 - 50, 195 - 50, 195 - 50, 230 - 50, 230 - 50 };
                            g.fillPolygon(x, y, 7);

                        }

                    } else if (p.getPos() >= 4775 + pC && p.getPos() <= 5305 + pC) {
                        g.drawImage(nurse, 150 - p.getPos() + 4875 + pC, 280, null);
                        if (tasks[1]) {
                            if (pointTime == 0) {
                                p.addPointsL2(100);
                            }
                            pointTime++;
                            g.setColor(Color.white);
                            g.fillRoundRect(270 - p.getPos() + 4875 + pC, 190, 100, 50, 10, 10);
                            g.setColor(Color.black);
                            g.setFont(new Font("Calibri", Font.PLAIN, 10));
                            g.drawString("Thank you so much! ", 275 - p.getPos() + 4875 + pC, 205); // Nurse's
                                                                                                    // message
                            g.drawString("Please stay safe! ", 275 - p.getPos() + 4875 + pC, 220);

                        } else {
                            pointTime = 0;
                            g.setColor(Color.white);
                            g.fillRoundRect(170 - p.getPos() + 4875 + pC, 190, 150, 85, 10, 10);
                            g.setColor(Color.black);
                            g.setFont(new Font("Calibri", Font.PLAIN, 10));
                            g.drawString("Frontline workers are some of", 175 - p.getPos() + 4875 + pC, 205); // explanation
                                                                                                              // of
                                                                                                              // healthcare
                                                                                                              // dilemma
                            g.drawString("the most essential service workers", 175 - p.getPos() + 4875 + pC, 220);
                            g.drawString("during this time. However many ", 175 - p.getPos() + 4875 + pC, 235);
                            g.drawString("don't receive the support they need, ", 175 - p.getPos() + 4875 + pC, 250);
                            g.drawString("and have been ignored in the past. ", 175 - p.getPos() + 4875 + pC, 265);

                            g.setColor(Color.white);
                            g.fillRect(0, 470, 730, 40);
                            g.setColor(Color.black);
                            g.setFont(new Font("Calibri", Font.PLAIN, 25));
                            g.drawString("Task: Support Frontline workers", 200, 495); // second task

                            g.setColor(new Color(50, 100, 50));
                            g.fillRect(315 - p.getPos() + 4875 + pC, 300, 70, 40);

                            g.setColor(Color.white);
                            g.setFont(new Font("Calibri", Font.PLAIN, 15));
                            g.drawString("Donations", 315 - p.getPos() + 4875 + pC, 315);

                            g.setColor(Color.blue);
                            int[] x = { 410 - p.getPos() + 4875 + pC - 50, 385 - p.getPos() + 4875 + pC - 50,
                                    400 - p.getPos() + 4875 + pC - 50, 400 - p.getPos() + 4875 + pC - 50,
                                    420 - p.getPos() + 4875 + pC - 50, 420 - p.getPos() + 4875 + pC - 50,
                                    435 - p.getPos() + 4875 + pC - 50 };
                            int[] y = { 245 + 50, 230 + 50, 230 + 50, 195 + 50, 195 + 50, 230 + 50, 230 + 50 };
                            g.fillPolygon(x, y, 7);

                        }
                    }
                }
                // options for PPE and changes depending on view
                if (inf.getY() < p.getY()) {
                    g.drawImage(inf.getImage(), inf.getX(), inf.getY(), null);
                    g.drawImage(p.getImage(), p.getX(), p.getY(), null);
                    if (p.getCharacter().equals("barry")) {
                        if (p.ppeI("mask")) {
                            g.drawImage(p.getPpeItem("mask", "barry"), p.getX() + 7, p.getY() + 23, null);
                        }
                        if (p.ppeI("goggles")) {
                            if (p.getView() == 1) {
                                g.drawImage(p.getPpeItem("goggles", "barry"), p.getX() + 30, p.getY() + 10, null);
                            } else
                                g.drawImage(p.getPpeItem("goggles", "barry"), p.getX() - 5, p.getY() + 10, null);
                        }
                        if (p.ppeI("hand-sanitizer")) {
                            g.drawImage(p.getPpeItem("hand-sanitizer", "both"), 20, 40, null);
                        }
                        if (p.ppeI("gloves")) {
                            g.setColor(Color.blue);
                            if (p.getView() == 1) {
                                g.fillOval(p.getX() + 100, p.getY() + 70, 12, 12);
                            } else {
                                g.fillOval(p.getX() + 50, p.getY() + 70, 12, 12);
                            }
                        }
                    } else {

                        if (p.ppeI("mask")) {
                            if (p.getView() == 1)
                                g.drawImage(p.getPpeItem("mask", "belle"), p.getX() + 50, p.getY() + 35, null);
                            else
                                g.drawImage(p.getPpeItem("mask", "belle"), p.getX() + 35, p.getY() + 35, null);

                        }
                        if (p.ppeI("goggles")) {
                            if (p.getView() == 1) {
                                g.drawImage(p.getPpeItem("goggles", "belle"), p.getX() + 55, p.getY() + 35, null);
                            } else
                                g.drawImage(p.getPpeItem("goggles", "belle"), p.getX() + 50, p.getY() + 30, null);
                        }
                        if (p.ppeI("hand-sanitizer")) {
                            g.drawImage(p.getPpeItem("hand-sanitizer", "both"), 20, 40, null);
                        }
                        if (p.ppeI("gloves")) {
                            g.setColor(Color.blue);
                            if (p.getView() == 1) {
                                g.fillOval(p.getX() + 100, p.getY() + 80, 12, 12);
                            } else {
                                g.fillOval(p.getX() + 70, p.getY() + 80, 12, 12);
                            }
                        }
                    }

                } else {
                    g.drawImage(p.getImage(), p.getX(), p.getY(), null);
                    if (p.getCharacter().equals("barry")) {
                        if (p.ppeI("mask")) {
                            g.drawImage(p.getPpeItem("mask", "barry"), p.getX() + 7, p.getY() + 23, null);
                        }
                        if (p.ppeI("goggles")) {
                            if (p.getView() == 1) {
                                g.drawImage(p.getPpeItem("goggles", "barry"), p.getX() + 30, p.getY() + 10, null);
                            } else
                                g.drawImage(p.getPpeItem("goggles", "barry"), p.getX() - 5, p.getY() + 10, null);
                        }
                        if (p.ppeI("hand-sanitizer")) {
                            g.drawImage(p.getPpeItem("hand-sanitizer", "both"), 20, 40, null);
                        }
                        if (p.ppeI("gloves")) {
                            g.setColor(Color.blue);
                            if (p.getView() == 1) {
                                g.fillOval(p.getX() + 100, p.getY() + 70, 12, 12);
                            } else {
                                g.fillOval(p.getX() + 50, p.getY() + 70, 12, 12);
                            }
                        }
                    } else {
                        if (p.ppeI("mask")) {
                            if (p.getView() == 1)
                                g.drawImage(p.getPpeItem("mask", "belle"), p.getX() + 50, p.getY() + 35, null);
                            else
                                g.drawImage(p.getPpeItem("mask", "belle"), p.getX() + 35, p.getY() + 35, null);

                        }
                        if (p.ppeI("goggles")) {
                            if (p.getView() == 1) {
                                g.drawImage(p.getPpeItem("goggles", "belle"), p.getX() + 55, p.getY() + 35, null);
                            } else
                                g.drawImage(p.getPpeItem("goggles", "belle"), p.getX() + 50, p.getY() + 30, null);
                        }
                        if (p.ppeI("hand-sanitizer")) {
                            g.drawImage(p.getPpeItem("hand-sanitizer", "both"), 20, 40, null);

                        }
                        if (p.ppeI("gloves")) {
                            g.setColor(Color.blue);
                            if (p.getView() == 1) {
                                g.fillOval(p.getX() + 100, p.getY() + 80, 12, 12);
                            } else {
                                g.fillOval(p.getX() + 70, p.getY() + 80, 12, 12);
                            }
                        }

                    }
                    g.drawImage(inf.getImage(), inf.getX(), inf.getY(), null);
                }

                if (tasks[0] && !tasks[1]) {
                    g.drawImage(p.getTask(1), 55, 40, null);
                }


            } else if (landed[0] || landed[1]) {
                if (landed[0]) {
                    g.drawImage(landing1, 0, 0, null);
                    game.getContentPane().addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                            if (e.getX() >= 51 && e.getY() >= 375 && e.getX() <= 295 && e.getY() <= 450) {
                                landed[0] = false;
                                game.getContentPane().removeMouseListener(this);
                                tasks[0] = true;
                                p.setDefaultPos();
                            } else if (e.getX() >= 425 && e.getY() >= 375 && e.getX() <= 672 && e.getY() <= 445) {
                                landed[0] = false;
                                taskCompletion = 0;
                                p.setDefaultPos();
                                game.getContentPane().removeMouseListener(this);
                            }

                        }
                    });
                } else if (landed[1]) {
                    g.drawImage(landing2, 0, 0, null);
                    game.getContentPane().addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                            if (e.getX() >= 51 && e.getY() >= 375 && e.getX() <= 295 && e.getY() <= 450) {
                                landed[1] = false;
                                game.getContentPane().removeMouseListener(this);
                                tasks[1] = true;
                                p.setDefaultPos();
                            } else if (e.getX() >= 425 && e.getY() >= 375 && e.getX() <= 672 && e.getY() <= 445) {
                                landed[1] = false;
                                taskCompletion = 1;
                                p.setDefaultPos();
                                game.getContentPane().removeMouseListener(this);

                            }

                        }
                    });
                }
            } else {

                g.drawImage(continuePage, 0, 0, null);
            }
        }

        private boolean intersect() {
            return (((p.getX() + 100 >= inf.getX() - 10 && p.getX() + 100 < inf.getX() + 100)
                    || (p.getX() >= inf.getX() - 10 && p.getX() < inf.getX() + 100))
                    && ((p.getY() >= inf.getY() && p.getY() <= inf.getY() + 90)
                            || (p.getY() + 100 >= inf.getY() && p.getY() + 100 <= inf.getY() + 90)));
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