
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
public class Hold {
    private int maxW;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxW) {
        this.maxW = maxW;
        suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitc){
        //int currentW2 = 0;
        
        if(suitcases.isEmpty()){
            suitcases.add(suitc);
            //currentW2 = item.getWeight();
            return;
        }
        
        if(getCurrentWS() + suitc.getCurrentW()>maxW){
            return;
        }
        
        suitcases.add(suitc);
        //currentW2 += item.getWeight();
        
    }
    
    public int getCurrentWS(){
        int currentW = 0;
        for(Suitcase i:suitcases){
            
            currentW += i.getCurrentW();
        }
        
        return currentW;
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + getCurrentWS() + " kg)";
    }
    
    public void printItems(){
        for(Suitcase i : suitcases){
            i.printItems();
        }
    }
    
    
    
    
    
    
}
