
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        /*String numberAsString = "3";
        int number = Integer.valueOf(numberAsString);
        
        System.out.println(numberAsString + 7);
        System.out.print(number + 7);*/
        
        gradeList gList = new gradeList();
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1){
                break;
            }
            
            gList.add(input);
        }
        
        //System.out.println(gList);
        //System.out.println("Sum: " + gList.average());
        System.out.println("Point average (all): " + gList.average());
        if(gList.averagePass() == 0){
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + gList.averagePass());
        }
        System.out.println("Pass percentage: " + gList.passPercentage());
        gList.printGradeD();
        //System.out.println(gList);
    }
    
    
}
