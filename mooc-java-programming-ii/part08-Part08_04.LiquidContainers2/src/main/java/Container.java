/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Container {
    int volume;

    public Container() {
        this.volume = 0;
    }
    
    public void add(int v){
        if(v>0){
            this.volume += v;
            if(this.volume>100){
                this.volume = 100;
            }
        }
    }

    public int contains() {
        return this.volume;
    }
    
    public void move(int r, Container L){
        if (r>0){
            if(this.volume<r){
                L.add(this.volume);
                this.volume = 0;
            } else{
                this.volume -= r;
                if(this.volume<0){
                    this.volume = 0;
                }
                L.add(r);
            }  
        }
            
            
            
    }
    
    public void remove(int amount){
        if (amount>0){
            this.volume -= amount;
            if(this.volume<0){
                this.volume = 0;
            }
        }
        
    }

    @Override
    public String toString() {
        return this.volume + "/100";
    }
    
    
    
}
