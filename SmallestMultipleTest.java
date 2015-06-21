/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smallestmultiple;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wilczewski
 */
public class SmallestMultipleTest {
    
    public SmallestMultipleTest() {
    }

    @Test
    public void testSmallestMultiple() {
        System.out.println("smallestMultiple");
        int upperLimit = 10;
        int expResult = 2520;
        int result = SmallestMultiple.smallestMultiple(upperLimit);
        assertEquals(expResult, result);
    }
}
