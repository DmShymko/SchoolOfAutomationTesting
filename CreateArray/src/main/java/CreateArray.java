import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class CreateArray {


    public static void runCreateAray (){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        out.println("Hello input integer - size array.");
        try {
            int sizeArray = scanner.nextInt();


        out.println("now let's fill the array");
        int sum = 0;
        int[] numbersArray = new int[sizeArray];
        int max = numbersArray[0];

        for (int i = 0; i<sizeArray; i++){
        out.println("Input number (integer) and push enter");
        numbersArray[i] = scanner2.nextInt();
    }


    for (int i = 0; i<sizeArray; i++){
        sum = sum +numbersArray[i];
    }


        for (int i : numbersArray) {
        out.println(i);
    }
        for(int i = 0; i < numbersArray.length; i++) {
        if(numbersArray[i] > max) {
            max = numbersArray[i];
        }

    }
        out.println("Average of the numbers entered: "+ sum/sizeArray);
        out.println("maximum value: "+ max);
    }catch (InputMismatchException exception) {
            System.err.println("You entered invalid value");
            System.err.println("Run the program again and enter an integer");
        }
}}
