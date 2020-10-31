
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
public class OneItemBox extends Box {
    private ArrayList<Item> Box;
    
    public OneItemBox(){
        this.Box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.Box.isEmpty()){
            Box.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        for(Item i : Box){
            if (i.equals(item)){
                return true;
            }
        }
        return false;
    }
    
    
}
