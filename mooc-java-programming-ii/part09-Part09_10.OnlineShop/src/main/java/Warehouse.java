
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Warehouse {
    private Map<String, Integer> warehouse;
    private Map<String, Integer> stockW;

    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.stockW = new HashMap<>();
    }
    
    
    
    public void addProduct(String product, int price, int stock){
        
        warehouse.put(product,price);
        stockW.put(product, stock);
        
    }
    
    public int price(String product){
        
        //if (warehouse.containsKey(product)){
            //return warehouse.get(product);
        //}
        
        return warehouse.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        
        return stockW.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        int stockNumber = stockW.getOrDefault(product,0);
        if (stockNumber>0){
            stockW.replace(product, stockNumber-1);
            return true;
        }     
        return false;
    }
    
    public Set<String> products(){
       
        return warehouse.keySet();
    }
    
}
