
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int liquidContainer1 = 0;
        int liquidContainer2 = 0;

        while (true) {
            System.out.println("First: " + liquidContainer1 + "/100");
            System.out.println("Second: " + liquidContainer2 + "/100");
            
            String input = scan.nextLine();
   
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")){
                if(amount>0){
                    liquidContainer1 += amount;
                    if(liquidContainer1 >100){
                        liquidContainer1 = 100;
                    }
                }
            }
            
            if(command.equals("move")){
                
                if(amount>0){
                    if(liquidContainer1<amount){
                        int helper = liquidContainer1;
                        liquidContainer1 = 0;
                        liquidContainer2 += helper;
                        if(liquidContainer2>100){
                            liquidContainer2 = 100;
                        }
                    } else {
                        liquidContainer1 -= amount;
                        liquidContainer2 += amount;
                        if(liquidContainer2>100){
                            liquidContainer2 = 100;
                        }
                    }
                }
                
            }
            
            if(command.equals("remove")){
                
                if(amount>0){
                    if(liquidContainer2<amount){
                        liquidContainer2 = 0;
                    } else {
                        liquidContainer2 -= amount;
                    }
                }
                
            }
            
            
            
        }
    }

}
