/*Assignment-3. 
● Create a class Person 
● Add member variables name as String, age and salary as int 
● Initialize the member variable along with declaration. 
● Now put the previous Person class in a package com.anudip.learning 
● Add a main method. Add a print message “Test Successful”. 
● Run the class after compilation. 
● Modify the classpaths to see the error messages on the console.*/



package com.anudip.learning;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private int salary;

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person p = new Person();

        System.out.print("Enter name: ");
        p.setName(scanner.nextLine());

        System.out.print("Enter age: ");
        p.setAge(scanner.nextInt());

        System.out.print("Enter salary: ");
        p.setSalary(scanner.nextInt());

        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Salary: " + p.getSalary());

        System.out.println("Test Successful");
    }
}
