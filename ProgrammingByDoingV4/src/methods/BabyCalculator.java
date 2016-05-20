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
public class BabyCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double a, b;
        double c = 0;
        String op;
        boolean keepRunning = true;

        do {
            System.out.print("> ");
            a = keyboard.nextDouble();
            op = keyboard.next();
            b = keyboard.nextDouble();
            
            
            if(a == 0){
                System.out.println("Bye, now.");
                keepRunning = false;
            }else if (op.equals("+")) {
                c = a + b;
            }else if(op.equals("*")){
                c = a * b;
            } else if(op.equals("-")){
                c = a-b;
            } else if(op.equals("/")){
                c = a/b;
            } else {
                System.out.println("Undefined operator: '" + op + "'.");
                c = 0;
            }

            System.out.println(c);

        } while (keepRunning);
    }

}
