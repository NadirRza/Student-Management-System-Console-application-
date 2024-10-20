package StudentManagementSystem;

import java.util.Objects;

public class StudentManagement {
    public static final Student[] STUDENTS = new Student[10];//constant
    private static  int studentCount = 0;
    public  static void addStudent(Student student){
        if (Objects.nonNull(student)){
            for (int i =0; i<STUDENTS.length;i++){
                if (Objects.isNull(STUDENTS[i])){
                    STUDENTS[i] = student;
                    break;
                }
            }
            if (studentCount < STUDENTS.length) {
                STUDENTS[studentCount] = student;
                studentCount++;

            } else {
                System.out.println("limit aşıldı");

            }


        }
    }
    public  static  void getAllStudents(){
        for (Student student : STUDENTS)
            if (Objects.nonNull(student)) {
                System.out.println(student);
            }
    }


    public  static void  getAllStudentsThanGradeGreaterThan(){
        for (Student student:STUDENTS)
            if (Objects.nonNull(student) && student.getGrade() > 70) {
                System.out.println(student);
            }
    }
}
