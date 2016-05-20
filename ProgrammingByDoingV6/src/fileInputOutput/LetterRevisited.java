/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class LetterRevisited {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("Letter.txt"));
        
        out.println("+-----------------------------------------------+");
        out.println("|                                          #####|");
        out.println("|                                          #####|");
        out.println("|                                          #####|");
        out.println("|                                               |");
        out.println("|                                               |");
        out.println("|               Rene Gomez                      |");
        out.println("|               555 Homeboy Ave.                |");
        out.println("|               The Ville, KY 40218             |");
        out.println("|                                               |");
        out.println("+-----------------------------------------------+");
        
        out.flush();
        out.close();
        
        FileReader fIn = new FileReader("Letter.txt");
        BufferedReader bIn = new BufferedReader(fIn);
        Scanner sc = new Scanner(bIn);
        
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
    
}
