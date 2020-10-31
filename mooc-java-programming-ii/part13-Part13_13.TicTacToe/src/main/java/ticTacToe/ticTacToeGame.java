/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.ArrayList;

/**
 *
 * @author lwych
 */
public class ticTacToeGame {
    int[][] game;
    String sign;
    
    public ticTacToeGame(){
        this.game = new int[3][3];
        this.sign = "X";
    }
    
    
    
  
    public String getCurrentSign(){
        return this.sign;
    }
    
    public void printGame(){
        System.out.println(this.game);
    }
  
    
}
