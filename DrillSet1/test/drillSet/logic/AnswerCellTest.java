/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.logic;

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
public class AnswerCellTest {

    public AnswerCellTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    AnswerCell testObj = new AnswerCell();

    @Test
    public void testAnswerCell1() {
        Assert.assertTrue(testObj.AnswerCell(false, false, false));
    }
    
    @Test
    public void testAnswerCell2() {
        Assert.assertFalse(testObj.AnswerCell(false, false, true));
    }
    
    @Test
    public void testAnswerCell3() {
        Assert.assertFalse(testObj.AnswerCell(true, false, false));
    }
}
