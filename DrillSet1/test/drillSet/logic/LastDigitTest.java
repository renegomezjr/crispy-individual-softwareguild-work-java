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
public class LastDigitTest {

    public LastDigitTest() {
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
    LastDigit testObj = new LastDigit();

    @Test
    public void testLastDigit1() {
        Assert.assertTrue(testObj.LastDigit(23, 19, 13));
    }
    
    @Test
    public void testLastDigit2() {
        Assert.assertFalse(testObj.LastDigit(23, 19, 12));
    }
    
    @Test
    public void testLastDigit3() {
        Assert.assertTrue(testObj.LastDigit(23, 19, 3));
    }
}
