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

/**
 *
 * @author Rene Gomez
 */
public class RollDiceTest {
    
    public RollDiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    RollDice testObj = new RollDice();
    
     @Test
     public void testRollDice1() {
        Assert.assertEquals(5, testObj.RollDice(2, 3, true)); 
     }
     
     @Test
     public void testRollDice2() {
        Assert.assertEquals(7, testObj.RollDice(3, 3, true)); 
     }
     
     @Test
     public void testRollDice3() {
        Assert.assertEquals(6, testObj.RollDice(3, 3, false)); 
     }
}
