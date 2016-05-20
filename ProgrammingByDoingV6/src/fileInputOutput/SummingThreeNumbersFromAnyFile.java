/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class SummingThreeNumbersFromAnyFile {

    public static void main(String[] args) throws IOException {
        Scanner sc2 = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;
        String userChoice;

        System.out.println("Which file would you like to read numbers from: ");
        userChoice = sc2.nextLine();

        FileReader fIn = new FileReader(userChoice);
        BufferedReader bIn = new BufferedReader(fIn);
        Scanner sc = new Scanner(bIn);

        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }

        sum = a + b + c;
        System.out.println("Reading numbers from file \"" + userChoice
                + "\"...done.\n"
                + a + " + " + b + " + " + c + " = " + sum);
    }
}
