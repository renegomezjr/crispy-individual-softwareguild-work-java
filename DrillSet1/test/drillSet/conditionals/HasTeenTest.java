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
public class HasTeenTest {

    public HasTeenTest() {
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
    HasTeen testObj = new HasTeen();

    @Test
    public void testHasTeen1() {
        Assert.assertTrue(testObj.HasTeen(13, 20, 10));
    }
    
    @Test
    public void testHasTeen2() {
        Assert.assertTrue(testObj.HasTeen(20, 19, 10));
    }
    
    @Test
    public void testHasTeen3() {
        Assert.assertFalse(testObj.HasTeen(20, 10, 12));
    }
}
