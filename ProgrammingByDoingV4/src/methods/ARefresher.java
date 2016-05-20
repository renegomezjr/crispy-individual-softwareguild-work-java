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
public class ARefresher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = sc.nextLine();

        for (int i = 0; i < 10; i++) {
            if (name.equals("Mitchell")) {
                System.out.println(name);
                i++;
            } else {
                System.out.println(name);
            }
        }

    }
}
