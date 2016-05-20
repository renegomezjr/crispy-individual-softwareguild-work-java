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
public class AddingValueWithAFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number: ");
        int userNumber = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= userNumber ; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        
        System.out.println("\nThe sum is " + sum);
    }
    
}
