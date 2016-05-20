/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.classroster.dto;

import java.util.logging.Logger;

/**
 *
 * @author Rene Gomez
 */
public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private int gradeLevel;

    public Student(String id, String firstName, String lastName, int gradeLevel) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
    }
    
    public Student(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    
}
