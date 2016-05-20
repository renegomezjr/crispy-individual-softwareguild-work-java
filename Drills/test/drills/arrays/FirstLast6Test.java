/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drills.arrays;

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
public class FirstLast6Test {
    FirstLast6 testObj = new FirstLast6();
    
    public FirstLast6Test() {
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
    // @Test
    // public void hello() {}
    @Test
    public void testWithThreeItemsInArray(){
        int[] testArray = {1,2,6};
        Assert.assertTrue(testObj.firstLast6(testArray));
    }
    
     @Test
    public void testWithFourItemsInArray(){
        int[] testArray = {6, 1, 2, 3};
        Assert.assertTrue(testObj.firstLast6(testArray));
    }
    
     @Test
    public void testWithFiveItemsInArray(){
        int[] testArray = {13, 6, 1, 2, 3};
        Assert.assertFalse(testObj.firstLast6(testArray));
    }
    
    
}
