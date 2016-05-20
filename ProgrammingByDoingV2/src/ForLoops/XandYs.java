/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForLoops;

/**
 *
 * @author Rene Gomez
 */
public class XandYs {
    
    public static void main(String[] args) {
        double x = -10.0;
        double y = 0.0;
        
        System.out.print("  x       y\n"
                       +"-------------\n");
        for (int i = 0; x <= 10; i++) {
            System.out.print(x + "\t");
            
            for (int j = 0; j < 1; j++) {
                y = x * x;
                System.out.println(" " + y);
            }
            x += .5;
        }
    }
    
}
