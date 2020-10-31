/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Items {
    private String id;
    private String name;
    
    public Items(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }
    
    public String toString(){
        return this.id + ": "+this.name;
    }
    
    /*public boolean equals(Object compared){
        
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Items)){
            return false;            
        }
        
        Items itemP = (Items) compared;
        
        if(this.id.equals(itemP.id)){
            return true;
        }
        
        
        return false;
    
    }*/
     
    
}
