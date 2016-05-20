/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class SummingSeveralNumbersAnyFile {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        String userChoice;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Which file would you like to open: ");
        userChoice = sc.nextLine();
        System.out.println("Reading numbers from \"" + userChoice + "\"");
        
        Scanner sc2 = new Scanner(new BufferedReader(new FileReader(userChoice)));
        
        while(sc2.hasNextLine()){
            int num = Integer.parseInt(sc2.nextLine());
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println("\nThe Total is " + sum);
        
    }
    
}
