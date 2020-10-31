import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Name: ");
            String show = scanner.nextLine();
            
            if(show.isEmpty()){
                break;
            }
            
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(show,duration));
            //System.out.println("");
        }
        
        System.out.print("Program's maximun duration? ");
        int max = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram tv : programs){
            if(tv.getDuration()<=max){
                System.out.println(tv);
            }
        }
    }
}
