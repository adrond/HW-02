package org.adrond;

import org.adrond.classes.Student;
import org.adrond.classes.StudyProfile;
import org.adrond.classes.University;

public class Main {
    public static void main(String[] args) {

        University university1 = new University("1", "First", "F", 1000, StudyProfile.MEDICINE );
        University university2 = new University("2", "Second", "S", 1500, StudyProfile.GEO);
        University university3 = new University("3", "Third", "T", 2000, StudyProfile.LAW );
        University university4 = new University("4", "Fourth", "Four", 2020, StudyProfile.MATH);

        Student student1 = new Student("First student", "1",1,1.0f);
        Student student2 = new Student("Second student", "2",2,1.5f);
        Student student3 = new Student("Third student", "3",3,2.0f);
        Student student4 = new Student("Fourth student", "4",4,2.5f);

        System.out.println(university1);
        System.out.println(university2);
        System.out.println(university3);
        System.out.println(university4);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
    }
}