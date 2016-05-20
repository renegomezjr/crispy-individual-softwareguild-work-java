/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfStatements;

import static java.lang.Character.UnicodeBlock.of;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.I;

/**
 *
 * @author Rene Gomez
 */
public class TwentyQuestionsActlyTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userChoice1;
        String userChoice2;
        String output = "";
  

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");

        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        userChoice1 = sc.nextLine();

        System.out.println("Question 2) Is it bigger than a breadbox?");
        userChoice2 = sc.nextLine();
        
        switch(userChoice1){
            case "animal":
                if(userChoice2.equals("yes")){
                    output = "Camel";
                }else{
                    output = "Squirrel";
                }
                break;
            case "vegetable":
                if(userChoice2.equals("yes")){
                    output = "Watermelon";
                }else{
                    output = "Pea";
                }
                break;
            case "mineral":
                if(userChoice2.equals("yes")){
                    output = "Corvette";
                }else{
                    output = "Paper Clip";
                }
                break;
        }

        System.out.println("My guess is that you are thinking of a " + output);
        System.out.println("I would ask you if I'm right, but I don't actually care.");
    }
}
