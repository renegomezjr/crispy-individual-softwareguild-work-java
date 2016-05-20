/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class HighScore {
    public static void main(String[] args) throws IOException {
        String name;
        int highScore = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Pleasae enter your name: ");
        name = sc.nextLine();
        
        System.out.print("Please enter your high score: ");
        highScore = sc.nextInt();
 
        PrintWriter out = new PrintWriter(new FileWriter("HighScore.txt"));
        out.println("Name: " + name);
        out.println("High score: " + highScore);
        
        out.flush();
        out.close();
        
        System.out.println("Data stored into HighScore.txt");
    }
}
