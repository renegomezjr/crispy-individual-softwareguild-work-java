/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class GradesInAnArrayFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] gradeArr = new int[5];
        Random r = new Random();
        
        String name;
        String file;
        
        System.out.print("Name (first last): ");
        name = sc.nextLine();
        
        System.out.print("\nFilename: ");
        file = sc.nextLine();
        
        for (int i = 0; i < gradeArr.length; i++) {
            gradeArr[i] = r.nextInt(101) + 1;
            if (i == 0) {
                System.out.println("\nHere are your random grades (hope you passed):\n");
            }
            System.out.println("Grade " + (i + 1) + ": " + gradeArr[i]);
        }
        
        PrintWriter out = new PrintWriter(new FileWriter(file));
        out.println(name);
        for (int i = 0; i < gradeArr.length; i++) {
            out.print(gradeArr[i] + " ");
        }
        out.flush();
        out.close();
        
        System.out.println("Data stored in \"" + file + "\"" );
    }
    
}
