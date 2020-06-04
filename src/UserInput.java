
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
    Vars screen;
    Clear clearHighscores;
    Level1 learn;
    Level2 play;
    int incorrect;
    int goBack;
    Vars skip;
    int counter;
 

    Player p;
    Infected inf; 
    public Image bkg;
    Timer time;
    int [] timeline = {400, 900, 1000};

    public UserInput(JFrame game, Vars screen, Level1 learn) {
        this.game = game;
        this.screen = screen;
        this.learn = learn;
        this.play = play;
        skip = new Vars(false);
        game.addMouseListener(new ML());
        incorrect = 0;

        p = new Player("Owner.png");
        
        game.addKeyListener(new AL());
        game.setFocusable(true);
        java.net.URL imgUrl = Main.class.getResource("Park [NEW].jpg");
        ImageIcon i = new ImageIcon(imgUrl);
        bkg = i.getImage().getScaledInstance(2000, 500, 100);

        

    }
    // source:
    // https://www.youtube.com/watch?v=PbmQrkwR9Ko&list=PLr6-GrHUlVf9SIx5cDhoEMknias5Xyv67&index=44


    // https://www.youtube.com/watch?v=bTaJKm43KGs
    private class ML extends MouseAdapter{
        public void mouseClicked(MouseEvent e) {
            game.getContentPane().removeAll();
            int x = e.getX();
            int y = e.getY();
    
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
                counter++;
                if (counter % 2 == 0)
                    if (x >= 370 && y >= 150 && x <= 660 && y <= 290) { // correct answer
                        screen.setScreen(8);
                        incorrect = 0;
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
                }
            } else if (screen.getScreen() == 21) {// failed page
                if (x >= 120 && y >= 315 && x <= 255 && y <= 340) {
                    screen.setScreen(7);
                    incorrect = 0;
                } else if (x >= 480 && y >= 315 && x <= 610 && y <= 340) {
                    screen.setScreen(2);
                    incorrect = 0;
                }
            } else if(screen.getScreen()==22){
                game.add(new Board());
                game.setVisible(true);
            }
    
            if (!skip.getSkip())
                if (incorrect == 1) {
                    screen.setScreen(20);
                } else if (incorrect == 2) {
                    screen.setScreen(21);
                }
        }

    }

    //source: https://www.youtube.com/watch?v=hzsPwDr8ibE
    private class Board extends JPanel implements ActionListener {
    
        public Board() {
            addKeyListener(new AL());
            time = new Timer(5, this);
            time.start();
            inf = new Infected(300, p, 350);

        }
    
        public void actionPerformed(ActionEvent e) {
            if(p.getY()>inf.getY()){
                inf.move(); 
                p.move();
            }else {
                p.move();
                inf.move();
            }
            
            if(inf.getY()<0){
                inf = new Infected(200, p, 20);
            }
            repaint();
        }
    
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
    
            g.drawImage(bkg, p.getImageX(), 0, null);
            g.drawImage(p.getImage(), p.getX(), p.getY(), null);
            g.drawImage(inf.getImage(), inf.getX(), inf.getY(), null);
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
