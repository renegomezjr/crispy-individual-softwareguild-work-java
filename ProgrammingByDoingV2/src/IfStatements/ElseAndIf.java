/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfStatements;

/**
 *
 * @author Rene Gomez
 */
public class ElseAndIf {

    public static void main(String[] args) {
        int people = 30;
        int cars = 40;
        int buses = 15;
        
        //else if and else are providing alternative options for the code block
        //if you remove the else from else if, it still evalutates true or false.
        if (cars > people) {
            System.out.println("We should take the cars.");
        } if (cars < people) {
            System.out.println("We should not take the cars.");
        } else {
            System.out.println("We can't decide.");
        }

        if (buses > cars) {
            System.out.println("That's too many buses.");
        } if (buses < cars) {
            System.out.println("Maybe we could take the buses.");
        } else {
            System.out.println("We still can't decide.");
        }

        if (people > buses) {
            System.out.println("All right, let's just take the buses.");
        } else {
            System.out.println("Fine, let's stay home then.");
        }

    }

}
