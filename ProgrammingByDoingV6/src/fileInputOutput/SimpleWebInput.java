/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputOutput;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class SimpleWebInput {

    public static void main(String[] args) throws Exception {
//        URL mcool = new URL("https://cs.leanderisd.org/mitchellis.txt");
//        Scanner webIn = new Scanner(mcool.openStream());
//
//        
//
//        
//        while(webIn.hasNextLine()){
//            System.out.println(webIn.nextLine());
//        }
//
//        webIn.close();
        
        URL mcool = new URL("https://www.washingtonpost.com/politics/protesters-block-the-road-to-donald-trump-rally-near-phoenix/2016/03/19/ed7f8e84-ed50-11e5-a6f3-21ccdbc5f74e_story.html");
        Scanner webIn = new Scanner(mcool.openStream());

        

        
        while(webIn.hasNextLine()){
            System.out.println(webIn.nextLine());
        }

        webIn.close();
    }

}
