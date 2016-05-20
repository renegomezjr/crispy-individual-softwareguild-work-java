package drillSet.arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
//Given an array of ints length 3, return a new array with the elements in reverse order, so for example {1, 2, 3} becomes {3, 2, 1}. 
//

public class ReverseTest {
    Reverse testObj = new Reverse();
    
    public ReverseTest() {
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
    public void reverseThreeTest(){
        int[] testArr = {3, 2, 1};
        int[] params = {1, 2, 3};
        Assert.assertArrayEquals(testArr, testObj.reverse(params));
    }
    
    @Test
    public void reverseFourTest(){
        int[] testArr = {3, 2, 1,0};
        int[] params = {0,1, 2, 3};
        Assert.assertArrayEquals(testArr, testObj.reverse(params));
    }
    
    @Test
    public void reverseFiveTest(){
        int[] testArr = {3, 2, 1,0,9};
        int[] params = {9,0,1, 2, 3};
        Assert.assertArrayEquals(testArr, testObj.reverse(params));
    }
    
    @Test
    public void reverseFiveFalseTest(){
        int[] testArr = {3, 2, 1,0,9};
        int[] params = {0,9,1, 2, 3};
        Assert.assertNotEquals(testArr, testObj.reverse(params));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
