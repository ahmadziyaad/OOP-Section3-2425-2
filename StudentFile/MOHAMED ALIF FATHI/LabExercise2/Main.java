public class Main {
    public static void main(String[] args) {
        // Q1
        System.out.println("Q1:");
        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());

        System.out.println("\nQ2: No Output");

        // Q3
        System.out.println("\nQ3:");
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();

        System.out.println("\nQ4: No Output");

        // Q5
        System.out.println("\nQ5:");
        Message msg = new Message();
        msg.display();
        msg.display("Hello World!");

        // Q6
        System.out.println("\nQ6:");
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());

        // Q7
        System.out.println("\nQ7:");
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());
    }
}

// Q1 and Q7
class Employee {

    // Q1
    private int empNum;
    private String empName;

    public void setEmpNum(int num) {
        empNum = num;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpName(String name) {
        empName = name;
    }

    public String getEmpName() {
        return empName;
    }

    // Q7
    private double salary;

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }
}

// Q2
class Car {
    private String brand;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }
}

// Q3
class Book {
    private String title;
    private String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Q4
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

// Q5
class Message {
    public void display() {
        System.out.println("Hello!");
    }

    public void display(String msg) {
        System.out.println("Message: " + msg);
    }
}

// Q6
class User {
    private static int counter = 0;

    public User() {
        counter++;
    }

    public static int getUserCount() {
        return counter;
    }
}