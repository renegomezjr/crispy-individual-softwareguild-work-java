/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.records;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
class Student2 {

    String name;
    int gradeClass;
    double average;
}

public class LittleDatabaseLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student2[] students = new Student2[3];
        
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student2();
            System.out.print("\nEnter the " + (i+1) + "'s" + " name: ");
            students[i].name = sc.next();
            System.out.print("Enter the " + (i+1) + "'s" + " grade: ");
            students[i].gradeClass = sc.nextInt();
            System.out.print("Enter the " + (i+1) + "'s" + " average: ");
            students[i].average = sc.nextDouble();
        }
        
        System.out.print("\nThe names are: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].name + " ");
        }
        
        System.out.print("\nThe grades are: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].gradeClass + " ");
        }
        
        System.out.print("\nThe averages are: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].average + " ");
            if(i == 2){
                System.out.println("\n");
            }
        }
    }
}
