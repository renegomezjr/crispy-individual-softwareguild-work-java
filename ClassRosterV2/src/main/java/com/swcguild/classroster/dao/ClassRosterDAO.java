/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.classroster.dao;

import com.swcguild.classroster.dto.Student;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

/**
 *
 * @author apprentice
 */
public interface ClassRosterDAO {


    void addStudent(Student student);

    Collection<Student> getAllStudents();

    Student getStudentById(String id);

    void loadRoster() throws FileNotFoundException;

    Student removeStudent(String idOfStudent);

    void writeRoster() throws IOException;
    
}
