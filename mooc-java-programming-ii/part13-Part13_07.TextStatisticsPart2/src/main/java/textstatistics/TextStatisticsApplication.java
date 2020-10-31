package textstatistics;

import java.util.Arrays;
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

public class TextStatisticsApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane componentGroup = new BorderPane();
        TextArea textArea = new TextArea();
        componentGroup.setCenter(textArea);
        Label lettersC = new Label("Letters: 0");
        Label wordsC = new Label("Words: 0");
        Label longestC = new Label("The longest word is: ");
        
        
        HBox hbox = new HBox();
        hbox.setSpacing(20);
        hbox.getChildren().add(lettersC);
        hbox.getChildren().add(wordsC);
        hbox.getChildren().add(longestC);
        
        componentGroup.setBottom(hbox);
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
        int characters = newValue.length();
        String[] parts = newValue.split(" ");
        int words = parts.length;
        String longest = Arrays.stream(parts)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .findFirst()
            .get();

            // set values of text elements
            
            lettersC.setText("Letters: " + characters);
            wordsC.setText("Words: " + words);
            longestC.setText("The longest word is: " + longest);
        });
        
        
        
        Scene viewport = new Scene(componentGroup);
 
        stage.setScene(viewport);
        stage.show();
    }
 
    

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    
}
