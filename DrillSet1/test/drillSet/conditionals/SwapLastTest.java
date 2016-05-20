/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.conditionals;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class SwapLastTest {
    
    SwapLast testObj = new SwapLast();
    
    @Test
    public void swapLastTest1() {
        Assert.assertEquals("codign",testObj.SwapLast("coding"));
    }
    
    @Test
    public void swapLastTest2() {
        Assert.assertEquals("cta",testObj.SwapLast("cat"));
    }
    
    @Test
    public void swapLastTest3() {
        Assert.assertEquals("ba",testObj.SwapLast("ab"));
    }
    
    @Test
    public void swapLastTest4StringSize1() {
        Assert.assertEquals("a",testObj.SwapLast("a"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
