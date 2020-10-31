/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Teacher extends Person {
    private int salary;
    
    public Teacher(String PName, String PAddr,int salary){
        super(PName, PAddr);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n  salary " + this.salary + " euro/month";
    }
    
    
}
