/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import stranger.things.StrangerThings;

/**
 *
 * @author Cache
 */
public abstract class View implements ViewInterface {
    
    private String message;
    
    protected final BufferedReader keyboard = StrangerThings.getInFile();
    protected final PrintWriter console = StrangerThings.getOutFile();
    
    public View(){
        
    }
    
}
