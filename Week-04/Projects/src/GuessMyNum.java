import java.util.Random;
import java.util.Scanner;
import java.util.logging.SocketHandler;

/**
 * Created by Zsuzska on 2016. 11. 11..
 */
public class GuessMyNum {
    public static void main(String[] args){
        Random random = new Random();
        int numberToGuess = 1 + random.nextInt(100);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        System.out.println("Hey, MotherFucker! Guess my number between 1 and 100! You have 6 tries, MotherFucker.");

        while (win == false || numberOfTries <= 6) {

            guess = input.nextInt();
            numberOfTries++;
            int remainingGuesses = 6 - numberOfTries;

            if (numberOfTries == 6){
                System.out.println("English, MotherFucker! Do you speak it? I said SIX tries! You ran out of guesses. I'll have to kill you now, MotherFucker.");
                break;
            }

            if (guess == numberToGuess) {
                win = true;
                System.out.println("Finally!! You guessed correctly.");
                System.out.println("The number was: " + numberToGuess);
                System.out.println("It took you " + numberOfTries + " tries");

            }
            else if (guess < numberToGuess) {
                System.out.println("Nope, you're too low, MotherFucker, too low. Try again. You have " + remainingGuesses + " guesses.");
            }
            else if (guess > numberToGuess) {
                System.out.println("Have you been smoking, MotherFucker? You're too high. Try again, MotherFucker. You have " + remainingGuesses + " guesses.");
            }
        }

    } // end of Main
} // end of GuessNum
