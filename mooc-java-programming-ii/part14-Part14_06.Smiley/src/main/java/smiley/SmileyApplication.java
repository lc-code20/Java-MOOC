package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {
        
    @Override
    public void start(Stage stage){
        
        BorderPane layout = new BorderPane();
        
        Canvas canvas = new Canvas(640, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        gc.setFill(Color.BLACK);
        gc.fillRect(200.0, 200.0, 50, 50);
        gc.fillRect(400, 200, 50, 50);
        gc.fillRect(150, 400, 50, 50);
        gc.fillRect(450, 400, 50, 50);
        gc.fillRect(200, 450, 250, 50);
        
        
        layout.setCenter(canvas);
        
        Scene view = new Scene(layout);
        
        stage.setScene(view);
        stage.show();
    
    
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SmileyApplication.class);
    }

}
