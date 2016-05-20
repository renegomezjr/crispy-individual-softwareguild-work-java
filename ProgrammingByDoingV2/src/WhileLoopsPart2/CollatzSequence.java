/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoopsPart2;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class CollatzSequence {
    
    public static void main(String[] args) {
        int n = 0;
        int counter = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Starting number: ");
        n = sc.nextInt();
        
        do {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = ((n * 3) + 1);
            }
            System.out.print("\t" + n);
            counter++;
            if (counter % 10 == 0){
                System.out.println("\n");
            }
        } while (n != 1);   
    }
}
