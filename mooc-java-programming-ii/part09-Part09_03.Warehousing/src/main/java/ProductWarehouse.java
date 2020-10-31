/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class ProductWarehouse extends Warehouse {
    private String pName;
    
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.pName = productName;
    }
    
    
    public String getName(){
        return this.pName;
    }
    
    public void setName(String newName){
        this.pName = newName;
    }

    @Override
    public String toString() {
        return this.pName + ": " + super.toString();
    }
    
    
}
