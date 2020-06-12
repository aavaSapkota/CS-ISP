import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Highscores {

    private ArrayList <Player> scores;

    public Highscores() {
        scores = new ArrayList <Player> ();
    }

    public void leaderboard() {
        // looping through file
        for (int f = 0; f < 10; f++) {
            // checking if value stored in arraylist is smaller than the current score the player earned
            if (scores.get(f).getPointsL2() <= this Player score) {
                // change the placement of the leaderboard by 1
                scores.remove (f);
                scores.add (f, this Player);
                break;
            }
        }

        // writing in the file
        try {
            PrintWriter output = new PrintWriter(new FileWriter("leaderboard.txt"));
            // loop to write highScores [f] in file
            for (int f = 0; f < 10; f++) {
                output.println(scores.get(f).getPointsL2());
                output.println(scores.get(f).getName());
            }
            output.close();
        } catch (IOException e) {
        }
    }
}