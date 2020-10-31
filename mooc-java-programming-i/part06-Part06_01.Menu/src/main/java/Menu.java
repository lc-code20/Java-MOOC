
import java.util.ArrayList;
import java.util.Objects;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){
        if(!this.meals.contains(meal)){
            this.meals.add(meal);   
        }
    }
    
    public void printMeals(){
        for(String i:this.meals){
            System.out.println(i);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Menu other = (Menu) obj;
        if (this.meals == null) {
            if (other.meals != null)
                return false;
        } else if (!this.meals.equals(other.meals))
            return false;
        return true;
    }
    
    
    
    

    
}
