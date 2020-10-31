
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    
    public boolean equals(Object compared){
        
        if(compared == this){
            return true;
        }
        
        if(!(compared instanceof Person)){
            return false;
        }
        
        Person comparedP = (Person) compared;
        
        if(this.name.equals(comparedP.name) &&
           this.birthday.equals(comparedP.birthday)&&
           this.height == comparedP.height &&
           this.weight == comparedP.weight){
            
           return true;
        }
    
    
    return false;
    }
    
    public boolean twins(Object compared){
        
        Person comparedP = (Person) compared;
        
        if(this.birthday.equals(comparedP.birthday)){
            
           return true;
        }
        
        return false;
    }
}
