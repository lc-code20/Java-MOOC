
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>();
        
        positive(list);
        
        //ArrayList list2 = list.stream()
        //    .collect(Collectors.toList());
        
    }
    
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> list2 = numbers.stream()
                .filter(i->i>0)
                .collect(Collectors.toList());
        
        return list2;
    }

}
