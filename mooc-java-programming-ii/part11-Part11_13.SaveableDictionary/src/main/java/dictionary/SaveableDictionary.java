/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lwych
 */
public class SaveableDictionary {
    private List<Word> dictionary;
    private String fileName;
    
    public SaveableDictionary() {
        
        dictionary = new ArrayList<>();
        
    }
    
    public SaveableDictionary(String file){
        dictionary = new ArrayList<>();
        this.fileName = file;
    }
    
    public boolean load(){
        
        String fileNameH = this.fileName;
        
        
       try (Scanner fileReader = new Scanner(Paths.get(fileNameH))){
           
           while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character

                //System.out.println(parts[0]);     // part of line before :
                //System.out.println(parts[1]);     // part of line after :
                
                Word newWord = new Word(parts[0],parts[1]);
                dictionary.add(newWord);
           }
           
           return true;
           
       
       }
       catch(Exception e){
           return false;
       }
        
    }
    
    public boolean save(){
        
        try {
            writeToFile(fileName);
            return true;
        } catch (Exception ex) {
            return false;
        }
        
        
        
        //return true;
    }
    
    public void writeToFile(String fileName) throws Exception {
        PrintWriter writer = new PrintWriter(fileName);
        
        for(Word i : dictionary){
            writer.println(i);
        }
        
        writer.close();
    }
    
    
    public void add(String words, String translation){
        
        if (containsN(words)!=null){
            return;
        }
        
        Word w = new Word(words, translation);
        dictionary.add(w);
        
    }
    
    public String translate(String word){
        
        if (containsN(word)!=null){
            return containsN(word).getTranslation();
        }
        
        if (containsN2(word)!=null){
            return containsN2(word).getWord();
        }
        
        
        return null;
    }
    
    public Word containsN(String word){
        
        for (Word i : dictionary){
            if(i.getWord().equals(word)){
                return i;
            }
        }
        return null; 
    }
    
    public Word containsN2(String word){
        
        for (Word i : dictionary){
            if(i.getTranslation().equals(word)){
                return i;
            }
        }
        return null; 
    }
    
    public void delete(String word){
        
        if (containsN(word)!=null){
            dictionary.remove(containsN(word));
        }
        
        if (containsN2(word)!=null){
            dictionary.remove(containsN2(word));
        }
        
        
    }
    
    /*private Map dictionary;
    

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        
    }
    
    public void add(String words, String translation){
        
        if (this.dictionary.containsKey(words)){
            return;
        }
        
        this.dictionary.put(words, translation);
        //this.dictionary.put(translation, words);
    }
    
    public String translate(String word){
        
        if (this.dictionary.get(word)!= null){
            return this.dictionary.get(word).toString();
        }
        
        if(this.dictionary.containsValue(word)){
            return "need key";
        }
        
        return null;
    }
    
    public void delete(String word){
        
        if(this.dictionary.containsKey(word)){
            this.dictionary.remove(word);
        }
        
        if(this.dictionary.containsValue(word)){
            Object  i = this.dictionary.get(word);
            this.dictionary.remove(i);
        }
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.dictionary);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SaveableDictionary other = (SaveableDictionary) obj;
        if (!Objects.equals(this.dictionary, other.dictionary)) {
            return false;
        }
        return true;
    }
    
    
    */
    
    
    
    
    
}
