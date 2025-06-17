/*Assignment-1. 
● Create a class Student in Student.java then add member variables studentName, collegeName of type String 
● Add a member variable studentID of type int. ● Make all the member variables as private. 
● Add a main method. And print a message “Successful”. 
● Compile the class 
● Run the class (Follow Coding convention) */

import java.util.Scanner;

public class Student {
    private String studentName;
    private String collegeName;
    private int studentID;


    public void setStudentName(String name) {
        studentName = name;
    }

    public void setCollegeName(String college) {
        collegeName = college;
    }

    public void setStudentID(int id) {
        studentID = id;
    }


    public String getStudentName() {
        return studentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getStudentID() {
        return studentID;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        s.setStudentName(scanner.nextLine());

        System.out.print("Enter college name: ");
        s.setCollegeName(scanner.nextLine());

        System.out.print("Enter student ID: ");
        s.setStudentID(scanner.nextInt());

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + s.getStudentName());
        System.out.println("College: " + s.getCollegeName());
        System.out.println("ID: " + s.getStudentID());
        System.out.println("Successful");
    }
}

