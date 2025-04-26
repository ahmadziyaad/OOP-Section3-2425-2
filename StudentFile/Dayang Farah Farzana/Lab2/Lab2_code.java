public class Main {
    public static void main(String[] args) {
        //QUESTION 1
        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());
        
        //QUESTION 3
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();
        
        //QUESTION 6
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());
        
        //QUESTION 7
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());
    }
}

//QUESTION 1
class Employee {
    // TODO: Add fields
    private int empNum;
    private String empName;
    
    // TODO: Add setter and getter methods
    // Setter
    public void setEmpNum(int num){
        empNum = num;
    }
    
    public void setEmpName(String name){
        empName = name;
    }
    
    // Getter
    public int getEmpNum(){
        return empNum;
    }
    
    public String getEmpName(){
        return empName;
    }
    
    //QUESTION 7
    // TODO: Make salary private
    private double salary;

    // TODO: Write setSalary() and getSalary() methods
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }
}

//QUESTION 2
class Car {
    // TODO: Declare two private instance variables (brand and year)
    private String brand;
    private int year;

    // TODO: Create setter for brand
    public void setBrand(String brand){
        this.brand=brand;
    }
    // TODO: Create getter for year
    public int getYear(){
        return year;
    }
}

//QUESTION 3
class Book {
    private String title;
    private String author;

    // TODO: Add a constructor
    public Book(String ti, String au){
        this.title = ti;
        this.author = au;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

//QUESTION 4
class Student {
    private String name;
    private int age;

    // TODO: Implement setter for name
    public void setName(String name){
        this.name = name;
    }

    // TODO: Implement getter for age
    public int getAge(){
        return age;
    }
}

//QUESTION 5
class Message {
    // TODO: Write a method display() that prints "Hello!"
    public void display(){
        System.out.println("Hello!");
    }
    // TODO: Overload display(String msg) to print "Message: msg"
    public void display(String msg){
        System.out.println("Message: " + msg);
    }
}

//QUESTION 6
class User {
    // TODO: Declare a static counter variable
    private static int counter = 0;

    public User() {
        // TODO: Increment counter
        counter++;
    }

    public static int getUserCount() {
        // TODO: Return counter
        return counter;
    }
}