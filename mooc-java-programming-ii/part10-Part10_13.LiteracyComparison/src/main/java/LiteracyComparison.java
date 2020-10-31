
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        List<Data> list = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row-> row.split(","))
                    .map(parts ->  new Data(parts[3].trim(),Integer.valueOf(parts[4]), parts[2].trim(), Double.valueOf(parts[5])))
                    .forEach(d -> list.add(d));
                    //.forEach(d -> System.out.println(d));
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //Collections.sort(list, (p1, p2) -> p1.getPercent() - p2.getPercent());
        
        list.stream()
              .sorted((p1,p2)-> {return p1.compareTo(p2);})
              .forEach(d ->System.out.println(d));
      
        
    }
}
