/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.logic;

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
public class GreatPartyTest {
//    When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise. 
    GreatParty testObj = new GreatParty();
    
    @Test
    public void GreatPartyTest1(){
        Assert.assertFalse(testObj.GreatParty(30, false));
    }
    
    @Test
    public void GreatPartyTest2(){
        Assert.assertTrue(testObj.GreatParty(50, false));
    }
    
    @Test
    public void GreatPartyTest3(){
        Assert.assertTrue(testObj.GreatParty(70, true));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
