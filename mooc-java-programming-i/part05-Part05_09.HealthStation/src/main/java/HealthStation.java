
public class HealthStation {
    private int weighings;
    

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighings++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        int w = person.getWeight();
        person.setWeight(w+1);
    }

    public int weighings(){
        return this.weighings;
    }
}
