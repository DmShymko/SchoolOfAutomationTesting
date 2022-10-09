import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GuessTheNumber.introduction();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Nice to meet you " + name);
        GuessTheNumber.rules();
        GuessTheNumber.game();
    }
}



