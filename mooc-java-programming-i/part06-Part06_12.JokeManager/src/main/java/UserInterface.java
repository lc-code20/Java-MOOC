
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
    private JokeManager jM;
    private Scanner scanner;

    public UserInterface(JokeManager jM, Scanner scanner) {
        this.jM = jM;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while (true){
            commands();
            
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                addJoke();
            } else if (command.equals("2")) {
                drawJokeU();
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jM.printJokes();
            }   
        }
    
    }
    
    public void commands(){
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");      
    }
    
    public void addJoke(){
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jM.addJoke(joke);
    }
    
    public void drawJokeU(){
        System.out.println("Drawing a joke.");
        System.out.println(jM.drawJoke());
    }
    
    
}
