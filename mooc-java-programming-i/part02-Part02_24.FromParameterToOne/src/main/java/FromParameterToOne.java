

public class FromParameterToOne {

    public static void main(String[] args) {
        
        printFromNumberToOne(5);

    }
    
    public static void printFromNumberToOne(int numTimes){
        int i = numTimes;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        
    }

}
