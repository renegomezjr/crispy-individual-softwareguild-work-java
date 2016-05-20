/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.logic;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class PlayOutsideTest {
    PlayOutside testObj = new PlayOutside();
    
    @Test
    public void playOutsideTest1(){
        Assert.assertTrue(testObj.PlayOutside(70, false));
    }
    
    @Test
    public void playOutsideTest2(){
        Assert.assertFalse(testObj.PlayOutside(95, false));
    }
    
    @Test
    public void playOutsideTest3(){
        Assert.assertTrue(testObj.PlayOutside(95, true));
    }
    

}
