/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author lwych
 */
public class Stack {
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.stack.isEmpty();
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        
        //for(int i = this.stack.size(); i>0;i--){
           // System.out.println("");
        //}
        return this.stack;
    }
    
    public String take(){
        
        
        String take = this.stack.get(this.stack.size()-1);
        
        this.stack.remove(this.stack.size()-1);
        
        
        return take;
    }
    
    
}
