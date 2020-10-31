
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(5));
        //System.out.println(msFactory.isMagicSquare());
        
        /*
        MagicSquare ms = new MagicSquare(3);
        System.out.println(ms.sumsOfRows());
        
        int k = 1;
        for (int i =0; i< 3; i++){
            for (int j =0; j<3; j++){
                ms.placeValue(i,j,k);
                k++;
            }
        }
        
        System.out.println(ms);
        System.out.println(ms.sumsOfRows());
        
        //System.out.println(ms.giveAllNumbers2());
        
        System.out.println(ms.sumsOfColumns());
        
        System.out.println(ms.sumsOfDiagonals());
        System.out.println(ms.isMagicSquare());
        
        */
        MagicSquare ms = new MagicSquare(2);
        ms.placeValue(0,0,1);
        ms.placeValue(1,0,5);
        ms.placeValue(0,1,1);
        ms.placeValue(1,1,7);
        
        System.out.println(ms);
        
        System.out.println(ms.sumsOfDiagonals());
        
        
        
    }
}
