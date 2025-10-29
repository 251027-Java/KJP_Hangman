import java.util.Scanner;

public class hangmanGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mistakes = 0;
        boolean[] guesses = new boolean[26];
        String word = null;
        int correct = 0;
        boolean gameState = true;
        boolean gameWon = false;

        // user input for the hangman word string
        // focus on word so exclude numbers special characters spaces
        // bool array (size 26) - represents letters user has guessed. arr[0] = true means user guessed 'a'
        // number of mistakes = 5

        // user input loop for word
        while (word == null) {

        }

        // gamestate
        while (correct > word.length() && mistakes < 5) {

            // loop to check user input for char

            // loop for guess
            // if its correct
            // if its incorrect
        }
        // while loop w bool gameCheck to end it. in loop gameCheck is changed during max mistakes and when user won
        // exactly one character inputs, has to be letters, try catch it
        // loop through the word array
        // mistake check

        // user_is_done - loop through the string and check all the characters.
        // see if all characters were guessed. true in the boolean array
        // OR: track total number of correct letters in the word-to-guess that match a user's guess
            // once tracked total reaches the number of letters in the word-to-guess, game is done, user wins

        // statement for win or lose
        input.close();
    }

    public void display (boolean[] guesses, String word) {
        // display function
        // for loop print "_ " or "charArray[i] + " "" depending on if user guessed that value
        // for loop size 26 array but only print vals that are true on one line "array[i] + " "
    }


}
