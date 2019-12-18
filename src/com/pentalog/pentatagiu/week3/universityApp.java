package com.pentalog.pentatagiu.week3;

public class universityApp {
    public static void main(String[] args) {
        Student student=new Student();
        student.setGrade(8.5);
        student.setFirstName("Miclaus");
        student.setSecondName("Nicoleta");
        student.printStudentInfotoConsole();
        student.hasScolarship();
    }
}
