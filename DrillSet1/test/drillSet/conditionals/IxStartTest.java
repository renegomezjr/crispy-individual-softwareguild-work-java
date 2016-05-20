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
public class IxStartTest {

    public IxStartTest() {
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
    IxStart testObj = new IxStart();

    @Test
    public void testIxStart1() {
        Assert.assertTrue(testObj.IxStart("mix snacks"));
    }
    @Test
    public void testIxStart2() {
        Assert.assertTrue(testObj.IxStart("pix snacks"));
    }
    @Test
    public void testIxStart3() {
        Assert.assertFalse(testObj.IxStart("piz snacks"));
    }
}
