
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class ChangeHistory {
    private ArrayList<Double> history;
    //private double sum;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public double maxValue(){
        double maxValue = this.history.get(0);
        
        for (double i : this.history){
            if (i>maxValue){
                maxValue = i;
            }
        }
        
        return maxValue;   
    }
    
    public double minValue(){
        double minValue = this.history.get(0);
        
        for (double i : this.history){
            if (i<minValue){
                minValue = i;
            }
        }
        
        return minValue;   
    }
    
    public double average(){
        double sum = 0;
        if (this.history.isEmpty()){
            return 0;
        }
        
        for(double i : history){
            sum+=i;
        }
        
        return 1.0*sum/this.history.size();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    
    
    
}
