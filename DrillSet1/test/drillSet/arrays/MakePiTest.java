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
public class MakePiTest {
//Return an int array length n containing the first n digits of pi.
//{3,1,4,1,5,9,2,6,5}
//MakePi(3) -> {3, 1, 4}

    MakePi testObj = new MakePi();
    
    public MakePiTest() {
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
    public void makePiTestFirst(){
        int[] testArr = testObj.makePi(1);
        int[] arr = {3};
        Assert.assertArrayEquals(arr, testArr);
    }
    
    @Test
    public void makePiTestThird(){
        int[] testArr = testObj.makePi(3);
        int[] arr = {3,1,4};
        Assert.assertArrayEquals(arr, testArr);
    }
    
    @Test
    public void makePiTestSixth(){
        int[] testArr = testObj.makePi(6);
        int[] arr = {3,1,4,1,5,9};
        Assert.assertArrayEquals(arr, testArr);
    }
    
    @Test
    public void makePiTestNinth(){
        int[] testArr = testObj.makePi(9);
        int[] arr = {3,1,4,1,5,9,2,6,5};
        Assert.assertArrayEquals(arr, testArr);
    }
    
    @Test
    public void makePiTestMoreThanNine(){
        int[] testArr = testObj.makePi(15);
        int[] arr = {3,1,4,1,5,9,2,6,5};
        Assert.assertArrayEquals(arr, testArr);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
