
import java.util.ArrayList;


public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;
    private ArrayList<String> completedExercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
        this.completedExercises = new ArrayList<>();
    }
    
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        
        for(Exercise i : this.exercises){
            list.add(i.getName());
        }
        
        return list;    
    }
    
    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }
    
   public void markAsCompleted(String exercise){
       for(Exercise i : exercises){
           if(i.getName().equals(exercise)){
               i.setCompleted(true);
           }
       }
       
       
   }
   
   public boolean isCompleted(String exercise){
       for(Exercise i : exercises){
           if(i.getName().equals(exercise)){
               return i.isCompleted();
           }
       }
       
       return false;
   }
}
