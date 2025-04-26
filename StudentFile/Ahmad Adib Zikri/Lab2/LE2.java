//Q1

public class Main {
    public static void main(String[] args) {
        //Q1
        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());

        //Q3
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();

        //Q6
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());

        //Q7
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());

    }
}

class Employee {
    // TODO: Add fields
    // TODO: Add setter and getter methods
    private int empNum;
    private String empName;

    //Q7
    // TODO: Make salary private
    private int salary;

    public void setEmpNum(int n){
        empNum = n;
    }
    public int getEmpNum() {
        return empNum;
    }

    public void setEmpName(String n){
        empName = n;
    }

    public String getEmpName() {
        return empName;
    }

    //Q7
    // TODO: Write setSalary() and getSalary() methods
    public void setSalary(int s){
        salary = s;
    }

    public int getSalary(){
        return salary;
    }

}


//Q2
class Car{
    // TODO: Declare two private instance variables (brand and year)

    // TODO: Create setter for brand

    // TODO: Create getter for year

    private String brand;
    private int year;

    public void setBrand(String brandName){
        brand = brandName;
    }

    public int getYear(){
        return year;
    }
   
}



//Q3
class Book {
    private String title;
    private String author;

    // TODO: Add a constructor

    public Book(String t, String name){
        title = t;
        author = name;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}


//Q4
class Student {
    private String name;
    private int age;

    // TODO: Implement setter for name

    // TODO: Implement getter for age

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
}

//Q5
class Message {
    // TODO: Write a method display() that prints "Hello!"
    // TODO: Overload display(String msg) to print "Message: msg"

    public void display(){
        System.out.println("Hello");

    }

    public void display(String msg){
        System.out.println("Message: " + msg);
    }
}


//Q6
class User {
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


