/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.records;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
class Student5 {

    int id;
    int gradeNum;
    float grade;
    String letterGrade;

}

public class SortingRecordsTwoFields {

    public static void main(String[] args) throws FileNotFoundException {

        Student5[] sArr = new Student5[30];

        Scanner sc = new Scanner(System.in);

        System.out.println("From which file do you want to load this information? ");
        String userFile = sc.nextLine();

        Scanner sc2 = new Scanner(new BufferedReader(new FileReader(userFile)));

        int counter = 0;
        while (sc2.hasNext()) {
            Student5 newStudent = new Student5();

            newStudent.id = sc2.nextInt();
            newStudent.gradeNum = sc2.nextInt();
            newStudent.grade = sc2.nextFloat();
            newStudent.letterGrade = sc2.next();
            sArr[counter] = newStudent;
            counter++;
        }

        Student5 temp = null;
        for (int i = 0; i < sArr.length; i++) {
            for (int j = i + 1; j < sArr.length; j++) {
                if (sArr[i].id > sArr[j].id) {
                    temp = sArr[i];
                    sArr[i] = sArr[j];
                    sArr[j] = temp;
                }
            }

        }

        for (int i = 0; i < sArr.length; i++) {
            for (int j = i + 1; j < sArr.length; j++) {
                if (sArr[i].id == sArr[j].id) {
                    if (sArr[i].gradeNum > sArr[j].gradeNum) {
                        temp = sArr[i];
                        sArr[i] = sArr[j];
                        sArr[j] = temp;
                    }
                }
            }

        }

        System.out.println("Data loaded");
        System.out.println("Data sorted");
        System.out.println("Here are the sorted grades:");
        for (int i = 0; i < sArr.length; i++) {

            System.out.println(sArr[i].id + " "+ sArr[i].gradeNum +" "+ sArr[i].grade + " " + sArr[i].letterGrade);

        }
    }
}
