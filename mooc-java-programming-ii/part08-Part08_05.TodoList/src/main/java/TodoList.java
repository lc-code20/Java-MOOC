
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
    private ArrayList<String> toDoList;
    
    public TodoList() {
        this.toDoList = new ArrayList<>();
    }
    
   public void add(String task){
       this.toDoList.add(task);
   }
   
   public void print(){
       int j = 1;
       for (String i : this.toDoList){
           System.out.println(j + ": " + i);
           j++;
       }
   }
   
   public void remove(int number){
       this.toDoList.remove(number-1);
   }

    @Override
    public String toString() {
        return "ToDoList{" + "toDoList=" + toDoList + '}';
    }
    
    
}
