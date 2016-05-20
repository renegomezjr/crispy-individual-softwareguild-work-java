/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class SortingSentences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sentence: ");
        String sentence = sc.nextLine();
        ArrayList<String> sentenceArray = new ArrayList<String>(Arrays.asList(sentence.toLowerCase().split(" ")));
        Collections.sort(sentenceArray);
        
        System.out.print("Sorted: [");
        for (int i = 0; i < sentenceArray.size(); i++) {
            System.out.print(sentenceArray.get(i) + ", ");
        }
        System.out.print("]");

    }

}
