
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Grade {
    private int points;
    private int grades;
    
    
    
    public Grade(int points, int grades) {
        this.points = points;
        this.grades = grades;
    }

    public int getPoints() {
        return this.points;
    }

    public int getGrades() {
        return this.grades;
    }

    @Override
    public String toString() {
        return "Grade{" + "points=" + points + ", grades=" + grades + '}';
    }
    
    
    
    
}
