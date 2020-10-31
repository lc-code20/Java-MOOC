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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ShanghaiApplication extends Application {
    
    private data d = new data();
    //private HashMap<String, Map<Integer, Double>> map;
    
    
    @Override
    public void start(Stage stage) {
    // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(2006,  2018, 4);
        NumberAxis yAxis = new NumberAxis();

    // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");


    // create the line chart. The values of the chart are given as numbers
    // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        XYChart.Series sData = new XYChart.Series();
        
        d.getMap().forEach((k,v)-> {      
            sData.getData().add(new XYChart.Data(k,v));
            System.out.println("key is " + k + "v is "+ v );
        });
        
        lineChart.getData().add(sData);

        
        
        
        /*
    // create the data set that is going to be added to the line chart
        XYChart.Series rkpData = new XYChart.Series();
        rkpData.setName("RKP");
    // and single points into the data set
        rkpData.getData().add(new XYChart.Data(1968, 5.6));
        rkpData.getData().add(new XYChart.Data(1972, 5.2));
        rkpData.getData().add(new XYChart.Data(1976, 4.7));
        rkpData.getData().add(new XYChart.Data(1980, 4.7));
        rkpData.getData().add(new XYChart.Data(1984, 5.1));
        rkpData.getData().add(new XYChart.Data(1988, 5.3));
        rkpData.getData().add(new XYChart.Data(1992, 5.0));
        rkpData.getData().add(new XYChart.Data(1996, 5.4));
        rkpData.getData().add(new XYChart.Data(2000, 5.1));
        rkpData.getData().add(new XYChart.Data(2004, 5.2));
        rkpData.getData().add(new XYChart.Data(2008, 4.7));

    // add the data set to the line chart
        lineChart.getData().add(rkpData);
        */
        /*
    // create another data set that's going to be added to the chart
        XYChart.Series vihrData = new XYChart.Series();
        vihrData.setName("VIHR");
    // and single data points into the data set
        vihrData.getData().add(new XYChart.Data(1984, 2.8));
        vihrData.getData().add(new XYChart.Data(1988, 2.3));
        vihrData.getData().add(new XYChart.Data(1992, 6.9));
        vihrData.getData().add(new XYChart.Data(1996, 6.3));
        vihrData.getData().add(new XYChart.Data(2000, 7.7));
        vihrData.getData().add(new XYChart.Data(2004, 7.4));
        vihrData.getData().add(new XYChart.Data(2008, 8.9));

    // add the data set to the line chart
        lineChart.getData().add(vihrData);
        */

    // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
}
    
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ShanghaiApplication.class);
    }

}
