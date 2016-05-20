/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.conditionals;

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
public class GotETest {

    public GotETest() {
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
    GotE testObj = new GotE();

    @Test
    public void testGotE1() {
        Assert.assertTrue(testObj.GotE("Hello"));
    }
    
    @Test
    public void testGotE2() {
        Assert.assertTrue(testObj.GotE("Heelle"));
    }
    
    @Test
    public void testGote3() {
        Assert.assertFalse(testObj.GotE("Heelele"));
    }
}
