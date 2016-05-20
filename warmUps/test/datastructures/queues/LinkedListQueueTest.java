/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.queues;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class LinkedListQueueTest {
    
    Queue testObj = new LinkedListQueue();
    
    @Test
    public void testIsEmptyWhenStartsEmpty() {
        Assert.assertTrue(testObj.isEmpty());
    }

    @Test
    public void testIsEmptyWhenOneThingIsAdded() {
        testObj.enqueue(1);
        testObj.enqueue(2);
        Assert.assertFalse(testObj.isEmpty());
    }

    @Test
    public void testIsEmptyWhenManyThingsAreAdded() {

        for (int i = 0; i < 20; i++) {
            testObj.enqueue(i);
        }

        Assert.assertFalse(testObj.isEmpty());
    }

    @Test
    public void testIsEmptyWhenManyThingsAreRemoved() {

        for (int i = 0; i < 20; i++) {
            testObj.enqueue(i);
        }

        for (int i = 0; i < 3; i++) {
            testObj.dequeue();
        }

        Assert.assertFalse(testObj.isEmpty());
    }

    @Test
    public void testIsEmptyWhenAllhingsAreRemoved() {

        for (int i = 0; i < 20; i++) {
            testObj.enqueue(i);
        }

        for (int i = 0; i < 20; i++) {
            testObj.dequeue();
        }

        Assert.assertTrue(testObj.isEmpty());
    }

    @Test
    public void testIsEmptyWhenStartsEmptySize() {
        Assert.assertEquals(0, testObj.size());
    }

    @Test
    public void testIsEmptyWhenOneThingSize1() {
        testObj.enqueue(1);
        Assert.assertEquals(1, testObj.size());
    }

    @Test
    public void testSizeWhenManyThingsAreAdded() {

        for (int i = 0; i < 20; i++) {
            testObj.enqueue(i);
        }

        Assert.assertEquals(20, testObj.size());
    }

    @Test
    public void testIsSizeWhenManyThingsAreRemoved() {

        for (int i = 0; i < 20; i++) {
            testObj.enqueue(i);
        }

        for (int i = 0; i < 10; i++) {
            testObj.dequeue();
        }

        Assert.assertEquals(10, testObj.size());
    }

    @Test
    public void testSizeWhenAllhingsAreRemoved() {

        for (int i = 0; i < 20; i++) {
            testObj.enqueue(i);
        }

        for (int i = 0; i < 20; i++) {
            testObj.dequeue();
        }

        Assert.assertEquals(0, testObj.size());
    }
    
    @Test
    public void testCorrectItemIsAddedThenRemoved1() {
        testObj.enqueue(1);
        Assert.assertEquals(1, testObj.dequeue());
    }

    @Test
    public void testCorrectItemsAreAddedThenRemoved5() {

        for (int i = 0; i < 20; i++) {
            testObj.enqueue(i);
        }
        

        Assert.assertEquals(0, testObj.dequeue());
        Assert.assertEquals(1, testObj.dequeue());
        Assert.assertEquals(2, testObj.dequeue());
        Assert.assertEquals(3, testObj.dequeue());
        Assert.assertEquals(4, testObj.dequeue());
        Assert.assertEquals(15, testObj.size());
    }

    @Test
    public void testValueWhenManyThingsAreAddedThenRemoved() {

        for (int i = 0; i < 20; i++) {
            testObj.enqueue(i);
        }

        for (int i = 0; i < 10; i++) {
            testObj.dequeue();
        }

        Assert.assertEquals(10, testObj.dequeue());
    }

    @Test
    public void testPopWhenEmpty() {

        Assert.assertNull(testObj.dequeue());
    }
}
