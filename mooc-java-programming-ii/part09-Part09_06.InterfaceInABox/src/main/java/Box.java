
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
public class Box implements Packable {
    private ArrayList<Packable> box;
    private double maxW;
    
    public Box(double maxW) {
        this.box = new ArrayList<>();
        this.maxW = maxW;
    }
    
    public int getSize(){
        return this.box.size();
    }
    
    public double weight(){
        double w = 0;
        for (Packable i : this.box){
            w += i.weight();
        }
        
        return w;
    }
    
    public void add(Packable p){
        if (weight() + p.weight() < this.maxW){
            this.box.add(p);
        }
    }

    @Override
    public String toString() {
        return "Box: " + getSize() + " items, total weight " + weight() + " kg";
    }
    
    
}
