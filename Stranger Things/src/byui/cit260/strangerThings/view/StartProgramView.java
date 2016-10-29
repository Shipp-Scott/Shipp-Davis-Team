/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.view;

import byui.cit260.strangerThings.control.GameControl;
import byui.cit260.strangerThings.model.Player;
import java.util.Scanner;

/**
 *
 * @author sshipp57
 */
public class StartProgramView {

    private final String promptMessage;

    public StartProgramView() {
        // promptMessage = "Please enter your name"
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view is created
        this.displayBanner();
    }
    
    private void displayBanner() {
        
        System.out.println(
                "\n******************************************************************"
               +"\n* Stranger things is a text based role playing game from the     *"
               +"\n* events in the Netflix original series Stranger Things.         *"
               +"\n* You will be taking the role of 3 children named Mike, Lucas    *"
               +"\n* and Dustin. One of their friends went missing and Mike,        *"
               +"\n* Lucas, and Dustin suspect foul play. While investigating       *"
               +"\n* they cross paths with another child named Eleven who has       *"
               +"\n* telekinesis powers. She helps Mike, Lucas, and Dustin discover *"
               +"\n* that their friend was taken by a monster! They will have to    *"
               +"\n* device a rescue plan to find a way to defeat the Monster       *"
               +"\n* while avoiding the government and the Sheriff. While on your   *"
               +"\n* journey you lost Eleven but are still looking for the required *"
               +"\n* items to defeat the monster. If ther governement finds you     *"
               +"\n* then you will be taken. If the local sheriff finds you then he *"
               +"\n* he will send you home and your adventure will be over! As you  *"
               +"\n* explore the map you will search for the required items and     *"
               +"\n* build your master weapon. In this game you will start your     *"
               +"\n* journey with a flashlight and a choice of an weapon item. You  *"
               +"\n* will move as a team in order to accomplish your goal of        *"
               +"\n* defeating the monster. Throughout the map there will be items  *"
               +"\n* placed that you can find in order to make your master weapon.  *"
               +"\n* The route you take and the weapon you make is up to you.       *"
               +"\n*                                                                *"
               +"\n******************************************************************"
               
               
               
               
        
        
        
        
        
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false;
        do {
            
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
        
        } while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
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
    

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid Players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null){
            System.out.println("/nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n========================================="
                            + "\n Welcome to the game " + player.getName()
                            + "\n We hope you have a lot of fun!"
                            + "\n======================================"
                            );
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }

   
}
