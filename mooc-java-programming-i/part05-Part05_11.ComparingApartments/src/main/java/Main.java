
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoRoomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeRoomApt = new Apartment(3, 78, 2500);
        
        //System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt)); // false
        //System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt)); // true
        
        //System.out.println(manhattanStudioApt.priceDifference(atlantaTwoRoomApt));  //71600
        //System.out.println(bangorThreeRoomApt.priceDifference(atlantaTwoRoomApt));   //35400
        
        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoRoomApt));  // true
        System.out.println(bangorThreeRoomApt.moreExpensiveThan(atlantaTwoRoomApt));   // false
        //System.out.println("m " + manhattanStudioApt);
        //System.out.println("a " +);
        //System.out.println("b " +);
    }
}
