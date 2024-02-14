package Model;

import java.util.ArrayList;

public class Students_DataBase {
    private ArrayList<Student>StudentsList;

    public Students_DataBase() {
        this.StudentsList = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        this.StudentsList.add(student);
    }

    public ArrayList<Student>getStudentsList() {
        return this.StudentsList;
    }
}
