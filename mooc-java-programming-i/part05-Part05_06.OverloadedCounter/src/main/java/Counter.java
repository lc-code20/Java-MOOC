/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Counter {
    private int value;
    
    public Counter(int startValue){
        this.value = startValue;
    }
    
    public Counter(){
        this(0);
    }
    
    public int value(){
        return this.value;
    }
    
    public void increase(int i){
        if(i>0){
            this.value += i;
        }
    }
    
    public void increase(){
        this.value++;
    }
    
    public void decrease(int j){
        if(j>0){
            this.value -= j;
        }
    }
    
    public void decrease(){
        this.value--;
    }
}
