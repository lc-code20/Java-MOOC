
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
public class BoxWithMaxWeight extends Box {
    private int maxW;
    private ArrayList<Item> BoxMax;
    
    public BoxWithMaxWeight(int i) {
        this.maxW = i;
        this.BoxMax = new ArrayList<>();
    }

    @Override
    public boolean isInBox(Item item){
        
        for(Item i : BoxMax){
            if (i.equals(item)){
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public void add(Item item){
        int itemW = item.getWeight();
        
        if (itemW > maxW){
            //System.out.println("too heavy, not added");
            return;
        }
        
        BoxMax.add(item);
        maxW -= itemW;
        //System.out.println("added, new weight: " + this.currentW);
        
    }
         
    
    
}
