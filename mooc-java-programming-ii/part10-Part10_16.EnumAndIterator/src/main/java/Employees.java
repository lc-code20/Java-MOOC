
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.list.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
         this.list.addAll(peopleToAdd);
    }
    
    public void print(){
        Iterator<Person> iterator = list.iterator();
        
        while(iterator.hasNext()){
            Person next = iterator.next();
            System.out.println(next);
        
        }
        
    }
    
    public void print(Education education){
        Iterator<Person> iterator = list.iterator();
        
        while(iterator.hasNext()){
            Person next = iterator.next();
            if (next.getEducation()== education){
                System.out.println(next);
            }
        
        }
    }
    
    public void fire(Education education){
        
        Iterator<Person> iterator = list.iterator();
        
        while(iterator.hasNext()){
            Person next = iterator.next();
            if (next.getEducation()== education){
                iterator.remove();
            }
        
        }
    
    }
    
    
    
}
