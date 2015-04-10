package Chapter5;

import java.util.Random;

/**
 * Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess until they get the right answer. Use classes to separate the different concerns of this program.
 * Created by kprakobkit on 4/9/15.
 */
public class GuessingGame {
    private int guess;
    private boolean done;
    private GameHelper gameHelper = new GameHelper();

    // Generate a random number between 1 - 100 and assign it to answer.
    private Random rn = new Random();
    private int answer = rn.nextInt(100) + 1;

    public void start() {
        while (done != true) {
            String guessString = gameHelper.getUserInput("Guess a number between 1 - 100: ");
            guess = Integer.parseInt(guessString);

            if (guess > answer) {
                System.out.println("The answer is lower, please try again.");
            } else if (guess < answer) {
                System.out.println("The answer is higher, please try again.");
            } else if (guess == answer) {
                System.out.println("You are correct! Thank you for playing");
                done = true;
            }
        }
    }
}
