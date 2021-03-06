
/**
 * Creators: Aava Sapkota and Sarah Zhao
 * Class: ICS4UO-1
 * Teacher: Ms.Krasteva
 * Project: ISP
 */

//import libraries. 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

public class Main {
    //variable initialization
    private static Vars screen;
    private static UserInput input;
    private static JFrame mainScreen = new JFrame("Game Title");
    private static Level1 learn;
    private static Level2 play;
    private Image icon;//image background
    private JLabel bkg;
    private static Player p;//player variable

    // main class constructor
    public Main() {
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainScreen.setSize(730, 540);
        mainScreen.setVisible(true);
        mainScreen.setLocationRelativeTo(null);
        screen = new Vars(1); // set up starting screen
        //initialize the level objects
        learn = new Level1(mainScreen); 
        play = new Level2(mainScreen);
        input = new UserInput(mainScreen, screen, play, p);
        p = new Player("jumbo");
        p.resetScore();

        //play music
        try {
            Music audioPlayer = new Music("bkg-song.wav");
            audioPlayer.play();
        }catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }
    }

    // splashscreen animation
    public void splashScreen() {
        Splashscreen a = new Splashscreen(mainScreen);
        a.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        a.end();
        mainScreen.getContentPane().setBackground(Color.WHITE);
    }

    // title card graphic
    public void introduction() {
        icon = new ImageIcon("FINAL Title Card.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
        screen.setScreen(screen.getScreen() + 1);

    }

    // main menu graphics
    public void mainMenu() {
        java.net.URL imgUrl = Main.class.getResource("FINAL Menu.PNG");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // get background
        bkg.setBounds(0, 0, 705, 510);
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    // highscores display
    public void highscores() {

        String[][] scores = Player.getScores();
        java.net.URL imgUrl = Main.class.getResource("FINAL Highscores.PNG");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        JLabel bkg = new JLabel(new ImageIcon(icon)) { //display Highscores
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                for (int i = 0; i < 10; i++) {
                    String spaces = "";
                    int r = 82 - (scores[i][0].length() + scores[i][1].length());//get spaces in between
                    for (int j = 0; j <= r; j++) {
                        spaces += " ";//add middle spaces
                    }
                    if(scores[i][0].equals("")){//check if name is empty
                        g.drawString( "Anonymous" + spaces + scores[i][1], 200, 190 + 20 * i);
                    }else{
                        g.drawString(scores[i][0] + "" + spaces + scores[i][1], 200, 190 + 20 * i);
                    }
                   
                }

            }
        }; // Gets background image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    // Instructions graphics
    public void learn() {
        java.net.URL imgUrl = Main.class.getResource("FINAL Instructions.PNG");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // gets flowers image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    // Level 1 start graphics
    public void level1() {
        icon = new ImageIcon("FINAL Level 1 Start.PNG").getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    // Level 2 start graphics
    public void level2() {
        java.net.URL imgUrl = Main.class.getResource("FINAL Level 2 Start.PNG");
        icon = new ImageIcon(imgUrl).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // gets flowers image
        bkg.setVisible(true);
        mainScreen.add(bkg);
        mainScreen.setVisible(true);
    }

    // exit graphic
    public void goodbye() {
        icon = new ImageIcon(Main.class.getResource("FINAL Exit.PNG")).getImage().getScaledInstance(700, 500, 100);
        bkg = new JLabel(new ImageIcon(icon)); // Gets background image
        bkg.setVisible(true);
        mainScreen.getContentPane().add(bkg);
        mainScreen.setVisible(true);

    }

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String args[]) {
        Main m = new Main();
        m.splashScreen();
        m.introduction();
        while (true) {
            if (screen.getScreen() == 2) { //main menu screen
                m.mainMenu();
            } else if (screen.getScreen() == 3) { // display highscores
                m.highscores();
            } else if (screen.getScreen() == 4) { //display instructions
                m.learn();
            } else if (screen.getScreen() == 5) {//play Level 1
                m.level1();
            } else if (screen.getScreen() == 6) { //end screen 
                m.goodbye();
            } else if (screen.getScreen() == 7) { // question 1
                learn.question1();
            } else if (screen.getScreen() == 8) {// info 1 screen
                learn.info1();
            } else if (screen.getScreen() == 9) {// question 2
                learn.question2();
            } else if (screen.getScreen() == 10) {// info 2 screen
                learn.info2();
            } else if (screen.getScreen() == 11) {// question 3
                learn.question3();
            } else if (screen.getScreen() == 12) {// info 3 screen
                learn.info3();
            } else if (screen.getScreen() == 13) {// question 4
                learn.question4();
            } else if (screen.getScreen() == 14) {// info 4 screen
                learn.info4();
            } else if (screen.getScreen() == 15) {// question 5
                learn.question5();
            } else if (screen.getScreen() == 16) {// info 5 screen
                learn.info5();
            } else if (screen.getScreen() == 17) {// question 6
                learn.question6();
            } else if (screen.getScreen() == 18) {// info 6 screen
                learn.info6();
            } else if (screen.getScreen() == 19) {// question 7
                learn.question7();
            } else if (screen.getScreen() == 20) {// info 7 screen
                learn.info7();
            } else if (screen.getScreen() == 21) {// question 8
                learn.question8();
            } else if (screen.getScreen() == 22) {// info 8 screen
                learn.info8();
            } else if (screen.getScreen() == 23) {// question 9
                learn.question9();
            } else if (screen.getScreen() == 24) {// info 9 screen
                learn.info9();
            } else if (screen.getScreen() == 25) { // passed screen
                learn.passed();
            } else if (screen.getScreen() == 26) {// incorrect page
                learn.incorrect();
            } else if (screen.getScreen() == 27) {// failed page
                learn.failed();
            } else if (screen.getScreen() == 28) {// Level 2 start page
                m.level2();
            } else if (screen.getScreen() == 29) { // character select
                play.charSelect();
            } else if (screen.getScreen() == 30) { // PPE selection page
                play.PPEOptions();
            } else if (screen.getScreen() == 32) { // failed screen
                play.failed();
            } else if (screen.getScreen() == 33) { // passed screen
                play.passed();
            } else if (screen.getScreen() == 34) { //exit program
                break;
            }
            System.out.print("");
        }
        // source:
        // https://stackoverflow.com/questions/1234912/how-to-programmatically-close-a-jframe
        mainScreen.dispatchEvent(new WindowEvent(mainScreen, WindowEvent.WINDOW_CLOSING));

    }
}
