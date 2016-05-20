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
public class MaxTest {

    public MaxTest() {
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
    Max testObj = new Max();

    @Test
    public void testMax1() {
        Assert.assertEquals(3, testObj.Max(1, 2, 3));
    }
    @Test
    public void testMax2() {
        Assert.assertEquals(3, testObj.Max(1, 3, 2));
    }
    @Test
    public void testMax3() {
        Assert.assertEquals(3, testObj.Max(3, 2, 1));
    }
    @Test
    public void testMax4AllTheSame() {
        Assert.assertEquals(-1, testObj.Max(3, 3, 3));
    }
    @Test
    public void testMax5FirstAndLastTheSame() {
        Assert.assertEquals(-1, testObj.Max(3, 1, 3));
    }
    @Test
    public void testMax5SecondAndLastTheSame() {
        Assert.assertEquals(-1, testObj.Max(1, 3, 3));
    }
}
