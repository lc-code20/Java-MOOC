/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author lwych
 */
public class data {
    private String data;
    private HashMap<Integer, Integer> map;
    
    public data(){
        this.data = "2007 73\n" +
        "2008 68\n" +
        "2009 72\n" +
        "2010 72\n" +
        "2011 74\n" +
        "2012 73\n" +
        "2013 76\n" +
        "2014 73\n" +
        "2015 67\n" +
        "2016 56\n" +
        "2017 56";
        this.map = new HashMap<>();
    }
    
    public HashMap getMap(){
        List<String> pieces = Arrays.asList(data.split("\n"));
        
        for (int i = 0; i < pieces.size(); i++) {
            String[] parts = pieces.get(i).split(" ");
            map.put(Integer.valueOf(parts[0]), Integer.valueOf(parts[1]));          
        }
        
        return map;
    }
    
}
    
    
    

