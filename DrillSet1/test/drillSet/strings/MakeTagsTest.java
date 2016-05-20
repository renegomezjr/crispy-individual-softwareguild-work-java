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
//The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>". 
//
//MakeTags("i", "Yay") -> "<i>Yay</i>"
//MakeTags("i", "Hello") -> "<i>Hello</i>"
//MakeTags("cite", "Yay") -> "<cite>Yay</cite>"

public class MakeTagsTest {
    MakeTags testObj = new MakeTags();
    public MakeTagsTest() {
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
    public void makeTagsYayTest(){
//        String testResult
        Assert.assertEquals("<i>Yay</i>", testObj.makeTags("i", "Yay") );
    }
    
    @Test
    public void makeTagsHelloTest(){
//        String testResult
        Assert.assertEquals("<i>Hello</i>", testObj.makeTags("i", "Hello") );
    }
    
    @Test
    public void makeTagsCiteTest(){
//        String testResult
        Assert.assertEquals("<cite>Yay</cite>", testObj.makeTags("cite", "Yay") );
    }
    
    @Test
    public void makeTagsFalseTest(){
//        String testResult
        Assert.assertNotEquals("<>Yay</>", testObj.makeTags("i", "Yay") );
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
