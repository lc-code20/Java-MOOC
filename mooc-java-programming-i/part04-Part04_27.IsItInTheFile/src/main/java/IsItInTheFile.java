
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        
        try (Scanner scanner1 = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scanner1.hasNextLine()) {
            // we read one line
            String row = scanner1.nextLine();
            // we print the line that we read
            list.add(row);
        }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        if(list.contains(searchedFor)){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
