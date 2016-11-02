/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.view;

import byui.cit260.strangerThings.control.GameControl;
import java.util.Scanner;
import stranger.things.StrangerThings;

/**
 *
 * @author sshipp57
 */
public class MainMenuView {
    
   private final String menu;
   
   public MainMenuView(){
    this.menu = "\n"
              + "\n--------------------------------"
              + "\n|  Main Menu                   |"
              + "\n--------------------------------"
              + "\nN - New Game                    "
              + "\nS - Save Game                   "
              + "\nR - Restore Existing Game       "
              + "\nH - Help Menu                   "
              + "\nE - Exit Game                   "
              + "\n--------------------------------";
   }
    
   
    public void displayMainMenuView() {
 
        boolean done = false;
        do {
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
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
            case "N":
                this.startNewGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "R":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invaild selection *** Try again");
                break;
                
        }
        return false;
    }

    private void startNewGame() {
        
        GameControl.createNewGame(StrangerThings.getPlayer());
        
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called");
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called");
    }

    private void displayHelpMenu() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.displayHelpMenuView();
    }
    
}
