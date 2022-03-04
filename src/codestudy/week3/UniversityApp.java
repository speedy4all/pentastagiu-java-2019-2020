package codestudy.week3;

public class UniversityApp {

    public static void main(String[] args){
        Student student = new Student();
        Student.firstName = "Andrew";
        Student.lastName= "Mcafee";
        student.setGrade(-5);
        student.printStudentInfoToConsole();
    }

    
    private static void buildStudentsWithoutOOP() {
        String firstName = "Andrei";
        String lastName = "Popescu";
        double grade = 6.5;
        System.out.println("Student " + firstName + " " + lastName + " has grade " + grade);

        String firstNameStudent2 = "Maria";
        String lastNameStudent2 = "Ionescu";
        double gradeStudent2 = 6;
        System.out.println("Student " + firstNameStudent2 + " " + lastNameStudent2 + " has grade " + gradeStudent2);
    }
}
