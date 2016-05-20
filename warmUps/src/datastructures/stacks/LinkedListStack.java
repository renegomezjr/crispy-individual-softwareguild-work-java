/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stacks;

import datastructures.linkedlists.LinkedList;
import datastructures.linkedlists.LinkedListNodeImpl;
import java.util.Iterator;

/**
 *
 * @author Rene Gomez
 */
public class LinkedListStack implements Stack {
    private LinkedList items = new LinkedListNodeImpl();
    
    @Override
    public Object pop() {
        return items.remove(0);
    }

    @Override
    public void push(Object item) {
        items.prepend(item);
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
        return new LinkedListStackIterator();

    }

    private class LinkedListStackIterator implements Iterator {

        private int curIndex;

        public LinkedListStackIterator() {
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
