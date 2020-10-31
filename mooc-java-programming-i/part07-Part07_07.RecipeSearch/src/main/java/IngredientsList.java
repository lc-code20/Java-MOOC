
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
public class IngredientsList {
    private ArrayList<Ingredients> ingredients;
    private String RName;

    public IngredientsList() {
        this.ingredients = new ArrayList<>();
        this.RName = "";
    }

    public ArrayList<Ingredients> getIngredients2() {
        return this.ingredients;
    }
    
    public void add(Ingredients ingred){
        //System.out.println("added");
        this.ingredients.add(ingred);
    }
    
    public void setRecipeName(String name){
        this.RName = name;
    }
    
    public int getSize(){
        return this.ingredients.size();
    }
    
    public Ingredients getIndex(int i){
        return this.ingredients.get(i);
    }
    
    

    @Override
    public String toString() {
        return "IngredientsList{"  + this.ingredients + " "+this.RName;
    }

    
    
    
}
