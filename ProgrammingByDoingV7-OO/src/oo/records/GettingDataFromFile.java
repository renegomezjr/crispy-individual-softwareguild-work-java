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
class Dog {
    String breed;
    int age;
    double weight;
}

public class GettingDataFromFile {
    public static void main(String[] args) throws IOException {
        String userChoice;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Which file to open: ");
        userChoice = sc.nextLine();
        System.out.println("Reading data from " + userChoice);
        
        FileReader fIn = new FileReader(userChoice);
        BufferedReader bIn = new BufferedReader(fIn);
        Scanner sc1 = new Scanner(bIn);
        
        Dog dog1 = new Dog();
        dog1.breed = sc1.next();
        dog1.age = sc1.nextInt();
        dog1.weight = sc1.nextDouble();
        
        Dog dog2 = new Dog();
        dog2.breed = sc1.next();
        dog2.age = sc1.nextInt();
        dog2.weight = sc1.nextDouble();
        
        System.out.print("\nFirst dog: " + dog1.breed + ", " + dog1.age + ", " + dog1.weight + "\n");
        System.out.print("Second dog: " + dog2.breed + ", " + dog2.age + ", " + dog2.weight + "\n");
    }
}
