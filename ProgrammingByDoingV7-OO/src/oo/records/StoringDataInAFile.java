/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.records;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
class Car {

    String make;
    String model;
    int year;
    String license_plate;
}

public class StoringDataInAFile {

    public static void main(String[] args) throws IOException {
        String userChoice;
        Scanner sc = new Scanner(System.in);

        Car[] cArr = new Car[5];

        for (int i = 0; i < 5; i++) {
            Car newCar = new Car();
            System.out.println("Car " + (i + 1));
            
            
            System.out.print("Make: ");
            newCar.make = sc.nextLine();

            System.out.print("Model: ");
            newCar.model = sc.nextLine();

            System.out.print("License: ");
            newCar.license_plate = sc.nextLine();
            
            System.out.print("Year: ");
            newCar.year = sc.nextInt();
            sc.nextLine();

            cArr[i] = newCar;
        }

        System.out.println("To which file do you want to save this information? ");
        String userFile = sc.nextLine();
        PrintWriter wr = new PrintWriter(new FileWriter(userFile));

        for (int i = 0; i < cArr.length; i++) {
            wr.println(cArr[i].make + " " + cArr[i].model + " " + cArr[i].year + " " + cArr[i].license_plate);
        }

        wr.flush();
        wr.close();

        System.out.println("Data saved.");
    }

}
