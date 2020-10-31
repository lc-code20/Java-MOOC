
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
public class Recipe {
    private String name;
    private int cookingTime;
    //private IngredientsList ingredients;

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        //this.ingredients = new IngredientsList();
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

   // public IngredientsList getIngredients() {
       // return this.ingredients;
    //}

    //public void setIngredients(ArrayList<String> ingredients) {
      //  this.ingredients = ingredients;
    //}
    
   // public void printInList(){
        
      //  System.out.println("print" + this.ingredients.size());
       // for(int i = 0; i < this.ingredients.size();i++){
      //      System.out.println("here");
      //      System.out.println(this.ingredients.get(i));
      //  }
   // }

    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
    
    
    
}
