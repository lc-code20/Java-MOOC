
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int counter = 0;
        int win = 0;
        int lose = 0;
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
 
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                if(line.equals("")){
                    break;
                }
                
                String[] parts = line.split(",");
                String hT = parts[0];
                String aT = parts[1];
                int hP = Integer.valueOf(parts[2]);
                int aP = Integer.valueOf(parts[3]);
                
                if(hT.equals(team)||aT.equals(team)){
                    counter++;
                }
                
                if(hT.equals(team)){
                    if(hP>aP){
                        win++;
                    } else {lose++;}
                    
                }else if(aT.equals(team)){
                    if(hP>aP){
                        lose++;
                    } else {
                        win++;
                    }
                }
                
            }
 
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Games: "+counter );
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
    }

}
