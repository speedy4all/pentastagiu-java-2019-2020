package com.pentalog.pentastagiu.homework3.connectingToBluetooth;

public class Student{
    private Integer studentRegistrationNumber;
    private String studentName;
    private String studentSpecialization;
    private String studentUniversity;



    public Student(Integer studentRegistrationNumber, String studentName, String studentSpecialization,
                   String studentUniversity) {
        super();
        this.studentRegistrationNumber = studentRegistrationNumber;
        this.studentName = studentName;
        this.studentSpecialization = studentSpecialization;
        this.studentUniversity = studentUniversity;
    }


    //getters and setters
    public Integer getStudentRegistrationNumber() {
        return studentRegistrationNumber;
    }
    public void setStudentRegistrationNumber(Integer studentRegistrationNumber) {
        this.studentRegistrationNumber = studentRegistrationNumber;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentSpecialization() {
        return studentSpecialization;
    }
    public void setStudentSpecialization(String studentSpecialization) {
        this.studentSpecialization = studentSpecialization;
    }
    public String getStudentUniversity() {
        return studentUniversity;
    }
    public void setStudentUniversity(String studentUniversity) {
        this.studentUniversity = studentUniversity;
    }


}
