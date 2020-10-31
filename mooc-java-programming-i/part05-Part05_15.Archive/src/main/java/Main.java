
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Items> items = new ArrayList<>();
        //int counter = 0;

        while (true) {
            System.out.println("Identifier?(empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Items item = new Items(id, name);
            
            if(!(items.contains(item))){
                items.add(item);
                //counter++;
            } //else {
              //System.out.println("The book is already on the list. Let's not add the same book again.");
            //}    
         
        }
        
        System.out.println("==Items==");
        
        for(Items i : items){
            System.out.println(i);
        }
    }
}
