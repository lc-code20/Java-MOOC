
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Ingredients {
    private ArrayList<String> ingredients;
    

    public Ingredients() {
        this.ingredients = new ArrayList<>();
        //this.RName = r;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public void add(String ingredient){
        this.ingredients.add(ingredient);
    }

   public String getIndividIn(int i) {
        return this.ingredients.get(i);
    }
   public int getSizeSeparate(){
        return this.ingredients.size();
    }
        
    
    @Override
    public String toString() {
        return "recipe separate{" + ingredients + '}';
    }
    
    
}
