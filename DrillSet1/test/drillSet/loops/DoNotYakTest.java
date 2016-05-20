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
public class DoNotYakTest {
    DoNotYak testObj = new DoNotYak();
    
    @Test
    public void testDoNotYak1(){
        Assert.assertEquals("pak", testObj.DoNotYak("yakpak")); 
    }
    
    @Test
    public void testDoNotYak2(){
        Assert.assertEquals("pak", testObj.DoNotYak("pakyak")); 
    }
    
    @Test
    public void testDoNotYak3(){
        Assert.assertEquals("123ya", testObj.DoNotYak("yak123ya")); 
    }
    @Test
    public void testDoNotYakContainsNoYak(){
        Assert.assertEquals("yk123ya", testObj.DoNotYak("yk123ya")); 
    }
}
