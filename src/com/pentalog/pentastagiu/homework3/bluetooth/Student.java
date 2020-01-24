package com.pentalog.pentastagiu.homework3.bluetooth;

public class Student{
    private Integer registrationNumber;
    private String name;
    private String specialization;
    private String university;


    public Student(Integer registrationNumber, String name, String specialization, String university) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.specialization = specialization;
        this.university = university;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
