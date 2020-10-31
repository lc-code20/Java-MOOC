
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        ArrayList<Bird> birds = new ArrayList<>();
        
        while(true){
        
            System.out.print("? ");
            
            String command = scan.nextLine();
            
            
            if(command.equals("Add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String lName = scan.nextLine();
                
                birds.add(new Bird(name,lName));
                
                continue;
            }
            
            if(command.equals("Observation")){
                System.out.print("Bird? ");
                
                String observation = scan.nextLine();
                int count = 0;
                        
                for(Bird b : birds){
                    if(b.birdExists(observation)){
                        //System.out.println("contains " + b);
                        b.addObservation(observation);
                        System.out.println(b);
                        count++;
                        break;
                    }
                }
                
                if(count==0){
                    System.out.println("Not a bird!");
                }
                
            }
            
            if (command.equals("Quit")){
                break;
            }
            
            if(command.equals("All")){
                for (Bird b : birds){
                    System.out.println(b);
                }
            }
            
            if(command.equals("One")){
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                
                for (Bird b : birds){
                    if(birdName.equals(b.getName())){
                        System.out.println(b);
                        break;
                    }
                }
            }
            
            
        
       
        }
    }

}
