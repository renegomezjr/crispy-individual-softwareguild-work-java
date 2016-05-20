/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.records;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
class Address2 {

    String street;
    String city;
    String state;
    int zip;

    public String toString() {
        return (this.street + ", " + this.city + ", " + this.state + "  " + this.zip);
    }
    
    //this method does not function if you change the name.
}

public class AddressToString {

    public static void main(String[] args) throws Exception {
        URL addys = new URL("https://cs.leanderisd.org/txt/fake-addresses.txt");

        Address2[] addybook = new Address2[5];

        Scanner fin = new Scanner(addys.openStream());

        for (int i = 0; i < 5; i++) {
            addybook[i] = new Address2();
            addybook[i].street = fin.nextLine();
            addybook[i].city = fin.nextLine();
            addybook[i].state = fin.next();
            addybook[i].zip = fin.nextInt();
            fin.skip("\n");
        }
        fin.close();

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + addybook[i]);
        }
    }
}
