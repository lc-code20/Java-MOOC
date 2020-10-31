
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
 
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                if(line.equals("")){
                    break;
                }
                
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                String years = "years";
                
                if(age == 1){
                    years = "year";
                }
                
                
                System.out.println(name+", age: "+age+" "+years);
                //System.out.println("Age: " + age);
                
            }
 
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
