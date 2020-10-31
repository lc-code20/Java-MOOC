
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        while(true){
        
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0){
                if(sum == 0|count == 0){
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println(average(sum,count));
                }
                break;
            }
            
            if (input>0){
                sum += input;
                count++;
            }
        }
            
    }
    
    public static double average(double sum, double count){
 
        return 1.0*sum/count;
    }
}
