package com.pentalog.pentastagiu.homework3.Bluetooth;

public class Student {
    private String NameOfStudent;
    private int OverallGrades;
    private String Origin;

    public Student(String nameOfStudent, int overallGrades, String origin) {
        NameOfStudent = nameOfStudent;
        OverallGrades = overallGrades;
        Origin = origin;
    }

    public String getNameOfStudent() {
        return NameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        NameOfStudent = nameOfStudent;
    }

    public int getOverallGrades() {
        return OverallGrades;
    }

    public void setOverallGrades(int overallGrades) {
        OverallGrades = overallGrades;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }
}
