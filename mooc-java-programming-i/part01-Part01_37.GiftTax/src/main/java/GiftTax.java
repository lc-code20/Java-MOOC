
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int number = Integer.valueOf(scan.nextLine());
        
        double tax = 0.0;
        if (number < 5000 && number > 0){
            tax = 0.0;
        } else if (number < 25001){
            tax = 100 + (0.08*(number-5000));
        } else if (number < 55001){
            tax = 1700 + (0.1*(number-25000));
        } else if (number < 200001){
            tax = 4700 + (0.12*(number-55000));
        } else if (number < 1000001){
            tax = 22100 + (0.15*(number-200000));
        } else {
            tax = 142100 + (0.17*(number-1000000));
        }
        
        if (tax == 0.0){
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }
              
        
    }
}
