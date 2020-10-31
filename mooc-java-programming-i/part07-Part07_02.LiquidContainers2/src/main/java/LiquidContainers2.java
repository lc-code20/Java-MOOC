
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println("First: " + containerOne.toString());
            System.out.println("Second: " + containerTwo.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")){
                containerOne.add(amount);
            }
            
            if (command.equals("move")){
                if (amount>0){
                    if(containerOne.contains()>= amount){
                        containerOne.remove(amount);
                        containerTwo.add(amount);
                    } else if (containerOne.contains()<amount && containerOne.contains()!=0){
                        containerTwo.add(containerOne.contains());
                        containerOne.remove(amount);
                    }
                }
            }
    
            if (command.equals("remove")){
                containerTwo.remove(amount);
            }
            
            System.out.println("");

        }
        
        
    }

}
