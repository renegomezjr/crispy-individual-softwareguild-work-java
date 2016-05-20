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
class Student {
    String name;
    int gradeClass;
    double average;
}

public class BasicRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        
        System.out.print("Enter the first student's name: ");
        student1.name = sc.next();
        System.out.print("Enter the first student's grade: ");
        student1.gradeClass = sc.nextInt();
        System.out.print("Enter the first student's grade: ");
        student1.average = sc.nextDouble();
        
        System.out.print("\nEnter the second student's name: ");
        student2.name = sc.next();
        System.out.print("Enter the second student's grade: ");
        student2.gradeClass = sc.nextInt();
        System.out.print("Enter the second student's grade: ");
        student2.average = sc.nextDouble();
        
        System.out.print("\nEnter the third student's name: ");
        student3.name = sc.next();
        System.out.print("Enter the third student's grade: ");
        student3.gradeClass = sc.nextInt();
        System.out.print("Enter the third student's grade: ");
        student3.average = sc.nextDouble();
        
        System.out.print("\nThe names are: " + student1.name +" "+ student2.name +" "+ student3.name);
        System.out.println("\nThe grade are: " + student1.gradeClass +" "+ student2.gradeClass +" "+ student3.gradeClass);
        System.out.println("\nThe averages are: " + student1.average +" "+ student2.average +" "+ student3.average);
        System.out.println("\nThe average for the three students is: " + ((student1.average +student2.average + student3.average)/3));
    }
}
