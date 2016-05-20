/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmups.countingdice;

import java.util.Random;

/**
 *
 * @author Rene Gomez
 */
public class CountingDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();

        int die1 = 0;
        int die2 = 0;
        int sum = 0;

        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;
        int fiveCount = 0;
        int sixCount = 0;
        int sevenCount = 0;
        int eightCount = 0;
        int nineCount = 0;
        int tenCount = 0;
        int elevenCount = 0;
        int twelveCount = 0;

        int rollCount = 0;
        while (rollCount < 50) {
            die1 = 1 + r.nextInt(6);
            die2 = 1 + r.nextInt(6);
            sum = die1 + die2;
            rollCount++;

            switch (sum) {

                case 2:
                    twoCount++;
                    break;
                case 3:
                    threeCount++;
                    break;
                case 4:
                    fourCount++;
                    break;
                case 5:
                    fiveCount++;
                    break;
                case 6:
                    sixCount++;
                    break;
                case 7:
                    sevenCount++;
                    break;
                case 8:
                    eightCount++;
                    break;
                case 9:
                    nineCount++;
                    break;
                case 10:
                    tenCount++;
                    break;
                case 11:
                    elevenCount++;
                    break;
                case 12:
                    twelveCount++;
                    break;

            }

        }

        System.out.println("Histogram of rolls:");
        System.out.println("2 occurred  " + makeStars(twoCount) + "  " + twoCount + " times");
        System.out.println("3 occurred  " + makeStars(threeCount) + "  " + threeCount + " times");
        System.out.println("4 occurred  " + makeStars(fourCount) + "  " + fourCount + " times");
        System.out.println("5 occurred  " + makeStars(fiveCount) + "  " + fiveCount + " times");
        System.out.println("6 occurred  " + makeStars(sixCount) + "  " + sixCount + " times");
        System.out.println("7 occurred  " + makeStars(sevenCount) + "  " + sevenCount + " times");
        System.out.println("8 occurred  " + makeStars(eightCount) + "  " + eightCount + " times");
        System.out.println("9 occurred  " + makeStars(nineCount) + "  " + nineCount + " times");
        System.out.println("10 occurred " + makeStars(tenCount) + "  " + tenCount + " times");
        System.out.println("11 occurred " + makeStars(elevenCount) + "  " + elevenCount + " times");
        System.out.println("12 occurred " + makeStars(twelveCount) + "  " + twelveCount + " times");

    }

    public static String makeStars(int dieCount) {
        String ofStars = "****************************************************";
        String resultsStars = ofStars.substring(0, dieCount);
        return resultsStars;
    }
}
