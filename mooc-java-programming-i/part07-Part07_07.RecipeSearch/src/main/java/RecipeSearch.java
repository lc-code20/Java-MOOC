
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("File to read: ");
        String fileName = scan.nextLine();
        
        ArrayList<Recipe> recipeList = readFromFile(fileName);
        IngredientsList listOfIngredients = readFromFile2(fileName);
        

        printCommands();
        
        while(true){
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scan.nextLine();
            if(command.equals("stop")){
               break;
            }
            if(command.equals("list")){
                printRecipes(recipeList);
            } else if (command.equals("find name")){
                System.out.print("Searched word: ");
                String input = scan.nextLine();
                findName(recipeList,input);
            } else if (command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int cookingTime = Integer.valueOf(scan.nextLine());
                findCookingTime(recipeList, cookingTime);
            } else if (command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String input = scan.nextLine();
                findByIngredient(listOfIngredients, recipeList, input);
            }
            
            
            
            
  
        }
                
  
    }
    
    public static ArrayList<Recipe> readFromFile(String fileName) {
        ArrayList<Recipe> recipeList = new ArrayList<>();
        IngredientsList listOfAllIngredients = new IngredientsList();
 
        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                
                String name = line;
                int cookingTime = Integer.valueOf(scan.nextLine());
                
                
                Ingredients ingredients = new Ingredients();
                
                while(scan.hasNextLine()){
                    String ingred = scan.nextLine();
                    
                    if (ingred.isEmpty()){
                        break;
                    }
                    
                    ingredients.add(ingred);
                    
                }
                
                listOfAllIngredients.add(ingredients);
              
                recipeList.add(new Recipe(name, cookingTime));
            }
        } catch (Exception e) {
            System.out.println("Failed to read from file.");
        }
 
        return recipeList;
 
    }
    
    public static IngredientsList readFromFile2(String fileName) {
        ArrayList<Recipe> recipeList = new ArrayList<>();
        IngredientsList listOfAllIngredients = new IngredientsList();
 
        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                
                String name = line;
                int cookingTime = Integer.valueOf(scan.nextLine());
                
                
                Ingredients ingredients = new Ingredients();
                while(scan.hasNextLine()){
                    String ingred = scan.nextLine();
                    
                    if (ingred.isEmpty()){
                        break;
                    }
                    
                    ingredients.add(ingred);
                    
                }
                
                listOfAllIngredients.add(ingredients);
              
                recipeList.add(new Recipe(name, cookingTime));
            }
        } catch (Exception e) {
            System.out.println("Failed to read from file.");
        }
 
        return listOfAllIngredients;
    }
    
    public static void printCommands(){
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
    

    private static void findName(ArrayList<Recipe> r, String input){
        
        if(input.equals(" ")){
            System.out.println("");
            System.out.println("Recipes:");
            return;
        }
        
        ArrayList<Recipe> helper = new ArrayList<>();
        
        for(Recipe i : r){
            if(i.getName().contains(input)){
                helper.add(i);
            }
        }
        
        printRecipes(helper);
        
    }
    
    private static void printRecipes(ArrayList<Recipe> r){

        System.out.println("");
            System.out.println("Recipes:");
            
            
            for(Recipe i : r){
                System.out.println(i);
            }
    }
    
    private static void findCookingTime(ArrayList<Recipe> r, int cT){
        
        ArrayList<Recipe> helper = new ArrayList<>();
        
        for(Recipe i : r){
            if(i.getCookingTime()<=cT){
                helper.add(i);
            }
        }
        
        printRecipes(helper);
    }
    
    private static void findByIngredient(IngredientsList r, ArrayList<Recipe> list ,String input){
        
        //System.out.println("list is " + r );
        //System.out.println("input is " + input);
        
        ArrayList<Integer> indices = new ArrayList<>();
        
        for(int i = 0; i<r.getSize();i++){
            //System.out.println("this is "+r.getIndex(i)); 
            for(int j = 0; j<r.getIndex(i).getSizeSeparate();j++){
                String ing = r.getIndex(i).getIndividIn(j);
                //System.out.println(ing); 
                if(input.equals(ing)){
                    indices.add(i);
                    //System.out.println("added");
                    //System.out.println("indices: "+indices);
                    //continue;
                }
            }    
        }
        //System.out.println("indices" + indices);
        
        ArrayList<Recipe> helper = new ArrayList<>();
        
        for(int k = 0; k<indices.size();k++){
            helper.add(list.get(indices.get(k)));  
        }
        
        //System.out.println("helper is: " + helper);
        
        printRecipes(helper);
        
        
    }
    

}
