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
public class TakeTwoFromPositionTest {
    TakeTwoFromPosition testObj = new TakeTwoFromPosition();
    
    @Test
    public void takeTwoFromPositionTest1(){
        Assert.assertEquals("ja", testObj.TakeTwoFromPosition("java", 0));
    }
    
    @Test
    public void takeTwoFromPositionTest2(){
        Assert.assertEquals("va", testObj.TakeTwoFromPosition("java", 2));
    }
    
    @Test
    public void takeTwoFromPositionTest3(){
        Assert.assertEquals("ja", testObj.TakeTwoFromPosition("java", 3));
    }
}
