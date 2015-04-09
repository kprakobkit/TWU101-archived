package Chapter5;

import java.util.Scanner;

/**
 * Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess until they get the right answer. Use classes to separate the different concerns of this program.
 * Created by kprakobkit on 4/9/15.
 */
public class GuessingGame {
    private int answer;
    private int userGuess;
    private boolean complete;

    public GuessingGame() {
        answer = (int)(Math.random() * 100);
    }

    public void start() {
        while (complete != true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Guess a number between 1 - 100: ");

            userGuess = reader.nextInt();

            if (userGuess > answer) {
                System.out.println("The answer is lower, please try again.");
            } else if (userGuess < answer) {
                System.out.println("The answer is higher, please try again.");
            } else if (userGuess == answer) {
                System.out.println("You are correct! Thank you for playing");
                complete = true;
            }
        }
    }
}
