
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        
        ArrayList<Integer> sumRows = new ArrayList<>();
        
        ArrayList<Integer> all = giveAllNumbers();
        int sum = 0;
        for (int i =1; i < all.size()+1; i++){
            if (i%getHeight()==0){
                sum+=all.get(i-1);
                sumRows.add(sum);
                sum = 0;
            } else{
             sum+=all.get(i-1);
            }
        }
        
        return sumRows;
    }

    public ArrayList<Integer> sumsOfColumns() {
        
        ArrayList<Integer> sumCols = new ArrayList<>();
        
        ArrayList<Integer> all = giveAllNumbers2();
        int sum = 0;
        for (int i =1; i < all.size()+1; i++){
            if (i%getWidth()==0){
                sum+=all.get(i-1);
                sumCols.add(sum);
                sum = 0;
            } else{
             sum+=all.get(i-1);
            }
        }
        
        return sumCols;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        
        ArrayList<Integer> diagonals = new ArrayList<>();
        
        int sum = 0;
        for (int i = 0; i < getWidth();i ++){
            
            for (int j = 0; j < getHeight(); j++){
                
                if (i==j){
                    sum+= square[i][j];
                }   
            }
        }
        
        int sum2 = 0;
        for (int i = 0; i < getWidth();i ++){
            
            for (int j = 0; j < getHeight(); j++){
                
                if ((i+j)==(getWidth()-1)){
                    sum2+= square[i][j];
                }   
            }
        }
        
        diagonals.add(sum);
        diagonals.add(sum2);
       
        return diagonals;
    }
    
    public ArrayList<Integer> giveAllNumbers2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[col][row]);
            }
        }

        return numbers;
    }
    

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
