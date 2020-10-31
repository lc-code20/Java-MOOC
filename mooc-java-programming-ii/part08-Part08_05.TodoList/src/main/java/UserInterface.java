
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
    private Scanner scan;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scan) {
        this.scan = scan;
        this.list = list;
    }
    
    public void start(){
        while(true){
            
            System.out.print("Command: ");
            String command = this.scan.nextLine();
            
            if (command.equals("stop")){
                break;
            }
            
            if (command.equals("add")){
                System.out.print("To add: ");
                String task = this.scan.nextLine();
                this.list.add(task);
                continue;
            }
            
            if (command.equals("list")){
                this.list.print();
                continue;
            }
            
            if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                int input  = Integer.valueOf(this.scan.nextLine());
                this.list.remove(input);
            }
            
        }
    }
    
    
    
}
