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
public class Mod35Test {

    public Mod35Test() {
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
    Mod35 testObj = new Mod35();

    @Test
    public void testMod351() {
        Assert.assertTrue(testObj.Mod35(3));
    }
    
    @Test
    public void testMod352() {
        Assert.assertTrue(testObj.Mod35(10));
    }
    
    @Test
    public void testMod353() {
        Assert.assertFalse(testObj.Mod35(15));
    }
    
    @Test
    public void testMod354OnANumberThatIsNeither() {
        Assert.assertFalse(testObj.Mod35(17));
    }
}
