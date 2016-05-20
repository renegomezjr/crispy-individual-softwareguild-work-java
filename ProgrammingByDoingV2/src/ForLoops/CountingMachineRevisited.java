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
public class CountingMachineRevisited {
    public static void main(String[] args) {
        int userFrom = 0;
        int userTo = 0;
        int userBy = 0;
     
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Count from: ");
        userFrom = sc.nextInt();
        
        System.out.print("\nCount to: ");
        userTo = sc.nextInt();
        
        System.out.print("\nCount by: ");
        userBy = sc.nextInt();
                
        for (int i = userFrom; i <= userTo; i += userBy) {
            System.out.print(" " + i);
        }
    }
}
