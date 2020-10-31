
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        
        while(i<number){
            System.out.print("*");
            i++;
        } 
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i=0;
        
        while(i<number){
            System.out.print(" ");
            i++;
        }
           
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int space = size-1;
        int stars = 1;
        
        if(size == 1){
            System.out.println("*");
            return;
        }
        
        while(space>=0){
            printSpaces(space);
            space--;
            printStars(stars);
            stars++;
        }
        
    }
    
    public static void printTriangleM(int size) {
        // extra method
        int space = size-1;
        int stars = 1;
        
        while(space>=0){
            printSpaces(space);
            space--;
            printStars(stars);
            stars+=2;
        }
        
    }
    
    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int i=0;
        
        while(i<height){
            printStars(width);
            i++;
        }
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = height;
        printTriangleM(i);
       
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
       
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(3);
        //printTriangleM(4);
        //christmasTree(10);
        //System.out.println("---");
        //christmasTree(4);
        //System.out.println("---");
        //christmasTree(10);
    }
}
