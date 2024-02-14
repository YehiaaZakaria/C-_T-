package Controller;

import Model.Student;
import Model.Students_DataBase;

import java.util.ArrayList;

public class Tracker {
    private Students_DataBase studentsDataBase = new Students_DataBase();

    private ArrayList<Student>AllStudents= studentsDataBase.getStudentsList();

    public Student getHighest () {
        Student highest = AllStudents.get(0);
        for (Student student : AllStudents) {
            if (student.getGrade() > highest.getGrade()) {
                highest = student;
            }
        }
        return highest;
    }

    public Student getLowest () {
        Student lowest = AllStudents.get(0);
        for (Student student : AllStudents) {
            if (student.getGrade() < lowest.getGrade()) {
                lowest = student;
            }
        }
        return lowest;
    }

    public Float getAverage () {
        Float sum =0f;
        for (Student student : AllStudents) {
            sum += student.getGrade();
        }
        return sum/AllStudents.size();
    }

    public void addStudent(String name, String id, Float grade) {
        Student student = new Student(name, id, grade);
        studentsDataBase.addStudent(student);
    }

    public void printHighest() {
        Student highest = getHighest();
        System.out.println("This is the student with the highest grade: ");
        System.out.println("Name: " + highest.getName());
        System.out.println("Id: " + highest.getId());
        System.out.println("Grade: " + highest.getGrade());
    }

    public void printLowest() {
        Student lowest = getLowest();
        System.out.println("This is the student with the lowest grade: ");
        System.out.println("Name: " + lowest.getName());
        System.out.println("Id: " + lowest.getId());
        System.out.println("Grade: " + lowest.getGrade());
    }

    public void getGradebyId(String id) {
        boolean found = false;
        for (Student student : AllStudents) {
            if (student.getId().equals(id)) {
                System.out.println("Name: " + student.getName());
                System.out.println("Id: " + student.getId());
                System.out.println("Grade: " + student.getGrade());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }
}
