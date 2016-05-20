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
public class ALittlePuzzle {
    public static void main(String[] args) throws FileNotFoundException {
        
        String userChoice;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Which file would you like to open: ");
        userChoice = sc.nextLine();
        
        Scanner sc2 = new Scanner(new BufferedReader(new FileReader(userChoice)));
        
        String puzzle = "";
        while(sc2.hasNextLine()){
          puzzle += sc2.nextLine();
        }
        
        for (int i = 2; i < puzzle.length(); i += 3) {
            
            System.out.print(puzzle.charAt(i));
        }
        System.out.println("\n");
        
    }
    
}
