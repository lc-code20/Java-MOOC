
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics(){
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number){
        //this.count = this.count + number;
        sum += number;
        this.count++;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average() {
        double av = 0;
        
        if(this.count != 0){
            av = 1.0*sum/this.count;
        }
        
        
        return av ;
    }
    
}
