package StudentManagementSystem;

import java.util.UUID;

public class Student {
    private String id;
    private String name;
    private int  grade;

    public  Student(String name, int grade){
        this.id= UUID.randomUUID().toString();
        this.name=name;
        this.grade=grade;
    }

    // getter setter yarat


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }



    @Override
    public String toString() {
        return String.format("Student{id='%s', name='%s', grade=%d}", id, name, grade);
    }
}
