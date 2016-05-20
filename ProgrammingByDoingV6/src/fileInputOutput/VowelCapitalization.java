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
public class VowelCapitalization {

    public static void main(String[] args) throws FileNotFoundException {
        String userChoice;
        Scanner sc = new Scanner(System.in);

        System.out.print("Which file would you like to open: ");
        userChoice = sc.nextLine();

        Scanner sc2 = new Scanner(new BufferedReader(new FileReader(userChoice)));

        while (sc2.hasNextLine()) {
            String line = sc2.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'a') {
                    line = line.replace('a', 'A');
                } else if (line.charAt(i) == 'e') {
                    line = line.replace('e', 'E');
                } else if (line.charAt(i) == 'i') {
                    line = line.replace('i', 'I');
                } else if (line.charAt(i) == 'o') {
                    line = line.replace('o', 'O');
                } else if (line.charAt(i) == 'u') {
                    line = line.replace('u', 'U');
                }
            }
            System.out.println(line);
        }

    }
}
