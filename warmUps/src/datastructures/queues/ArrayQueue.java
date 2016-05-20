/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.queues;

import java.util.Iterator;

/**
 *
 * @author Rene Gomez
 */
public class ArrayQueue implements Queue {

    private Object[] items;
    private int numItems;
    private int head = -1;
    private int tail = -1;
    private int DEFAULT_SIZE = 6;

    public ArrayQueue() {
        this.items = new Object[DEFAULT_SIZE];
        numItems = 0;
    }

    @Override
    public void enqueue(Object item) {
        if (numItems >= items.length) {
            resize(items.length * 2);
        }

        if (numItems == 0) {
            head = 0;
            tail = 0;
        } else if (tail + 1 == items.length) {
            tail = 0;
        } else {
            tail++;
        }

        items[tail] = item;
        numItems++;
    }

    private void resize(int newSize) {
        Object[] temp = new Object[newSize];

        if (head > tail) {
            int j = 0;
            for (int i = head; i < items.length; i++) {
                temp[j] = items[i];
                j++;
            }
            for (int i = 0; i < tail; i++) {
                temp[j] = items[i];
                j++;
            }
        } else {
            for (int i = 0; i < items.length; i++) {
                temp[i] = items[i];
            }
        }

        items = temp;
    }

    @Override
    public Object dequeue() {
        Object item;

        if (numItems == 0) {
            item = null;
        } else {
            item = items[head];
            head++;

            if (head + 1 > items.length) {
                head = 0;
            }

            numItems--;
        }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public Iterator iterator() {
        return new QueueIterator();
    }
    
    
    private class QueueIterator implements Iterator {
        int index;
        int visited;
        
        public QueueIterator(){
            index = head;
            visited = 0;
            
        }
        
        @Override
        public boolean hasNext() {
            return visited < numItems;
        }

        @Override
        public Object next() {
           Object item;
           
           item = items[index];
           index++;
           visited++;
           
           if(index >= items.length){
               index = 0;
           }
           
           return item;
        }
        
    }

}
