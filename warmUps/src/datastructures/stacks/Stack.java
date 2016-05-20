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
public interface Stack {
    
    public Object pop();
    public void push(Object item);
    public boolean isEmpty();
    public int size();
    
    public Iterator iterator();
    
}
