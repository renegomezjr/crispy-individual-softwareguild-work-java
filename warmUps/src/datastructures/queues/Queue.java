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
public interface Queue {
    
    public void enqueue(Object item);
    public Object dequeue();
    public boolean isEmpty();
    public int size();
    public Iterator iterator();
    
}
