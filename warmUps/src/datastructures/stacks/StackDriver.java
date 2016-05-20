/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stacks;

/**
 *
 * @author Rene Gomez
 */
public class StackDriver {
    public static void main(String[] args) {
//        ArrayStack myStack = new ArrayStack();
//        
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.push(5);
//        myStack.push(6);
//        
////        System.out.println(myStack.pop());
////        System.out.println(myStack.pop());
////        System.out.println(myStack.pop());
////        System.out.println(myStack.pop());
////        System.out.println(myStack.pop());
////        
//        Iterator dandelionOne = myStack.iterator();
//        
//        while(dandelionOne.hasNext()){
//            System.out.println(dandelionOne.next());
//        }
//        
        Stack myStack = new LinkedListStack();
        
        for (int i = 0; i < 20; i++) {
            myStack.push(i);
        }

//        for (int i = 0; i < 3; i++) {
//            System.out.println(myStack.pop());
//        }
    }
    
}
