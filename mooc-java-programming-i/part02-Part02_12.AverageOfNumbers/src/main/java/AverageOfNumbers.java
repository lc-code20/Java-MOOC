
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ones = 0;
        int nos = 0;

        // The task is to read an input from the user
        while (true) {
            System.out.println("Give a number: ");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            }

            // The task is to increase the amount of ones
            // if the user inputs a number one
            if (number != 0) {
                ones = ones + number;
                nos = nos + 1;
            }
                
        }

        //System.out.println("Number of numbers: " + nos);
        // The task is to print out the total of ones
        System.out.println("Average of the numbers: " + (1.0*ones/nos));
        
    }
}
