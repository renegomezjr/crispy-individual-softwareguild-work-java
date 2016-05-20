/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlists;

import java.util.Iterator;

/**
 *
 * @author Rene Gomez
 */
public class LinkedListNodeImpl implements LinkedList {

    private int numItems = 0;
    private Node first;

    private class Node {

        Object item;
        Node next;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems <= 0;
    }

    @Override
    public void append(Object item) {
        Node aNode = new Node();

        aNode.item = item;

        Node tempNode = first;

        if (tempNode == null) {
            first = aNode;

        } else {

            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = aNode;
        }
        numItems++;
    }

    @Override
    public void prepend(Object item) {
        Node tempNode = new Node();
        tempNode.item = item;
        tempNode.next = this.first;
        this.first = tempNode;
        numItems++;
    }

    @Override
    public void insert(int index, Object item) {
        if (index >= numItems || index < 0) {
            return;
        }
        if (index == 0) {
            this.prepend(item);
        } else {
            int count = 0;
            Node temp = first;

            while (count + 1 < index) {
                temp = temp.next;
                count++;
            }

            Node aNode = new Node();
            aNode.item = item;
            aNode.next = temp.next;
            temp.next = aNode;
            numItems++;
        }
    }

    private Node getNode(int index) {
        if (index >= numItems || index < 0) {
            return null;
        }

        int count = 0;
        Node kid = first;

        while (count < index) {
            kid = kid.next;
            count++;
        }

        return kid;
    }

    @Override
    public Object remove(int index) {
        if (index >= numItems || index < 0) {
            return null;
        }
        Node nodeToRemove;
        
        if(index == 0){
            nodeToRemove = this.first;
            this.first = first.next;
        }else{

        Node beforeRemoved = this.getNode(index - 1);
        nodeToRemove = beforeRemoved.next;
        beforeRemoved.next = nodeToRemove.next;
        
        }
        
        numItems--;
        return nodeToRemove.item;
    }

    @Override
    public Object get(int index) {

        if (index >= numItems || index < 0) {
            return null;
        }

        int count = 0;
        Node kid = first;

        while (count < index) {
            kid = kid.next;
            count++;
        }

        return kid.item;
    }

}
