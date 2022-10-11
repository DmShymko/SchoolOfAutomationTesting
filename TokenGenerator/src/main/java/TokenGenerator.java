import java.util.InputMismatchException;
import java.util.Scanner;


public class TokenGenerator {
    public static void introduction() {
        System.out.println("Hello my name TokenGenerator.");
        System.out.println("I am a program that generates tokens with a length of 5, 10, 15 characters. :)");
        System.out.println("Please enter token size");
    }

       public static StringBuilder runTokenGenerator() {
        final char[] chars = {33, 34, 35, 36, 37, 38, 39, 40, 41, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67,
                68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99,
                100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120,
                121, 122};

        StringBuilder token = new StringBuilder();

        int a ;

        try {
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();

            if ((a != 5) && (a!=10) && (a !=15)){
                System.err.println("You entered incorrect value.");
                System.out.println("Please enter token size 5, 10 or 15");
            }
            else {

            for (int i = 0; i < a; i++) {
                int index = (int) (Math.random() * 72);
                token.append(chars[index]);
            }}
        } catch (InputMismatchException exception) {
            System.err.println("You input incorrect data");
            System.out.println("Please enter token size 5, 10 or 15");
        }
        return token;

       }

}
