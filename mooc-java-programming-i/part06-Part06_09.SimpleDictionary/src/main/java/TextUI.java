
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simple;

    public TextUI(Scanner scanner, SimpleDictionary simple) {
        this.scanner = scanner;
        this.simple = simple;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                System.out.println("Bye bye!");
                return;
            }
            
            if(input.equals("add")){
                
                System.out.print("Word: ");
                String inputW = scanner.nextLine();
                System.out.print("Translation: ");
                String inputT = scanner.nextLine();
                
                simple.add(inputW,inputT);
                continue;
            }
            
            if(input.equals("search")){
                System.out.print("To be translated: ");
                String inputS = scanner.nextLine();
             
                String searched = "";
                if(simple.translate(inputS)==null){
                    searched = "Word "+ inputS + " was not found";
                } else {
                    searched = simple.translate(inputS);     
                }
                
                System.out.println("Translation: " + searched);
          
                continue;
            }
            
            System.out.println("Unknown command");
        
        }
    }
    
}
