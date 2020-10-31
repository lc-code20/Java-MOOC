
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
public class gradeList {
    private ArrayList<Grade> gList;
    private ArrayList<Grade> gListPass;
    private double sum;
    private double sumP;
    private int grade5;
    private int grade4;
    private int grade3;
    private int grade2;
    private int grade1;
    private int grade0;

    public gradeList() {
        gList = new ArrayList<>();
        gListPass = new ArrayList<>();
        this.sum = 0;
        this.sumP = 0;
        this.grade5 = 0;
        this.grade4 = 0;
        this.grade3 = 0;
        this.grade2 = 0;
        this.grade1 = 0;
        this.grade0 = 0;
    }

    public ArrayList<Grade> getgList() {
        return this.gList;
    }

    public double getSum() {
        return this.sum;
    }
    
    public void add(int points){
        
        if (points>=0 && points<=100){
            
            int grade = pointsToGrade(points);
            
            this.gList.add(new Grade(points,grade));
            
            this.sum+= points;
            
            if (points>=50){
                this.gListPass.add(new Grade(points,grade));
                this.sumP += points;
            }
           
        }
    }
    
    public int pointsToGrade(int points){
        if(points>=90){
                this.grade5++;
                return 5;
            } else if(points>=80){
                this.grade4++;
                return 4;
            } else if(points>=70){
                this.grade3++;
                return 3;
            } else if(points>=60){
                this.grade2++;
                return 2;
            } else if(points>=50){
                this.grade1++;
                return 1;
            } else{
                this.grade0++;
                return 0;
            }      
    }
    
    public double average(){
        return Math.round(1.0*sum/this.gList.size());
    }
    
    public double averagePass(){
        return Math.round(1.0*sumP/gListPass.size());
    }
    
    public String passPercentage(){
        if(gList.size()==0){
            return "-";
        }
        
        return String.valueOf(100.0*gListPass.size()/gList.size());
    }
    
    public void printStar(int count){
        
        for(int i = 0; i < count; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public void printGradeD(){
        System.out.println("Grade distribution:");
        System.out.print("5:");
        printStar(grade5);
        System.out.print("4:");
        printStar(grade4);
        System.out.print("3:");
        printStar(grade3);
        System.out.print("2:");
        printStar(grade2);
        System.out.print("1:");
        printStar(grade1);
        System.out.print("0:");
        printStar(grade0);
        
        
    }

    @Override
    public String toString() {
        return "gradeList{" + "gList=" + gList + ", gListPass=" + gListPass + ", sum=" + sum + '}';
    }
     
     

   
     
     
    
    
    
}
