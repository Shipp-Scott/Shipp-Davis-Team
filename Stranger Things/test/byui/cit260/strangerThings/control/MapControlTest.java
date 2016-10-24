/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sshipp57
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcRunningAway method, of class MapControl.
     */
    @Test
    public void testCalcRunningAway() {
        System.out.println("calcRunningAway");
        
        System.out.println("\tTest case #1");
        
        
        double finalvelocity = 8.0;
        double initialvelocity = 5.0;
        double time = 5.0;
        
        MapControl instance = new MapControl();
        
        
        double expResult = 0.6000;
        double result = instance.calcRunningAway(finalvelocity, initialvelocity, time);
        assertEquals(expResult, result, 0.0);
        
        
        // Test 2
        
        System.out.println("\tTest case #2");
        
        
        finalvelocity = 8.0;
        initialvelocity = -1.0;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalvelocity, initialvelocity, time);
        assertEquals(expResult, result, 0.0);
        
        
        // Test 3
        
        System.out.println("\tTest case #3");
        
        
        finalvelocity = -1.0;
        initialvelocity = 5.0;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalvelocity, initialvelocity, time);
        assertEquals(expResult, result, 0.0);
        
        
        // Test 4
        
        System.out.println("\tTest case #4");
        
        
        finalvelocity = 30;
        initialvelocity = 35;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalvelocity, initialvelocity, time);
        assertEquals(expResult, result, 0.0);
       
        
        // Test 5
        
        System.out.println("\tTest case #5");
        
        
        finalvelocity = 8.0;
        initialvelocity = 0.0;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalvelocity, initialvelocity, time);
        assertEquals(expResult, result, 0.0);
        
        
        // Test 6
        
        System.out.println("\tTest case #6");
        
        
        finalvelocity = 0.0;
        initialvelocity = 5.0;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalvelocity, initialvelocity, time);
        assertEquals(expResult, result, 0.0);
       
        
        //Test 7
        
        System.out.println("\tTest case #7");
        
        
        finalvelocity = 30.0;
        initialvelocity = 35.0;
        time = 5.0;
        
        expResult = -1;
        result = instance.calcRunningAway(finalvelocity, initialvelocity, time);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of calcFightingMonster method, of class MapControl.
     */
    @Test
    public void testCalcFightingMonster() {
        System.out.println("calcFightingMonster");
        System.out.println("\tTest case #1");
        
        
        double mass = 10.0;
        double velocity = 3.0;
        double time = 2.0;
        
        MapControl instance = new MapControl();
        double expResult = 15.0;
        
        double result = instance.calcFightingMonster(mass, velocity, time);
        assertEquals(expResult, result, 0.0);
        
        // Test 2
        
        System.out.println("\tTest case #2");
        
        mass = -1.0;
        velocity = 3.0;
        time = 2.0;
        
          
        expResult = -1.0;
        
        result = instance.calcFightingMonster(mass, velocity, time);
        assertEquals(expResult, result, 0.0);
        
        // Test 3
        
        System.out.println("\tTest case #3");
        
        mass = 10.0;
        velocity = -1.0;
        time = 2.0;
        
          
        expResult = -1.0;
        
        result = instance.calcFightingMonster(mass, velocity, time);
        assertEquals(expResult, result, 0.0);
        
        // Test 4
        
        System.out.println("\tTest case #4");
        
        mass = 50.0;
        velocity = 35.0;
        time = 2.0;
        
          
        expResult = -1.0;
        
        result = instance.calcFightingMonster(mass, velocity, time);
        assertEquals(expResult, result, 0.0);
        
        // Test 5
        
        System.out.println("\tTest case #5");
        
        mass = 0.0;
        velocity = 3.0;
        time = 2.0;
        
          
        expResult = -1.0;
        
        result = instance.calcFightingMonster(mass, velocity, time);
        assertEquals(expResult, result, 0.0);
        
        // Test 6
        
        System.out.println("\tTest case #6");
        
        mass = 10.0;
        velocity = 0.0;
        time = 2.0;
        
          
        expResult = -1.0;
        
        result = instance.calcFightingMonster(mass, velocity, time);
        assertEquals(expResult, result, 0.0);
        
        // Test 7
        
        System.out.println("\tTest case #7");
        
        mass = 50.0;
        velocity = 35.0;
        time = 2.0;
        
          
        expResult = -1.0;
        
        result = instance.calcFightingMonster(mass, velocity, time);
        assertEquals(expResult, result, 0.0);
        
    }
   
}
