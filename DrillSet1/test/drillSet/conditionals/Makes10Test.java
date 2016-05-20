/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.conditionals;

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
public class Makes10Test {
    Makes10 testObj = new Makes10();
    
    @Test
    public void make10Test1(){
        Assert.assertTrue(testObj.Makes10(9, 10));
    }
    
    @Test
    public void makes10Test2(){
        Assert.assertFalse(testObj.Makes10(9, 9));
    }
    
    @Test
    public void makes10Test3(){
        Assert.assertTrue(testObj.Makes10(1, 9));
    }

}
