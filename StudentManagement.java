// Do not modify this code

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student roll number: ");
        int rollNumber = input.nextInt();

        Student student = new Student(name, rollNumber);

        int grade;
        System.out.println("Enter grades (enter -1 to finish):");

        while ((grade = input.nextInt()) != -1) {
            student.addGrade(grade);
        }
      
        student.displayStudentInfo();

        double average = student.calculateAverageGrade();
        System.out.println("Average Grade: " + average);

        input.close();
    }
}
