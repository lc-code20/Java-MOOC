
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
        
        while(true){
        
            String input = scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            
            list.add(input);
        
        }
        
        double check = list.stream()
            .mapToInt(i -> Integer.valueOf(i))
            .reduce(0,(a, value)-> a + value);
            //getAsDouble();
            
            System.out.println(check);
        
    }
}
