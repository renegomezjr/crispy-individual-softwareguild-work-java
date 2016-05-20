/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.classroster.dao;

import com.swcguild.classroster.dto.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class ClassRosterDAOImpl implements ClassRosterDAO {
    

    private HashMap<String, Student> students = new HashMap<>();
    private static final String DELIMITER = "::";
    private String roster_file = "ClassRoster.txt";

    public ClassRosterDAOImpl() {
    }
    
    public ClassRosterDAOImpl(String file) {
        roster_file = file;
    }

    
    @Override
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }
    
    @Override
    public Student getStudentById(String id){
        return students.get(id);
    }

    @Override
    public void loadRoster() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(roster_file)));

        while (sc.hasNextLine()) {
            String recordLine = sc.nextLine();
            String[] recordProperties = recordLine.split(DELIMITER);

            if (recordProperties.length != 4) {
                continue;
            }

            Student studentRecord = new Student();
            studentRecord.setId(recordProperties[0]);
            studentRecord.setFirstName(recordProperties[1]);
            studentRecord.setLastName(recordProperties[2]);
            studentRecord.setGradeLevel(Integer.parseInt(recordProperties[3]));

            students.put(studentRecord.getId(), studentRecord);
        }
    }

    @Override
    public void writeRoster() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(roster_file));
        
        Collection<Student> allStudentsInHashMap = students.values();
        
        for(Student stu : allStudentsInHashMap){
            writer.println(stu.getId() + DELIMITER
                            + stu.getFirstName() + DELIMITER
                            + stu.getLastName() + DELIMITER
                            + stu.getGradeLevel());
        }
        writer.flush();
        writer.close();
    }
    
    @Override
    public Student removeStudent(String idOfStudent){
        Student removedStudent = students.remove(idOfStudent);
        
        return removedStudent;
    }
}
