package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        BorderPane FirstBorder = new BorderPane();
        Label FirstViewText = new Label("First View!");
        Button secondP = new Button("To the second view!");
        
        
        FirstBorder.setCenter(secondP);
        FirstBorder.setTop(FirstViewText);
        
        Button thirdP = new Button("To the third view!");
        
        VBox secondView = new VBox();
        secondView.getChildren().add(thirdP);
        secondView.getChildren().add(new Label("Second View!"));
        
        
        Button frontP = new Button("To the first view!");
        
        GridPane thirdV = new GridPane();
        thirdV.add(new Label("Third View!"), 0, 0);
        thirdV.add(frontP, 1,1);
        
        
        Scene first = new Scene(FirstBorder);
        Scene second = new Scene(secondView);
        Scene third = new Scene(thirdV);

        secondP.setOnAction((event) -> {
            window.setScene(second);
        });

        frontP.setOnAction((event) -> {
            window.setScene(first);
        });
        
        thirdP.setOnAction((event) -> {
            window.setScene(third);
        });
        
        
        
        

        window.setScene(first);
        window.show();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

}
