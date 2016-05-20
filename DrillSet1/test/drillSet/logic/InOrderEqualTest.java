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
public class InOrderEqualTest {

    public InOrderEqualTest() {
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
    InOrderEqual testObj = new InOrderEqual();

    @Test
    public void testInOrderEqual1() {
        Assert.assertTrue(testObj.InOrderEqual(2, 5, 11, false));
    }
    @Test
    public void testInOrderEqual2() {
        Assert.assertFalse(testObj.InOrderEqual(5, 7, 6, false));
    }
    @Test
    public void testInOrderEqual3() {
        Assert.assertTrue(testObj.InOrderEqual(5, 5, 7, true));
    }
}
