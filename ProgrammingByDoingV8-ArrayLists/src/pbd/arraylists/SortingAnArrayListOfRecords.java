/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.arraylists;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
class Car2 {

    String make;
    String model;
    int year;
    String license_plate;
    

   
 
}

public class SortingAnArrayListOfRecords {
    public static Comparator<Car2> carComp = new Comparator<Car2>() {
        @Override
        public int compare(Car2 o1, Car2 o2) {
            int car1 = o1.year;
            int car2 = o2.year;
            return car1 - car2;
        }
    };

    public static void main(String[] args) throws IOException {
        ArrayList<Car2> cArr = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("From which file do you want to load this information? ");
        String userFile = sc.nextLine();

        Scanner sc2 = new Scanner(new BufferedReader(new FileReader(userFile)));

        while (sc2.hasNext()) {
            Car2 newCar = new Car2();

            newCar.make = sc2.next();
            newCar.model = sc2.next();
            newCar.year = sc2.nextInt();
            newCar.license_plate = sc2.next();
            cArr.add(newCar);
      
        }
        Collections.sort(cArr,carComp);
        
//        for (int i = 0; i < cArr.size(); i++) {
//            for (int j = i + 1; j < cArr.size(); j++) {
//                if(cArr.get(i).year > cArr.get(j).year){
//                    Car2 temp = cArr.get(i);
//                    cArr.add(i, cArr.get(j));
//                    cArr.add(j, temp);
//                }
//            }
//        }
        System.out.println("Data loaded");
        System.out.println("Data Sorted");
        
        System.out.print("ArrayList: [");
        for (Car2 c : cArr) {
            System.out.print(c.year + " " + c.make + " " + c.model + " (" + c.license_plate + "),");
        }
                System.out.print("]\n");

    }

}
