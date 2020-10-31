
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
public class Herd implements Movable{
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        
        herd.add(movable);
        
    }
    
    @Override
    public void move(int dx, int dy){
        
        for (Movable m : herd){
            m.move(dx, dy);
        }
        
    }

    @Override
    public String toString() {
        String string = "";
        
        for (Movable m : herd){
            string = m + "\n" + string;
            //System.out.println(string);
        }
           
        return string;
    }
    
    
    
    
}
