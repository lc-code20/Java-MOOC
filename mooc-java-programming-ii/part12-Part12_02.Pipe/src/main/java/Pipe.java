
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Pipe<T> {
    private List<T> element;
    private int counter;
    
    public Pipe(){
        this.element = new ArrayList<>();
        this.counter = 0;
    }
    
    public void putIntoPipe(T value){
        this.element.add(value);
        //System.out.println("added " + value);
    }
    
    public T takeFromPipe(){
        //this.counter++;
        //System.out.println("counter= " + this.counter);
        
        if (!isInPipe()){
            return null;
        }
        
        T helper = this.element.get(counter);
        this.element.remove(this.counter);
        //counter++;
        
        
        return helper;
    }
    
    public boolean isInPipe(){
        return !this.element.isEmpty();
    }
    
    
}
