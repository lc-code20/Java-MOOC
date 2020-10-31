
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
public class UserInterface {
    private TodoList toDo;
    private Scanner scanner;

    public UserInterface(TodoList toDo, Scanner scanner) {
        this.toDo = toDo;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if(input.equals("add")){
                System.out.print("To add: ");
                String input2 = scanner.nextLine();
                this.toDo.add(input2);
            }
            
            if(input.equals("list")){
                this.toDo.print();
            }
            
            if(input.equals("remove")){
                System.out.print("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                
                this.toDo.remove(index);
                
            }
            
            if(input.equals("stop")){
                break;
            }
        
        }
    
    }
}
