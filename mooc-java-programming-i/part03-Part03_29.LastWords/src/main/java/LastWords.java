
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            
            //String text = scanner.nextLine();
            String[] parts = text.split(" ");
            
            int l = parts.length-1;
                    
            System.out.println(parts[l]);
            //for (String i : parts){
               // if (i.contains("av")){
                 //   System.out.println(i);
                //}
            //}
            //text = 
        }

    }
}
