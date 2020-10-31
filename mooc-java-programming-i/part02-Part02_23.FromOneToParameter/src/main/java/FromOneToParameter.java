

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
    public static void printUntilNumber(int numTimes){
        int i = 1;
        while (i < numTimes+1) {
            System.out.println(i);
            i++;
        }
        
    }
}
