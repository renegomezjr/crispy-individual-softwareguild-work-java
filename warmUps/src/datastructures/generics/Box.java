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
public class Box<E> {
    private E item;
    
    public Box(E item){
        this.item = item;
    }
    
    public E getItem(){
        return item;
    }
    
    public void setItem(E item){
        this.item = item;
    }
    
}
