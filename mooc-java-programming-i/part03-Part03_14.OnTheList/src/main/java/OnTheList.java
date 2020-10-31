
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        //System.out.println("");
        System.out.print("Search for? ");
        
        String inS = scanner.nextLine();
        
        if (list.contains(inS)){
            System.out.println(inS + " was found!");
        } else{
            System.out.println(inS + " was not found!");
        }
    }
}
