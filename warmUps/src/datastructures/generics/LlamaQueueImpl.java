/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rene Gomez
 */
public class LlamaQueueImpl<E> implements Queue<E> {

    ArrayList<E> items = new ArrayList<>();

    @Override
    public void enqueue(E element) {
        items.add(element);
    }

    @Override
    public E dequeue() {
  
        if (items.isEmpty()){
            return null;
        }
        return items.remove(0);
    }

    @Override
    public E peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public Boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public String getAuthorName() {
        return "What's my name fool!";
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

}
