/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stranger.things;

import byui.cit260.strangerThings.model.Game;
import byui.cit260.strangerThings.model.Player;
import byui.cit260.strangerThings.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author sshipp57
 */
public class StrangerThings {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
 
    private static PrintWriter logFile = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        StrangerThings.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        StrangerThings.player = player;
    }
    
       public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        StrangerThings.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        StrangerThings.inFile = inFile;
    }
    
    public static PrintWriter getLogFile(){
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile) {
        StrangerThings.logFile = logFile;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            
            //open character stream files for end user input and output
            StrangerThings.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            
            StrangerThings.outFile = new PrintWriter(System.out, true);
       
            //open log file
            String filePath = "log.txt";
            StrangerThings.logFile = new PrintWriter(filePath);
            
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    } catch (Throwable e) {
        
        System.out.println("Exception: " + e.toString() +
                           "\nCause: " + e.getCause() +
                           "\nMessage: " + e.getMessage());
    }
        finally {
            try {
                if (StrangerThings.inFile != null)
                    StrangerThings.inFile.close();
                
                if (StrangerThings.outFile != null)
                    StrangerThings.outFile.close();
                
                if (StrangerThings.logFile != null)
                    StrangerThings.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
    
}
