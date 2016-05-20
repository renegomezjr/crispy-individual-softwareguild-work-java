/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.arrays;

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

//Given an array of ints, return the sum of all the elements. 
//
//Sum({1, 2, 3}) -> 6
//Sum({5, 11, 2}) -> 18
//Sum({7, 0, 0}) -> 7
//
//public int Sum(int[] numbers) {
//
//}
public class sumTest {
    Sum testObj = new Sum();
    
    public sumTest() {
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
    
    @Test
    public void sumTestThreeSmall(){
        int testInt = 6;
        int[] testArr = {1, 2, 3};
        
        Assert.assertEquals(testInt, testObj.sum(testArr));
    }
    
    @Test
    public void sumTestFour(){
        int testInt = 117;
        int[] testArr = {5, 11, 2, 99};
        
        Assert.assertEquals(testInt, testObj.sum(testArr));
    }
    
    @Test
    public void sumTestTen(){
        int testInt = 41;
        int[] testArr = {1, 2, 3, 1, 2, 9, 11, 2, 9, 1};
        
        Assert.assertEquals(testInt, testObj.sum(testArr));
    }
    
    @Test
    public void sumTestTenLargeFalse(){
        int testInt = 6;
        int[] testArr = {1949, 25757, 3544, 1157, 2565, 995, 11, 2, 995, 11};
        
        Assert.assertNotEquals(testInt, testObj.sum(testArr));
    }



    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
