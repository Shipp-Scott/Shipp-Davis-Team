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
        System.out.println("\nThe three main characters are Mike, Dustin, "
                + "\nand Lucas are out on an Adventure because they lost Eleven"
                + "\nThey are out in the woods with the monster, other creatures, and other "
                + "\nobstacles such as government officials and the Sheriff. You will explore "
                + "\nthe map seeking required items in order to destroy the monster while avoiding "
                + "\nthe Sheriff and the government. Using simple commands you will move your characters "
                + "\nin order to complete the tasks that are needed to complete the game. Take one wrong "
                + "\nturn the game is OVER!");
    }

    private void backStory() {
        System.out.println("\nStranger things is an American science fiction-horror"
                + "\nweb television series created by the Duffer Brothers. "
                + "\nThe plot follows the disappearance of a young boy, and a "
                + "\ntelekinetic girl who helps his friends in their search, while "
                + "\nthe boy's older brother, his mother, and the town police chief "
                + "\nstart their own investigations");
    }

    private void howToMove() {
        System.out.println("\nCharacters will all be moving together "
                + "\none space at a time. The arrow keys on the keyboard "
                + "\nwill be used to move the team/characters.");
    }

    private void listInventoryMap() {
        System.out.println("\nThe list of inventory on the map shows you what "
                + "\nitems you have on the map to make weapons but doesn’t show you "
                + "\nthe location of these items on the map.");
    }

    private void howToManufacture() {
        System.out.println("\nThroughout the game, objects for making weapons will "
                + "\nbe at randomized places on the map. You are to gather as many "
                + "\nobjects as possible without getting caught by the sheriff, government "
                + "\nand monster. The more objects you have, the more powerful your weapon becomes.");
    }
  
}

