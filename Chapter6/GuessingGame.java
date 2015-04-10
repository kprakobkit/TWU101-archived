package Chapter6;

import Chapter5.GameHelper;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kprakobkit on 4/10/15.
 */
public class GuessingGame {
    private boolean gameOver;
    private GameHelper gameHelper = new GameHelper();
    private ArrayList<Integer> userGuesses = new ArrayList<Integer>();

    // Generate a random number between 1 - 100 and assign it to answer.
    private Random rn = new Random();
    private int answer = rn.nextInt(100) + 1;

    public void start() {
        int guess;
        String result;

        while (gameOver != true) {
            System.out.println("answer = " + answer);
            gameOver = true;
            String guessString = gameHelper.getUserInput("Guess a number between 1 - 100: ");
            guess = Integer.parseInt(guessString);
            result = checkUserInput(guess);
            System.out.println(result);
        }

        System.out.println("Your previous guesses: " + userGuesses);
    }

    private String checkUserInput(int guess) {
        String result = "";

        if (guess > answer) {
            result = "The answer is lower, please try again.";
        } else if (guess < answer) {
            result = "The answer is higher, please try again.";
        } else if (guess == answer) {
            result = "You are correct! Thank you for playing";
            gameOver = true;
        }

        if (!gameOver) userGuesses.add(guess);

        return result;
    }
}
