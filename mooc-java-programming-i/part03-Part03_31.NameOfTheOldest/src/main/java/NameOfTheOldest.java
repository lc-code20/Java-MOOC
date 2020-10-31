
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //int sum = 0;
        int count = 0;
        int greatest = 0;
        String name = "name";

        while (true) {
            String input = scanner.nextLine();
            //int greatest = 0;
            if (input.equals("")) {
             break;
            }
            
            
            String[] parts = input.split(",");
            //sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
            
            if(greatest<Integer.valueOf(parts[1])){
                greatest = Integer.valueOf(parts[1]);
                name = parts[0];
            }
            
        }

        System.out.println("Name of the oldest: " + name);

    }
}
