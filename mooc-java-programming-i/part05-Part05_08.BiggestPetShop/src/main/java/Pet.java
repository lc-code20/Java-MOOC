
public class Pet {

    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    
    public Pet(){
        this("name","breed");
    }
    

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

}
