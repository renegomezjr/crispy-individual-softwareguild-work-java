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
//Given an array of ints, figure out which is larger between the first and last elements in the array, and set all the other elements to be that value. Return the changed array. 
//
//HigherWins({1, 2, 3}) -> {3, 3, 3}
//HigherWins({11, 5, 9}) -> {11, 11, 11}
//HigherWins({2, 11, 3}) -> {3, 3, 3}

public class HigherWinsTest {
    HigherWins testObj = new HigherWins();
    
    public HigherWinsTest() {
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
    public void higherWins() {
        int[] testResults = {3, 3, 3};
        int[] params = {1, 2, 3};
        Assert.assertArrayEquals(testResults, testObj.higherWins(params));
    }
    
    @Test
    public void higherFourWins() {
        int[] testResults = {11, 11, 11,11};
        int[] params = {1, 11, 3, 4};
        Assert.assertArrayEquals(testResults, testObj.higherWins(params));
    }
    
    @Test
    public void higherFiveWins() {
        int[] testResults = {9,9,9,9,9};
        int[] params = {1, 2, 3, 8, 9};
        Assert.assertArrayEquals(testResults, testObj.higherWins(params));
    }
    
    @Test
    public void higherDoesntWins() {
        int[] testResults = {2, 2, 2};
        int[] params = {1, 2, 3};
        Assert.assertNotEquals(testResults, testObj.higherWins(params));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
