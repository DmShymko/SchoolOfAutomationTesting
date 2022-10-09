import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void introduction() {
        System.out.println("Hello my name GUSS.");
        System.out.println("I program - guess the number game. :)");
        System.out.println("What's your name?");
    }

    public static void rules() {
        System.out.println("Enter a number from 0 and to 100");
        System.out.println("You have only 5 attempts");
    }

    public static void game() {
        int numberToGuess = new Random().nextInt(100);

        for (int i = 0; i < 5; ) {
            try {
                i++;
                Scanner sc2 = new Scanner(System.in);
                int number = Integer.parseInt(sc2.nextLine());
                if (number < 0 || number > 100) {
                    System.err.println("You entered a number outside the range of numbers.");
                    System.out.println("Input number from 0 and to 100.");
                }

                if (number == numberToGuess) {
                    System.out.println("You guessed it!");
                    break;
                }

                if (number < numberToGuess) {
                    System.out.println("Your number is LOWER than the one you are trying to guess");
                } else {
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                }
                if (i < 5) {
                    System.out.println(5 - i + " tries left.");
                    System.out.println("Try again");
                } else {
                    System.out.println("Your attempts is over");
                    System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                    System.out.println("You lost I'm sorry");

                }
            } catch (NumberFormatException exception) {
                System.err.println("You input incorrect data");
                System.out.println(5 - i + " tries left.");
                System.out.println("Please enter number");
            }
        }


    }
}
