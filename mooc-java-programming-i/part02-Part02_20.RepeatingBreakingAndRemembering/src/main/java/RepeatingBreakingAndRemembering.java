
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Give numbers:");
        
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int noNu = 0;   //counter for number of numbers
        int odd = 0;
        int even = 0;
  
        while(number != -1){
            sum += number;
            noNu += 1;
                
            if(number%2 == 0){
                even += 1;
            } else if (number%2 == 1){
                odd +=1;
            }
            number = Integer.valueOf(scanner.nextLine());
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + noNu);      
        System.out.println("Average: " + (1.0*sum/noNu));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
    }
}
