
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);
        Person luke = new Person("Luke", date, 63, 10);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct? Expected no print out");
        }       

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct? Leo weight check");
        }
        
        if(leo.twins(luke)){
            System.out.println("Potential twins");
        }
        
    }
}
