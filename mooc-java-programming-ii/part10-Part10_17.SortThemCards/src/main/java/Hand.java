
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        
        Iterator<Card> iterator = hand.iterator();
        
        while(iterator.hasNext()){
            Card next = iterator.next();
            System.out.println(next);
        }
        
    }
    
    public void sort(){
        //System.out.println("sort called");
       
        Collections.sort(hand, (c1,c2) -> c1.compareTo(c2));
        
        //System.out.println("");
                
        
    }
    
    public int sum(){
        int sum = 0;
        for(Card c : hand){
            sum += c.getValue();
        }
        
        return sum;
    }
    
    public void sortBySuit(){
        Collections.sort(hand, new BySuitInValueOrder());
    }
    
    @Override
    public int compareTo(Hand h){
        
        return sum()-h.sum();
    }
    
    
}
