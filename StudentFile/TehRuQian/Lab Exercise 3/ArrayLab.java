//Teh Ru Qian A23CS0191
//Lab Exercise 3

import java.util.*;

public class ArrayLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part A Question 1
        System.out.println("Question 1: No Output");
        double gpa[] = new double[4];

        // Part A Question 2
        System.out.println("Question 2: No Output");
        int[] points = {90,85,88};

        // Part A Question 3
        System.out.println("Question 3: No Output");

        // 1D array for student scores
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        // 2D array for marks of 3 students and 3 subjects
        int[][] marks = {
            {85, 78, 90},
            {88, 92, 79},
            {75, 80, 85}
        };

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

        // Part B Question 4
        System.out.println("Question 4: No Output");
        int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // Part B Question 5
        System.out.println("Question 5: No Output");
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(85.5);
        grades.add(90.0);
        grades.add(78.5);

        // Part B Question 6
        System.out.println("Question 6: ");
        printAverage(new int[] {10,20,30,40});

        // Part C Question 7
        System.out.println("Question 7: ");
        int highest = findHighestScore(scores);
        System.out.println("Highest score: " + highest);

        // Display all student names
        // Part C Question 8
        System.out.println("Question 8: ");
        printStudentInfo(students);

        // Part C Question 9
        System.out.println("Question 9: ");
        int totalMarks = sumSubjectMarks(marks);
        System.out.println("Total marks: " + totalMarks);

        input.close();
    }

    // Part A Question 3
    public static void printTotal(String title, int... values) { 
        int total = 0;
        for (int v : values)
            total +=v;
        System.out.println(title + ":" + total);
    }

    // Part B Question 6
    public static void printAverage(int[] nums){
        int sum = 0;
        for (int n : nums){
            sum += n;
        }

        double avg = (double) sum / nums.length;
        System.out.println("Average: " + avg);
    }

    // Part C Question 7
    public static int findHighestScore(int[] scores) {
        int max = scores[0];
        for (int s : scores) {
            if (s > max)
                max = s;
        }
        return max;
    }

    // Part C Question 8
    public static void printStudentInfo(Student[] arr){
        for (Student s : arr) {
            System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
        }
    }

    // Part C Question 9
    public static int sumSubjectMarks (int [][] marks) {
        int sum = 0;
        for (int[] row : marks){
            for (int val : row) {
                sum += val;
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
