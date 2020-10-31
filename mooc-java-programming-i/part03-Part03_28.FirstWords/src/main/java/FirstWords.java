
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            
            //String text = scanner.nextLine();
            String[] parts = text.split(" ");
            
            System.out.println(parts[0]);
            //for (String i : parts){
               // if (i.contains("av")){
                 //   System.out.println(i);
                //}
            //}
            //text = 
        }

    }
}
