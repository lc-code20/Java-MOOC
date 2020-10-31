
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        while(true){
            System.out.println("Give a number");
            int first = Integer.valueOf(scanner.nextLine());
            if(first == 0){
                break;
            } else if(first>0){
                System.out.println(first*first);
            } else if(first<0){
                System.out.println("Unsuitable number");
            } else {
                System.out.println(first);
            }
                
        }
    }
}
