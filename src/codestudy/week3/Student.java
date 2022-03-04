package codestudy.week3;

public class Student {

    static String firstName;
    static String lastName;
    double grade;
    boolean active = true;

    void printStudentInfoToConsole(){
        System.out.println( "Student " + this.lastName + " is active");
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if( grade < 1 || grade >10){
            System.out.println("warning: not valid grade");
            return;
        }
        this.grade = grade;
    }
}
