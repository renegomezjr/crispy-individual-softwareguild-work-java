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
public class Mod20Test {

    Mod20 testObj = new Mod20();

    public Mod20Test() {
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
    @Test
    public void testMod201() {
        Assert.assertFalse(testObj.Mod20(20));
    }
    @Test
    public void testMod202() {
        Assert.assertTrue(testObj.Mod20(21));
    }
    @Test
    public void hello() {
        Assert.assertTrue(testObj.Mod20(22));
    }
}
