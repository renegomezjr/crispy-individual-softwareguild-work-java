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
public class ConCatTest {

    ConCat testObj = new ConCat();

    @Test
    public void conCatTest1() {
        Assert.assertEquals("abcat", testObj.ConCat("abc", "cat"));
    }
    
    @Test
    public void conCatTest2() {
        Assert.assertEquals("dogcat", testObj.ConCat("dog", "cat"));
    }
    
    @Test
    public void conCatTest3() {
        Assert.assertEquals("abc", testObj.ConCat("abc", ""));
    }
    
    @Test
    public void conCatTestEmptyFirstString() {
        Assert.assertEquals("abc", testObj.ConCat("", "abc"));
    }

   
    
}
