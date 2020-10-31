
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int e2 = this.euros+addition.euros();
        int c2 = this.cents+addition.cents();
           
        
        Money newMoney = new Money(e2,c2); // create a new Money object that has the correct worth
        
        
        // return the new Money object
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        
        if(this.euros<compared.euros()){
            return true;
        }
        
        if(this.euros==compared.euros()){
            if(this.cents<compared.cents()){
                return true;
            }
        }
        
        return false;
    }
    
    public Money minus(Money decreaser){
        int e2 = this.euros-decreaser.euros();
        int c2 = this.cents-decreaser.cents();
        
        //System.out.println("e2 begin "+ e2);
        //System.out.println("c2 begin "+ c2);
        
        if(e2<0){
            e2 = 0;
            c2 =0;
        }
        
        if(c2<0){
            c2 =100+c2;
            e2--;
            //System.out.println("e2 loop " + e2);
            //System.out.println("c2 loop " + c2);
            if(e2<0){
                e2 = 0;
                c2 =0;
            }
            
        }
        
        Money newMoney = new Money(e2,c2); // create a new Money object that has the correct worth
        
        
        // return the new Money object
        return newMoney;
        
    
    }

}
