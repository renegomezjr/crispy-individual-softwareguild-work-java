/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfStatements;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class TwoMoreQuestions {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        String userChoice1;
        String userChoice2;
        String output = "";
  

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");

        System.out.println("Question 1) Does it stay inside or outside or both?");
        userChoice1 = sc.nextLine();

        System.out.println("Question 2) Is it a living thing");
        userChoice2 = sc.nextLine();
        
        if(userChoice1.equals("inside") && userChoice2.equals("alive")){
            output = "houseplant";
        } 
        if(userChoice1.equals("inside") && userChoice2.equals("not alive")){
            output = "shower curtain";
        }
        
        if(userChoice1.equals("outside") && userChoice2.equals("alive")){
            output = "bison";
        }
        if(userChoice1.equals("outside") && userChoice2.equals("not alive")){
            output = "billboard";
        }
        
        if(userChoice1.equals("both") && userChoice2.equals("alive")){
            output = "dog";
        }
        if(userChoice1.equals("both") && userChoice2.equals("not alive")){
            output = "cell phone";
        }
           
        if(userChoice2.equals("alive")){
            System.out.println("Of course you are thinking of a " + output + "!");

        }else{
            System.out.println("This nonliving thing is a " + output + ".");

        }
    }
}
