/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stacks;

import datastructures.linkedlists.LinkedListNodeImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class LinkedListStackTest {

    Stack testObj = new LinkedListStack();

    @Test
    public void testIsEmptyWhenStartsEmpty() {
        Assert.assertTrue(testObj.isEmpty());
    }

    @Test
    public void testIsEmptyWhenOneThingIsAdded() {
        testObj.push(1);
        Assert.assertFalse(testObj.isEmpty());
    }

    @Test
    public void testIsEmptyWhenManyThingsAreAdded() {

        for (int i = 0; i < 20; i++) {
            testObj.push(i);
        }

        Assert.assertFalse(testObj.isEmpty());
    }

    @Test
    public void testIsEmptyWhenManyThingsAreRemoved() {

        for (int i = 0; i < 20; i++) {
            testObj.push(i);
        }

        for (int i = 0; i < 3; i++) {
            testObj.pop();
        }

        Assert.assertFalse(testObj.isEmpty());
    }

    @Test
    public void testIsEmptyWhenAllhingsAreRemoved() {

        for (int i = 0; i < 20; i++) {
            testObj.push(i);
        }

        for (int i = 0; i < 20; i++) {
            testObj.pop();
        }

        Assert.assertTrue(testObj.isEmpty());
    }

    @Test
    public void testIsEmptyWhenStartsEmptySize() {
        Assert.assertEquals(0, testObj.size());
    }

    @Test
    public void testIsEmptyWhenOneThingSize1() {
        testObj.push(1);
        Assert.assertEquals(1, testObj.size());
    }

    @Test
    public void testSizeWhenManyThingsAreAdded() {

        for (int i = 0; i < 20; i++) {
            testObj.push(i);
        }

        Assert.assertEquals(20, testObj.size());
    }

    @Test
    public void testIsSizeWhenManyThingsAreRemoved() {

        for (int i = 0; i < 20; i++) {
            testObj.push(i);
        }

        for (int i = 0; i < 10; i++) {
            testObj.pop();
        }

        Assert.assertEquals(10, testObj.size());
    }

    @Test
    public void testSizeWhenAllhingsAreRemoved() {

        for (int i = 0; i < 20; i++) {
            testObj.push(i);
        }

        for (int i = 0; i < 20; i++) {
            testObj.pop();
        }

        Assert.assertEquals(0, testObj.size());
    }
    
    @Test
    public void testCorrectItemIsAddedThenRemoved1() {
        testObj.push(1);
        Assert.assertEquals(1, testObj.pop());
    }

    @Test
    public void testCorrectItemsAreAddedThenRemoved5() {

        for (int i = 0; i < 20; i++) {
            testObj.push(i);
        }
        

        Assert.assertEquals(19, testObj.pop());
        Assert.assertEquals(18, testObj.pop());
        Assert.assertEquals(17, testObj.pop());
        Assert.assertEquals(16, testObj.pop());
        Assert.assertEquals(15, testObj.pop());
        Assert.assertEquals(15, testObj.size());
    }

    @Test
    public void testValueWhenManyThingsAreAddedThenRemoved() {

        for (int i = 0; i < 20; i++) {
            testObj.push(i);
        }

        for (int i = 0; i < 10; i++) {
            testObj.pop();
        }

        Assert.assertEquals(9, testObj.pop());
    }

    @Test
    public void testPopWhenEmpty() {

        Assert.assertNull(testObj.pop());
    }

}
