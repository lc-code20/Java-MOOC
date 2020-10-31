
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
public class TodoList {
    private ArrayList<String> list;
    //private ArrayList<TaskN> taskN;

    public TodoList() {
        this.list = new ArrayList<>();
        //this.taskN = new ArrayList<>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        
        if(this.list.isEmpty()){
            return;
        }
        
        int index = 1; 
        for(String i : this.list){
            System.out.println(index + ": " + i);
            //index++;
            //String a = i;
            //this.taskN.add(new TaskN(index,i));
            index++;
        }
        
    }
    
    public void remove(int number){
        
        if(this.list.isEmpty()){
            return;
        }
        
        this.list.remove(number-1);
        
      
      
    }
    
    
}
