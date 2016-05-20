/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author Rene Gomez
 */
public class FindingPrimeNumbers {

    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            if (i == 2 || isPrime(i)) {
                System.out.println(i + "<");
            } else {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            } 
        }
        return true;
    }

}
