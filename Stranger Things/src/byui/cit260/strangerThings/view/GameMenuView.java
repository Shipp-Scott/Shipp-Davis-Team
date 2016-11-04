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
public class GameMenuView {
    
    private final String gameMenu;
   
   public GameMenuView(){
    this.gameMenu = "\n"
              + "\n-----------------------------------------"
              + "\n|  Game Menu                             |"
              + "\n-----------------------------------------"
              + "\nM - Move                                 "
              + "\nI - Inventory                            "
              + "\nV - View Map                             "
              + "\nS - Save Game                            "
              + "\nH - Help Menu                            "
              + "\nW - Manufacture Weapon                   "
              + "\nL - Look for items                       "
              + "\nT - View Weapon Status                   "
              + "\nQ - Quit                                 "
              + "\n-----------------------------------------";
   }

    void displayGameMenu() {
        
        boolean done = false;
        do {
            
            String gameMenuOption = this.getgameMenuOption();
            if (gameMenuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(gameMenuOption);
        } while (!done);
    }

    private String getgameMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.gameMenu);
            
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
            case "M":
                this.movePlayer();
                break;
            case "I":
                this.viewInventory();
                break;
            case "V":
                this.viewMap();
                break;
            case "S":
                this.saveGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "W":
                this.manufactureWeapon();
                break;
            case "L":
                this.lookItems();
                break;
            case "T":
                this.weaponStatus();
                break;
            default:
                System.out.println("\n*** Invaild selection *** Try again");
                break;
                
        }
        return false;
    }

    private void movePlayer() {
        System.out.println("\n*** movePlayer stub function called ***");

    }

    private void viewInventory() {
        System.out.println("\n*** viewInventory stub function called ***");

    }

    private void viewMap() {
        System.out.println("\n*** viewMap stub function called ***");

    }

    private void saveGame() {
        System.out.println("\n*** saveGame stub function called ***");

    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.displayHelpMenuView();
    }

    private void manufactureWeapon() {
        System.out.println("\n*** manufactureWeapon stub function called ***");

    }

    private void lookItems() {
        System.out.println("\n*** lookItems stub function called ***");

    }

    private void weaponStatus() {
        System.out.println("\n*** weaponStstus stub function called ***");

    }
    
}
