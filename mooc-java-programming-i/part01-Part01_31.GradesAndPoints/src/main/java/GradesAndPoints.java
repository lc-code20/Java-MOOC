
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
      
        if (first < 0){
            System.out.println("Impossible");
        } else if (first < 50) {
            System.out.println("Failed");
        } else if(first < 60) {
            System.out.println("1");
        } else if(first < 70) {
            System.out.println("2");
        } else if(first < 80) {
            System.out.println("3");
        } else if(first < 90) {
            System.out.println("4");
        } else if(first < 101) {
            System.out.println("5");
        } else {
            System.out.println("Incredible");
        }
        
    }
}
