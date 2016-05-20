/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.queues;

import datastructures.linkedlists.LinkedList;
import datastructures.linkedlists.LinkedListNodeImpl;
import java.util.Iterator;

/**
 *
 * @author Rene Gomez
 */
public class LinkedListQueue implements Queue, Iterable {

    LinkedList items = new LinkedListNodeImpl();

    @Override
    public void enqueue(Object item) {
        items.append(item);
    }

    @Override
    public Object dequeue() {
        return items.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public Iterator iterator() {
        return new LinkedListQueueIterator();

    }

    private class LinkedListQueueIterator implements Iterator {

        private int curIndex;

        public LinkedListQueueIterator() {
            curIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return curIndex < items.size();
        }

        @Override
        public Object next() {
            Object item = items.get(curIndex);
            curIndex++;
            return item;
        }

    }

}
