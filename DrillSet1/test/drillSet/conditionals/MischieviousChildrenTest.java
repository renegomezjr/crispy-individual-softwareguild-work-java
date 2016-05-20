/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.conditionals;

import drillSet.conditionals.MischieviousChildren;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class MischieviousChildrenTest {
    

    MischieviousChildren testObj = new MischieviousChildren();
    
    @Test
    public void MischieviousChildrenTest1(){
        Assert.assertTrue(testObj.AreWeInTrouble(true, true));
    }
    
    @Test
    public void MischieviousChildrenTest2(){
        Assert.assertTrue(testObj.AreWeInTrouble(false, false));
    }
    
    @Test
    public void MischieviousChildrenTest3(){
        Assert.assertFalse(testObj.AreWeInTrouble(true, false));
    }
    
    
}
