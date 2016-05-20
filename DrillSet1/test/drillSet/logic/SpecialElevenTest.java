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
public class SpecialElevenTest {

    SpecialEleven testObj = new SpecialEleven();

    public SpecialElevenTest() {
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
    public void testSpecialEleven1() {
        Assert.assertTrue(testObj.SpecialEleven(22));
    }
    
    @Test
    public void testSpecialEleven2() {
        Assert.assertTrue(testObj.SpecialEleven(23));
    }
    
    @Test
    public void testSpecialEleven3() {
        Assert.assertFalse(testObj.SpecialEleven(24));
    }
}
