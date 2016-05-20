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
public class AreInOrderTest {

    public AreInOrderTest() {
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
    AreInOrder testObj = new AreInOrder();

    @Test
    public void testAreInOrder1() {
        Assert.assertTrue(testObj.AreInOrder(1, 2, 4, false));
    }
    @Test
    public void testAreInOrder2() {
        Assert.assertFalse(testObj.AreInOrder(1, 2, 1, false));
    }
    @Test
    public void testAreInOrder3() {
        Assert.assertTrue(testObj.AreInOrder(1, 1, 2, true));
    }
}
