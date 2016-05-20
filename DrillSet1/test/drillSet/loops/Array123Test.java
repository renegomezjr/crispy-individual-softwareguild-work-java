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
public class Array123Test {
    Array123 testObj = new Array123();
    
    public Array123Test() {
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
    public void testArray123v1() {
        int[] arr = {1, 1, 2, 3, 1};
        Assert.assertTrue(testObj.Array123(arr));
    }
    @Test
    public void testArray123v2() {
        int[] arr = {1, 1, 2, 4, 1};
        Assert.assertFalse(testObj.Array123(arr));
    }
    @Test
    public void testArray123v3() {
        int[] arr = {1, 1, 2, 1, 2, 3};
        Assert.assertTrue(testObj.Array123(arr));
    }
    @Test
    public void testArray123v4NumbersVerySeparated() {
        int[] arr = {1, 1, 2, 1,0, 2, 0 , 0 , 0, 3, };
        Assert.assertTrue(testObj.Array123(arr));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
