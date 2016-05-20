/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables;

/**
 *
 * @author Rene Gomez
 */
public class VariableNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;
        
        //car
        cars = 100;
        //space
        space_in_a_car = 4.0; //no it is not necessary
        //drivers
        drivers = 30;
        //passengers
        passengers = 90;
        //cars_not_driven
        cars_not_driven = cars - drivers;
        //cars_driven
        cars_driven = drivers;
        //carpool
        carpool_capacity = cars_driven * space_in_a_car;
        //average
        average_passengers_per_car = passengers / cars_driven;
        
        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be  " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carpool_capacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
        
    }
}
