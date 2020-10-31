package application;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {
    
    private int newV;
    private double helper;
    
    public void start(Stage stage) {
        
        HashMap<Integer,Double> values = new HashMap<>();
        int value = 0;
        BorderPane border = new BorderPane();
        
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings");
        //lineChart.setLegendVisible(false);
        XYChart.Series monthly = new XYChart.Series<>();
        monthly.setName("Monthly");
        
        for (int i = 0; i <= 30; i++){    
            monthly.getData().add(new XYChart.Data(i,i*12*25));
        }
        
        lineChart.getData().add(monthly);
        
        VBox vbox = new VBox();
        BorderPane topB = new BorderPane();
        BorderPane bottomB = new BorderPane();
        
        topB.setLeft(new Label("Monthly savings"));
        
        Slider slider = new Slider();
        slider.setMin(25);
        slider.setMax(250);
        slider.setValue(25);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        topB.setCenter(slider);
        
        Label topValue = new Label(
            Double.toString(slider.getValue()));
        topB.setRight(topValue);        
        
        XYChart.Series yearlyI = new XYChart.Series<>();
        
        double minMax = 0.0;
        //helper = 12*25;
        
        double cashFlowI = 12*25;
        double interestI = 0.1;
        
        for (int i = 0; i <= 30; i++){
            
            double fv = (1+interestI)*cashFlowI * ((Math.pow((1.0+interestI), i)-1)/interestI);
            
            yearlyI.getData().add(new XYChart.Data(i,fv));
            //minMax = 1.1*(minMax+12*25);
        }

        
        slider.valueProperty().addListener((change, oldValue, newValue) -> {
            topValue.setText(String.format("%.1f", newValue));
            
            newV = newValue.intValue();
         
            
            XYChart.Series helper = new XYChart.Series<>();
            for(int i = 0; i <= 30;i++){
               helper.getData().add(new XYChart.Data(i,i*12*Double.parseDouble(newValue.toString())));
            }
            
            monthly.setData(helper.getData());
            
        });
       
        

        bottomB.setLeft(new Label("Yearly interest rate"));   
        Slider slider2 = new Slider();
        slider2.setMin(0);
        slider2.setMax(10);
        slider2.setValue(0);
        slider2.setShowTickLabels(true);
        slider2.setShowTickMarks(true);
        bottomB.setCenter(slider2);
        Label bottomValue = new Label(
            Double.toString(slider2.getValue()));
        bottomB.setRight(bottomValue);
        
        
        
        
        
        slider2.valueProperty().addListener((change, oldValue, newValue) -> {
            bottomValue.setText(String.format("%.1f", newValue));
             
            //Double startV;
            XYChart.Series helper = new XYChart.Series<>();
            //for(int i = 0; i <= 30;i++){
               //helper.getData().add(new XYChart.Data(i,i*12*Math.pow(1.0+Double.parseDouble(newValue.toString())/100,i)*newV));
                //System.out.println(newValue.intValue());
                //System.out.println(i*12*(1.0*Double.parseDouble(newValue.toString())/100)*newV);
                
            //}
            
            double minMax2 = 0.0;
            
            double interest = newValue.doubleValue()/100;
            
            double cashFlow = 12*newV;
            
            if(newV<25){
                cashFlow = 12*25;
            }
            
            for (int i = 0; i <= 30; i++){
                
                double fv = (1.0+interest)*cashFlow * ((Math.pow((1.0+interest), i)-1)/interest);
                
                helper.getData().add(new XYChart.Data(i, fv));
                        
                yearlyI.setData(helper.getData());
            }
            
        });
            
        
        lineChart.getData().add(yearlyI);
        
        vbox.getChildren().add(topB);
        vbox.getChildren().add(bottomB);
        
       
        border.setCenter(lineChart);
        border.setTop(vbox);
        
        border.setPadding(new Insets(20, 20, 20, 20));
        
        Scene view = new Scene(border);
        stage.setScene(view);
        stage.show();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SavingsCalculatorApplication.class);
    }
    
    

}
