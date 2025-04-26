public class Main {
    public static void main(String[] args) {

        //Question 1
        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());

        //Question 3
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();

        //Question 6
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());

        //Question 7
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());
    }
}

class Employee {

    // Question 1
    // TODO: Add fields
    private int empNum;
    private String empName;

    // TODO: Add setter and getter methods
    public void setEmpNum(int num){
        empNum = num;
    }

    public void setEmpName(String name){
        empName = name;
    }

    public int getEmpNum(){
        return empNum;
    }

    public String getEmpName(){
        return empName;
    }

    //Question 7
    // TODO: Make salary private
    private double salary;

    // TODO: Write setSalary() and getSalary() methods
    public void setSalary(double s){
        salary = s;
    }

    public double getSalary(){
        return salary;
    }

}

class Car {

    // Question 2
    // TODO: Declare two private instance variables (brand and year)
    private String brand;
    private int year;


    // TODO: Create setter for brand
    public void setBrand(String b){
        brand = b;
    }

    // TODO: Create getter for year
    public int getYear(){
        return year;
    }
}

class Book {
    private String title;
    private String author;

    // Question 3
    // TODO: Add a constructor
    public Book(String t, String a){
        title = t;
        author = a;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Student {
    private String name;
    private int age;

    // Question 4
    // TODO: Implement setter for name
    public void setName(String n){
        name = n;
    }

    // TODO: Implement getter for age
    public int getAge(){
        return age;
    }
}

class Message {

    // Question 5
    // TODO: Write a method display() that prints "Hello!"
    public void display(){
        System.out.println("Hello!");
    }

    // TODO: Overload display(String msg) to print "Message: msg"
    public void display(String msg){
        System.out.println("Message: " + msg);
    }
}

class User {

    // Question 6
    // TODO: Declare a static counter variable
    private static int count = 0;

    public User() {
        // TODO: Increment counter
        count++;
    }

    public static int getUserCount() {
        // TODO: Return counter
        return count;
    }
}
