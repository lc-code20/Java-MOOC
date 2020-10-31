
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int counter =0;
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }
            counter++;
            numbers.add(luku);
        }
        
        int i = 0;
        while(i<counter){
            System.out.println(numbers.get(i));
            i++;
        }
    }
}
