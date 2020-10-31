/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Data implements Comparable<Data> {
    private String country;
    private int year;
    private String gender;
    private double percent;

    public Data(String country, int year, String gender, double percent) {
        this.country = country;
        this.year = year;
        
        String[] genderA = gender.split(" ");
        
        this.gender = genderA[0];
        this.percent = percent;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        
        
        return gender;
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + percent;
    }
    
    @Override
    public int compareTo(Data d){
        
        if(this.percent > d.getPercent()){
            return 1;
        } else if (this.percent < d.getPercent()){
            return -1;
        }
            
        
        return 0;
    }
    
    
}
