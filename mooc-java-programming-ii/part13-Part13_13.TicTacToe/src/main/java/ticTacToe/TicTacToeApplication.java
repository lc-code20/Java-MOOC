package ticTacToe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application{
    
    private String[][] game;
    private int count;
    private int value;
    //private ticTacToeGame game;
    
    @Override
    public void init() throws Exception {
        // Create game
        this.game = new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};    
        this.count = 0;
    }
    
    @Override
    public void start (Stage stage) throws Exception{

        BorderPane layout = new BorderPane();
        
        Label gameMessage = new Label("Turn: X");
        
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                Button b = new Button(" ");
                b.setFont(Font.font("Monospaced", 40));
                grid.add(b, i, j);
                
                int helperI = i;
                int helperJ = j;
                //int value = 0;
                b.setOnAction((event)->{
                    count++;
                    String s = "X";
                    String t;
                    
                    if (count%2==0){
                        //System.out.println(count);
                        s = "O";
                        t = "X";
                    } else {
                        t = "O";
                        //System.out.println(count);
                    }
                    
                    b.setText(s);
                    //game[helperI][helperJ] = s;
                    gameMessage.setText("Turn: " + t );
                    
                    if(count==9){
                        gameMessage.setText("The end!");
                    }
                    b.setDisable(true);
                }); 
            } 
        }
        
        // Format layer
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        
        // Set gameMessage at the top
        layout.setTop(gameMessage);
           
        
        // Set grid in center
        layout.setCenter(grid);


        // Create main scene with layout 
        Scene scene = new Scene(layout);


        // Show the main scene
        stage.setScene(scene);
        stage.show();
    
    }
    

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
    }

}
