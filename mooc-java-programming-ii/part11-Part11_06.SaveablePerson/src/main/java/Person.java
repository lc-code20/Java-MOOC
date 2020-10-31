/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Person implements Saveable {
    private String name;
    private String address;
    
    
    public void save(){
    
    }
    
    public void printName(){
        System.out.println(name);
    }
    
    public void load(String str){
        System.out.println(this.address);
    }
    
    public void delete(){
    
    }
    
    
    
}
