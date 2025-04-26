// Object-Oriented Programming
// Lab Exercise 2
// MIKHAIL BIN YASSIN A21EC0053



public class Main {
    public static void main(String[] args) {
        // Question 01
        System.out.println("\nQuestion 01 - Class and Object Creation");
        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());


        // Question 03
        System.out.println("\nQuestion 02 - Instance Variables and Data Fields");
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();


        // Question 06
        System.out.println("\nQuestion 06 - Static vs Non-Static");
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());


        // Question 07
        System.out.println("\nQuestion 07 - Access Modifiers");
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());

    }




}

// Question 01 - Start
class Employee {
    int empNum;
    String empName;
    // TODO: Make salary private
    private double salary;

    public Employee() {

    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }
    public String getEmpName() {
        return empName;
    }
    public int getEmpNum() {
        return empNum;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
// --- End ---

// Question 02 - Start
class Car {
    String brand;
    int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }
}
// --- End ---

// Question 03
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
// --- End ---

// Question 04 - Start
class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
// --- End --

// Question 05 -- Start
class Message {
    public void display() {
        System.out.println("Hello!");
    }
    public void display(String msg) {
        System.out.println("Message: " + msg);
    }
}
// --- End ---

// Question 06 - Start
class User {
    private static int userCount = 0;

    public User() {
        userCount++;
    }

    public static int getUserCount() {
        return userCount;
    }
}


