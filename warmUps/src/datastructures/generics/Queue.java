/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.generics;

/**
 *
 * @author Rene Gomez
 */
public interface Queue<E> extends Iterable<E> {
    
    void enqueue(E element);
    E dequeue();
    E peek();
    int size();
    Boolean isEmpty();
    String getAuthorName();
    
}
