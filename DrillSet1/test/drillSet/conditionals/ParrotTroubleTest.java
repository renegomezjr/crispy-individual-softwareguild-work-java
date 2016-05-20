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
public class ParrotTroubleTest {

    ParrotTrouble testObj = new ParrotTrouble();

    @Test
    public void parrotTrouble1() {
        Assert.assertTrue(testObj.ParrotTrouble(true, 6));
    }

    @Test
    public void parrotTrouble2() {
        Assert.assertFalse(testObj.ParrotTrouble(true, 7));
    }

    @Test
    public void parrotTrouble3() {
        Assert.assertFalse(testObj.ParrotTrouble(false, 6));
    }
    
}
