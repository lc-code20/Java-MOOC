/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lwych
 */
public class data {
  private String data;
    private HashMap<String, Map<Integer, Double>> map;
    private HashMap<Integer, Double> vMap;
    private ArrayList list;
    private ArrayList list2;
    private ArrayList list3;
    private ArrayList list4;
    private ArrayList list5;
    private ArrayList list6;
    private ArrayList list7;
    private ArrayList list8;
    private ArrayList list9;
    private ArrayList list10;
    private ArrayList list11;
    private ArrayList list12;
    private ArrayList listOfL;

    public data(){
        
        listOfL = new ArrayList<>();
        list = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        list4 = new ArrayList<>();
        list5 = new ArrayList<>();
        list6 = new ArrayList<>();
        list7 = new ArrayList<>();
        list8 = new ArrayList<>();
        list9 = new ArrayList<>();
        list10 = new ArrayList<>();
        list11 = new ArrayList<>();
        list12 = new ArrayList<>();
        
        try(Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))){
            
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                
                
                String[] pieces = row.split("\t");
                list.add(pieces[0]);
                list2.add(pieces[1]);
                list3.add(pieces[2]);
                list4.add(pieces[3]);
                list5.add(pieces[4]);
                list6.add(pieces[5]);
                list7.add(pieces[6]);
                list8.add(pieces[7]);
                list9.add(pieces[8]);
                list10.add(pieces[9]);
                list11.add(pieces[10]);
                list12.add(pieces[11]);
            }
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        
        this.vMap = new HashMap<>();
        this.map = new HashMap<>();
        
        //listIntoHash();
        
        //listOfL.add(list);
        listOfL.add(list2);
        listOfL.add(list3);
        listOfL.add(list4);
        listOfL.add(list5);
        listOfL.add(list6);
        listOfL.add(list7);
        listOfL.add(list8);
        listOfL.add(list9);
        listOfL.add(list10);
        listOfL.add(list11);
        listOfL.add(list12);
        //listOfL.add(list);
        
        //method();
    }

    
    public void printList(List l){
        
        for (Object s : l){
            System.out.println(s.toString());
        }   
    }
    
    public HashMap listIntoHash(List l, HashMap m, int j){

            if(l.get(j).toString().equals("-")){
                return m ;
            }
                
            m.put(Integer.valueOf(l.get(0).toString()), Double.valueOf(l.get(j).toString()));
            
        return m;
    }
    
    public void initialize(){
        
        for (int i = 0; i < list.size();i++){
            method(i);
        }

    }
    
    public void method(int i){
        
        HashMap<Integer, Double> helper = new HashMap<>();
        helper.clear();
        
        for (Object j : listOfL){
            listIntoHash((List) j, helper, i);
        }
      
        map.put(list.get(i).toString(), helper);
        System.out.println(list.get(i).toString());
        
    }
    
    

    public HashMap<String, Map<Integer, Double>> getMap() {
        return map;
    }

    public HashMap<Integer, Double> getvMap() {
        return vMap;
    }

    public ArrayList getList() {
        return list;
    }

    public ArrayList getList2() {
        return list2;
    }

    public ArrayList getList3() {
        return list3;
    }

    public ArrayList getList4() {
        return list4;
    }

    public ArrayList getList5() {
        return list5;
    }

    public ArrayList getList6() {
        return list6;
    }

    public ArrayList getList7() {
        return list7;
    }

    public ArrayList getList8() {
        return list8;
    }

    public ArrayList getList9() {
        return list9;
    }

    public ArrayList getList10() {
        return list10;
    }

    public ArrayList getList11() {
        return list11;
    }
    
    public ArrayList getListX() {
        return listOfL;
    }
    
    

  
    
}
    
    
    

