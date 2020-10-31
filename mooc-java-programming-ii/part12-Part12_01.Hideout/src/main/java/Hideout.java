/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class Hideout<T> {
    private T element;
    
    public Hideout(){
        this.element = null;
    }
    
    public void putIntoHideout(T toHide){
        //if (this.element==null){
            this.element = toHide;
        //}
    }
    
    public T takeFromHideout(){
        T helper;
        if (this.element!=null){
            helper = this.element;
            this.element = null;
            return helper;
        }
        return null;
    }
    
    public boolean isInHideout(){
        if (this.element!=null){
            return true;
        }
        return false;
    }
    
    
    
}
