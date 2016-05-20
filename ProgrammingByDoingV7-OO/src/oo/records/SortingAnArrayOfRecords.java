/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.records;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
class Car3 {

    String make;
    String model;
    int year;
    String license_plate;
}
public class SortingAnArrayOfRecords {
    public static void main(String[] args) throws IOException {
//        Car3[] cArr = new Car3[5];
        Car3[] cArr = new Car3[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("From which file do you want to load this information? ");
        String userFile = sc.nextLine();

        Scanner sc2 = new Scanner(new BufferedReader(new FileReader(userFile)));

        int counter = 0;
        while (sc2.hasNext()) {
            Car3 newCar = new Car3();
            
            newCar.make = sc2.next();
            newCar.model = sc2.next();
            newCar.year = sc2.nextInt();
            newCar.license_plate = sc2.next();
            cArr[counter] = newCar;
            counter++;
        }
        Car3 temp = null;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < cArr.length; j++) {
                if(cArr[i].year > cArr[j].year){
                    temp = cArr[i];
                    cArr[i] = cArr[j];
                    cArr[j] = temp;
                }
            }
           
        }
        

        System.out.println("Data loaded");

        for (int i = 0; i < cArr.length; i++) {
            System.out.println("\nCar " + (i + 1));

            System.out.println("Make: " + cArr[i].make);

            System.out.println("Model: " + cArr[i].model);

            System.out.println("Year: " + cArr[i].year);

            System.out.println("License: " + cArr[i].license_plate);

        }
    }
}
