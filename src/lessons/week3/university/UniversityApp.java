package lessons.week3.university;

import lessons.week3.university.Student;

public class UniversityApp {
    public static void main(String[] args) {
        Student student1 = new Student("nume1", "nume2", 22, 8.5);
        System.out.println(student1.hasScolarship());
    }
}
