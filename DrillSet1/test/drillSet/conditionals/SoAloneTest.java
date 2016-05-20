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
public class SoAloneTest {

    public SoAloneTest() {
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
    SoAlone testObj = new SoAlone();

    @Test
    public void testSoAlone1() {
        Assert.assertTrue(testObj.SoAlone(13, 99));
    }
    @Test
    public void testSoAlone2() {
        Assert.assertTrue(testObj.SoAlone(21, 19));
    }
    @Test
    public void testSoAlone3() {
        Assert.assertFalse(testObj.SoAlone(13, 13));
    }
}
