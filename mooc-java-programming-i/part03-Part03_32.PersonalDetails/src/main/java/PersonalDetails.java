
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int greatest = 0;
        String name = "name";
        int nameLength = 0;

        while (true) {
            String input = scanner.nextLine();
            //int greatest = 0;
            if (input.equals("")) {
             break;
            }
            
            
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
            
            if(nameLength< parts[0].length()){
                nameLength = parts[0].length();
                name = parts[0];
            }
            
        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0*sum/count));

    }
}
