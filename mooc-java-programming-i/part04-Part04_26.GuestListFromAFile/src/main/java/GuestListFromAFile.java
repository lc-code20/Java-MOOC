
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        
        try (Scanner scanner1 = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scanner1.hasNextLine()) {
            // we read one line
            String row = scanner1.nextLine();
            
            list.add(row);
            // we print the line that we read
            //System.out.println(row);
        }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        
        
        //int i = 0;    
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
                //break;
            } else {
                System.out.println("The name is not on the list.");
                //break;
            }
            //i++;
        }
        
        
        System.out.println("Thank you!");
    }
}
