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
public class ModulusAnimation {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 80; i++) {
            if (i % 16 == 0) {
                System.out.println(" *                 \r");
            } else if (i % 16 == 1) {
                System.out.println("   **             \r");
            } else if (i % 16 == 2) {
                System.out.println("     ***             \r");
            } else if (i % 16 == 3) {
                System.out.println("       ****           \r");
            } else if (i % 16 == 4) {
                System.out.println("         *****         \r");
            } else if (i % 16 == 5) {
                System.out.println("           ******       \r");
            } else if (i % 16 == 6) {
                System.out.println("             *******     \r");
            } else if (i % 16 == 7) {
                System.out.println("               ********   \r");
            } else if (i % 16 == 8) {
                System.out.println("                 * \r");
            }

            Thread.sleep(200);
        }

    }
}
