/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rene Gomez
 */
public class LoveSixTest {
    LoveSix testObj = new LoveSix();
    
    @Test
    public void loveSixTest1(){
        Assert.assertTrue(testObj.LoveSix(6, 4));
    }
    
    @Test
    public void loveSixTest2(){
        Assert.assertFalse(testObj.LoveSix(4, 5));
    }
    
    @Test
    public void loveSixTest3(){
        Assert.assertTrue(testObj.LoveSix(1, 5));
    }
    
}
