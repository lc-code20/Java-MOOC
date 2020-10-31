/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author lwych
 */
public class ApplicationLogic {
    private UserInterface UI;

    public ApplicationLogic(UserInterface UI) {
        this.UI = UI;
    }
    
    public void execute(int times){
        
        for(int i=0; i<times; i++){
            System.out.println("Application logic is working");
            this.UI.update();
        }
    }
    
}
