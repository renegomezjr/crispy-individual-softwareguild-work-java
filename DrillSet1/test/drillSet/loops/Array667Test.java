/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class Array667Test {
    Array667 testObj = new Array667();
    
    public Array667Test() {
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
    
    @Test
    public void testArray6671() {
        int[] arr = {6, 6, 2};
        Assert.assertEquals(1, testObj.Array667(arr));
    }
    
    @Test
    public void testArray6672() {
        int[] arr = {6, 6, 2, 6};
        Assert.assertEquals(1, testObj.Array667(arr));
    }
    
    @Test
    public void testArray6673() {
        int[] arr = {6, 7, 2, 6};
        Assert.assertEquals(1, testObj.Array667(arr));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
