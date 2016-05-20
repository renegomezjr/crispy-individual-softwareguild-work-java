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
public class IcyHotTest {

    public IcyHotTest() {
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
    IcyHot testObj = new IcyHot();

    @Test
    public void testIcyHot1() {
        Assert.assertTrue(testObj.IcyHot(120, -1));
    }
    @Test
    public void testIcyHot2() {
        Assert.assertTrue(testObj.IcyHot(-1, 120));
    }
    @Test
    public void testIcyHot3() {
        Assert.assertFalse(testObj.IcyHot(2, 120));
    }
}
