package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage window) {
    TextField topText = new TextField();
    Label bottomText = new Label();
    Button button = new Button("Update");

    button.setOnAction((event) -> {
        bottomText.setText(topText.getText());
    });

    VBox componentGroup = new VBox();
    //componentGroup.setSpacing(20);
    componentGroup.getChildren().addAll(topText, button, bottomText);

    Scene scene = new Scene(componentGroup);

    window.setScene(scene);
    window.show();
}

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        launch(NotifierApplication.class);
    }

}
