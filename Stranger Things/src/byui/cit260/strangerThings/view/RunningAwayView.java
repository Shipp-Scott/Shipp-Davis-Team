/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.view;

import byui.cit260.strangerThings.control.MapControl;
import java.util.Scanner;

/**
 *
 * @author sshipp57
 */
public class RunningAwayView {
    
    private String runAway;
    
    public RunningAwayView(){
        this.runAway = "\nThe group of boys accelerate away                        "
                     + "\nfrom the monster from _m/s";
    }
    
    void displayRunningAwayView(){
    
        boolean done = false;
        do {
            
            String runningAwayOption = this.getRunnnigAwayOption();
            if (runningAwayOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(runningAwayOption);
        } while (!done);
    }

    private String getRunnnigAwayOption() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.runAway);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvaild value: value can not be blank");
                continue;
            }
            
            break;
           }
        return value;
    }

    private boolean doAction(String runningAwayOption) {
        
        double finalVelocity = Double.parseDouble(runningAwayOption);
        
        this.runAway = "\nto _m/s";
        String secondInput = this.getRunnnigAwayOption();
        double initialVelocity = Double.parseDouble(secondInput);
        
        this.runAway = "in _seconds           "
                     + "\nHow fast do the boys need to accelerate away from danger?";
        String thirdInput = this.getRunnnigAwayOption();
        double time = Double.parseDouble(thirdInput);
        
         
        
        
        double result = MapControl.calcRunningAway(finalVelocity, initialVelocity, time);
        
        if (result < 0){
            System.out.println("\nOops! Something went wrong! ");
            return false;
        } else
            System.out.println("\nWow! You accelerated away from the monster"
                              + "\nfast enough. You are safe!");
            return true;
        
    }
}
