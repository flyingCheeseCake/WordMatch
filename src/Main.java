import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        WordMatch w = new WordMatch("mississippi");
//        System.out.println(w.scoreGuess("i"));
//        System.out.println(w.scoreGuess("iss"));
//        System.out.println(w.scoreGuess("issipp"));
//        System.out.println(w.scoreGuess("mississippi"));
//
//        WordMatch game = new WordMatch("concatenation");
//        System.out.println(game.scoreGuess("ten"));
//        System.out.println(game.scoreGuess("nation"));
//        System.out.println(game.findBetterGuess("ten", "nation"));
//        System.out.println(game.scoreGuess("con"));
//        System.out.println(game.scoreGuess("cat"));
//        System.out.println(game.findBetterGuess("con", "cat"));
        System.out.println(read());
    }
    public static int read () throws IOException {
        int points = 0;
        File f = new File("Guesses.txt");
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            WordMatch w = new WordMatch(s.next());
            points += w.scoreGuess(w.findBetterGuess(s.next(), s.next()));
        }
        return points;
    }
}
