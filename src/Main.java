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
import javax.imageio.ImageIO;
import java.awt.Graphics;

public class Main {
    static Screen screen;
    static UserInput input;
    static JFrame mainScreen = new JFrame("Game Title");

    public Main() {
        screen = new Screen(1);
        mainScreen.setLayout(new FlowLayout());
        mainScreen.setSize(700, 500);
        mainScreen.setVisible(true);
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void introduction() {

        JLabel title = new JLabel(
                "<html><div style='text-align: center; margin-top: 50px'> PHOENIX GAMES </div></html>");
        mainScreen.add(title);
        mainScreen.getContentPane().setBackground(Color.gray);
        input = new UserInput(mainScreen, screen);
        

        title.setVisible(false);
        screen.setScreen(screen.getScreen()+1);

    }

    public void mainMenu() {
        java.net.URL imgUrl = Main.class.getResource("Menu-bkg (2).jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets flowers image
        
        bkg.setBounds(0,0,700,500);
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);

    }

    public void highscores() {
        java.net.URL imgUrl = Main.class.getResource("highscores-screen (2).jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets flowers image
        
        bkg.setBounds(0,0,700,500);
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    public void learn() {
        java.net.URL imgUrl = Main.class.getResource("Learn Instructions Page.jpg");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel bkg = new JLabel(icon); // gets flowers image
        
        bkg.setBounds(-5,-5,700,500);
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    public void play() {
        mainScreen.getContentPane().setBackground(Color.yellow);
    }

    public void goodbye() {
        screen.setScreen(screen.getScreen()+1);
    }

    public void credits() {
        mainScreen.getContentPane().setBackground(Color.black);
    }

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String args[]) {
        Main m = new Main();
        m.introduction();
        while (screen.getScreen() < 7) {
            if (screen.getScreen() == 2) {
                m.mainMenu();
            } else if (screen.getScreen() == 3) {
                m.highscores();
            } else if (screen.getScreen() == 4) {
                m.learn();
            } else if (screen.getScreen() == 5) {
                m.play();
            } else if (screen.getScreen() == 6) {
                m.goodbye();
            }
            System.out.println(screen.getScreen());
        }
        // source:
        // https://stackoverflow.com/questions/1234912/how-to-programmatically-close-a-jframe
        mainScreen.dispatchEvent(new WindowEvent(mainScreen, WindowEvent.WINDOW_CLOSING));
    }
}



















































// /**
//  * Creators: Aava Sapkota and Sarah Zhao
//  * Class: ICS4UO-1
//  * Teacher: Ms.Krasteva
//  * Project: ISP
//  */
// /**
//  * THIS IS TO SEE IF YOU CAN SEE THIS
//  */

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// import javax.swing.JFrame.*;
// import java.io.*;
// import java.util.*;
// import javax.swing.JComponent;
// import javax.imageio.ImageIO;
// import java.awt.image.*;
// import java.awt.Graphics;

// public class Main {
//     static Screen screen;
//     static UserInput input;
//     static JFrame mainScreen = new JFrame("Game Title");
//     static boolean win;

//     //Backgrounds: 
//     JLabel background; 

//     public Main() {
//         screen = new Screen(1);
//         win = false;
//         mainScreen.setLayout(null);
//         mainScreen.setSize(700, 500);
//         mainScreen.setVisible(true);
//         mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         // background = new JLabel(new ImageIcon(" "));

//     }

//     public void introduction() {

//         JLabel title = new JLabel(
//                 "<html><div style='text-align: center; margin-top: 50px'> PHOENIX GAMES </div></html>");
//         mainScreen.add(title);

//         try {
//             Thread.sleep(100);
//         } catch (Exception a) {
//         }

//         screen.setScreen(screen.getScreen() + 1);
//         mainScreen.remove(title);

//     }

//     public void mainMenu() {
//         java.net.URL imgUrl = getClass().getResource("Menu-bkg.jpg");
//         ImageIcon icon = new ImageIcon(imgUrl);
//         JLabel l = new JLabel(icon); // gets flowers image
//         JLabel i = new JLabel("MAIN MENU");
//         l.setBounds(0,0,700,500); 
//         mainScreen.add(l);
//         mainScreen.add(i);
//         l.setVisible(true);


//         // java.net.URL imgUrl = Main.class.getResource("Menu Page.jpg");
//         // ImageIcon icon = new ImageIcon(imgUrl);
//         // JLabel bkgg = new JLabel(icon);

//         // // ImageIcon icon = new ImageIcon("Menu-bkg (1).jpg");
//         // // JLabel bkgg = new JLabel(); // get background image
//         // bkgg.setBounds(0, 0, 700, 500);
//         // bkgg.setVisible(true);
//         // mainScreen.add(bkgg);
//         // mainScreen.setVisible(true);
//         // try {
//         //     Thread.sleep(100);
//         // } catch (Exception a) {
//         // }
//         // bkgg.setVisible(false);


//         // JLabel bkg = new JLabel(); 
//         // try {
//         //     BufferedImage b = ImageIO.read (new File ("Menu-bkg (1).jpg"));
//         //     bkg = new JLabel(new ImageIcon(b)); 
//         // } catch (Exception a) {}
//         // bkg.setVisible(true);
//         // mainScreen.add(bkg);
//         // mainScreen.setVisible(true);
//         // // try {
// 	    // //     Thread.sleep(100);
//         // // } catch (Exception a) {}
//         // input = new UserInput(mainScreen, screen);
//         // // bkg.setVisible(false);
//     }



//     public void highscores() {
//         // try {
//         //     BufferedImage bkg = ImageIO.read(new File("highscores-screen.jpg"));
//         // } catch (IOException a) {
//         // }
//         // ImageIcon icon = new ImageIcon("highscores-screen.jpg");
//         // JLabel bkgg = new JLabel(icon); // get background image
//         // bkgg.setBounds(0, 0, 700, 500);
//         // bkgg.setVisible(true);
//         // mainScreen.add(bkgg);
//         // try {
//         //     Thread.sleep(100);
//         // } catch (Exception a) {
//         // }
//         // bkgg.setVisible(false);

//     }
    

//     // public void mainMenu() {
//     //     background.setIcon(new ImageIcon("Menu-bkg (1).jpg")); 
//     //     background.setBounds(0,0,700,500);
//     //     background.setVisible(true);
//     //     mainScreen.add(background);
//     //     mainScreen.setVisible(true);
//     //     input = new UserInput(mainScreen, screen);
//     // }

//     // public void highscores() {
//     //     background.setIcon(new ImageIcon("highscores-screen.jpg")); 
//     //     background.setBounds(0,0,700,500);
//     //     background.setVisible(true);
//     //     mainScreen.add(background);
//     //     mainScreen.setVisible(true);

//     // }

    
//     public void learn() {
//         mainScreen.getContentPane().setBackground(Color.CYAN);
//     }

//     public void level1() {
//         mainScreen.getContentPane().setBackground(Color.yellow);
//     }

//     public void level2() {
//         mainScreen.getContentPane().setBackground(Color.MAGENTA);
//     }

//     public void goodbye() {
//         mainScreen.getContentPane().setBackground(Color.lightGray);
//     }

//     public void credits() {
//         mainScreen.getContentPane().setBackground(Color.black);
//     }

//     /**
//      * Main method
//      * 
//      * @param args
//      */
//     public static void main(String args[]) {
//         Main m = new Main();
//         m.mainMenu();
//         // m.introduction();
//         // while (screen.getScreen() < 7) {
//         //     if (screen.getScreen() == 2) {
//         //         m.mainMenu();
//         //     } else if (screen.getScreen() == 3) {
//         //         m.highscores();
//         //     } else if (screen.getScreen() == 4) {
//         //         m.learn();
//         //     } else if (screen.getScreen() == 5) {
//         //         m.level1();
//         //         if (win == true) {
//         //             m.level2();
//         //         }
//         //     } else if (screen.getScreen() == 6) {
//         //         m.goodbye();
//         //     } else if (screen.getScreen() == 7) {
//         //         m.credits();
//         //     }
//         //     System.out.println(screen.getScreen());
//         // }
//         // // source:
//         // // https://stackoverflow.com/questions/1234912/how-to-programmatically-close-a-jframe
//         // mainScreen.dispatchEvent(new WindowEvent(mainScreen, WindowEvent.WINDOW_CLOSING));
//     }
// }