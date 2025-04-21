public class Main {
    public static void main(String[] args) {
        // Question 1
        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());

        // Question 3
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();

        // Question 6
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());

        // Question 7
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());
    }
}

// Question 1
class Employee {
    // Fields
    private int empNum;
    private String empName;

    // Setter and Getter methods
    public void setEmpNum(int num){
        empNum = num;
    }

    public int getEmpNum(){
        return empNum;
    }

    public void setEmpName(String name) {
        empName = name;
    }

    public String getEmpName() {
        return empName;
    }

    // Question 7
        // Make salary private
        private int salary;

        // Write setSalary() and getSalary() methods
        public void setSalary(int salary){
            this.salary = salary;
        }
        public int getSalary(){
            return salary;
        }
}

// Question 2
class Car {
    // Two private instance variables
    private String brand;
    private int year;

    // Setter for brand
    public void setBrand(String b){
        brand = b;
    }

    // Getter for year
    public int getYear(){
        return year;
    }
}

// Question 3
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}


// Question 4
class Student {
    private String name;
    private int age;

    // Setter for name
    public void setName(String n){
        name = n;
    }

    // Getter for age
    public int getAge(){
        return age;
    }
}

// Question 5
class Message {
    // a method display() that prints "Hello!"
    public void display(){
        System.out.println("Hello!");
    }

    // Overload display(String msg) to print "Message: msg"
    public void display(String msg) {
        System.out.println("Message: " + msg);
    }
}

// Question 6
class User {
    // Static counter variable
    private static int count = 0;

    public User() {
        // Increment counter
        count++;
    }

    public static int getUserCount() {
        // Return counter
        return count;
    }
}
