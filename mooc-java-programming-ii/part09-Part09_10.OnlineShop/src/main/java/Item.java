/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Item {
    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int quantity, int unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return this.quantity*this.unitPrice;
    }
    
    public void increaseQuantity(){
        this.quantity +=1;
    }

    @Override
    public String toString() {
        return product + ": " + quantity;
    }
    
    
}
