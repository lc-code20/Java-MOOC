
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        /*HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");*/
        
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("pride", 1813, "...."));
        hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));
        printValueIfNameContains(hashmap, "ide");
    }
    
    public static void printValues(HashMap<String,Book> hashmap){
        
        for(String bookName : hashmap.keySet()){
            System.out.println(hashmap.get(bookName).toString());
        }
        
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        
        for(String bookName : hashmap.keySet()){
            if (bookName.contains(text)){  
                System.out.println(hashmap.get(bookName).toString());
            }
            if (hashmap.get(bookName).getName().contains(text)){
                System.out.println(hashmap.get(bookName).toString());
            }
        }
    }
    
}
