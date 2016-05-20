/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rene Gomez
 */
public class Count9Test {
    
//    Given an array of ints, return the number of 9's in the array. 
    Count9 testObj = new Count9();
    
    @Test
    public void Count9Test(){
        int[] arr = {1, 2, 9};
        Assert.assertEquals(1, testObj.Count9(arr));

    }
    
    @Test
    public void Count9Test2(){
        int[] arr = {1, 9, 9};
        Assert.assertEquals(2, testObj.Count9(arr));

    }
    
    @Test
    public void Count9Test3(){
        int[] arr = {1, 9, 9, 3, 9};
        Assert.assertEquals(3, testObj.Count9(arr));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
