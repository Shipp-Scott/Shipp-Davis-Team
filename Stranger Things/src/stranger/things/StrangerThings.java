/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stranger.things;

import byui.cit260.strangerThings.model.Player;
import byui.cit260.strangerThings.model.Game;
import byui.cit260.strangerThings.model.Character;
import byui.cit260.strangerThings.model.Items;
import byui.cit260.strangerThings.model.Location;
import byui.cit260.strangerThings.model.Map;
import byui.cit260.strangerThings.model.Questions;
import byui.cit260.strangerThings.model.Weapon;

/**
 *
 * @author sshipp57
 */
public class StrangerThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Mike Wheeler");
        playerOne.setBestTime(10.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Game gameOne = new Game();
        
        gameOne.setTotalTime(35.00);
        gameOne.setNoPeople(1);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }
    
}
