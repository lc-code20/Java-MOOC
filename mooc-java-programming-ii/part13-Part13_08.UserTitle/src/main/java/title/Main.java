package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        Application.launch(UserTitle.class,
            "--title="+input);
    }

}
