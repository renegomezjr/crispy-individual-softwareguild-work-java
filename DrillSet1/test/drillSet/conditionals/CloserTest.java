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
public class CloserTest {

    public CloserTest() {
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
    Closer testObj = new Closer();

    @Test
    public void testCloser1() {
        Assert.assertEquals(8, testObj.Closer(8, 13));
    }
    @Test
    public void testCloser2() {
        Assert.assertEquals(8, testObj.Closer(13, 8));
    }
    @Test
    public void testCloser3() {
        Assert.assertEquals(0, testObj.Closer(13, 7));
    }
}
