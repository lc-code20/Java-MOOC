package application;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {
  
    private data d = new data();
    
    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Year");
 
        yAxis.setLabel("Relative support (%)");
 
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support in the years 1968-2008");
        
        d.initialize();
        
        // data has been read earlier -- the following object contains the data
        Map<String, Map<Integer, Double>> values = d.getMap();

        // go through the parties and add them to the chart
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            if(!party.toString().equals("Party")){
                XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                if(party.toString().equals("Party")){
                System.out.println("party check 2");
                }
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
                System.out.println("key: " + pair.getKey() );
                System.out.println("value: " + pair.getValue() );
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
            }
            

        });
 
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(PartiesApplication.class);
    }

}
