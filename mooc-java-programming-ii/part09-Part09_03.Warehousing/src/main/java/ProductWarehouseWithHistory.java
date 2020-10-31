/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory c;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        setBalance(initialBalance);
        this.c = new ChangeHistory();
        this.c.add(initialBalance);
    }
    
    public String history(){
        return c.toString();
    }
    
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.c.add(getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        double i = super.takeFromWarehouse(amount);
        this.c.add(getBalance());
        return i;
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+ getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + c.maxValue());
        System.out.println("Smallest amount of product: " + c.minValue());
        System.out.println("Average: " + c.average());
    }
    
}
