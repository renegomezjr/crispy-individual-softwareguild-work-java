/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.restfulwarmup.dto;

import java.util.Random;

/**
 *
 * @author Rene Gomez
 */
public class RandomNumber {
    private int randomNumber;
    Random r = new Random();

    public int getRandomNumber() {
        return randomNumber = r.nextInt(1000000);
    }

}
