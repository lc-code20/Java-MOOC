/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Debt {
    private double balance;
    private double iR;
    
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.iR = initialInterestRate;
    }
    
    public void printBalance(){
        System.out.println(this.balance);
    }
    
    public void waitOneYear(){
        this.balance = this.iR * this.balance;
    }
    
}
