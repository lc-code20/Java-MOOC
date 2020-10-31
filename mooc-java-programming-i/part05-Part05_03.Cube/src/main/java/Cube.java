/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Cube {
    private int l;
    
    public Cube (int edgeLength){
        this.l = edgeLength;
    }
    
    public int volume(){
        return this.l*this.l*this.l;
    }
    
    public String toString(){
        return "The length of the edge is " + this.l + " and the volume "+this.l*this.l*this.l;
    }
}
