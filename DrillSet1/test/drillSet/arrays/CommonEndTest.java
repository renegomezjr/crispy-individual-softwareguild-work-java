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
import static org.junit.Assert.*;

/**
 *
 * @author Rene Gomez
 */
//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more. 
//
//CommonEnd({1, 2, 3}, {7, 3}) -> true
//CommonEnd({1, 2, 3}, {7, 3, 2}) -> false
//CommonEnd({1, 2, 3}, {1, 3}) -> true
public class CommonEndTest {
    CommonEnd testObj = new CommonEnd();
    
    public CommonEndTest() {
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
    public void commonEndLast(){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 3};
        
        Assert.assertTrue(testObj.commonEnd(arr1, arr2));
    }
    
    @Test
    public void commonEndFalse(){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 3, 2};
        
        Assert.assertFalse(testObj.commonEnd(arr1, arr2));
    }
    
    @Test
    public void commonEndTrueFirst(){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 3};
        
        Assert.assertTrue(testObj.commonEnd(arr1, arr2));
    }
    
    @Test
    public void commonEndTrueLong(){
        int[] arr1 = {1, 2, 5, 3};
        int[] arr2 = {0, 8,3,4,5,6,4,4,3,1, 3};
        
        Assert.assertTrue(testObj.commonEnd(arr1, arr2));
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
