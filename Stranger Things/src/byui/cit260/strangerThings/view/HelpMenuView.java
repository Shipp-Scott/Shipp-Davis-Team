/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.view;

import java.util.Scanner;

/**
 *
 * @author sshipp57
 */
public class HelpMenuView {
    
   private final String helpMenu;
   
   public HelpMenuView(){
    this.helpMenu = "\n"
              + "\n-----------------------------------------"
              + "\n|  Help Menu                            |"
              + "\n-----------------------------------------"
              + "\nG - What is the goal of the game?        "
              + "\nS - The backstory to Stranger Things     "
              + "\nM - How to move?                         "
              + "\nL - List of inventory on map             "
              + "\nB - How to manufacture upgraded weapons? "
              + "\nQ - Quit                                 "
              + "\n-----------------------------------------";
   }

    void displayHelpMenuView() {
        
        boolean done = false;
        do {
            
            String helpMenuOption = this.gethelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(helpMenuOption);
        } while (!done);
    }

    private String gethelpMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.helpMenu);
            
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.goalGame();
                break;
            case "S":
                this.backStory();
                break;
            case "M":
                this.howToMove();
                break;
            case "L":
                this.listInventoryMap();
                break;
            case "B":
                this.howToManufacture();
                break;
            default:
                System.out.println("\n*** Invaild selection *** Try again");
                break;
                
        }
        return false;
    }

    private void goalGame() {
        System.out.println("*** goalGame function called");
    }

    private void backStory() {
        System.out.println("*** backStory function called");
    }

    private void howToMove() {
        System.out.println("*** howToMove function called");
    }

    private void listInventoryMap() {
        System.out.println("*** listInventoryMap function called");
    }

    private void howToManufacture() {
        System.out.println("*** howToManufacture function called");
    }
  
}

