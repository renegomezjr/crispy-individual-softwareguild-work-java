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
public class AreaCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice;
        
        do {
            System.out.println("\n-=-=--=-=-=-=-=-=-=-=\n"
                             + "1. Triangle\n"
                             + "2. Rectangle\n"
                             + "3. Square\n"
                             + "4. Circle\n"
                             + "5. Quit\n"
                             + "Which shape: ");
            userChoice = sc.nextInt();
            
            switch (userChoice){
                case 1:
                    System.out.println("Base: ");
                    int base = sc.nextInt();
                    System.out.println("Height: ");
                    int height = sc.nextInt();
                    double aTrian = area_triangle(base, height);
                    System.out.println("The area is " + aTrian);
                    break;
                case 2:
                    System.out.println("Length: ");
                    int length = sc.nextInt();
                    System.out.println("Width: ");
                    int width = sc.nextInt();
                    double aRec = area_rectangle(length, width);
                    System.out.println("The area is " + aRec);
                    break;
                case 3:
                    System.out.println("Side: ");
                    int side = sc.nextInt();
                    double aSquar = area_square(side);
                    System.out.println("The area is " + aSquar);
                    break;
                case 4:
                    System.out.println("Radius: ");
                    int radius = sc.nextInt();
                    double aCirc = area_circle(radius);
                    System.out.println("The area is " + aCirc);
                    break;
            }
        } while (userChoice != 5); 
        System.out.println("Goodbye!");
    }

    public static double area_circle(int radius) {
        double aCirc = (Math.PI) * (radius * radius);
        return aCirc;
    }             

    public static int area_rectangle(int length, int width) {
        int aRec = length * width;
        return aRec;
    }   

    public static int area_square(int side) {
        int aSquar = side * side;
        return aSquar;
    }             

    public static double area_triangle(int base, int height) {
        double aTrian = (.5 * base) * height;
        return aTrian;
    }
}
