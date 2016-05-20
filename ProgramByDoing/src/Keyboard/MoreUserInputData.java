/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Keyboard;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class MoreUserInputData {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String loginName;
        int grade;
        int studentIdNumber;
        double gpa;

        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Please enter the following information so I can sell it for a profit!\n");
        
        System.out.print("First name: ");
        firstName = keyboard.nextLine();
        
        System.out.print("Last name: ");
        lastName = keyboard.nextLine();
        
        System.out.print("Grade (9-12): ");
        grade = keyboard.nextInt();
        
        System.out.print("Student ID: ");
        studentIdNumber = keyboard.nextInt();
        
        System.out.println("Login: ");
        loginName = keyboard.nextLine();
        
        System.out.print("GPA (0.0 - 4.0): ");
        gpa = keyboard.nextDouble();
        
        System.out.println("Your information: \n"
                         + "Login: " + loginName + "\n"
                         + "ID:    " + studentIdNumber +"\n"
                         + "Name:  " + lastName + ", " + firstName + "\n"
                         + "GPA:   " + gpa + "\n"
                         + "Grade: " + grade);
        
    }
    
}
