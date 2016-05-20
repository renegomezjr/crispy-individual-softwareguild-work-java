/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlists;

/**
 *
 * @author Rene Gomez
 */
public interface LinkedList {

    public int size();

    public boolean isEmpty();

    public void append(Object item);

    public void prepend(Object item);

    public void insert(int index, Object item);

    public Object remove(int index);

    public Object get(int index);

}
