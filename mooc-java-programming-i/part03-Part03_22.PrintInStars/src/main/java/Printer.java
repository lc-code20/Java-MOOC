
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        
        for(int i : array){
            printStar(i);
        }
        
        
    }
    
    public static void printStar(int stars){
        int i = 0;
        //int ln =0;
        while(i<stars){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

}
