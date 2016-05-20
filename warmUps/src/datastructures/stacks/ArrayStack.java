/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stacks;

import java.util.Iterator;

/**
 *
 * @author Rene Gomez
 */
public class ArrayStack implements Stack, Iterable {

    private Object[] items;
    private int numItems;
    private int stackPointer = -1;
    private static final int DEFAULT_INITIAL_SIZE = 4;

    public ArrayStack() {

        this.items = new Object[DEFAULT_INITIAL_SIZE];
        this.numItems = 0;

    }

    @Override
    public Object pop() {
        if(this.isEmpty()){
            return null;
        }
        
        Object item = items[stackPointer];
        numItems--;
        stackPointer--;
        
         if(numItems > 0 && numItems == items.length/4){
            resize(items.length/2);
        }
         
        return item;
    }

    @Override
    public void push(Object item) {
        if(numItems >= items.length){
            resize(items.length * 2);
        }
        
        items[stackPointer + 1] = item;
        numItems++;
        stackPointer++;

    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public int size() {
        return numItems;
    }
    
    private void resize(int newSize){
        Object[] temp = new Object[newSize];
        
        for (int i = 0; i < numItems; i++) {
            temp[i] = items[i];
        }
        
        items = temp;
    }
    
    @Override
    public Iterator iterator(){
        return new ReverseArrayStackIterator();
        
    }
    
    private class ReverseArrayStackIterator implements Iterator{
        
        private int iteratorPointer;
        
        ReverseArrayStackIterator(){
            iteratorPointer = stackPointer;
        }
        
        @Override
        public boolean hasNext() {
            return iteratorPointer > -1;
        }

        @Override
        public Object next() {
            return items[iteratorPointer--];
        }
        
    }
}
