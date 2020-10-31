
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        
        //int topRow = 0;
        int centerMost = (size+1)/2;
        //System.out.println(centerMost);
        
        square.placeValue(centerMost-1,0, 1);
        
        int i = centerMost-1;
        int j = 0;
        boolean finished = false;
        int numbers = 2;
        
        //for (int numbers = 2; numbers<(size*size)+1;numbers++){
            
        while(numbers<=size*size){
                int currentI = i;
                int currentJ = j;
            //while(finished==false){
                j-=1;
                //System.out.println("j is " + j);
                if(j < 0){
                    j = size-1;
                    //System.out.println("j updated to " + j);
                }
                
                i+=1;
                if(i>size-1){
                    i=0;
                }
                //System.out.println(square.readValue(i, j));
                //System.out.println("current i and j is " +i +" " +j);
                
                
                if (square.readValue(i, j)==0){
                    //System.out.println("value is " + square.readValue(i, j)+" at "+i+j);
                    square.placeValue(i, j, numbers);
                    //System.out.println("value is " + square.readValue(i, j)+" at "+i+" "+j);
                    numbers++;
                    //finished = true;
                } else {
                    //System.out.println("number existed: current i and j is " +i +" " +j);
                    
                    currentJ+=1;
                    
                    if(currentJ>size-1){
                        currentJ = 0;
                    }
                    
                    square.placeValue(currentI, currentJ, numbers);
                    i = currentI;
                    j = currentJ;
                    //System.out.println("number exists value is " + square.readValue(i, j)+" at "+i+" "+j);
                    
                    numbers++;
                    //finished = true;
                }
                
           // }
            
            
        }
        
        System.out.println(square.isMagicSquare());
        System.out.println(square.sumsOfColumns());
        System.out.println(square.sumsOfRows());
        System.out.println(square.sumsOfDiagonals());
        
        
        return square;
    }

}
