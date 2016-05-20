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
class Student1 {
    String name;
    int gradeClass;
    double average;
}
public class ALittleDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student1[] students = new Student1[3];
        students[0] = new Student1();
        students[1] = new Student1();
        students[2] = new Student1();
        
        System.out.print("Enter the first student's name: ");
        students[0].name = sc.next();
        System.out.print("Enter the first student's grade: ");
        students[0].gradeClass = sc.nextInt();
        System.out.print("Enter the first student's grade: ");
        students[0].average = sc.nextDouble();
        
        System.out.print("\nEnter the second student's name: ");
        students[1].name = sc.next();
        System.out.print("Enter the second student's grade: ");
        students[1].gradeClass = sc.nextInt();
        System.out.print("Enter the second student's grade: ");
        students[1].average = sc.nextDouble();
        
        System.out.print("\nEnter the third student's name: ");
        students[2].name = sc.next();
        System.out.print("Enter the third student's grade: ");
        students[2].gradeClass = sc.nextInt();
        System.out.print("Enter the third student's grade: ");
        students[2].average = sc.nextDouble();
        
        System.out.print("\nThe names are: " + students[0].name +" "+ students[1].name +" "+ students[2].name);
        System.out.println("\nThe grade are: " + students[0].gradeClass +" "+ students[1].gradeClass +" "+ students[2].gradeClass);
        System.out.println("\nThe averages are: " + students[0].average +" "+ students[1].average +" "+ students[2].average);
        System.out.println("\nThe average for the three students is: " + ((students[0].average +students[1].average + students[2].average)/3) + "\n");
    }
}
