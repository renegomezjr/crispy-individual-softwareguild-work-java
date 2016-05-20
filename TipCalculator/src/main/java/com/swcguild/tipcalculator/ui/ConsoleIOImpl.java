/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.tipcalculator.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Winona Wixson
 */
public class ConsoleIOImpl implements ConsoleIO {
    private Scanner sc = new Scanner(System.in);

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public String readString(String prompt) {
        Scanner mySc = new Scanner(System.in);
        System.out.println(prompt);
        return mySc.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        boolean badInput;
        int result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextInt();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);
        return result;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        int result;
        do {
            result = readInt(prompt);
        } while (result < min || result > max);

        return result;
    }

    @Override
    public long readLong(String prompt) {
        boolean badInput;
        long result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextLong();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long result;
        do {
            result = readLong(prompt);
        } while (result < min || result > max);

        return result;
    }

    @Override
    public float readFloat(String prompt) {
        boolean badInput;
        float result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextFloat();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float result;
        do {
            result = readFloat(prompt);
        } while (result < min || result > max);

        return result;
    }

    @Override
    public double readDouble(String prompt) {
        boolean badInput;
        double result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextDouble();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        long result;
        do {
            result = readLong(prompt);
        } while (result < min || result > max);

        return result;
    }
}
