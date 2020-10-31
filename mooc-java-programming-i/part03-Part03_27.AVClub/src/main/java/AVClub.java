
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        while(true){
            if(text.equals("")){
                break;
            }
            
            //String text = scanner.nextLine();
            String[] parts = text.split(" ");
            
            for (String i : parts){
                if (i.contains("av")){
                    System.out.println(i);
                }
            }
            text = scanner.nextLine();
        }

    }
}
