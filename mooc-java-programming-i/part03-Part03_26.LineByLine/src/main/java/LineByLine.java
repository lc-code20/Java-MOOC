
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter username: ");
        String text = scanner.nextLine();
        boolean finished = false;
        
        while (!finished){
            if(text.equals("")){
                finished = true;
                return;
            }else {
            
                String[] parts = text.split(" ");
        
                int length = parts.length;
                int i = 0;
                while(i<length){
                    System.out.println(parts[i]);
                    i++;
                }
                
                text = scanner.nextLine();
            }
        }
        
        
    }
}
