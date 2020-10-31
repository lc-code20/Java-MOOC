/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author lwych
 */
public class AverageSensor implements Sensor {
    //private boolean state;
    private List<Sensor> list;
    private List<Integer> list2;
    

    public AverageSensor() {
        //this.state = false;
        this.list = new ArrayList<>();
        this.list2 = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.list.add(toAdd);
    }
    
    public List<Integer> readings(){
        
        return this.list2;
    }
    
    
    @Override
    public int read(){
        if (!isOn()||list.isEmpty()){
            throw new IllegalStateException();
        }
        
        int holder = 0;
        int counter = 0;
        for (Sensor i : list){
            holder += i.read();
            counter++;
        }
        
        this.list2.add(holder/counter);
        
        return holder/counter;
    }
    
    public boolean isOn(){
        boolean state = true;
        
        for (Sensor i : list){
            if (!i.isOn()){
                state = false;
            }
        }
        
        return state;
    }
    
    public void setOn(){
        //this.state = true;
        for (Sensor i : list){
            i.setOn();
        }
        
    }
    
    public void setOff(){
        //this.state = false;
        for (Sensor i : list){
            i.setOff();
        }
    }
}
