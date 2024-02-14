package Model;

public class Student {
    private String name;
    private String id;
    private Float grade;

    //Construtor
    public Student(String name, String id, Float grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public Float getGrade() {
        return this.grade;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }
}
