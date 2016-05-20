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
public class EveryNthTest {

    public EveryNthTest() {
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
    EveryNth testObj = new EveryNth();

    @Test
    public void testEveryNth1() {
        Assert.assertEquals("Mrce", testObj.EveryNth("Miracle", 2));
    }
    
    @Test
    public void testEveryNth2() {
        Assert.assertEquals("aceg", testObj.EveryNth("abcdefg", 2));
    }
    
    @Test
    public void testEveryNth3() {
        Assert.assertEquals("adg", testObj.EveryNth("abcdefg", 3));
    }
}
