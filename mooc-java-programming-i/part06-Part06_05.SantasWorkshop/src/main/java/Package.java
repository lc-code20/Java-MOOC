/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author lwych
 */
public class Package {
    private ArrayList<Gift> list;
    //private int i;

    public Package() {
        this.list = new ArrayList<>();
        //this.i =0;
    }

    
    public void addGift(Gift gift){
        this.list.add(gift);
    }
    
    public int totalWeight(){
        int tW=0;
        for(Gift g : this.list){
            tW += g.getWeight();
        }
        
      return tW;
    }
}
