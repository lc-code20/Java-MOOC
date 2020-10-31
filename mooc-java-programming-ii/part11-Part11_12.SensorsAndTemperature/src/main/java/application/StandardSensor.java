/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author lwych
 */
public class StandardSensor implements Sensor{
    private int param;

    public StandardSensor(int param) {
        this.param = param;
    }
    
    @Override
    public boolean isOn(){
        return true;
    }
    
    public void setOn(){
        return;
    }
    
    public void setOff(){
        return;
    }
    
    public int read(){
        if (!isOn()){
            throw new IllegalStateException();
        } //else throw exception
        return this.param;
    }
    
    
}
