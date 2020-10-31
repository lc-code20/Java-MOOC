
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Scanner scanner = new Scanner(System.in);
        List<Book> Books = new ArrayList<>();
        
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            
            //String name = scanner.nextLine();
            
            System.out.println("Input the age recommendation: ");
            
            int age = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(input,age);
            Books.add(book);
        }
        
        System.out.println(Books.stream().count() + " books in total." + "\n");

        System.out.println("Books:");
        //Books.stream()
          //      .forEach(b -> System.out.println(b));

        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(Books, comparator);
        
        for (Book b:Books){
            System.out.println(b);
        }
        
        
    }

}
