package com.pentalog.pentastagiu.homework3.exercise3;

public class Student {
    private String name;
    private int age;
    private String university;

    public Student(String name, int age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public void connectToDevice(Connectable connectable) {
        connectable.connectToBluetooth();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUniversity() {
        return university;
    }
}
