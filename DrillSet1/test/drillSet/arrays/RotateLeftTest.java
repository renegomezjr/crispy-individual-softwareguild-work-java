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
//Given an array of ints, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}. 
//
//RotateLeft({1, 2, 3}) -> {2, 3, 1}
//RotateLeft({5, 11, 9}) -> {11, 9, 5}
//RotateLeft({7, 0, 0}) -> {0, 0, 7}

public class RotateLeftTest {
    RotateLeft testObj = new RotateLeft();
    
    public RotateLeftTest() {
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
    public void rotateLeftTest() {
        int[] testArr = {2, 3, 1};
        int[] params = {1, 2, 3};
        Assert.assertArrayEquals(testArr, testObj.rotateLeft(params));
    }
    
    @Test
    public void rotateLeftFourTest() {
        int[] testArr = {5, 11, 9, 1};
        int[] params = {1, 5, 11, 9};
        Assert.assertArrayEquals( testArr, testObj.rotateLeft(params));
    }
    
    @Test
    public void rotateLeftFiveTest() {
        int[] testArr = {2, 7, 0, 0, 4};
        int[] params = {4, 2, 7, 0, 0};
        Assert.assertArrayEquals( testArr, testObj.rotateLeft(params));
    }
    
    @Test
    public void rotateLeftFiveFalseTest() {
        int[] testArr = {0, 0, 7, 2, 4};
        int[] params = {2, 4, 7, 0, 0};
        Assert.assertNotEquals(testArr, testObj.rotateLeft(params));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
