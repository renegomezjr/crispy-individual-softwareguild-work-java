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
public class SummingThreeNumbersFromFile {

    public static void main(String[] args) throws IOException {
        FileReader fIn = new FileReader("3nums.txt");
        BufferedReader bIn = new BufferedReader(fIn);
        Scanner sc = new Scanner(bIn);
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;
        
        
        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
        
        sum = a+b+c;
        System.out.println("Reading numbers from file \"3nums.txt\"...done.\n"
                         + a + " + " + b + " + " + c + " = " + sum);
    }
}
