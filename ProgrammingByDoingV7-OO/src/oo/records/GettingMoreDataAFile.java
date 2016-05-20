/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.records;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
class Person{
    String name;
    int age;
}

public class GettingMoreDataAFile {
     public static void main(String[] args) throws IOException {
        String userChoice;
        Person[] pArr = new Person[5];
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Which file to open: ");
        userChoice = sc.nextLine();
        System.out.println("Reading data from " + userChoice);
        
        Scanner sc1 = new Scanner(new BufferedReader(new FileReader(userChoice)));
        
        int counter = 0;
        while(sc1.hasNext()){
           
        Person person1 = new Person();
        person1.name = sc1.next();
        person1.age = sc1.nextInt();
        pArr[counter] = person1;
        counter++;
        
        }
        
         for (int i = 0; i < pArr.length; i++) {
             System.out.println(pArr[i].name + " is " + pArr[i].age);
         }
        
    }
}
