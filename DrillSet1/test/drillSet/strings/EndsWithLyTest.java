/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class EndsWithLyTest {
    
    EndsWithLy testObj = new EndsWithLy();
            
    @Test
    public void endWithLyTest1(){
        Assert.assertTrue(testObj.EndsWithLy("oddly"));
    }
    
    @Test
    public void endWithLyTest2(){
        Assert.assertFalse(testObj.EndsWithLy("y"));
    }
    
    @Test
    public void endWithLyTest3(){
        Assert.assertFalse(testObj.EndsWithLy("oddy"));
    }
    
}
