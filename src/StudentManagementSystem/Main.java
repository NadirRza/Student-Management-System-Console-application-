package StudentManagementSystem;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Name-1",73);
        Student student2 = new Student("Name-2",69);
        Student student3 = new Student("Name-3",55);
        Student student4 = new Student("Name-4",90);



        StudentManagement.addStudent(student1);
        StudentManagement.addStudent(student2);
        StudentManagement.addStudent(student3);
        StudentManagement.addStudent(student4);


        System.out.println("Students : " );
        StudentManagement.getAllStudents();

        System.out.println();

        System.out.println("Grade greater than 70 : ");
        StudentManagement.getAllStudentsThanGradeGreaterThan();
    }

}


