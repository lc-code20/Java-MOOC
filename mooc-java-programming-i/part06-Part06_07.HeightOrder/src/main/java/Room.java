
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
public class Room {
    private ArrayList<Person> list;
    
    public Room() {
        this.list = new ArrayList<>();
    }
  
    public void add(Person person){
        this.list.add(person);
    }
    
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.list;
    }
    
    public Person shortest(){
        if(list.isEmpty()){
            return null;
        }
        
        Person returnObject = list.get(0);
        
        for (Person prs : list){
            if(returnObject.getHeight()>prs.getHeight()){
                returnObject = prs;
            }
            
        }
    
    
        return returnObject;
    }
    
    public Person take(){
        if(list.isEmpty()){
            return null;
        }
        
        Person returnObject = list.get(0);
        
        for (Person prs : list){
            if(returnObject.getHeight()>prs.getHeight()){
                returnObject = prs;
            }
            
        }
        
        list.remove(returnObject);
        
        return returnObject;
    }
    
}
