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
public class EndUpTest {

    public EndUpTest() {
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
    EndUp testObj = new EndUp();

    @Test
    public void testEndUp1() {
        Assert.assertEquals("HeLLO", testObj.EndUp("Hello"));
    }
    
    @Test
    public void testEndUp2() {
        Assert.assertEquals("hi thERE", testObj.EndUp("hi there"));
    }
    
    @Test
    public void testEndUp3() {
        Assert.assertEquals("HI", testObj.EndUp("hi"));
    }
}
