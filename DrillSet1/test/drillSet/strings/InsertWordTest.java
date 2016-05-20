/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

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
//InsertWord("<<>>", "Yay") -> "<<Yay>>"
//InsertWord("<<>>", "WooHoo") -> "<<WooHoo>>"
//InsertWord("[[]]", "word") -> "[[word]]"
public class InsertWordTest {
    InsertWord testObj = new InsertWord();
    
    public InsertWordTest() {
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
    public void insertWordYayTest(){
        Assert.assertEquals("<<Yay>>", testObj.insertWord("<<>>", "Yay"));
    }
    
    @Test
    public void insertWordWooHooTest(){
        Assert.assertEquals("<<WooHoo>>", testObj.insertWord("<<>>", "WooHoo"));
    }
    
    @Test
    public void insertWordBracketsTest(){
        Assert.assertEquals("[[word]]", testObj.insertWord("[[]]", "word"));
    }
    
    @Test
    public void insertWordFalseTest(){
        Assert.assertNotEquals("<Yay>", testObj.insertWord("<<>>", "Yay"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
