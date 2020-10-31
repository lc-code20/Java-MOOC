
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Which file should have its content printed?");
        
        String input = scanner1.nextLine();
        
        try (Scanner scanner = new Scanner(Paths.get(input))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
            // we read one line
            String row = scanner.nextLine();
            // we print the line that we read
            System.out.println(row);
        }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        

    }
}
