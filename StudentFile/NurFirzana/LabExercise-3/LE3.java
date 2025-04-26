// NAME: NUR FIRZANA BINTI BADRUS HISHAM
// LAB 3 - ARRAY

import java.util.*;

public class LE3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // QUESTION 1 
        // double gpa[] = new double(4); //Line to fix
        double[] gpa = new double[4];    //[] wrong placement, array always using []


        // QUESTION 2
        // int[] points;
        // points = {90, 85, 88};     //Line to fix
        int[] points = {90, 85, 88};  //dont split it 


        // QUESTION 4
        // Declare and initialize a 2D array called matric that stores the numbers 1 to 9 arranged in 3 rows and 3 columns
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };


        // QUESTION 5
        // Create an ArrayList named grades that stores Double values for student grades
        ArrayList<Double> grades = new ArrayList<>();


        // 1D array for student scores
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++){
            System.out.print("Enter score " + (i+1) + ": ");
            scores[i] = input.nextInt();
        }

        int[] temp = {10, 20, 30, 40};    //call Q6
        printAverage(temp);

        double highest = findHighestScore(scores);        //call Q7
        System.out.println("Highest score: " + highest);

        // 2D array for marks of 3 students and 3 subjects
        int[][] marks = {
            {85, 78, 90},
            {88, 92, 85},
            {75, 80, 85}
        };

        double totalMark = sumSubjectMarks(marks);        // Call Q9
        System.out.println("Total Marks: " + totalMark);

        // ArrayList of subjects
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");

        // Array of Student objects
        Student[] students = new Student[3];
        students[0] = new Student("Ali", 20);
        students[1] = new Student("Siti", 21);
        students[2] = new Student("Raj", 19);

        printStudentInfo(students);        // call Q8

        input.close();
    }


    // QUESTION 3 
    // correct the misuse of variable-length arguement
    public static void printTotal(String title, int... values ){
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            sum += values[i];
        }
    }


    // QUESTION 6
    // Create an anonymous array to store and immediately print the average of {10, 20, 30, 40} using a helper method printAverage
    static void printAverage(int[] number){
        int sum = 0;
        for (int i = 0; i < number.length; i++){
            sum += number[i];
        }
        double average = (double)sum/number.length;
        System.out.println("\nAverage: " + average);
    }


    // QUESTION 7 
    // Create a static method named findHighestScore(int[] scores)  that returns the highest value in the scores array. Call it from the main() method and print the result
    static double findHighestScore(int[] scores){
        double highest = scores[0];
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > highest){
                highest = scores[i];
            }
        }
        return highest;
    }


    // QUESTION 8
    // Write a method named printStudentInfo(Student[] arr)  to print all students’ name and age using enhanced for-each loop. Replace the existing print loop with a call to this method.
    static void printStudentInfo(Student[] arr){
        // Display all student names
        for (Student s : arr) {
            System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
        }
        
    }


    // QUESTION 9 
    // Write a method sumSubjectMarks(int[][] marks)  that returns the sum of all elements in the marks 2D array and print the result in main()
    static double sumSubjectMarks(int[][] marks){ 
        double total = 0.0;
        for (int i = 0; i < marks.length; i++){
            for (int j = 0; j < marks.length; j++){
                total += marks[i][j];
            }
        }
        return total;
    }
}

// Student Class
class Student {
    private String name;
    private int age;

    public Student(String name, int age){  //constructor
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}