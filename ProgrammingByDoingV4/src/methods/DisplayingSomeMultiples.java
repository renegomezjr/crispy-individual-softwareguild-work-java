/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class DisplayingSomeMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        System.out.println("Choose a number: ");
        num = sc.nextInt();
        
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + "X" + i +" = "+(num*i));
        }
    }
}
