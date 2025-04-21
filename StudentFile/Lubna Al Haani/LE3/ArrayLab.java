// Lubna Al Haani Binti Radzuan (A23CS0107)
// Lab Exercise 3

import java.util.*;

public class ArrayLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part A: no.1
        double gpa[] = new double[4]; // Change (4) to [4]
        // Part A: no.2
        int[] points = {90, 85, 88}; // shorthand initialization

        // 1D array for student scores
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }
        // method call for Part C: no.7
        System.out.println("\nHighest score: " + findHighestScore(scores) + "\n");

        // 2D array for marks of 3 students and 3 subjects
        int[][] marks = {
            {85, 78, 90},
            {88, 92, 79},
            {75, 80, 85}
        };
        // method call for Part C: no.9
        System.out.println("Total marks: " + sumSubjectMarks(marks) + "\n");

        // Part B: no.4
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // ArrayList of subjects
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");

        // Part B: no.5
        ArrayList<Double> grades = new ArrayList<>();

        // method call for Part B: no.6
        printAverage(new int[] {10, 20, 30, 40});

        // Array of Student objects
        Student[] students = new Student[3];
        students[0] = new Student("Ali", 20);
        students[1] = new Student("Siti", 21);
        students[2] = new Student("Raj", 19);

        // method call for Part C: no.8
        printStudentInfo(students);

        input.close();
    }

    // Part A: no.3
    public static void printTotal(String title, int... values) { // swap parameter place
        // ...
    }

    // Part B: no.6
    public static void printAverage(int[] num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        int average = sum / num.length;
        System.out.println("Average: " + average + "\n");
    }

    // Part C: no.7
    public static int findHighestScore(int[] scores) {
        int highest = 0;
        for (int h : scores) {
            if(h > highest) {
                highest = h;
            }
        }
        return highest;
    }

    // Part C: no.8
    public static void printStudentInfo(Student[] arr) {
        for (Student s : arr) {
            System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
        }
    }

    // Part C: no.9
    public static int sumSubjectMarks(int[][] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
        }
        return sum;
    }
}

// Student class
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}