/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmups.datamodeling;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Rene Gomez
 */
public class School {
    
    
    public static void main(String[] args) {
        HashMap<String, ArrayList<Student>> school = new HashMap<>();
        
        Student tim = new Student("Tim", "t@theMail.com");
        Student paul = new Student("paul", "t@theMail.com");
        Student sally = new Student("sally", "t@theMail.com");
        Student martha = new Student("martha", "t@theMail.com");
        Student bob = new Student("bob", "t@theMail.com");
        
        ArrayList<Student> algebra1 = new ArrayList<>();
        ArrayList<Student> drama1 = new ArrayList<>();
        ArrayList<Student> physicalEducation = new ArrayList<>();
        
        algebra1.add(tim);
        algebra1.add(paul);
        algebra1.add(sally);
        algebra1.add(martha);
        algebra1.add(bob);
        drama1.add(paul);
        drama1.add(bob);
        drama1.add(sally);
        drama1.add(martha);
        drama1.add(tim);
        physicalEducation.add(martha);
        physicalEducation.add(bob);
        physicalEducation.add(sally);
        physicalEducation.add(paul);
        physicalEducation.add(tim);
        
        
        
        school.put("Algebra 1", algebra1);
        school.put("Drama 1", drama1);
        school.put("Physical Education", physicalEducation);
        
    }
}
