
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
public class Bird {
    private String name;
    private String latinName;
    private ArrayList<String> observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void addObservation(String obs) {
        this.observations.add(obs);
    }
    
    public int observationCount(){
        return this.observations.size();
    }
    
    //public void add(Bird bird){
      
    //}
    
    public boolean birdExists(String search){
        return this.name.contains(search);
    }

    @Override
    public String toString() {
        return name + " (" + latinName + "): " + observationCount() + " observations";
    }
    
    
    
    
    
    
}
