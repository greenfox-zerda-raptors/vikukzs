import java.util.Random;
import java.util.Scanner;

/**
 * Created by Zsuzska on 2016. 11. 18..
 */
public class Guess {
    public static void main(String[] args){
        Random random = new Random();
        int numberToGuess = 1 + random.nextInt(100);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        System.out.println("Hey, you beautiful creature! Guess my number between 1 and 100! You have 6 tries, my love.");

        while (win == false || numberOfTries <= 6) {

            guess = input.nextInt();
            numberOfTries++;
            int remainingGuesses = 6 - numberOfTries;

            if (numberOfTries == 6){
                System.out.println("I'm sorry, my love! Unfortunately, you ran out of guesses. I'llgive you a hug, my love.");
                break;
            }

            if (guess == numberToGuess) {
                win = true;
                System.out.println("You guessed correctly, my love.");
                System.out.println("The number was: " + numberToGuess);
                System.out.println("It took you " + numberOfTries + " tries");

            }
            else if (guess < numberToGuess) {
                System.out.println("Nope, you're too low, my love, too low. Please, try again. You have " + remainingGuesses + " guesses.");
            }
            else if (guess > numberToGuess) {
                System.out.println("Have you been smoking, my love? You're too high. Please, try again. You have " + remainingGuesses + " guesses.");
            }
        }

    } // end of Main
}
