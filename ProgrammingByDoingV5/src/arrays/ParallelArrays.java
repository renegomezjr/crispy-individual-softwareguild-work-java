/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class ParallelArrays {

    public static void main(String[] args) {
        String[] lastNames = {"Gomez", "Timmons", "Betts", "Salazar", "Holmes"};
        Double[] avgGrade = {99.8, 87.4, 78.4, 99.9, 100.0};
        int[] stuId = {123455, 567949, 939455, 868574, 576849};
        Scanner sc = new Scanner(System.in);

        System.out.println("Values:\n");
        for (int i = 0; i < lastNames.length; i++) {
            System.out.print(lastNames[i] + " " + avgGrade[i] + " " + stuId[i] + "\n");
        }

        System.out.println("\nEnter an ID number: ");
        int userChoice = sc.nextInt();

        for (int i = 0; i < lastNames.length; i++) {
            if (userChoice == stuId[i]) {
                System.out.println("\nStudent was found in slot: " + i);
                System.out.println("Name: " + lastNames[i]);
                System.out.println("Grade: " + avgGrade[i]);
                System.out.println("id: " + stuId[i]);
            }
        }
    }

}
