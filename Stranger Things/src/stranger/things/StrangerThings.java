/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stranger.things;

import byui.cit260.strangerThings.model.Player;

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
    }
    
}
