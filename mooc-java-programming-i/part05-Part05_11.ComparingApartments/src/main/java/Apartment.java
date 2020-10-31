
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    //private boolean exp;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        
        if(this.squares>compared.getSquares()){
            return true;
        }
        
        return false;
    }
    
    public int getSquares(){
        return this.squares;
    }
    
    public int getRooms(){
        return this.rooms;
    }
    
    public int getPricePerSquare(){
        return this.pricePerSquare;
    }
    
    public int priceDifference(Apartment compared){
        int thisPrice = this.squares*this.pricePerSquare;
        int cPrice = compared.getSquares()*compared.getPricePerSquare();
        int ans = thisPrice - cPrice;
        
        if(ans<0){
            ans *= -1;
            //this.exp = false;
        }
        
        return ans;
    }

    public boolean moreExpensiveThan(Apartment compared){
        
        if(this.squares*this.pricePerSquare>compared.getSquares()*compared.getPricePerSquare()){
            //System.out.println("this one "+this.squares*this.pricePerSquare );
            //System.out.println("compared "+compared.getSquares()*compared.getPricePerSquare());
            return true;
        }
        
            return false;
    }
    
}
