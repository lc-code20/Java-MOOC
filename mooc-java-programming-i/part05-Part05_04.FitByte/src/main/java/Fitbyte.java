/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Fitbyte {
    private int age;
    private int rHR;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.rHR = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double mHR = 206.3 - (0.711*this.age);
        
        return ((mHR-rHR)*percentageOfMaximum+rHR);   
    }
    
}
