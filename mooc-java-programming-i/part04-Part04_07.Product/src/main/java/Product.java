/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Product {
    private double price;
    private int quant;
    private String name;
   
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.quant = initialQuantity;        
    }
    
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price +", " + this.quant +" pcs");
    }
    
}
