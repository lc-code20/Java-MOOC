/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String iTitle, int iPages, int iYear){
        this.title = iTitle;
        this.pages = iPages;
        this.year = iYear;
    }
    
    public String getName(){
        return this.title;
    }
    
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
