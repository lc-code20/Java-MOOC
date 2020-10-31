
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("How many numbers should be printed?");
        
        int input = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < input; i++){
            System.out.println(r.nextInt(11));
        }
        
    }

}
