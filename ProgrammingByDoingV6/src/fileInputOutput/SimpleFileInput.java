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
public class SimpleFileInput {

    public static void main(String[] args) throws IOException {
        FileReader fIn = new FileReader("name.txt");
        BufferedReader bIn = new BufferedReader(fIn);
        Scanner sc = new Scanner(bIn);

        while (sc.hasNextLine()) {
            System.out.println("Using my psychic powers (aided by reading data from the file), I have\n"
                             + "determined that your name is " + sc.nextLine() + ".");
        }
    }
}
