/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Person {
    private String PName;
    private String PAddr;
    
    public Person(String name, String address){
        this.PName = name;
        this.PAddr = address;
    }

    @Override
    public String toString() {
        return PName + "\n  " + PAddr;
    }
    
    
    
}
