
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String print = "";
        String items = "";
        
        if(this.elements.isEmpty()){
            print = "The collection " + this.name + " is empty.";
            
            return print;
        }
        
        if(this.elements.size()==1){
            print = "The collection " + this.name + " has 1 element:\n" + this.elements.get(0);
        }
        
        for(String items2 : this.elements){
            items = items + items2+"\n";
        }
        
        if(this.elements.size()>1){
            print = "The collection " + this.name + " has "+this.elements.size()+ " elements:\n" + items;
        }
        
        return print;
    }
    
    
}
