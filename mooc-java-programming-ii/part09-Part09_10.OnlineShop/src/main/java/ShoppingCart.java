
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class ShoppingCart {
    private Map<String,Item> shoppingCart;
    //private String product;
    //private int price;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }
    
    public void add(String product, int price){
        
        if(!this.shoppingCart.containsKey(product)){
            Item item = new Item(product, 1, price);
            this.shoppingCart.put(product, item);
        }
        
        else if(this.shoppingCart.containsKey(product)){
           this.shoppingCart.get(product).increaseQuantity();
        }
        
        
        //this.shoppingCart.put(product, item);
        
    }
    
    public int price(){
        int price = 0;
        for (Item i : this.shoppingCart.values()){
            price += i.price();
        }
        
        return price;
    }
    
    public void print(){
        for (Item i : this.shoppingCart.values()){
            System.out.println(i);
        }
        
    }
    
    
}
