
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        int ans;
        if (first > second){
            ans = first;
            System.out.println("Greater number is: " + ans);
        } else if (first < second) {
            ans = second;
            System.out.println("Greater number is: " + ans);
        } else {
            ans = 1;
            System.out.println("The numbers are equal!");
        }
        
        
    }
}
