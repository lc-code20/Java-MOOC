
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
public class Suitcase {
    private ArrayList<Item> list;
    private int maxW;
    private int currentW;
    //private String items;

    public Suitcase(int maxW) {
        this.maxW = maxW;
        list = new ArrayList<>();
    }
    
    public void addItem(Item item){
        //int currentW2 = 0;
        
        if(list.isEmpty()){
            list.add(item);
            //currentW2 = item.getWeight();
            return;
        }
        
        if(getCurrentW() + item.getWeight()>maxW){
            return;
        }
        
        list.add(item);
        //currentW2 += item.getWeight();
        
    }
    
    public int getCurrentW(){
        int currentW = 0;
        for(Item i:list){
            
            currentW += i.getWeight();
        }
        
        return currentW;
    }

    @Override
    public String toString() {
        
        if(list.size()==0){
            return "no items ("+ getCurrentW() + " kg)";
        }
        
        if(list.size()==1){
            return list.size() + " item (" + getCurrentW() + " kg)";
        }
        
        return list.size() + " items (" + getCurrentW() + " kg)";
    }
    
    public void printItems(){
        for(Item i : list){
            System.out.println(i);
        }
        
    }
    
    public int totalWeight(){
        return getCurrentW();
    }
    
    public Item heaviestItem(){
        
        if(list.isEmpty()){
            return null;
        }
        
        Item hI = list.get(0);
        
        for(Item i : list){
            if(hI.getWeight()< i.getWeight()){
                hI = i;
            }
        }
        
        
        return hI; 
    }
}
