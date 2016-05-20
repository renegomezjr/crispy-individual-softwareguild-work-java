/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.sitelabwebapp.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rene Gomez
 */
public class Factorizer {
    private int userNumber;
    private int sum = 0; //sum to find if the number is perfect
    private List<Integer> factors = new ArrayList<>();
    private String primeOrNot;
    private String perfectOrNot;

    public int getUserNumber() {
        return userNumber;
    }

    public int getSum() {
        return sum;
    }


    public List<Integer> getFactors() {
        return factors;
    }

    public String getPrimeOrNot() {
        return primeOrNot;
    }

    public String getPerfectOrNot() {
        return perfectOrNot;
    }
    
    public Factorizer(int numToFac){
        this.userNumber = numToFac;
        
        for (int i = 1; i < userNumber; i++) {
                if( userNumber % i == 0){
                    factors.add(i);
                    sum = sum + i;
                }
                              
            }
            //printing perfect or not, prime or not
            if ( sum == userNumber ){
                perfectOrNot = userNumber + " is a perfect number! Congrats!!";
            }else {
                perfectOrNot = userNumber + " is not perfect so you are not perfect!";
            
            }
                
            if (sum == 1){
                primeOrNot = userNumber + " is prime. That's exciting!";
            }else {
                primeOrNot = userNumber + " is not prime...lame.";
            }
    }
}
