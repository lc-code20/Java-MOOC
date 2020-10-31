/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Cat extends Animal implements NoiseCapable {
    
    private String name;
    
    public Cat() {
        super("Cat");
    }
    
    public Cat(String name) {
        super(name);
    }
    
    public void purr(){
        System.out.println(getName()+ " purrs");
    }

    /*
    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }
    */
    
    @Override
    public void makeNoise(){
        purr();
    }
    
    
    
}
