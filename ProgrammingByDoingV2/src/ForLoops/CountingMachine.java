/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForLoops;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class CountingMachine {
    public static void main(String[] args) {
        int userInput = 0;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Count to: ");
        userInput = sc.nextInt();
                
        for (int i = 0; i <= userInput; i++) {
            System.out.print(" " + i);
        }   
    }
}
