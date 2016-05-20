/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.classroster.ops;

import com.swcguild.classroster.dao.ClassRosterDAOImpl;
import com.swcguild.classroster.dto.Student;
import com.swcguild.classroster.ui.ConsoleIOImpl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Rene Gomez
 */
public class ClassRosterControllerImpl implements ClassRosterController {
    
    private ConsoleIOImpl console; //new ConsoleIOImpl();
    private ClassRosterDAOImpl daoLayer; //new ClassRosterDAO();

    public ConsoleIOImpl getConsole() {
        return console;
    }

    public void setConsole(ConsoleIOImpl console) {
        this.console = console;
    }

    public ClassRosterDAOImpl getDaoLayer() {
        return daoLayer;
    }

    public void setDaoLayer(ClassRosterDAOImpl daoLayer) {
        this.daoLayer = daoLayer;
    }
    
    @Override
    public void run() throws IOException {
       
        boolean keepRunning = true;
        int menuSelect = 0;
        
        try {
            daoLayer.loadRoster();
        } catch (FileNotFoundException ex) {
            keepRunning = false;
            console.print("Roster file not found.");
        }
        
        while(keepRunning) {
        printMenu();
        menuSelect = console.readInt("Please select one of the above menu choices: ", 1, 1);
        
            switch(menuSelect){
                case 1: //add  student
                    addStudent();
                    break;
                case 2: //update  student
                    updateStudent();
                    break;
                case 3: //list all  student
                    listAllStudents();
                    break;
                case 4: //remove student
                    removeStudent();
                    break;
                case 5: //find student
                    findStudent();
                    break;
                default: //add  student
                    keepRunning = false;
                    daoLayer.writeRoster();
                    break;
            }
        
        }
        
    }
    
    private void printMenu(){
        console.print("Main Menu");
        console.print("1. Enter New Student");
        console.print("2. Update Student");
        console.print("3. List All Student");
        console.print("4. Remove Student");
        console.print("5. Find Student");
        console.print("6. Exit");
        
    }
    
    private void updateStudent(){
        String id = console.readString("Please enter id of student you want to update: ");
        Student studentToEdit = daoLayer.getStudentById(id);
        
        if(studentToEdit == null){
            console.print("There is no student with that id.");
        } else {
            boolean studentUpdated = false;
            String updatedFirstName = console.readString(studentToEdit.getFirstName() 
                    + " :Please enter new first name or hit enter to keep current name.");
            if(!updatedFirstName.isEmpty()){
                studentToEdit.setFirstName(updatedFirstName);
                studentUpdated = true;
            }
            
            String updatedLastName = console.readString(studentToEdit.getLastName() 
                    + " :Please enter new last name or hit enter to keep current name.");
            if(!updatedLastName.isEmpty()){
                studentToEdit.setFirstName(updatedLastName);
                studentUpdated = true;

            }
            
            String updatedGradeLevel = console.readString(studentToEdit.getGradeLevel() 
                    + " :Please enter new first name or hit enter to keep current name.");
            if(!updatedGradeLevel.isEmpty()){
                studentToEdit.setGradeLevel(Integer.parseInt(updatedGradeLevel));
                studentUpdated = true;
            }
            
            if(studentUpdated){
                console.print("Student has been updated.");
            }else {
                console.print("Student has not been update.");
            }
        }
    }
    
    private void listAllStudents(){
        Collection<Student> students = daoLayer.getAllStudents();
        for(Student stu : students) {
            console.print(stu.getFirstName() +" "+ stu.getLastName()
                         +"\n" + stu.getId() + ", " + stu.getGradeLevel());
        }
    }
    
    private void findStudent(){
        String lastNameToSearchFor = console.readString("Please enter the last name of the student you are search for: ");
        Collection<Student> allStudents = daoLayer.getAllStudents();
        ArrayList<Student> matchingStudents = new ArrayList<>(); 
        
        for(Student curStudent : allStudents){
            String curLastName= curStudent.getLastName();
            if(curLastName.equalsIgnoreCase(lastNameToSearchFor)){
                matchingStudents.add(curStudent);
            }
        }
        
        if(matchingStudents.isEmpty()){
            console.print("You don't have any students with that last name");
        }else {
            console.print("These are the matches.");
            for(int i = 0; i < matchingStudents.size(); i++){
                Student curStudent = matchingStudents.get(i);
                console.print(curStudent.getId() + curStudent.getFirstName() + curStudent.getLastName());
            }
        }
        console.readString("Please hit enter to continue...");
        
    }
    
    private void removeStudent(){
        String studentIdToRemove = console.readString("Please enter id");
        Student removedStudentFromDAO = daoLayer.removeStudent(studentIdToRemove);
        console.print(removedStudentFromDAO.getFirstName() + " " + removedStudentFromDAO.getLastName());
        console.readString("Please press enter to continue...");
    }
    
    private void addStudent(){
        String studentId = console.readString("Please enter Student ID: ");
        String firstName = console.readString("Please enter Student first name: ");
        String lastName = console.readString("Please enter Student last name: ");
        int gradeLevel = console.readInt("Please enter grade level: ", 1, 12);
        
        Student newStudent = new Student(studentId, firstName, lastName, gradeLevel);
        //add student to database
        daoLayer.addStudent(newStudent);
        
        console.readString("Student successfully added. Please hit enter to continue.");
    }
}
