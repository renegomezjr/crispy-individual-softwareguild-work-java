/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class CountLast2Test {
    CountLast2 testObj = new CountLast2();
//    Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
    
    @Test
    public void countLast2Test1() {    
        Assert.assertEquals(1, testObj.countLast2("hixxhi"));
    }
    
    @Test
    public void countLast2Test2() {
        Assert.assertEquals(1, testObj.countLast2("xaxxaxaxx"));
    }
    
    @Test
    public void countLast2Test3() {
        Assert.assertEquals(2, testObj.countLast2("axxxaaxx"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
