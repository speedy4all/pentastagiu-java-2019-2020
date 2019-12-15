package lessons.week3.university;

class Student {
    private String nume;
    private String prenume;
    private int age;
    private double grade;
    private boolean active = true;

    Student() {
        this.nume = "Default nume";
        this.prenume = "Default prenume";
        this.age = 100;
        this.grade = 100.5;
    }

    Student(String nume, String prenume, int age, double grade) {
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
        this.grade = grade;
    }

    public boolean hasScolarship() {
        return grade > 8;
    }
}
